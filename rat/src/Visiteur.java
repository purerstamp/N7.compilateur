import java.beans.Expression;
import java.rmi.server.Operation;
import java.util.Collections;
import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.program.Program;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import com.google.common.base.Function;

import attributs.Info;
import attributs.InfoConst;
import attributs.InfoFun;
import attributs.InfoVar;
import attributs.ReturnType;
import attributs.TDS;
import attributs.TypeDeBase;
import exception.DoubleDeclarationException;
import exception.NoDeclarationException;
import exception.OperationInterditeException;
import exception.TypeException;
import rat.rat.Affectation;
import rat.rat.DP;
import rat.rat.Bloc;
import rat.rat.Boolean;
import rat.rat.Appel;
import rat.rat.Constante;
import rat.rat.Declaration;
import rat.rat.Denominateur;
import rat.rat.Fun;
import rat.rat.Rationnel;
import rat.rat.Identificateur;
import rat.rat.Conditionnelle;
import rat.rat.I;
import rat.rat.Numerateur;
import rat.rat.Print;
import rat.rat.Prog;
import rat.rat.Type;
import rat.rat.Tantque;
import rat.rat.util.RatSwitch;

public class Visiteur extends RatSwitch<ReturnType> {
	private static int whileCounter = 0;
	private static int ifCounter = 0;
	private TDS tds;
	
	private String base;
	protected int deplacement;
	
	public Visiteur() {
		super();
		this.tds = new TDS();
		base = "SB";
		deplacement = 0;
	}
	
	public Visiteur (TDS tds, String base, int deplacement) {
		super();
		this.tds = tds;
		this.base = base;
		this.deplacement = deplacement;
	}
	
	public ReturnType caseProg(Prog prog) {
		// Fonctions
		String code = "JUMP main\n" +
				"LABEL pgcd\n" + 
				"LOADL 0\n" + 
				"LOAD (1) -2[LB]\n" + 
				"LOAD (1) -1[LB]\n" + 
				"LABEL boucle\n" + 
				"LOAD (1) 5[LB]\n" + 
				"JUMPIF (0) fin\n" + 
				"LOAD (1) 4[LB]\n" + 
				"LOAD (1) 5 [LB]\n" + 
				"SUBR IMod\n" + 
				"STORE (1) 3[LB]\n" + 
				"LOAD (1) 5[LB]\n" + 
				"STORE (1) 4[LB]\n" + 
				"LOAD (1) 3[LB]\n" + 
				"STORE(1) 5[LB]\n" + 
				"JUMP boucle\n" + 
				"LABEL fin\n" + 
				"LOAD (1) 4[LB]\n" + 
				"RETURN (1) 2\n" + 
				"\n" + 
				"LABEL norm\n" + 
				"LOAD (1) -2[LB]\n" + 
				"LOAD (1) -1[LB]\n" + 
				"CALL (LB) pgcd\n" + 
				"LOAD (1) -2[LB]\n" + 
				"LOAD (1) 3[LB]\n" + 
				"SUBR IDiv\n" + 
				"LOAD (1) -1[LB]\n" + 
				"LOAD (1) 3[LB]\n" + 
				"SUBR IDiv\n" + 
				"RETURN (2) 2\n" + 
				"\n" + 
				"LABEL ROut\n" + 
				"LOADL '['\n" + 
				"SUBR COut\n" + 
				"LOAD (1) -2[LB]\n" + 
				"SUBR IOut\n" + 
				"LOADL '|'\n" + 
				"SUBR COut\n" + 
				"LOAD (1) -1[LB]\n" + 
				"SUBR IOut\n" + 
				"LOADL ']'\n" + 
				"SUBR COut\n" + 
				"POP (0) 1\n" + 
				"RETURN (0) 2\n" + 
				"\n" + 
				"LABEL RAdd\n" + 
				"LOAD (1) -4[LB]\n" + 
				"LOAD (1) -1[LB]\n" + 
				"SUBR IMul\n" + 
				"LOAD (1) -2[LB]\n" + 
				"LOAD (1) -3[LB]\n" + 
				"SUBR IMul    \n" + 
				"SUBR IAdd    \n" + 
				"LOAD (1) -3[LB]\n" + 
				"LOAD (1) -1[LB]\n" + 
				"SUBR IMul    \n" + 
				"CALL (ST) norm\n" + 
				"POP (2) 4\n" + 
				"RETURN (2) 4\n" + 
				"\n" + 
				"LABEL RMul\n" + 
				"LOAD (1) -4[LB]\n" + 
				"LOAD (1) -2[LB]\n" + 
				"SUBR IMul\n" + 
				"LOAD (1) -3[LB]\n" + 
				"LOAD (1) -1[LB]\n" + 
				"SUBR IMul\n" + 
				"CALL (ST) norm\n" + 
				"POP (2) 4\n" + 
				"RETURN (2) 4\n\n";
		for(Fun f : prog.getFun()) {
			ReturnType rFun = this.doSwitch(f);
			code += rFun.getCode();
		}
		// Main
		code += "LABEL main\n";
		Visiteur vMain = new Visiteur(new TDS(this.tds), this.base, this.deplacement);
		ReturnType rMain = vMain.doSwitch(prog.getMain());
		code += rMain.getCode();
		code += "POP (0) " + vMain.tds.getTailleBlocLocal() + "\n";
		code += "HALT\n";
		return new ReturnType(TypeDeBase.VOID, code);
	}
	
	@Override
	public ReturnType caseFunction(Function func) {
		// Test doublons
		String name = func.getNameFun();
		if(tds.chercherLocalement(name) != null) {
			throw new DoubleDeclarationException(getLine(func),name);
		}
		
		Vector<TypeDeBase> vArgType = new Vector<TypeDeBase>();
		
		// Switch arguments
		TDS fTds = new TDS(this.tds);
		Visiteur vFunc = new Visiteur(fTds,"LB",0);
		EList<Argument> args = func.getArgs();
		int tailleParams = 0;
		for(int i = args.size(); i > 0; i--) {
			ReturnType rt = vFunc.doSwitch(args.get(i-1));
			TypeDeBase tArg = (TypeDeBase) rt.getType();
			vArgType.add(tArg);
			tailleParams += tArg.getTaille();
		}
	
		Collections.reverse(vArgType);
		
		vFunc.deplacement = 3;
		// Ajout de la fonction
		TypeDeBase tFunction = (TypeDeBase) doSwitch(func.getType()).getType();
		
		String code = "LABEL " +name+"\n";
		
		tds.inserer(name, new InfoFun(tFunction,vArgType));
		// Switch instructions
		for(Instruction ins : func.getInsts()) {
			ReturnType rt = vFunc.doSwitch(ins);
			vFunc.deplacement += rt.getSize();
			code += rt.getCode();
		}
		ReturnType rReturn = vFunc.doSwitch(func.getReturn());
		TypeDeBase tReturn = (TypeDeBase) rReturn.getType();
		code += rReturn.getCode()
				+ "RETURN (" + tReturn.getTaille() + ") " + tailleParams + "\n\n";
		if(!tReturn.estCompatible(tFunction)) 
			throw new TypeException(getLine(func),"Le type de retour de la fonction " + name + " n'est pas compatible avec sa signature!");
		return new ReturnType(tFunction, tReturn.getTaille(), code);
}
	@Override
	public ReturnType caseArgument(Argument arg) {
		// Test doublons
		String name = arg.getNameArg();
		if(tds.chercherLocalement(name) != null) {
			throw new DoubleDeclarationException(getLine(arg),name);
		}
		TypeDeBase tArg = (TypeDeBase) doSwitch(arg.getType()).getType();
		this.deplacement -= tArg.getTaille();
		tds.inserer(name, new InfoVar(tArg,this.deplacement,this.base));
		return new ReturnType(tArg,tArg.getTaille(), "Code Argument");
	}
	
	@Override
	public ReturnType caseDeclaration(Declaration decl) {
		String name = decl.getNameDecl();
		if(tds.chercherLocalement(name) != null) {
			throw new DoubleDeclarationException(getLine(decl),name);
		}
		ReturnType valeur = this.doSwitch(decl.getExpr());
		TypeDeBase tDecl = (TypeDeBase) valeur.getType();
		if (!tDecl.estCompatible((TypeDeBase) doSwitch(decl.getType()).getType())) {
			throw new TypeException(getLine(decl),"Le type de l'expression de " + name + " n'est pas compatible avec son type déclaré!");
		}
		tds.inserer(name, new InfoVar(tDecl,this.deplacement,this.base));
		return new ReturnType(TypeDeBase.VOID,tDecl.getTaille(), valeur.getCode());
	}
	
	@Override
	public ReturnType caseConstant(Constant cons) {
		String name = cons.getNameConst();
		if(tds.chercherLocalement(name) != null) {
			throw new DoubleDeclarationException(getLine(cons),name);
		}
		
		tds.inserer(name, new InfoConst(TypeDeBase.ENTIER,cons.getVal()));
		return new ReturnType(TypeDeBase.ENTIER);
	}
	@Override
	public ReturnType caseAffectation(Affectation afc) {
		String name = afc.getNameAfc();
		Info resultat = tds.chercherGlobalement(name);
		if(resultat == null) {
			throw new NoDeclarationException(getLine(afc),name);
		}
		if(resultat instanceof InfoConst){
			throw new OperationInterditeException(getLine(afc),"Affection de la constante "+name+"!");
		}
		if(resultat instanceof InfoFun){
			throw new OperationInterditeException(getLine(afc),"Affectation de la function "+name+"!");
		}
		ReturnType rExpr = this.doSwitch(afc.getExpr());
		TypeDeBase tAfc = (TypeDeBase) rExpr.getType();
		if(!tAfc.estCompatible(((InfoVar) resultat).getType())){
			throw new TypeException(getLine(afc),"Le type de " + name + " n'est pas compatible avec son expression!");
		}
		String code = rExpr.getCode();
		InfoVar ivResultat = (InfoVar) resultat;
		code += "STORE (" + tAfc.getTaille() + ") " + ivResultat.getDeplacement() + "["+ivResultat.getBase()+"]\n";
		return new ReturnType(TypeDeBase.VOID, code);
	}

	@Override
	public ReturnType casePrint(Print print) {
		ReturnType value = this.doSwitch(print.getVal());
		String code = value.getCode();;
		TypeDeBase tValue = (TypeDeBase) value.getType();
		if(tValue.estCompatible(TypeDeBase.ENTIER)) {
			code += "SUBR IOut\n";
		} else if(tValue.estCompatible(TypeDeBase.BOOLEEN)) {
			code += "SUBR BOut\n";
		} else if(tValue.estCompatible(TypeDeBase.RATIONEL)) {
			code += "CALL (SB) ROut\n";
		}
		return new ReturnType(TypeDeBase.VOID, code);
	}

	@Override
	public ReturnType caseIf(If obj) {
		// TEST
		Visiteur.ifCounter ++;
		String label = "else" + Visiteur.ifCounter;
		ReturnType rExpr = this.doSwitch(obj.getTest());
		TypeDeBase tExpr = (TypeDeBase) rExpr.getType();
		if(!tExpr.equals(TypeDeBase.BOOLEEN)) {
			throw new TypeException(getLine(obj.getTest()),"Le test n'est pas un booléen!");
		}
		String code = rExpr.getCode();
		code += "JUMPIF (0) " + label + "\n";
		// IF
		Visiteur vIf = new Visiteur(new TDS(this.tds),"",0);
		ReturnType rIf = vIf.doSwitch(obj.getIf());
		code += rIf.getCode();
		code += "JUMP end"+label+"\n"
				+ "LABEL " + label + "\n"
				+ "POP (0) " +vIf.tds.getTailleBlocLocal() + "\n";
		// ELSE
		Visiteur vElse = new Visiteur(new TDS(this.tds),"",0);
		ReturnType rElse = vElse.doSwitch(obj.getElse());
		code += rElse.getCode();
		code += "POP (0) " + vElse.tds.getTailleBlocLocal() + "\n"
				+ "LABEL end"+label+"\n";
		return new ReturnType(TypeDeBase.VOID, code);
	}

	@Override
	public ReturnType caseBloc(Bloc bloc) {
		String code = "";
		for(Instruction inst : bloc.getInsts()) {
			ReturnType ret = this.doSwitch(inst);
			this.deplacement += ret.getSize();
			code += ret.getCode();
		}
		return new ReturnType(TypeDeBase.VOID ,code);
	}
	
	@Override
	public ReturnType caseWhile(While whi) {
		// Test
		Visiteur.whileCounter ++;
		String label = "while"+ Visiteur.whileCounter;
		String code = "LABEL " + label + "\n";
		ReturnType rTest = this.doSwitch(whi.getTest());
		TypeDeBase tExpr = (TypeDeBase) rTest.getType();
		if(!tExpr.equals(TypeDeBase.BOOLEEN)) {
			throw new TypeException(getLine(whi.getTest()),"Le test n'est pas un booléen!");
		}
		code += rTest.getCode();
		code += "JUMPIF (0) end" + label + "\n";
		
		// Blocs
		Visiteur vWhile = new Visiteur(new TDS(this.tds),this.base,this.deplacement);
		ReturnType rBloc = vWhile.doSwitch(whi.getLoop());
		code += rBloc.getCode();
		code += "POP (0) " + vWhile.tds.getTailleBlocLocal() + "\n";
		code += "JUMP " + label + "\n"
				+ "LABEL end" + label +"\n";
		return new ReturnType(TypeDeBase.VOID, code);
	}

	@Override
	public ReturnType caseOperation(Operation op) {
		// Membre 1
		ReturnType rOp1 = this.doSwitch(op.getMembre1());
		TypeDeBase tOp1 = (TypeDeBase) rOp1.getType();
		
		// Membre 2
		ReturnType rOp2 = this.doSwitch(op.getMembre2());
		TypeDeBase tOp2 = (TypeDeBase) rOp2.getType();
		
		if(!tOp1.estCompatible(tOp2)) {
			throw new TypeException(getLine(op.getMembre1()),"Le type du premier opérateur n'est pas compatible avec celui du second!");
		}
		ReturnType retour;
		String code = rOp1.getCode() + rOp2.getCode();
		switch(op.getOperateur()){
			case "+":
				if(tOp1.estCompatible(TypeDeBase.ENTIER)) {
					retour = new ReturnType(tOp1, code + "SUBR IAdd\n");	
				} else if(tOp1.estCompatible(TypeDeBase.RATIONEL)) {
					retour = new ReturnType(tOp1, code + "CALL (SB) RAdd\n");
				} else {
					throw new TypeException(getLine(op.getMembre1()),"On ne peut pas additionner des " + tOp1.getNom() + "!");
				}
				break;
			case "*":
				if(tOp1.estCompatible(TypeDeBase.ENTIER)) {
					retour = new ReturnType(tOp1, code + "SUBR IMul\n");	

				} else if(tOp1.estCompatible(TypeDeBase.RATIONEL)) {
					retour = new ReturnType(tOp1, code + "CALL (SB) RMul\n");

				} else {
					throw new TypeException(getLine(op.getMembre1()),"On ne peut pas multiplier des " + tOp1.getNom() + "!");
				}
				break;
			case "=":
				if(tOp1.estCompatible(TypeDeBase.ENTIER) || tOp1.estCompatible(TypeDeBase.BOOLEEN)) {
					retour = new ReturnType(TypeDeBase.BOOLEEN, code + "SUBR IEq\n");
				} else {
					throw new TypeException(getLine(op.getMembre1()),"On ne peut pas comparer des " + tOp1.getNom() + "!");
				}
				break;
			case "<":
				if(tOp1.estCompatible(TypeDeBase.ENTIER)) {
					retour = new ReturnType(TypeDeBase.BOOLEEN, code + "SUBR ILss\n");
				} else {
					throw new TypeException(getLine(op.getMembre1()),"On ne peut pas comparer les valeurs des " + tOp1.getNom() + "!");
				}
				break;
			case ">":
				if(tOp1.estCompatible(TypeDeBase.ENTIER)) {
					retour = new ReturnType(TypeDeBase.BOOLEEN, code + "SUBR IGtr\n");
				} else {
					throw new TypeException(getLine(op.getMembre1()),"On ne peut pas comparer les valeurs des " + tOp1.getNom() + "!");
				}
				break;
			default:
				retour = new ReturnType(TypeDeBase.VOID);
		}
		
		return retour;
	}

	@Override
	public ReturnType caseIdent(Ident id) {
		String name = id.getId();
		Info resultat = tds.chercherGlobalement(name);
		if(resultat == null) {
			throw new NoDeclarationException(getLine(id),name);
		}
		if(resultat instanceof InfoFun) {
			throw new OperationInterditeException(getLine(id),"Vouliez-vous 'dire call "+name+"()' ?");
		}
		ReturnType ret;
		if(resultat instanceof InfoConst) {
			ret = new ReturnType(TypeDeBase.ENTIER,"LOADL " + ((InfoConst) resultat).getValeur());
		} else {
			InfoVar info = (InfoVar) resultat;
			TypeDeBase type = info.getType();
			ret = new ReturnType(type,"LOAD (" + type.getTaille() + ") " + info.getDeplacement() + "[" + info.getBase() + "]\n");
			
		}
		
		return ret;
	}

	@Override
	public ReturnType caseBoolean(Boolean bool) {
		return new ReturnType(TypeDeBase.BOOLEEN,"LOADL " + (bool.getVal().equals("true") ? "1" : "0") + "\n");
	}

	@Override
	public ReturnType caseInteger(Integer integer) {
		String val = "LOADL " + integer.getValIntg() + "\n";
		return new ReturnType(TypeDeBase.ENTIER,val);
	}

	@Override
	public ReturnType caseCall(Call call) {
		String name = call.getNameCall();
		Info resultat = tds.chercherGlobalement(name);
		if(resultat == null) {
			throw new NoDeclarationException(getLine(call),name);
		}
		if(!(resultat instanceof InfoFun)) {
			throw new OperationInterditeException(getLine(call),name + " n'est pas une fonction!");
		}
		Vector<TypeDeBase> vArgs = new Vector<TypeDeBase>();
		String code = "";
		for(Expression param : call.getParams()) {
			ReturnType rArg = this.doSwitch(param);
			TypeDeBase tArg = (TypeDeBase) rArg.getType();
			vArgs.add(tArg);
			code += rArg.getCode();
		}
		InfoFun tFunc = (InfoFun) resultat;
		
		if(!(((InfoFun) tFunc).estCompatibleParam(vArgs))) {
			throw new TypeException(getLine(call),"Les arguments de la fonction " + name + " ne sont pas du bon type!");
		}
		code += "CALL (SB) " + name + "\n";
		return new ReturnType(tFunc.getTypeRetour(), code);
	}

	@Override
	public ReturnType caseFraction(Fraction frac) {
		// Numérateur
		ReturnType rNum = this.doSwitch(frac.getNum());
		TypeDeBase tNum = (TypeDeBase) rNum.getType();
		if(!(TypeDeBase.ENTIER.estCompatible(tNum))) {
			throw new TypeException(getLine(frac),"Le numérateur n'est pas un entier!");
		}
		// Dénominateur
		ReturnType rDenom =  this.doSwitch(frac.getDenom());
		TypeDeBase tDenom = (TypeDeBase) rDenom.getType();
		if(!(TypeDeBase.ENTIER.estCompatible(tDenom))) {
			throw new TypeException(getLine(frac),"Le dénominateur n'est pas un entier!");
		}
		return new ReturnType(TypeDeBase.RATIONEL, rNum.getCode() + rDenom.getCode());
	}

	@Override
	public ReturnType caseNumerator(Numerator num) {
		ReturnType rFrac = this.doSwitch(num.getVarNum());
		TypeDeBase tFrac = (TypeDeBase) rFrac.getType();
		if(!(TypeDeBase.RATIONEL.estCompatible(tFrac))) {
			throw new TypeException(getLine(num),"Le type " + tFrac.getNom() + " n'as pas de numérateur!");
		}
		String code = rFrac.getCode();
		code += "POP (0) 1\n";
		return new ReturnType(TypeDeBase.ENTIER,code);
	}

	@Override
	public ReturnType caseDenominator(Denominator denom) {
		ReturnType rFrac = this.doSwitch(denom.getVarDenom());
		TypeDeBase tFrac = (TypeDeBase) rFrac.getType();
		if(!(TypeDeBase.RATIONEL.estCompatible(tFrac))) {
			throw new TypeException(getLine(denom),"Le type " + tFrac.getNom() + " n'as pas de dénominateur!");
		}
		String code = rFrac.getCode();
		code += "POP (1) 1\n";
		return new ReturnType(TypeDeBase.ENTIER,code);
	}

	@Override
	public ReturnType caseType(Type type) {
		TypeDeBase retour = TypeDeBase.VOID;
		switch(type.getType()) {
		case "int":
			retour = TypeDeBase.ENTIER;
			break;
		case "bool":
			retour = TypeDeBase.BOOLEEN;
			break;
		case "rat":
			retour = TypeDeBase.RATIONEL;
			break;
		}
		return new ReturnType(retour);

	}
	
	@Override
	public ReturnType defaultCase(EObject object) {
		return super.defaultCase(object);
	}
	
	public int getLine(EObject object) {
		return NodeModelUtils.findActualNodeFor(object).getStartLine();
	}
	
	
}
