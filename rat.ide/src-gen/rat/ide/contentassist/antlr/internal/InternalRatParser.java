package rat.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import rat.services.RatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRatParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bool'", "'int'", "'rat'", "'false'", "'true'", "'+'", "'='", "'*'", "'<'", "'('", "')'", "'{'", "'return'", "';'", "'}'", "'const'", "'print'", "'if'", "'else'", "'while'", "'call'", "'['", "'/'", "']'", "'num'", "'denom'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRatParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRatParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRatParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRat.g"; }


    	private RatGrammarAccess grammarAccess;

    	public void setGrammarAccess(RatGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProg"
    // InternalRat.g:53:1: entryRuleProg : ruleProg EOF ;
    public final void entryRuleProg() throws RecognitionException {
        try {
            // InternalRat.g:54:1: ( ruleProg EOF )
            // InternalRat.g:55:1: ruleProg EOF
            {
             before(grammarAccess.getProgRule()); 
            pushFollow(FOLLOW_1);
            ruleProg();

            state._fsp--;

             after(grammarAccess.getProgRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProg"


    // $ANTLR start "ruleProg"
    // InternalRat.g:62:1: ruleProg : ( ( rule__Prog__Group__0 ) ) ;
    public final void ruleProg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:66:2: ( ( ( rule__Prog__Group__0 ) ) )
            // InternalRat.g:67:2: ( ( rule__Prog__Group__0 ) )
            {
            // InternalRat.g:67:2: ( ( rule__Prog__Group__0 ) )
            // InternalRat.g:68:3: ( rule__Prog__Group__0 )
            {
             before(grammarAccess.getProgAccess().getGroup()); 
            // InternalRat.g:69:3: ( rule__Prog__Group__0 )
            // InternalRat.g:69:4: rule__Prog__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Prog__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProg"


    // $ANTLR start "entryRuleFun"
    // InternalRat.g:78:1: entryRuleFun : ruleFun EOF ;
    public final void entryRuleFun() throws RecognitionException {
        try {
            // InternalRat.g:79:1: ( ruleFun EOF )
            // InternalRat.g:80:1: ruleFun EOF
            {
             before(grammarAccess.getFunRule()); 
            pushFollow(FOLLOW_1);
            ruleFun();

            state._fsp--;

             after(grammarAccess.getFunRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFun"


    // $ANTLR start "ruleFun"
    // InternalRat.g:87:1: ruleFun : ( ( rule__Fun__Group__0 ) ) ;
    public final void ruleFun() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:91:2: ( ( ( rule__Fun__Group__0 ) ) )
            // InternalRat.g:92:2: ( ( rule__Fun__Group__0 ) )
            {
            // InternalRat.g:92:2: ( ( rule__Fun__Group__0 ) )
            // InternalRat.g:93:3: ( rule__Fun__Group__0 )
            {
             before(grammarAccess.getFunAccess().getGroup()); 
            // InternalRat.g:94:3: ( rule__Fun__Group__0 )
            // InternalRat.g:94:4: rule__Fun__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fun__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFun"


    // $ANTLR start "entryRuleBloc"
    // InternalRat.g:103:1: entryRuleBloc : ruleBloc EOF ;
    public final void entryRuleBloc() throws RecognitionException {
        try {
            // InternalRat.g:104:1: ( ruleBloc EOF )
            // InternalRat.g:105:1: ruleBloc EOF
            {
             before(grammarAccess.getBlocRule()); 
            pushFollow(FOLLOW_1);
            ruleBloc();

            state._fsp--;

             after(grammarAccess.getBlocRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBloc"


    // $ANTLR start "ruleBloc"
    // InternalRat.g:112:1: ruleBloc : ( ( rule__Bloc__Group__0 ) ) ;
    public final void ruleBloc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:116:2: ( ( ( rule__Bloc__Group__0 ) ) )
            // InternalRat.g:117:2: ( ( rule__Bloc__Group__0 ) )
            {
            // InternalRat.g:117:2: ( ( rule__Bloc__Group__0 ) )
            // InternalRat.g:118:3: ( rule__Bloc__Group__0 )
            {
             before(grammarAccess.getBlocAccess().getGroup()); 
            // InternalRat.g:119:3: ( rule__Bloc__Group__0 )
            // InternalRat.g:119:4: rule__Bloc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bloc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlocAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBloc"


    // $ANTLR start "entryRuleI"
    // InternalRat.g:128:1: entryRuleI : ruleI EOF ;
    public final void entryRuleI() throws RecognitionException {
        try {
            // InternalRat.g:129:1: ( ruleI EOF )
            // InternalRat.g:130:1: ruleI EOF
            {
             before(grammarAccess.getIRule()); 
            pushFollow(FOLLOW_1);
            ruleI();

            state._fsp--;

             after(grammarAccess.getIRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleI"


    // $ANTLR start "ruleI"
    // InternalRat.g:137:1: ruleI : ( ( rule__I__Alternatives ) ) ;
    public final void ruleI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:141:2: ( ( ( rule__I__Alternatives ) ) )
            // InternalRat.g:142:2: ( ( rule__I__Alternatives ) )
            {
            // InternalRat.g:142:2: ( ( rule__I__Alternatives ) )
            // InternalRat.g:143:3: ( rule__I__Alternatives )
            {
             before(grammarAccess.getIAccess().getAlternatives()); 
            // InternalRat.g:144:3: ( rule__I__Alternatives )
            // InternalRat.g:144:4: rule__I__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__I__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleI"


    // $ANTLR start "entryRuleDeclaration"
    // InternalRat.g:153:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalRat.g:154:1: ( ruleDeclaration EOF )
            // InternalRat.g:155:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalRat.g:162:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:166:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // InternalRat.g:167:2: ( ( rule__Declaration__Group__0 ) )
            {
            // InternalRat.g:167:2: ( ( rule__Declaration__Group__0 ) )
            // InternalRat.g:168:3: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // InternalRat.g:169:3: ( rule__Declaration__Group__0 )
            // InternalRat.g:169:4: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleAffectation"
    // InternalRat.g:178:1: entryRuleAffectation : ruleAffectation EOF ;
    public final void entryRuleAffectation() throws RecognitionException {
        try {
            // InternalRat.g:179:1: ( ruleAffectation EOF )
            // InternalRat.g:180:1: ruleAffectation EOF
            {
             before(grammarAccess.getAffectationRule()); 
            pushFollow(FOLLOW_1);
            ruleAffectation();

            state._fsp--;

             after(grammarAccess.getAffectationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // InternalRat.g:187:1: ruleAffectation : ( ( rule__Affectation__Group__0 ) ) ;
    public final void ruleAffectation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:191:2: ( ( ( rule__Affectation__Group__0 ) ) )
            // InternalRat.g:192:2: ( ( rule__Affectation__Group__0 ) )
            {
            // InternalRat.g:192:2: ( ( rule__Affectation__Group__0 ) )
            // InternalRat.g:193:3: ( rule__Affectation__Group__0 )
            {
             before(grammarAccess.getAffectationAccess().getGroup()); 
            // InternalRat.g:194:3: ( rule__Affectation__Group__0 )
            // InternalRat.g:194:4: rule__Affectation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleConstante"
    // InternalRat.g:203:1: entryRuleConstante : ruleConstante EOF ;
    public final void entryRuleConstante() throws RecognitionException {
        try {
            // InternalRat.g:204:1: ( ruleConstante EOF )
            // InternalRat.g:205:1: ruleConstante EOF
            {
             before(grammarAccess.getConstanteRule()); 
            pushFollow(FOLLOW_1);
            ruleConstante();

            state._fsp--;

             after(grammarAccess.getConstanteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstante"


    // $ANTLR start "ruleConstante"
    // InternalRat.g:212:1: ruleConstante : ( ( rule__Constante__Group__0 ) ) ;
    public final void ruleConstante() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:216:2: ( ( ( rule__Constante__Group__0 ) ) )
            // InternalRat.g:217:2: ( ( rule__Constante__Group__0 ) )
            {
            // InternalRat.g:217:2: ( ( rule__Constante__Group__0 ) )
            // InternalRat.g:218:3: ( rule__Constante__Group__0 )
            {
             before(grammarAccess.getConstanteAccess().getGroup()); 
            // InternalRat.g:219:3: ( rule__Constante__Group__0 )
            // InternalRat.g:219:4: rule__Constante__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constante__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstanteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstante"


    // $ANTLR start "entryRulePrint"
    // InternalRat.g:228:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalRat.g:229:1: ( rulePrint EOF )
            // InternalRat.g:230:1: rulePrint EOF
            {
             before(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            rulePrint();

            state._fsp--;

             after(grammarAccess.getPrintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalRat.g:237:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:241:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalRat.g:242:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalRat.g:242:2: ( ( rule__Print__Group__0 ) )
            // InternalRat.g:243:3: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // InternalRat.g:244:3: ( rule__Print__Group__0 )
            // InternalRat.g:244:4: rule__Print__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleConditionnelle"
    // InternalRat.g:253:1: entryRuleConditionnelle : ruleConditionnelle EOF ;
    public final void entryRuleConditionnelle() throws RecognitionException {
        try {
            // InternalRat.g:254:1: ( ruleConditionnelle EOF )
            // InternalRat.g:255:1: ruleConditionnelle EOF
            {
             before(grammarAccess.getConditionnelleRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionnelle();

            state._fsp--;

             after(grammarAccess.getConditionnelleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionnelle"


    // $ANTLR start "ruleConditionnelle"
    // InternalRat.g:262:1: ruleConditionnelle : ( ( rule__Conditionnelle__Group__0 ) ) ;
    public final void ruleConditionnelle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:266:2: ( ( ( rule__Conditionnelle__Group__0 ) ) )
            // InternalRat.g:267:2: ( ( rule__Conditionnelle__Group__0 ) )
            {
            // InternalRat.g:267:2: ( ( rule__Conditionnelle__Group__0 ) )
            // InternalRat.g:268:3: ( rule__Conditionnelle__Group__0 )
            {
             before(grammarAccess.getConditionnelleAccess().getGroup()); 
            // InternalRat.g:269:3: ( rule__Conditionnelle__Group__0 )
            // InternalRat.g:269:4: rule__Conditionnelle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditionnelle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionnelleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionnelle"


    // $ANTLR start "entryRuleTantque"
    // InternalRat.g:278:1: entryRuleTantque : ruleTantque EOF ;
    public final void entryRuleTantque() throws RecognitionException {
        try {
            // InternalRat.g:279:1: ( ruleTantque EOF )
            // InternalRat.g:280:1: ruleTantque EOF
            {
             before(grammarAccess.getTantqueRule()); 
            pushFollow(FOLLOW_1);
            ruleTantque();

            state._fsp--;

             after(grammarAccess.getTantqueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTantque"


    // $ANTLR start "ruleTantque"
    // InternalRat.g:287:1: ruleTantque : ( ( rule__Tantque__Group__0 ) ) ;
    public final void ruleTantque() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:291:2: ( ( ( rule__Tantque__Group__0 ) ) )
            // InternalRat.g:292:2: ( ( rule__Tantque__Group__0 ) )
            {
            // InternalRat.g:292:2: ( ( rule__Tantque__Group__0 ) )
            // InternalRat.g:293:3: ( rule__Tantque__Group__0 )
            {
             before(grammarAccess.getTantqueAccess().getGroup()); 
            // InternalRat.g:294:3: ( rule__Tantque__Group__0 )
            // InternalRat.g:294:4: rule__Tantque__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tantque__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTantqueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTantque"


    // $ANTLR start "entryRuleDP"
    // InternalRat.g:303:1: entryRuleDP : ruleDP EOF ;
    public final void entryRuleDP() throws RecognitionException {
        try {
            // InternalRat.g:304:1: ( ruleDP EOF )
            // InternalRat.g:305:1: ruleDP EOF
            {
             before(grammarAccess.getDPRule()); 
            pushFollow(FOLLOW_1);
            ruleDP();

            state._fsp--;

             after(grammarAccess.getDPRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDP"


    // $ANTLR start "ruleDP"
    // InternalRat.g:312:1: ruleDP : ( ( rule__DP__Group__0 ) ) ;
    public final void ruleDP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:316:2: ( ( ( rule__DP__Group__0 ) ) )
            // InternalRat.g:317:2: ( ( rule__DP__Group__0 ) )
            {
            // InternalRat.g:317:2: ( ( rule__DP__Group__0 ) )
            // InternalRat.g:318:3: ( rule__DP__Group__0 )
            {
             before(grammarAccess.getDPAccess().getGroup()); 
            // InternalRat.g:319:3: ( rule__DP__Group__0 )
            // InternalRat.g:319:4: rule__DP__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DP__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDP"


    // $ANTLR start "entryRuleType"
    // InternalRat.g:328:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalRat.g:329:1: ( ruleType EOF )
            // InternalRat.g:330:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalRat.g:337:1: ruleType : ( ( rule__Type__TAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:341:2: ( ( ( rule__Type__TAssignment ) ) )
            // InternalRat.g:342:2: ( ( rule__Type__TAssignment ) )
            {
            // InternalRat.g:342:2: ( ( rule__Type__TAssignment ) )
            // InternalRat.g:343:3: ( rule__Type__TAssignment )
            {
             before(grammarAccess.getTypeAccess().getTAssignment()); 
            // InternalRat.g:344:3: ( rule__Type__TAssignment )
            // InternalRat.g:344:4: rule__Type__TAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Type__TAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleCP"
    // InternalRat.g:353:1: entryRuleCP : ruleCP EOF ;
    public final void entryRuleCP() throws RecognitionException {
        try {
            // InternalRat.g:354:1: ( ruleCP EOF )
            // InternalRat.g:355:1: ruleCP EOF
            {
             before(grammarAccess.getCPRule()); 
            pushFollow(FOLLOW_1);
            ruleCP();

            state._fsp--;

             after(grammarAccess.getCPRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCP"


    // $ANTLR start "ruleCP"
    // InternalRat.g:362:1: ruleCP : ( ( rule__CP__Group__0 ) ) ;
    public final void ruleCP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:366:2: ( ( ( rule__CP__Group__0 ) ) )
            // InternalRat.g:367:2: ( ( rule__CP__Group__0 ) )
            {
            // InternalRat.g:367:2: ( ( rule__CP__Group__0 ) )
            // InternalRat.g:368:3: ( rule__CP__Group__0 )
            {
             before(grammarAccess.getCPAccess().getGroup()); 
            // InternalRat.g:369:3: ( rule__CP__Group__0 )
            // InternalRat.g:369:4: rule__CP__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CP__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCP"


    // $ANTLR start "entryRuleE"
    // InternalRat.g:378:1: entryRuleE : ruleE EOF ;
    public final void entryRuleE() throws RecognitionException {
        try {
            // InternalRat.g:379:1: ( ruleE EOF )
            // InternalRat.g:380:1: ruleE EOF
            {
             before(grammarAccess.getERule()); 
            pushFollow(FOLLOW_1);
            ruleE();

            state._fsp--;

             after(grammarAccess.getERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleE"


    // $ANTLR start "ruleE"
    // InternalRat.g:387:1: ruleE : ( ( rule__E__Alternatives ) ) ;
    public final void ruleE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:391:2: ( ( ( rule__E__Alternatives ) ) )
            // InternalRat.g:392:2: ( ( rule__E__Alternatives ) )
            {
            // InternalRat.g:392:2: ( ( rule__E__Alternatives ) )
            // InternalRat.g:393:3: ( rule__E__Alternatives )
            {
             before(grammarAccess.getEAccess().getAlternatives()); 
            // InternalRat.g:394:3: ( rule__E__Alternatives )
            // InternalRat.g:394:4: rule__E__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__E__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleE"


    // $ANTLR start "entryRuleAppel"
    // InternalRat.g:403:1: entryRuleAppel : ruleAppel EOF ;
    public final void entryRuleAppel() throws RecognitionException {
        try {
            // InternalRat.g:404:1: ( ruleAppel EOF )
            // InternalRat.g:405:1: ruleAppel EOF
            {
             before(grammarAccess.getAppelRule()); 
            pushFollow(FOLLOW_1);
            ruleAppel();

            state._fsp--;

             after(grammarAccess.getAppelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAppel"


    // $ANTLR start "ruleAppel"
    // InternalRat.g:412:1: ruleAppel : ( ( rule__Appel__Group__0 ) ) ;
    public final void ruleAppel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:416:2: ( ( ( rule__Appel__Group__0 ) ) )
            // InternalRat.g:417:2: ( ( rule__Appel__Group__0 ) )
            {
            // InternalRat.g:417:2: ( ( rule__Appel__Group__0 ) )
            // InternalRat.g:418:3: ( rule__Appel__Group__0 )
            {
             before(grammarAccess.getAppelAccess().getGroup()); 
            // InternalRat.g:419:3: ( rule__Appel__Group__0 )
            // InternalRat.g:419:4: rule__Appel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Appel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAppel"


    // $ANTLR start "entryRuleRationnel"
    // InternalRat.g:428:1: entryRuleRationnel : ruleRationnel EOF ;
    public final void entryRuleRationnel() throws RecognitionException {
        try {
            // InternalRat.g:429:1: ( ruleRationnel EOF )
            // InternalRat.g:430:1: ruleRationnel EOF
            {
             before(grammarAccess.getRationnelRule()); 
            pushFollow(FOLLOW_1);
            ruleRationnel();

            state._fsp--;

             after(grammarAccess.getRationnelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRationnel"


    // $ANTLR start "ruleRationnel"
    // InternalRat.g:437:1: ruleRationnel : ( ( rule__Rationnel__Group__0 ) ) ;
    public final void ruleRationnel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:441:2: ( ( ( rule__Rationnel__Group__0 ) ) )
            // InternalRat.g:442:2: ( ( rule__Rationnel__Group__0 ) )
            {
            // InternalRat.g:442:2: ( ( rule__Rationnel__Group__0 ) )
            // InternalRat.g:443:3: ( rule__Rationnel__Group__0 )
            {
             before(grammarAccess.getRationnelAccess().getGroup()); 
            // InternalRat.g:444:3: ( rule__Rationnel__Group__0 )
            // InternalRat.g:444:4: rule__Rationnel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rationnel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRationnelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRationnel"


    // $ANTLR start "entryRuleNumerateur"
    // InternalRat.g:453:1: entryRuleNumerateur : ruleNumerateur EOF ;
    public final void entryRuleNumerateur() throws RecognitionException {
        try {
            // InternalRat.g:454:1: ( ruleNumerateur EOF )
            // InternalRat.g:455:1: ruleNumerateur EOF
            {
             before(grammarAccess.getNumerateurRule()); 
            pushFollow(FOLLOW_1);
            ruleNumerateur();

            state._fsp--;

             after(grammarAccess.getNumerateurRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumerateur"


    // $ANTLR start "ruleNumerateur"
    // InternalRat.g:462:1: ruleNumerateur : ( ( rule__Numerateur__Group__0 ) ) ;
    public final void ruleNumerateur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:466:2: ( ( ( rule__Numerateur__Group__0 ) ) )
            // InternalRat.g:467:2: ( ( rule__Numerateur__Group__0 ) )
            {
            // InternalRat.g:467:2: ( ( rule__Numerateur__Group__0 ) )
            // InternalRat.g:468:3: ( rule__Numerateur__Group__0 )
            {
             before(grammarAccess.getNumerateurAccess().getGroup()); 
            // InternalRat.g:469:3: ( rule__Numerateur__Group__0 )
            // InternalRat.g:469:4: rule__Numerateur__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Numerateur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumerateurAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumerateur"


    // $ANTLR start "entryRuleDenominateur"
    // InternalRat.g:478:1: entryRuleDenominateur : ruleDenominateur EOF ;
    public final void entryRuleDenominateur() throws RecognitionException {
        try {
            // InternalRat.g:479:1: ( ruleDenominateur EOF )
            // InternalRat.g:480:1: ruleDenominateur EOF
            {
             before(grammarAccess.getDenominateurRule()); 
            pushFollow(FOLLOW_1);
            ruleDenominateur();

            state._fsp--;

             after(grammarAccess.getDenominateurRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDenominateur"


    // $ANTLR start "ruleDenominateur"
    // InternalRat.g:487:1: ruleDenominateur : ( ( rule__Denominateur__Group__0 ) ) ;
    public final void ruleDenominateur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:491:2: ( ( ( rule__Denominateur__Group__0 ) ) )
            // InternalRat.g:492:2: ( ( rule__Denominateur__Group__0 ) )
            {
            // InternalRat.g:492:2: ( ( rule__Denominateur__Group__0 ) )
            // InternalRat.g:493:3: ( rule__Denominateur__Group__0 )
            {
             before(grammarAccess.getDenominateurAccess().getGroup()); 
            // InternalRat.g:494:3: ( rule__Denominateur__Group__0 )
            // InternalRat.g:494:4: rule__Denominateur__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Denominateur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDenominateurAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDenominateur"


    // $ANTLR start "entryRuleIdentificateur"
    // InternalRat.g:503:1: entryRuleIdentificateur : ruleIdentificateur EOF ;
    public final void entryRuleIdentificateur() throws RecognitionException {
        try {
            // InternalRat.g:504:1: ( ruleIdentificateur EOF )
            // InternalRat.g:505:1: ruleIdentificateur EOF
            {
             before(grammarAccess.getIdentificateurRule()); 
            pushFollow(FOLLOW_1);
            ruleIdentificateur();

            state._fsp--;

             after(grammarAccess.getIdentificateurRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdentificateur"


    // $ANTLR start "ruleIdentificateur"
    // InternalRat.g:512:1: ruleIdentificateur : ( ( rule__Identificateur__IdAssignment ) ) ;
    public final void ruleIdentificateur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:516:2: ( ( ( rule__Identificateur__IdAssignment ) ) )
            // InternalRat.g:517:2: ( ( rule__Identificateur__IdAssignment ) )
            {
            // InternalRat.g:517:2: ( ( rule__Identificateur__IdAssignment ) )
            // InternalRat.g:518:3: ( rule__Identificateur__IdAssignment )
            {
             before(grammarAccess.getIdentificateurAccess().getIdAssignment()); 
            // InternalRat.g:519:3: ( rule__Identificateur__IdAssignment )
            // InternalRat.g:519:4: rule__Identificateur__IdAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Identificateur__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIdentificateurAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentificateur"


    // $ANTLR start "entryRuleBoolean"
    // InternalRat.g:528:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalRat.g:529:1: ( ruleBoolean EOF )
            // InternalRat.g:530:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalRat.g:537:1: ruleBoolean : ( ( rule__Boolean__ValAssignment ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:541:2: ( ( ( rule__Boolean__ValAssignment ) ) )
            // InternalRat.g:542:2: ( ( rule__Boolean__ValAssignment ) )
            {
            // InternalRat.g:542:2: ( ( rule__Boolean__ValAssignment ) )
            // InternalRat.g:543:3: ( rule__Boolean__ValAssignment )
            {
             before(grammarAccess.getBooleanAccess().getValAssignment()); 
            // InternalRat.g:544:3: ( rule__Boolean__ValAssignment )
            // InternalRat.g:544:4: rule__Boolean__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleEntier"
    // InternalRat.g:553:1: entryRuleEntier : ruleEntier EOF ;
    public final void entryRuleEntier() throws RecognitionException {
        try {
            // InternalRat.g:554:1: ( ruleEntier EOF )
            // InternalRat.g:555:1: ruleEntier EOF
            {
             before(grammarAccess.getEntierRule()); 
            pushFollow(FOLLOW_1);
            ruleEntier();

            state._fsp--;

             after(grammarAccess.getEntierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntier"


    // $ANTLR start "ruleEntier"
    // InternalRat.g:562:1: ruleEntier : ( ( rule__Entier__IntAssignment ) ) ;
    public final void ruleEntier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:566:2: ( ( ( rule__Entier__IntAssignment ) ) )
            // InternalRat.g:567:2: ( ( rule__Entier__IntAssignment ) )
            {
            // InternalRat.g:567:2: ( ( rule__Entier__IntAssignment ) )
            // InternalRat.g:568:3: ( rule__Entier__IntAssignment )
            {
             before(grammarAccess.getEntierAccess().getIntAssignment()); 
            // InternalRat.g:569:3: ( rule__Entier__IntAssignment )
            // InternalRat.g:569:4: rule__Entier__IntAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Entier__IntAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntierAccess().getIntAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntier"


    // $ANTLR start "entryRuleOpBin"
    // InternalRat.g:578:1: entryRuleOpBin : ruleOpBin EOF ;
    public final void entryRuleOpBin() throws RecognitionException {
        try {
            // InternalRat.g:579:1: ( ruleOpBin EOF )
            // InternalRat.g:580:1: ruleOpBin EOF
            {
             before(grammarAccess.getOpBinRule()); 
            pushFollow(FOLLOW_1);
            ruleOpBin();

            state._fsp--;

             after(grammarAccess.getOpBinRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpBin"


    // $ANTLR start "ruleOpBin"
    // InternalRat.g:587:1: ruleOpBin : ( ( rule__OpBin__Group__0 ) ) ;
    public final void ruleOpBin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:591:2: ( ( ( rule__OpBin__Group__0 ) ) )
            // InternalRat.g:592:2: ( ( rule__OpBin__Group__0 ) )
            {
            // InternalRat.g:592:2: ( ( rule__OpBin__Group__0 ) )
            // InternalRat.g:593:3: ( rule__OpBin__Group__0 )
            {
             before(grammarAccess.getOpBinAccess().getGroup()); 
            // InternalRat.g:594:3: ( rule__OpBin__Group__0 )
            // InternalRat.g:594:4: rule__OpBin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpBin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpBinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpBin"


    // $ANTLR start "entryRuleOperande"
    // InternalRat.g:603:1: entryRuleOperande : ruleOperande EOF ;
    public final void entryRuleOperande() throws RecognitionException {
        try {
            // InternalRat.g:604:1: ( ruleOperande EOF )
            // InternalRat.g:605:1: ruleOperande EOF
            {
             before(grammarAccess.getOperandeRule()); 
            pushFollow(FOLLOW_1);
            ruleOperande();

            state._fsp--;

             after(grammarAccess.getOperandeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperande"


    // $ANTLR start "ruleOperande"
    // InternalRat.g:612:1: ruleOperande : ( ( rule__Operande__OpAssignment ) ) ;
    public final void ruleOperande() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:616:2: ( ( ( rule__Operande__OpAssignment ) ) )
            // InternalRat.g:617:2: ( ( rule__Operande__OpAssignment ) )
            {
            // InternalRat.g:617:2: ( ( rule__Operande__OpAssignment ) )
            // InternalRat.g:618:3: ( rule__Operande__OpAssignment )
            {
             before(grammarAccess.getOperandeAccess().getOpAssignment()); 
            // InternalRat.g:619:3: ( rule__Operande__OpAssignment )
            // InternalRat.g:619:4: rule__Operande__OpAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Operande__OpAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOperandeAccess().getOpAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperande"


    // $ANTLR start "rule__I__Alternatives"
    // InternalRat.g:627:1: rule__I__Alternatives : ( ( ruleDeclaration ) | ( ruleAffectation ) | ( ruleConstante ) | ( rulePrint ) | ( ruleConditionnelle ) | ( ruleTantque ) );
    public final void rule__I__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:631:1: ( ( ruleDeclaration ) | ( ruleAffectation ) | ( ruleConstante ) | ( rulePrint ) | ( ruleConditionnelle ) | ( ruleTantque ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 13:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            case 27:
                {
                alt1=4;
                }
                break;
            case 28:
                {
                alt1=5;
                }
                break;
            case 30:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRat.g:632:2: ( ruleDeclaration )
                    {
                    // InternalRat.g:632:2: ( ruleDeclaration )
                    // InternalRat.g:633:3: ruleDeclaration
                    {
                     before(grammarAccess.getIAccess().getDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDeclaration();

                    state._fsp--;

                     after(grammarAccess.getIAccess().getDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRat.g:638:2: ( ruleAffectation )
                    {
                    // InternalRat.g:638:2: ( ruleAffectation )
                    // InternalRat.g:639:3: ruleAffectation
                    {
                     before(grammarAccess.getIAccess().getAffectationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAffectation();

                    state._fsp--;

                     after(grammarAccess.getIAccess().getAffectationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRat.g:644:2: ( ruleConstante )
                    {
                    // InternalRat.g:644:2: ( ruleConstante )
                    // InternalRat.g:645:3: ruleConstante
                    {
                     before(grammarAccess.getIAccess().getConstanteParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleConstante();

                    state._fsp--;

                     after(grammarAccess.getIAccess().getConstanteParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRat.g:650:2: ( rulePrint )
                    {
                    // InternalRat.g:650:2: ( rulePrint )
                    // InternalRat.g:651:3: rulePrint
                    {
                     before(grammarAccess.getIAccess().getPrintParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePrint();

                    state._fsp--;

                     after(grammarAccess.getIAccess().getPrintParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRat.g:656:2: ( ruleConditionnelle )
                    {
                    // InternalRat.g:656:2: ( ruleConditionnelle )
                    // InternalRat.g:657:3: ruleConditionnelle
                    {
                     before(grammarAccess.getIAccess().getConditionnelleParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleConditionnelle();

                    state._fsp--;

                     after(grammarAccess.getIAccess().getConditionnelleParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRat.g:662:2: ( ruleTantque )
                    {
                    // InternalRat.g:662:2: ( ruleTantque )
                    // InternalRat.g:663:3: ruleTantque
                    {
                     before(grammarAccess.getIAccess().getTantqueParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleTantque();

                    state._fsp--;

                     after(grammarAccess.getIAccess().getTantqueParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__I__Alternatives"


    // $ANTLR start "rule__Type__TAlternatives_0"
    // InternalRat.g:672:1: rule__Type__TAlternatives_0 : ( ( 'bool' ) | ( 'int' ) | ( 'rat' ) );
    public final void rule__Type__TAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:676:1: ( ( 'bool' ) | ( 'int' ) | ( 'rat' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRat.g:677:2: ( 'bool' )
                    {
                    // InternalRat.g:677:2: ( 'bool' )
                    // InternalRat.g:678:3: 'bool'
                    {
                     before(grammarAccess.getTypeAccess().getTBoolKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getTBoolKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRat.g:683:2: ( 'int' )
                    {
                    // InternalRat.g:683:2: ( 'int' )
                    // InternalRat.g:684:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getTIntKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getTIntKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRat.g:689:2: ( 'rat' )
                    {
                    // InternalRat.g:689:2: ( 'rat' )
                    // InternalRat.g:690:3: 'rat'
                    {
                     before(grammarAccess.getTypeAccess().getTRatKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getTRatKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TAlternatives_0"


    // $ANTLR start "rule__E__Alternatives"
    // InternalRat.g:699:1: rule__E__Alternatives : ( ( ruleAppel ) | ( ruleRationnel ) | ( ruleNumerateur ) | ( ruleDenominateur ) | ( ruleIdentificateur ) | ( ruleBoolean ) | ( ruleEntier ) | ( ruleOpBin ) );
    public final void rule__E__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:703:1: ( ( ruleAppel ) | ( ruleRationnel ) | ( ruleNumerateur ) | ( ruleDenominateur ) | ( ruleIdentificateur ) | ( ruleBoolean ) | ( ruleEntier ) | ( ruleOpBin ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case 35:
                {
                alt3=3;
                }
                break;
            case 36:
                {
                alt3=4;
                }
                break;
            case RULE_ID:
                {
                alt3=5;
                }
                break;
            case 14:
            case 15:
                {
                alt3=6;
                }
                break;
            case RULE_INT:
                {
                alt3=7;
                }
                break;
            case 20:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRat.g:704:2: ( ruleAppel )
                    {
                    // InternalRat.g:704:2: ( ruleAppel )
                    // InternalRat.g:705:3: ruleAppel
                    {
                     before(grammarAccess.getEAccess().getAppelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAppel();

                    state._fsp--;

                     after(grammarAccess.getEAccess().getAppelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRat.g:710:2: ( ruleRationnel )
                    {
                    // InternalRat.g:710:2: ( ruleRationnel )
                    // InternalRat.g:711:3: ruleRationnel
                    {
                     before(grammarAccess.getEAccess().getRationnelParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRationnel();

                    state._fsp--;

                     after(grammarAccess.getEAccess().getRationnelParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRat.g:716:2: ( ruleNumerateur )
                    {
                    // InternalRat.g:716:2: ( ruleNumerateur )
                    // InternalRat.g:717:3: ruleNumerateur
                    {
                     before(grammarAccess.getEAccess().getNumerateurParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNumerateur();

                    state._fsp--;

                     after(grammarAccess.getEAccess().getNumerateurParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRat.g:722:2: ( ruleDenominateur )
                    {
                    // InternalRat.g:722:2: ( ruleDenominateur )
                    // InternalRat.g:723:3: ruleDenominateur
                    {
                     before(grammarAccess.getEAccess().getDenominateurParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDenominateur();

                    state._fsp--;

                     after(grammarAccess.getEAccess().getDenominateurParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRat.g:728:2: ( ruleIdentificateur )
                    {
                    // InternalRat.g:728:2: ( ruleIdentificateur )
                    // InternalRat.g:729:3: ruleIdentificateur
                    {
                     before(grammarAccess.getEAccess().getIdentificateurParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleIdentificateur();

                    state._fsp--;

                     after(grammarAccess.getEAccess().getIdentificateurParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRat.g:734:2: ( ruleBoolean )
                    {
                    // InternalRat.g:734:2: ( ruleBoolean )
                    // InternalRat.g:735:3: ruleBoolean
                    {
                     before(grammarAccess.getEAccess().getBooleanParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getEAccess().getBooleanParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRat.g:740:2: ( ruleEntier )
                    {
                    // InternalRat.g:740:2: ( ruleEntier )
                    // InternalRat.g:741:3: ruleEntier
                    {
                     before(grammarAccess.getEAccess().getEntierParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleEntier();

                    state._fsp--;

                     after(grammarAccess.getEAccess().getEntierParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRat.g:746:2: ( ruleOpBin )
                    {
                    // InternalRat.g:746:2: ( ruleOpBin )
                    // InternalRat.g:747:3: ruleOpBin
                    {
                     before(grammarAccess.getEAccess().getOpBinParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleOpBin();

                    state._fsp--;

                     after(grammarAccess.getEAccess().getOpBinParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__E__Alternatives"


    // $ANTLR start "rule__Boolean__ValAlternatives_0"
    // InternalRat.g:756:1: rule__Boolean__ValAlternatives_0 : ( ( 'false' ) | ( 'true' ) );
    public final void rule__Boolean__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:760:1: ( ( 'false' ) | ( 'true' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRat.g:761:2: ( 'false' )
                    {
                    // InternalRat.g:761:2: ( 'false' )
                    // InternalRat.g:762:3: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getValFalseKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getValFalseKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRat.g:767:2: ( 'true' )
                    {
                    // InternalRat.g:767:2: ( 'true' )
                    // InternalRat.g:768:3: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getValTrueKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getValTrueKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__ValAlternatives_0"


    // $ANTLR start "rule__Operande__OpAlternatives_0"
    // InternalRat.g:777:1: rule__Operande__OpAlternatives_0 : ( ( '+' ) | ( '=' ) | ( '*' ) | ( '<' ) );
    public final void rule__Operande__OpAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:781:1: ( ( '+' ) | ( '=' ) | ( '*' ) | ( '<' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRat.g:782:2: ( '+' )
                    {
                    // InternalRat.g:782:2: ( '+' )
                    // InternalRat.g:783:3: '+'
                    {
                     before(grammarAccess.getOperandeAccess().getOpPlusSignKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOperandeAccess().getOpPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRat.g:788:2: ( '=' )
                    {
                    // InternalRat.g:788:2: ( '=' )
                    // InternalRat.g:789:3: '='
                    {
                     before(grammarAccess.getOperandeAccess().getOpEqualsSignKeyword_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOperandeAccess().getOpEqualsSignKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRat.g:794:2: ( '*' )
                    {
                    // InternalRat.g:794:2: ( '*' )
                    // InternalRat.g:795:3: '*'
                    {
                     before(grammarAccess.getOperandeAccess().getOpAsteriskKeyword_0_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOperandeAccess().getOpAsteriskKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRat.g:800:2: ( '<' )
                    {
                    // InternalRat.g:800:2: ( '<' )
                    // InternalRat.g:801:3: '<'
                    {
                     before(grammarAccess.getOperandeAccess().getOpLessThanSignKeyword_0_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOperandeAccess().getOpLessThanSignKeyword_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operande__OpAlternatives_0"


    // $ANTLR start "rule__Prog__Group__0"
    // InternalRat.g:810:1: rule__Prog__Group__0 : rule__Prog__Group__0__Impl rule__Prog__Group__1 ;
    public final void rule__Prog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:814:1: ( rule__Prog__Group__0__Impl rule__Prog__Group__1 )
            // InternalRat.g:815:2: rule__Prog__Group__0__Impl rule__Prog__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Prog__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prog__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__Group__0"


    // $ANTLR start "rule__Prog__Group__0__Impl"
    // InternalRat.g:822:1: rule__Prog__Group__0__Impl : ( ( rule__Prog__FunAssignment_0 )* ) ;
    public final void rule__Prog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:826:1: ( ( ( rule__Prog__FunAssignment_0 )* ) )
            // InternalRat.g:827:1: ( ( rule__Prog__FunAssignment_0 )* )
            {
            // InternalRat.g:827:1: ( ( rule__Prog__FunAssignment_0 )* )
            // InternalRat.g:828:2: ( rule__Prog__FunAssignment_0 )*
            {
             before(grammarAccess.getProgAccess().getFunAssignment_0()); 
            // InternalRat.g:829:2: ( rule__Prog__FunAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=13)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRat.g:829:3: rule__Prog__FunAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Prog__FunAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProgAccess().getFunAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__Group__0__Impl"


    // $ANTLR start "rule__Prog__Group__1"
    // InternalRat.g:837:1: rule__Prog__Group__1 : rule__Prog__Group__1__Impl rule__Prog__Group__2 ;
    public final void rule__Prog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:841:1: ( rule__Prog__Group__1__Impl rule__Prog__Group__2 )
            // InternalRat.g:842:2: rule__Prog__Group__1__Impl rule__Prog__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Prog__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prog__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__Group__1"


    // $ANTLR start "rule__Prog__Group__1__Impl"
    // InternalRat.g:849:1: rule__Prog__Group__1__Impl : ( ( rule__Prog__NomProgAssignment_1 ) ) ;
    public final void rule__Prog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:853:1: ( ( ( rule__Prog__NomProgAssignment_1 ) ) )
            // InternalRat.g:854:1: ( ( rule__Prog__NomProgAssignment_1 ) )
            {
            // InternalRat.g:854:1: ( ( rule__Prog__NomProgAssignment_1 ) )
            // InternalRat.g:855:2: ( rule__Prog__NomProgAssignment_1 )
            {
             before(grammarAccess.getProgAccess().getNomProgAssignment_1()); 
            // InternalRat.g:856:2: ( rule__Prog__NomProgAssignment_1 )
            // InternalRat.g:856:3: rule__Prog__NomProgAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Prog__NomProgAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgAccess().getNomProgAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__Group__1__Impl"


    // $ANTLR start "rule__Prog__Group__2"
    // InternalRat.g:864:1: rule__Prog__Group__2 : rule__Prog__Group__2__Impl ;
    public final void rule__Prog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:868:1: ( rule__Prog__Group__2__Impl )
            // InternalRat.g:869:2: rule__Prog__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prog__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__Group__2"


    // $ANTLR start "rule__Prog__Group__2__Impl"
    // InternalRat.g:875:1: rule__Prog__Group__2__Impl : ( ( rule__Prog__BlocAssignment_2 ) ) ;
    public final void rule__Prog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:879:1: ( ( ( rule__Prog__BlocAssignment_2 ) ) )
            // InternalRat.g:880:1: ( ( rule__Prog__BlocAssignment_2 ) )
            {
            // InternalRat.g:880:1: ( ( rule__Prog__BlocAssignment_2 ) )
            // InternalRat.g:881:2: ( rule__Prog__BlocAssignment_2 )
            {
             before(grammarAccess.getProgAccess().getBlocAssignment_2()); 
            // InternalRat.g:882:2: ( rule__Prog__BlocAssignment_2 )
            // InternalRat.g:882:3: rule__Prog__BlocAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Prog__BlocAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProgAccess().getBlocAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__Group__2__Impl"


    // $ANTLR start "rule__Fun__Group__0"
    // InternalRat.g:891:1: rule__Fun__Group__0 : rule__Fun__Group__0__Impl rule__Fun__Group__1 ;
    public final void rule__Fun__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:895:1: ( rule__Fun__Group__0__Impl rule__Fun__Group__1 )
            // InternalRat.g:896:2: rule__Fun__Group__0__Impl rule__Fun__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Fun__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fun__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__0"


    // $ANTLR start "rule__Fun__Group__0__Impl"
    // InternalRat.g:903:1: rule__Fun__Group__0__Impl : ( ( rule__Fun__TypeAssignment_0 ) ) ;
    public final void rule__Fun__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:907:1: ( ( ( rule__Fun__TypeAssignment_0 ) ) )
            // InternalRat.g:908:1: ( ( rule__Fun__TypeAssignment_0 ) )
            {
            // InternalRat.g:908:1: ( ( rule__Fun__TypeAssignment_0 ) )
            // InternalRat.g:909:2: ( rule__Fun__TypeAssignment_0 )
            {
             before(grammarAccess.getFunAccess().getTypeAssignment_0()); 
            // InternalRat.g:910:2: ( rule__Fun__TypeAssignment_0 )
            // InternalRat.g:910:3: rule__Fun__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Fun__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__0__Impl"


    // $ANTLR start "rule__Fun__Group__1"
    // InternalRat.g:918:1: rule__Fun__Group__1 : rule__Fun__Group__1__Impl rule__Fun__Group__2 ;
    public final void rule__Fun__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:922:1: ( rule__Fun__Group__1__Impl rule__Fun__Group__2 )
            // InternalRat.g:923:2: rule__Fun__Group__1__Impl rule__Fun__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Fun__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fun__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__1"


    // $ANTLR start "rule__Fun__Group__1__Impl"
    // InternalRat.g:930:1: rule__Fun__Group__1__Impl : ( ( rule__Fun__NomFunAssignment_1 ) ) ;
    public final void rule__Fun__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:934:1: ( ( ( rule__Fun__NomFunAssignment_1 ) ) )
            // InternalRat.g:935:1: ( ( rule__Fun__NomFunAssignment_1 ) )
            {
            // InternalRat.g:935:1: ( ( rule__Fun__NomFunAssignment_1 ) )
            // InternalRat.g:936:2: ( rule__Fun__NomFunAssignment_1 )
            {
             before(grammarAccess.getFunAccess().getNomFunAssignment_1()); 
            // InternalRat.g:937:2: ( rule__Fun__NomFunAssignment_1 )
            // InternalRat.g:937:3: rule__Fun__NomFunAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fun__NomFunAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunAccess().getNomFunAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__1__Impl"


    // $ANTLR start "rule__Fun__Group__2"
    // InternalRat.g:945:1: rule__Fun__Group__2 : rule__Fun__Group__2__Impl rule__Fun__Group__3 ;
    public final void rule__Fun__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:949:1: ( rule__Fun__Group__2__Impl rule__Fun__Group__3 )
            // InternalRat.g:950:2: rule__Fun__Group__2__Impl rule__Fun__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Fun__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fun__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__2"


    // $ANTLR start "rule__Fun__Group__2__Impl"
    // InternalRat.g:957:1: rule__Fun__Group__2__Impl : ( '(' ) ;
    public final void rule__Fun__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:961:1: ( ( '(' ) )
            // InternalRat.g:962:1: ( '(' )
            {
            // InternalRat.g:962:1: ( '(' )
            // InternalRat.g:963:2: '('
            {
             before(grammarAccess.getFunAccess().getLeftParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFunAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__2__Impl"


    // $ANTLR start "rule__Fun__Group__3"
    // InternalRat.g:972:1: rule__Fun__Group__3 : rule__Fun__Group__3__Impl rule__Fun__Group__4 ;
    public final void rule__Fun__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:976:1: ( rule__Fun__Group__3__Impl rule__Fun__Group__4 )
            // InternalRat.g:977:2: rule__Fun__Group__3__Impl rule__Fun__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Fun__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fun__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__3"


    // $ANTLR start "rule__Fun__Group__3__Impl"
    // InternalRat.g:984:1: rule__Fun__Group__3__Impl : ( ( rule__Fun__ParamAssignment_3 )* ) ;
    public final void rule__Fun__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:988:1: ( ( ( rule__Fun__ParamAssignment_3 )* ) )
            // InternalRat.g:989:1: ( ( rule__Fun__ParamAssignment_3 )* )
            {
            // InternalRat.g:989:1: ( ( rule__Fun__ParamAssignment_3 )* )
            // InternalRat.g:990:2: ( rule__Fun__ParamAssignment_3 )*
            {
             before(grammarAccess.getFunAccess().getParamAssignment_3()); 
            // InternalRat.g:991:2: ( rule__Fun__ParamAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=11 && LA7_0<=13)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRat.g:991:3: rule__Fun__ParamAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Fun__ParamAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFunAccess().getParamAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__3__Impl"


    // $ANTLR start "rule__Fun__Group__4"
    // InternalRat.g:999:1: rule__Fun__Group__4 : rule__Fun__Group__4__Impl rule__Fun__Group__5 ;
    public final void rule__Fun__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1003:1: ( rule__Fun__Group__4__Impl rule__Fun__Group__5 )
            // InternalRat.g:1004:2: rule__Fun__Group__4__Impl rule__Fun__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Fun__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fun__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__4"


    // $ANTLR start "rule__Fun__Group__4__Impl"
    // InternalRat.g:1011:1: rule__Fun__Group__4__Impl : ( ')' ) ;
    public final void rule__Fun__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1015:1: ( ( ')' ) )
            // InternalRat.g:1016:1: ( ')' )
            {
            // InternalRat.g:1016:1: ( ')' )
            // InternalRat.g:1017:2: ')'
            {
             before(grammarAccess.getFunAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFunAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__4__Impl"


    // $ANTLR start "rule__Fun__Group__5"
    // InternalRat.g:1026:1: rule__Fun__Group__5 : rule__Fun__Group__5__Impl rule__Fun__Group__6 ;
    public final void rule__Fun__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1030:1: ( rule__Fun__Group__5__Impl rule__Fun__Group__6 )
            // InternalRat.g:1031:2: rule__Fun__Group__5__Impl rule__Fun__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Fun__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fun__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__5"


    // $ANTLR start "rule__Fun__Group__5__Impl"
    // InternalRat.g:1038:1: rule__Fun__Group__5__Impl : ( '{' ) ;
    public final void rule__Fun__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1042:1: ( ( '{' ) )
            // InternalRat.g:1043:1: ( '{' )
            {
            // InternalRat.g:1043:1: ( '{' )
            // InternalRat.g:1044:2: '{'
            {
             before(grammarAccess.getFunAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFunAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__5__Impl"


    // $ANTLR start "rule__Fun__Group__6"
    // InternalRat.g:1053:1: rule__Fun__Group__6 : rule__Fun__Group__6__Impl rule__Fun__Group__7 ;
    public final void rule__Fun__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1057:1: ( rule__Fun__Group__6__Impl rule__Fun__Group__7 )
            // InternalRat.g:1058:2: rule__Fun__Group__6__Impl rule__Fun__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Fun__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fun__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__6"


    // $ANTLR start "rule__Fun__Group__6__Impl"
    // InternalRat.g:1065:1: rule__Fun__Group__6__Impl : ( ( rule__Fun__IsAssignment_6 )* ) ;
    public final void rule__Fun__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1069:1: ( ( ( rule__Fun__IsAssignment_6 )* ) )
            // InternalRat.g:1070:1: ( ( rule__Fun__IsAssignment_6 )* )
            {
            // InternalRat.g:1070:1: ( ( rule__Fun__IsAssignment_6 )* )
            // InternalRat.g:1071:2: ( rule__Fun__IsAssignment_6 )*
            {
             before(grammarAccess.getFunAccess().getIsAssignment_6()); 
            // InternalRat.g:1072:2: ( rule__Fun__IsAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=11 && LA8_0<=13)||(LA8_0>=26 && LA8_0<=28)||LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRat.g:1072:3: rule__Fun__IsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Fun__IsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFunAccess().getIsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__6__Impl"


    // $ANTLR start "rule__Fun__Group__7"
    // InternalRat.g:1080:1: rule__Fun__Group__7 : rule__Fun__Group__7__Impl rule__Fun__Group__8 ;
    public final void rule__Fun__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1084:1: ( rule__Fun__Group__7__Impl rule__Fun__Group__8 )
            // InternalRat.g:1085:2: rule__Fun__Group__7__Impl rule__Fun__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Fun__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fun__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__7"


    // $ANTLR start "rule__Fun__Group__7__Impl"
    // InternalRat.g:1092:1: rule__Fun__Group__7__Impl : ( 'return' ) ;
    public final void rule__Fun__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1096:1: ( ( 'return' ) )
            // InternalRat.g:1097:1: ( 'return' )
            {
            // InternalRat.g:1097:1: ( 'return' )
            // InternalRat.g:1098:2: 'return'
            {
             before(grammarAccess.getFunAccess().getReturnKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFunAccess().getReturnKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__7__Impl"


    // $ANTLR start "rule__Fun__Group__8"
    // InternalRat.g:1107:1: rule__Fun__Group__8 : rule__Fun__Group__8__Impl rule__Fun__Group__9 ;
    public final void rule__Fun__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1111:1: ( rule__Fun__Group__8__Impl rule__Fun__Group__9 )
            // InternalRat.g:1112:2: rule__Fun__Group__8__Impl rule__Fun__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Fun__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fun__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__8"


    // $ANTLR start "rule__Fun__Group__8__Impl"
    // InternalRat.g:1119:1: rule__Fun__Group__8__Impl : ( ( rule__Fun__RetourAssignment_8 ) ) ;
    public final void rule__Fun__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1123:1: ( ( ( rule__Fun__RetourAssignment_8 ) ) )
            // InternalRat.g:1124:1: ( ( rule__Fun__RetourAssignment_8 ) )
            {
            // InternalRat.g:1124:1: ( ( rule__Fun__RetourAssignment_8 ) )
            // InternalRat.g:1125:2: ( rule__Fun__RetourAssignment_8 )
            {
             before(grammarAccess.getFunAccess().getRetourAssignment_8()); 
            // InternalRat.g:1126:2: ( rule__Fun__RetourAssignment_8 )
            // InternalRat.g:1126:3: rule__Fun__RetourAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Fun__RetourAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getFunAccess().getRetourAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__8__Impl"


    // $ANTLR start "rule__Fun__Group__9"
    // InternalRat.g:1134:1: rule__Fun__Group__9 : rule__Fun__Group__9__Impl rule__Fun__Group__10 ;
    public final void rule__Fun__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1138:1: ( rule__Fun__Group__9__Impl rule__Fun__Group__10 )
            // InternalRat.g:1139:2: rule__Fun__Group__9__Impl rule__Fun__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Fun__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fun__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__9"


    // $ANTLR start "rule__Fun__Group__9__Impl"
    // InternalRat.g:1146:1: rule__Fun__Group__9__Impl : ( ';' ) ;
    public final void rule__Fun__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1150:1: ( ( ';' ) )
            // InternalRat.g:1151:1: ( ';' )
            {
            // InternalRat.g:1151:1: ( ';' )
            // InternalRat.g:1152:2: ';'
            {
             before(grammarAccess.getFunAccess().getSemicolonKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFunAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__9__Impl"


    // $ANTLR start "rule__Fun__Group__10"
    // InternalRat.g:1161:1: rule__Fun__Group__10 : rule__Fun__Group__10__Impl ;
    public final void rule__Fun__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1165:1: ( rule__Fun__Group__10__Impl )
            // InternalRat.g:1166:2: rule__Fun__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fun__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__10"


    // $ANTLR start "rule__Fun__Group__10__Impl"
    // InternalRat.g:1172:1: rule__Fun__Group__10__Impl : ( '}' ) ;
    public final void rule__Fun__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1176:1: ( ( '}' ) )
            // InternalRat.g:1177:1: ( '}' )
            {
            // InternalRat.g:1177:1: ( '}' )
            // InternalRat.g:1178:2: '}'
            {
             before(grammarAccess.getFunAccess().getRightCurlyBracketKeyword_10()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFunAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__10__Impl"


    // $ANTLR start "rule__Bloc__Group__0"
    // InternalRat.g:1188:1: rule__Bloc__Group__0 : rule__Bloc__Group__0__Impl rule__Bloc__Group__1 ;
    public final void rule__Bloc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1192:1: ( rule__Bloc__Group__0__Impl rule__Bloc__Group__1 )
            // InternalRat.g:1193:2: rule__Bloc__Group__0__Impl rule__Bloc__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Bloc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bloc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__0"


    // $ANTLR start "rule__Bloc__Group__0__Impl"
    // InternalRat.g:1200:1: rule__Bloc__Group__0__Impl : ( () ) ;
    public final void rule__Bloc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1204:1: ( ( () ) )
            // InternalRat.g:1205:1: ( () )
            {
            // InternalRat.g:1205:1: ( () )
            // InternalRat.g:1206:2: ()
            {
             before(grammarAccess.getBlocAccess().getBlocAction_0()); 
            // InternalRat.g:1207:2: ()
            // InternalRat.g:1207:3: 
            {
            }

             after(grammarAccess.getBlocAccess().getBlocAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__0__Impl"


    // $ANTLR start "rule__Bloc__Group__1"
    // InternalRat.g:1215:1: rule__Bloc__Group__1 : rule__Bloc__Group__1__Impl rule__Bloc__Group__2 ;
    public final void rule__Bloc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1219:1: ( rule__Bloc__Group__1__Impl rule__Bloc__Group__2 )
            // InternalRat.g:1220:2: rule__Bloc__Group__1__Impl rule__Bloc__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Bloc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bloc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__1"


    // $ANTLR start "rule__Bloc__Group__1__Impl"
    // InternalRat.g:1227:1: rule__Bloc__Group__1__Impl : ( '{' ) ;
    public final void rule__Bloc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1231:1: ( ( '{' ) )
            // InternalRat.g:1232:1: ( '{' )
            {
            // InternalRat.g:1232:1: ( '{' )
            // InternalRat.g:1233:2: '{'
            {
             before(grammarAccess.getBlocAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBlocAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__1__Impl"


    // $ANTLR start "rule__Bloc__Group__2"
    // InternalRat.g:1242:1: rule__Bloc__Group__2 : rule__Bloc__Group__2__Impl rule__Bloc__Group__3 ;
    public final void rule__Bloc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1246:1: ( rule__Bloc__Group__2__Impl rule__Bloc__Group__3 )
            // InternalRat.g:1247:2: rule__Bloc__Group__2__Impl rule__Bloc__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Bloc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bloc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__2"


    // $ANTLR start "rule__Bloc__Group__2__Impl"
    // InternalRat.g:1254:1: rule__Bloc__Group__2__Impl : ( ( rule__Bloc__IsAssignment_2 )* ) ;
    public final void rule__Bloc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1258:1: ( ( ( rule__Bloc__IsAssignment_2 )* ) )
            // InternalRat.g:1259:1: ( ( rule__Bloc__IsAssignment_2 )* )
            {
            // InternalRat.g:1259:1: ( ( rule__Bloc__IsAssignment_2 )* )
            // InternalRat.g:1260:2: ( rule__Bloc__IsAssignment_2 )*
            {
             before(grammarAccess.getBlocAccess().getIsAssignment_2()); 
            // InternalRat.g:1261:2: ( rule__Bloc__IsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=11 && LA9_0<=13)||(LA9_0>=26 && LA9_0<=28)||LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRat.g:1261:3: rule__Bloc__IsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Bloc__IsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getBlocAccess().getIsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__2__Impl"


    // $ANTLR start "rule__Bloc__Group__3"
    // InternalRat.g:1269:1: rule__Bloc__Group__3 : rule__Bloc__Group__3__Impl ;
    public final void rule__Bloc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1273:1: ( rule__Bloc__Group__3__Impl )
            // InternalRat.g:1274:2: rule__Bloc__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bloc__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__3"


    // $ANTLR start "rule__Bloc__Group__3__Impl"
    // InternalRat.g:1280:1: rule__Bloc__Group__3__Impl : ( '}' ) ;
    public final void rule__Bloc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1284:1: ( ( '}' ) )
            // InternalRat.g:1285:1: ( '}' )
            {
            // InternalRat.g:1285:1: ( '}' )
            // InternalRat.g:1286:2: '}'
            {
             before(grammarAccess.getBlocAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBlocAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__3__Impl"


    // $ANTLR start "rule__Declaration__Group__0"
    // InternalRat.g:1296:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1300:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // InternalRat.g:1301:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // InternalRat.g:1308:1: rule__Declaration__Group__0__Impl : ( ( rule__Declaration__TypeAssignment_0 ) ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1312:1: ( ( ( rule__Declaration__TypeAssignment_0 ) ) )
            // InternalRat.g:1313:1: ( ( rule__Declaration__TypeAssignment_0 ) )
            {
            // InternalRat.g:1313:1: ( ( rule__Declaration__TypeAssignment_0 ) )
            // InternalRat.g:1314:2: ( rule__Declaration__TypeAssignment_0 )
            {
             before(grammarAccess.getDeclarationAccess().getTypeAssignment_0()); 
            // InternalRat.g:1315:2: ( rule__Declaration__TypeAssignment_0 )
            // InternalRat.g:1315:3: rule__Declaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // InternalRat.g:1323:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1327:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // InternalRat.g:1328:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // InternalRat.g:1335:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__NomDeclAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1339:1: ( ( ( rule__Declaration__NomDeclAssignment_1 ) ) )
            // InternalRat.g:1340:1: ( ( rule__Declaration__NomDeclAssignment_1 ) )
            {
            // InternalRat.g:1340:1: ( ( rule__Declaration__NomDeclAssignment_1 ) )
            // InternalRat.g:1341:2: ( rule__Declaration__NomDeclAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getNomDeclAssignment_1()); 
            // InternalRat.g:1342:2: ( rule__Declaration__NomDeclAssignment_1 )
            // InternalRat.g:1342:3: rule__Declaration__NomDeclAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__NomDeclAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getNomDeclAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__Declaration__Group__2"
    // InternalRat.g:1350:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl rule__Declaration__Group__3 ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1354:1: ( rule__Declaration__Group__2__Impl rule__Declaration__Group__3 )
            // InternalRat.g:1355:2: rule__Declaration__Group__2__Impl rule__Declaration__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2"


    // $ANTLR start "rule__Declaration__Group__2__Impl"
    // InternalRat.g:1362:1: rule__Declaration__Group__2__Impl : ( '=' ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1366:1: ( ( '=' ) )
            // InternalRat.g:1367:1: ( '=' )
            {
            // InternalRat.g:1367:1: ( '=' )
            // InternalRat.g:1368:2: '='
            {
             before(grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2__Impl"


    // $ANTLR start "rule__Declaration__Group__3"
    // InternalRat.g:1377:1: rule__Declaration__Group__3 : rule__Declaration__Group__3__Impl rule__Declaration__Group__4 ;
    public final void rule__Declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1381:1: ( rule__Declaration__Group__3__Impl rule__Declaration__Group__4 )
            // InternalRat.g:1382:2: rule__Declaration__Group__3__Impl rule__Declaration__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__3"


    // $ANTLR start "rule__Declaration__Group__3__Impl"
    // InternalRat.g:1389:1: rule__Declaration__Group__3__Impl : ( ( rule__Declaration__EAssignment_3 ) ) ;
    public final void rule__Declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1393:1: ( ( ( rule__Declaration__EAssignment_3 ) ) )
            // InternalRat.g:1394:1: ( ( rule__Declaration__EAssignment_3 ) )
            {
            // InternalRat.g:1394:1: ( ( rule__Declaration__EAssignment_3 ) )
            // InternalRat.g:1395:2: ( rule__Declaration__EAssignment_3 )
            {
             before(grammarAccess.getDeclarationAccess().getEAssignment_3()); 
            // InternalRat.g:1396:2: ( rule__Declaration__EAssignment_3 )
            // InternalRat.g:1396:3: rule__Declaration__EAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__EAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getEAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__3__Impl"


    // $ANTLR start "rule__Declaration__Group__4"
    // InternalRat.g:1404:1: rule__Declaration__Group__4 : rule__Declaration__Group__4__Impl ;
    public final void rule__Declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1408:1: ( rule__Declaration__Group__4__Impl )
            // InternalRat.g:1409:2: rule__Declaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__4"


    // $ANTLR start "rule__Declaration__Group__4__Impl"
    // InternalRat.g:1415:1: rule__Declaration__Group__4__Impl : ( ';' ) ;
    public final void rule__Declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1419:1: ( ( ';' ) )
            // InternalRat.g:1420:1: ( ';' )
            {
            // InternalRat.g:1420:1: ( ';' )
            // InternalRat.g:1421:2: ';'
            {
             before(grammarAccess.getDeclarationAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__4__Impl"


    // $ANTLR start "rule__Affectation__Group__0"
    // InternalRat.g:1431:1: rule__Affectation__Group__0 : rule__Affectation__Group__0__Impl rule__Affectation__Group__1 ;
    public final void rule__Affectation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1435:1: ( rule__Affectation__Group__0__Impl rule__Affectation__Group__1 )
            // InternalRat.g:1436:2: rule__Affectation__Group__0__Impl rule__Affectation__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Affectation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__0"


    // $ANTLR start "rule__Affectation__Group__0__Impl"
    // InternalRat.g:1443:1: rule__Affectation__Group__0__Impl : ( ( rule__Affectation__NomAffAssignment_0 ) ) ;
    public final void rule__Affectation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1447:1: ( ( ( rule__Affectation__NomAffAssignment_0 ) ) )
            // InternalRat.g:1448:1: ( ( rule__Affectation__NomAffAssignment_0 ) )
            {
            // InternalRat.g:1448:1: ( ( rule__Affectation__NomAffAssignment_0 ) )
            // InternalRat.g:1449:2: ( rule__Affectation__NomAffAssignment_0 )
            {
             before(grammarAccess.getAffectationAccess().getNomAffAssignment_0()); 
            // InternalRat.g:1450:2: ( rule__Affectation__NomAffAssignment_0 )
            // InternalRat.g:1450:3: rule__Affectation__NomAffAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__NomAffAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getNomAffAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__0__Impl"


    // $ANTLR start "rule__Affectation__Group__1"
    // InternalRat.g:1458:1: rule__Affectation__Group__1 : rule__Affectation__Group__1__Impl rule__Affectation__Group__2 ;
    public final void rule__Affectation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1462:1: ( rule__Affectation__Group__1__Impl rule__Affectation__Group__2 )
            // InternalRat.g:1463:2: rule__Affectation__Group__1__Impl rule__Affectation__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Affectation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__1"


    // $ANTLR start "rule__Affectation__Group__1__Impl"
    // InternalRat.g:1470:1: rule__Affectation__Group__1__Impl : ( '=' ) ;
    public final void rule__Affectation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1474:1: ( ( '=' ) )
            // InternalRat.g:1475:1: ( '=' )
            {
            // InternalRat.g:1475:1: ( '=' )
            // InternalRat.g:1476:2: '='
            {
             before(grammarAccess.getAffectationAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__1__Impl"


    // $ANTLR start "rule__Affectation__Group__2"
    // InternalRat.g:1485:1: rule__Affectation__Group__2 : rule__Affectation__Group__2__Impl rule__Affectation__Group__3 ;
    public final void rule__Affectation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1489:1: ( rule__Affectation__Group__2__Impl rule__Affectation__Group__3 )
            // InternalRat.g:1490:2: rule__Affectation__Group__2__Impl rule__Affectation__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Affectation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__2"


    // $ANTLR start "rule__Affectation__Group__2__Impl"
    // InternalRat.g:1497:1: rule__Affectation__Group__2__Impl : ( ( rule__Affectation__EAssignment_2 ) ) ;
    public final void rule__Affectation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1501:1: ( ( ( rule__Affectation__EAssignment_2 ) ) )
            // InternalRat.g:1502:1: ( ( rule__Affectation__EAssignment_2 ) )
            {
            // InternalRat.g:1502:1: ( ( rule__Affectation__EAssignment_2 ) )
            // InternalRat.g:1503:2: ( rule__Affectation__EAssignment_2 )
            {
             before(grammarAccess.getAffectationAccess().getEAssignment_2()); 
            // InternalRat.g:1504:2: ( rule__Affectation__EAssignment_2 )
            // InternalRat.g:1504:3: rule__Affectation__EAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__EAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getEAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__2__Impl"


    // $ANTLR start "rule__Affectation__Group__3"
    // InternalRat.g:1512:1: rule__Affectation__Group__3 : rule__Affectation__Group__3__Impl ;
    public final void rule__Affectation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1516:1: ( rule__Affectation__Group__3__Impl )
            // InternalRat.g:1517:2: rule__Affectation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__3"


    // $ANTLR start "rule__Affectation__Group__3__Impl"
    // InternalRat.g:1523:1: rule__Affectation__Group__3__Impl : ( ';' ) ;
    public final void rule__Affectation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1527:1: ( ( ';' ) )
            // InternalRat.g:1528:1: ( ';' )
            {
            // InternalRat.g:1528:1: ( ';' )
            // InternalRat.g:1529:2: ';'
            {
             before(grammarAccess.getAffectationAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__3__Impl"


    // $ANTLR start "rule__Constante__Group__0"
    // InternalRat.g:1539:1: rule__Constante__Group__0 : rule__Constante__Group__0__Impl rule__Constante__Group__1 ;
    public final void rule__Constante__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1543:1: ( rule__Constante__Group__0__Impl rule__Constante__Group__1 )
            // InternalRat.g:1544:2: rule__Constante__Group__0__Impl rule__Constante__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Constante__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constante__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constante__Group__0"


    // $ANTLR start "rule__Constante__Group__0__Impl"
    // InternalRat.g:1551:1: rule__Constante__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constante__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1555:1: ( ( 'const' ) )
            // InternalRat.g:1556:1: ( 'const' )
            {
            // InternalRat.g:1556:1: ( 'const' )
            // InternalRat.g:1557:2: 'const'
            {
             before(grammarAccess.getConstanteAccess().getConstKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConstanteAccess().getConstKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constante__Group__0__Impl"


    // $ANTLR start "rule__Constante__Group__1"
    // InternalRat.g:1566:1: rule__Constante__Group__1 : rule__Constante__Group__1__Impl rule__Constante__Group__2 ;
    public final void rule__Constante__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1570:1: ( rule__Constante__Group__1__Impl rule__Constante__Group__2 )
            // InternalRat.g:1571:2: rule__Constante__Group__1__Impl rule__Constante__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Constante__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constante__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constante__Group__1"


    // $ANTLR start "rule__Constante__Group__1__Impl"
    // InternalRat.g:1578:1: rule__Constante__Group__1__Impl : ( ( rule__Constante__NomConstAssignment_1 ) ) ;
    public final void rule__Constante__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1582:1: ( ( ( rule__Constante__NomConstAssignment_1 ) ) )
            // InternalRat.g:1583:1: ( ( rule__Constante__NomConstAssignment_1 ) )
            {
            // InternalRat.g:1583:1: ( ( rule__Constante__NomConstAssignment_1 ) )
            // InternalRat.g:1584:2: ( rule__Constante__NomConstAssignment_1 )
            {
             before(grammarAccess.getConstanteAccess().getNomConstAssignment_1()); 
            // InternalRat.g:1585:2: ( rule__Constante__NomConstAssignment_1 )
            // InternalRat.g:1585:3: rule__Constante__NomConstAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constante__NomConstAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstanteAccess().getNomConstAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constante__Group__1__Impl"


    // $ANTLR start "rule__Constante__Group__2"
    // InternalRat.g:1593:1: rule__Constante__Group__2 : rule__Constante__Group__2__Impl rule__Constante__Group__3 ;
    public final void rule__Constante__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1597:1: ( rule__Constante__Group__2__Impl rule__Constante__Group__3 )
            // InternalRat.g:1598:2: rule__Constante__Group__2__Impl rule__Constante__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Constante__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constante__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constante__Group__2"


    // $ANTLR start "rule__Constante__Group__2__Impl"
    // InternalRat.g:1605:1: rule__Constante__Group__2__Impl : ( '=' ) ;
    public final void rule__Constante__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1609:1: ( ( '=' ) )
            // InternalRat.g:1610:1: ( '=' )
            {
            // InternalRat.g:1610:1: ( '=' )
            // InternalRat.g:1611:2: '='
            {
             before(grammarAccess.getConstanteAccess().getEqualsSignKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConstanteAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constante__Group__2__Impl"


    // $ANTLR start "rule__Constante__Group__3"
    // InternalRat.g:1620:1: rule__Constante__Group__3 : rule__Constante__Group__3__Impl rule__Constante__Group__4 ;
    public final void rule__Constante__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1624:1: ( rule__Constante__Group__3__Impl rule__Constante__Group__4 )
            // InternalRat.g:1625:2: rule__Constante__Group__3__Impl rule__Constante__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Constante__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constante__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constante__Group__3"


    // $ANTLR start "rule__Constante__Group__3__Impl"
    // InternalRat.g:1632:1: rule__Constante__Group__3__Impl : ( ( rule__Constante__ValAssignment_3 ) ) ;
    public final void rule__Constante__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1636:1: ( ( ( rule__Constante__ValAssignment_3 ) ) )
            // InternalRat.g:1637:1: ( ( rule__Constante__ValAssignment_3 ) )
            {
            // InternalRat.g:1637:1: ( ( rule__Constante__ValAssignment_3 ) )
            // InternalRat.g:1638:2: ( rule__Constante__ValAssignment_3 )
            {
             before(grammarAccess.getConstanteAccess().getValAssignment_3()); 
            // InternalRat.g:1639:2: ( rule__Constante__ValAssignment_3 )
            // InternalRat.g:1639:3: rule__Constante__ValAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Constante__ValAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstanteAccess().getValAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constante__Group__3__Impl"


    // $ANTLR start "rule__Constante__Group__4"
    // InternalRat.g:1647:1: rule__Constante__Group__4 : rule__Constante__Group__4__Impl ;
    public final void rule__Constante__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1651:1: ( rule__Constante__Group__4__Impl )
            // InternalRat.g:1652:2: rule__Constante__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constante__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constante__Group__4"


    // $ANTLR start "rule__Constante__Group__4__Impl"
    // InternalRat.g:1658:1: rule__Constante__Group__4__Impl : ( ';' ) ;
    public final void rule__Constante__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1662:1: ( ( ';' ) )
            // InternalRat.g:1663:1: ( ';' )
            {
            // InternalRat.g:1663:1: ( ';' )
            // InternalRat.g:1664:2: ';'
            {
             before(grammarAccess.getConstanteAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConstanteAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constante__Group__4__Impl"


    // $ANTLR start "rule__Print__Group__0"
    // InternalRat.g:1674:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1678:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalRat.g:1679:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Print__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Print__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0"


    // $ANTLR start "rule__Print__Group__0__Impl"
    // InternalRat.g:1686:1: rule__Print__Group__0__Impl : ( 'print' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1690:1: ( ( 'print' ) )
            // InternalRat.g:1691:1: ( 'print' )
            {
            // InternalRat.g:1691:1: ( 'print' )
            // InternalRat.g:1692:2: 'print'
            {
             before(grammarAccess.getPrintAccess().getPrintKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getPrintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0__Impl"


    // $ANTLR start "rule__Print__Group__1"
    // InternalRat.g:1701:1: rule__Print__Group__1 : rule__Print__Group__1__Impl rule__Print__Group__2 ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1705:1: ( rule__Print__Group__1__Impl rule__Print__Group__2 )
            // InternalRat.g:1706:2: rule__Print__Group__1__Impl rule__Print__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Print__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Print__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1"


    // $ANTLR start "rule__Print__Group__1__Impl"
    // InternalRat.g:1713:1: rule__Print__Group__1__Impl : ( ( rule__Print__ValAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1717:1: ( ( ( rule__Print__ValAssignment_1 ) ) )
            // InternalRat.g:1718:1: ( ( rule__Print__ValAssignment_1 ) )
            {
            // InternalRat.g:1718:1: ( ( rule__Print__ValAssignment_1 ) )
            // InternalRat.g:1719:2: ( rule__Print__ValAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getValAssignment_1()); 
            // InternalRat.g:1720:2: ( rule__Print__ValAssignment_1 )
            // InternalRat.g:1720:3: rule__Print__ValAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Print__ValAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getValAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1__Impl"


    // $ANTLR start "rule__Print__Group__2"
    // InternalRat.g:1728:1: rule__Print__Group__2 : rule__Print__Group__2__Impl ;
    public final void rule__Print__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1732:1: ( rule__Print__Group__2__Impl )
            // InternalRat.g:1733:2: rule__Print__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__2"


    // $ANTLR start "rule__Print__Group__2__Impl"
    // InternalRat.g:1739:1: rule__Print__Group__2__Impl : ( ';' ) ;
    public final void rule__Print__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1743:1: ( ( ';' ) )
            // InternalRat.g:1744:1: ( ';' )
            {
            // InternalRat.g:1744:1: ( ';' )
            // InternalRat.g:1745:2: ';'
            {
             before(grammarAccess.getPrintAccess().getSemicolonKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__2__Impl"


    // $ANTLR start "rule__Conditionnelle__Group__0"
    // InternalRat.g:1755:1: rule__Conditionnelle__Group__0 : rule__Conditionnelle__Group__0__Impl rule__Conditionnelle__Group__1 ;
    public final void rule__Conditionnelle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1759:1: ( rule__Conditionnelle__Group__0__Impl rule__Conditionnelle__Group__1 )
            // InternalRat.g:1760:2: rule__Conditionnelle__Group__0__Impl rule__Conditionnelle__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Conditionnelle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditionnelle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditionnelle__Group__0"


    // $ANTLR start "rule__Conditionnelle__Group__0__Impl"
    // InternalRat.g:1767:1: rule__Conditionnelle__Group__0__Impl : ( 'if' ) ;
    public final void rule__Conditionnelle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1771:1: ( ( 'if' ) )
            // InternalRat.g:1772:1: ( 'if' )
            {
            // InternalRat.g:1772:1: ( 'if' )
            // InternalRat.g:1773:2: 'if'
            {
             before(grammarAccess.getConditionnelleAccess().getIfKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConditionnelleAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditionnelle__Group__0__Impl"


    // $ANTLR start "rule__Conditionnelle__Group__1"
    // InternalRat.g:1782:1: rule__Conditionnelle__Group__1 : rule__Conditionnelle__Group__1__Impl rule__Conditionnelle__Group__2 ;
    public final void rule__Conditionnelle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1786:1: ( rule__Conditionnelle__Group__1__Impl rule__Conditionnelle__Group__2 )
            // InternalRat.g:1787:2: rule__Conditionnelle__Group__1__Impl rule__Conditionnelle__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Conditionnelle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditionnelle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditionnelle__Group__1"


    // $ANTLR start "rule__Conditionnelle__Group__1__Impl"
    // InternalRat.g:1794:1: rule__Conditionnelle__Group__1__Impl : ( ( rule__Conditionnelle__CondcAssignment_1 ) ) ;
    public final void rule__Conditionnelle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1798:1: ( ( ( rule__Conditionnelle__CondcAssignment_1 ) ) )
            // InternalRat.g:1799:1: ( ( rule__Conditionnelle__CondcAssignment_1 ) )
            {
            // InternalRat.g:1799:1: ( ( rule__Conditionnelle__CondcAssignment_1 ) )
            // InternalRat.g:1800:2: ( rule__Conditionnelle__CondcAssignment_1 )
            {
             before(grammarAccess.getConditionnelleAccess().getCondcAssignment_1()); 
            // InternalRat.g:1801:2: ( rule__Conditionnelle__CondcAssignment_1 )
            // InternalRat.g:1801:3: rule__Conditionnelle__CondcAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Conditionnelle__CondcAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionnelleAccess().getCondcAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditionnelle__Group__1__Impl"


    // $ANTLR start "rule__Conditionnelle__Group__2"
    // InternalRat.g:1809:1: rule__Conditionnelle__Group__2 : rule__Conditionnelle__Group__2__Impl rule__Conditionnelle__Group__3 ;
    public final void rule__Conditionnelle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1813:1: ( rule__Conditionnelle__Group__2__Impl rule__Conditionnelle__Group__3 )
            // InternalRat.g:1814:2: rule__Conditionnelle__Group__2__Impl rule__Conditionnelle__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Conditionnelle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditionnelle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditionnelle__Group__2"


    // $ANTLR start "rule__Conditionnelle__Group__2__Impl"
    // InternalRat.g:1821:1: rule__Conditionnelle__Group__2__Impl : ( ( rule__Conditionnelle__Bloc1condAssignment_2 ) ) ;
    public final void rule__Conditionnelle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1825:1: ( ( ( rule__Conditionnelle__Bloc1condAssignment_2 ) ) )
            // InternalRat.g:1826:1: ( ( rule__Conditionnelle__Bloc1condAssignment_2 ) )
            {
            // InternalRat.g:1826:1: ( ( rule__Conditionnelle__Bloc1condAssignment_2 ) )
            // InternalRat.g:1827:2: ( rule__Conditionnelle__Bloc1condAssignment_2 )
            {
             before(grammarAccess.getConditionnelleAccess().getBloc1condAssignment_2()); 
            // InternalRat.g:1828:2: ( rule__Conditionnelle__Bloc1condAssignment_2 )
            // InternalRat.g:1828:3: rule__Conditionnelle__Bloc1condAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Conditionnelle__Bloc1condAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionnelleAccess().getBloc1condAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditionnelle__Group__2__Impl"


    // $ANTLR start "rule__Conditionnelle__Group__3"
    // InternalRat.g:1836:1: rule__Conditionnelle__Group__3 : rule__Conditionnelle__Group__3__Impl rule__Conditionnelle__Group__4 ;
    public final void rule__Conditionnelle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1840:1: ( rule__Conditionnelle__Group__3__Impl rule__Conditionnelle__Group__4 )
            // InternalRat.g:1841:2: rule__Conditionnelle__Group__3__Impl rule__Conditionnelle__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Conditionnelle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditionnelle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditionnelle__Group__3"


    // $ANTLR start "rule__Conditionnelle__Group__3__Impl"
    // InternalRat.g:1848:1: rule__Conditionnelle__Group__3__Impl : ( 'else' ) ;
    public final void rule__Conditionnelle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1852:1: ( ( 'else' ) )
            // InternalRat.g:1853:1: ( 'else' )
            {
            // InternalRat.g:1853:1: ( 'else' )
            // InternalRat.g:1854:2: 'else'
            {
             before(grammarAccess.getConditionnelleAccess().getElseKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConditionnelleAccess().getElseKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditionnelle__Group__3__Impl"


    // $ANTLR start "rule__Conditionnelle__Group__4"
    // InternalRat.g:1863:1: rule__Conditionnelle__Group__4 : rule__Conditionnelle__Group__4__Impl ;
    public final void rule__Conditionnelle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1867:1: ( rule__Conditionnelle__Group__4__Impl )
            // InternalRat.g:1868:2: rule__Conditionnelle__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditionnelle__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditionnelle__Group__4"


    // $ANTLR start "rule__Conditionnelle__Group__4__Impl"
    // InternalRat.g:1874:1: rule__Conditionnelle__Group__4__Impl : ( ( rule__Conditionnelle__Bloc2condAssignment_4 ) ) ;
    public final void rule__Conditionnelle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1878:1: ( ( ( rule__Conditionnelle__Bloc2condAssignment_4 ) ) )
            // InternalRat.g:1879:1: ( ( rule__Conditionnelle__Bloc2condAssignment_4 ) )
            {
            // InternalRat.g:1879:1: ( ( rule__Conditionnelle__Bloc2condAssignment_4 ) )
            // InternalRat.g:1880:2: ( rule__Conditionnelle__Bloc2condAssignment_4 )
            {
             before(grammarAccess.getConditionnelleAccess().getBloc2condAssignment_4()); 
            // InternalRat.g:1881:2: ( rule__Conditionnelle__Bloc2condAssignment_4 )
            // InternalRat.g:1881:3: rule__Conditionnelle__Bloc2condAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Conditionnelle__Bloc2condAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionnelleAccess().getBloc2condAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditionnelle__Group__4__Impl"


    // $ANTLR start "rule__Tantque__Group__0"
    // InternalRat.g:1890:1: rule__Tantque__Group__0 : rule__Tantque__Group__0__Impl rule__Tantque__Group__1 ;
    public final void rule__Tantque__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1894:1: ( rule__Tantque__Group__0__Impl rule__Tantque__Group__1 )
            // InternalRat.g:1895:2: rule__Tantque__Group__0__Impl rule__Tantque__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Tantque__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tantque__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tantque__Group__0"


    // $ANTLR start "rule__Tantque__Group__0__Impl"
    // InternalRat.g:1902:1: rule__Tantque__Group__0__Impl : ( 'while' ) ;
    public final void rule__Tantque__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1906:1: ( ( 'while' ) )
            // InternalRat.g:1907:1: ( 'while' )
            {
            // InternalRat.g:1907:1: ( 'while' )
            // InternalRat.g:1908:2: 'while'
            {
             before(grammarAccess.getTantqueAccess().getWhileKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTantqueAccess().getWhileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tantque__Group__0__Impl"


    // $ANTLR start "rule__Tantque__Group__1"
    // InternalRat.g:1917:1: rule__Tantque__Group__1 : rule__Tantque__Group__1__Impl rule__Tantque__Group__2 ;
    public final void rule__Tantque__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1921:1: ( rule__Tantque__Group__1__Impl rule__Tantque__Group__2 )
            // InternalRat.g:1922:2: rule__Tantque__Group__1__Impl rule__Tantque__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Tantque__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tantque__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tantque__Group__1"


    // $ANTLR start "rule__Tantque__Group__1__Impl"
    // InternalRat.g:1929:1: rule__Tantque__Group__1__Impl : ( ( rule__Tantque__CondtAssignment_1 ) ) ;
    public final void rule__Tantque__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1933:1: ( ( ( rule__Tantque__CondtAssignment_1 ) ) )
            // InternalRat.g:1934:1: ( ( rule__Tantque__CondtAssignment_1 ) )
            {
            // InternalRat.g:1934:1: ( ( rule__Tantque__CondtAssignment_1 ) )
            // InternalRat.g:1935:2: ( rule__Tantque__CondtAssignment_1 )
            {
             before(grammarAccess.getTantqueAccess().getCondtAssignment_1()); 
            // InternalRat.g:1936:2: ( rule__Tantque__CondtAssignment_1 )
            // InternalRat.g:1936:3: rule__Tantque__CondtAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tantque__CondtAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTantqueAccess().getCondtAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tantque__Group__1__Impl"


    // $ANTLR start "rule__Tantque__Group__2"
    // InternalRat.g:1944:1: rule__Tantque__Group__2 : rule__Tantque__Group__2__Impl ;
    public final void rule__Tantque__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1948:1: ( rule__Tantque__Group__2__Impl )
            // InternalRat.g:1949:2: rule__Tantque__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tantque__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tantque__Group__2"


    // $ANTLR start "rule__Tantque__Group__2__Impl"
    // InternalRat.g:1955:1: rule__Tantque__Group__2__Impl : ( ( rule__Tantque__BoucleAssignment_2 ) ) ;
    public final void rule__Tantque__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1959:1: ( ( ( rule__Tantque__BoucleAssignment_2 ) ) )
            // InternalRat.g:1960:1: ( ( rule__Tantque__BoucleAssignment_2 ) )
            {
            // InternalRat.g:1960:1: ( ( rule__Tantque__BoucleAssignment_2 ) )
            // InternalRat.g:1961:2: ( rule__Tantque__BoucleAssignment_2 )
            {
             before(grammarAccess.getTantqueAccess().getBoucleAssignment_2()); 
            // InternalRat.g:1962:2: ( rule__Tantque__BoucleAssignment_2 )
            // InternalRat.g:1962:3: rule__Tantque__BoucleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Tantque__BoucleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTantqueAccess().getBoucleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tantque__Group__2__Impl"


    // $ANTLR start "rule__DP__Group__0"
    // InternalRat.g:1971:1: rule__DP__Group__0 : rule__DP__Group__0__Impl rule__DP__Group__1 ;
    public final void rule__DP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1975:1: ( rule__DP__Group__0__Impl rule__DP__Group__1 )
            // InternalRat.g:1976:2: rule__DP__Group__0__Impl rule__DP__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DP__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DP__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DP__Group__0"


    // $ANTLR start "rule__DP__Group__0__Impl"
    // InternalRat.g:1983:1: rule__DP__Group__0__Impl : ( ( rule__DP__TypeAssignment_0 ) ) ;
    public final void rule__DP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:1987:1: ( ( ( rule__DP__TypeAssignment_0 ) ) )
            // InternalRat.g:1988:1: ( ( rule__DP__TypeAssignment_0 ) )
            {
            // InternalRat.g:1988:1: ( ( rule__DP__TypeAssignment_0 ) )
            // InternalRat.g:1989:2: ( rule__DP__TypeAssignment_0 )
            {
             before(grammarAccess.getDPAccess().getTypeAssignment_0()); 
            // InternalRat.g:1990:2: ( rule__DP__TypeAssignment_0 )
            // InternalRat.g:1990:3: rule__DP__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DP__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDPAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DP__Group__0__Impl"


    // $ANTLR start "rule__DP__Group__1"
    // InternalRat.g:1998:1: rule__DP__Group__1 : rule__DP__Group__1__Impl ;
    public final void rule__DP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2002:1: ( rule__DP__Group__1__Impl )
            // InternalRat.g:2003:2: rule__DP__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DP__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DP__Group__1"


    // $ANTLR start "rule__DP__Group__1__Impl"
    // InternalRat.g:2009:1: rule__DP__Group__1__Impl : ( ( rule__DP__IdAssignment_1 ) ) ;
    public final void rule__DP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2013:1: ( ( ( rule__DP__IdAssignment_1 ) ) )
            // InternalRat.g:2014:1: ( ( rule__DP__IdAssignment_1 ) )
            {
            // InternalRat.g:2014:1: ( ( rule__DP__IdAssignment_1 ) )
            // InternalRat.g:2015:2: ( rule__DP__IdAssignment_1 )
            {
             before(grammarAccess.getDPAccess().getIdAssignment_1()); 
            // InternalRat.g:2016:2: ( rule__DP__IdAssignment_1 )
            // InternalRat.g:2016:3: rule__DP__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DP__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDPAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DP__Group__1__Impl"


    // $ANTLR start "rule__CP__Group__0"
    // InternalRat.g:2025:1: rule__CP__Group__0 : rule__CP__Group__0__Impl rule__CP__Group__1 ;
    public final void rule__CP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2029:1: ( rule__CP__Group__0__Impl rule__CP__Group__1 )
            // InternalRat.g:2030:2: rule__CP__Group__0__Impl rule__CP__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__CP__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CP__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CP__Group__0"


    // $ANTLR start "rule__CP__Group__0__Impl"
    // InternalRat.g:2037:1: rule__CP__Group__0__Impl : ( () ) ;
    public final void rule__CP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2041:1: ( ( () ) )
            // InternalRat.g:2042:1: ( () )
            {
            // InternalRat.g:2042:1: ( () )
            // InternalRat.g:2043:2: ()
            {
             before(grammarAccess.getCPAccess().getCPAction_0()); 
            // InternalRat.g:2044:2: ()
            // InternalRat.g:2044:3: 
            {
            }

             after(grammarAccess.getCPAccess().getCPAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CP__Group__0__Impl"


    // $ANTLR start "rule__CP__Group__1"
    // InternalRat.g:2052:1: rule__CP__Group__1 : rule__CP__Group__1__Impl ;
    public final void rule__CP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2056:1: ( rule__CP__Group__1__Impl )
            // InternalRat.g:2057:2: rule__CP__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CP__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CP__Group__1"


    // $ANTLR start "rule__CP__Group__1__Impl"
    // InternalRat.g:2063:1: rule__CP__Group__1__Impl : ( ( rule__CP__EAssignment_1 )* ) ;
    public final void rule__CP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2067:1: ( ( ( rule__CP__EAssignment_1 )* ) )
            // InternalRat.g:2068:1: ( ( rule__CP__EAssignment_1 )* )
            {
            // InternalRat.g:2068:1: ( ( rule__CP__EAssignment_1 )* )
            // InternalRat.g:2069:2: ( rule__CP__EAssignment_1 )*
            {
             before(grammarAccess.getCPAccess().getEAssignment_1()); 
            // InternalRat.g:2070:2: ( rule__CP__EAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||(LA10_0>=14 && LA10_0<=15)||LA10_0==20||(LA10_0>=31 && LA10_0<=32)||(LA10_0>=35 && LA10_0<=36)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRat.g:2070:3: rule__CP__EAssignment_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__CP__EAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCPAccess().getEAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CP__Group__1__Impl"


    // $ANTLR start "rule__Appel__Group__0"
    // InternalRat.g:2079:1: rule__Appel__Group__0 : rule__Appel__Group__0__Impl rule__Appel__Group__1 ;
    public final void rule__Appel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2083:1: ( rule__Appel__Group__0__Impl rule__Appel__Group__1 )
            // InternalRat.g:2084:2: rule__Appel__Group__0__Impl rule__Appel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Appel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Appel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appel__Group__0"


    // $ANTLR start "rule__Appel__Group__0__Impl"
    // InternalRat.g:2091:1: rule__Appel__Group__0__Impl : ( 'call' ) ;
    public final void rule__Appel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2095:1: ( ( 'call' ) )
            // InternalRat.g:2096:1: ( 'call' )
            {
            // InternalRat.g:2096:1: ( 'call' )
            // InternalRat.g:2097:2: 'call'
            {
             before(grammarAccess.getAppelAccess().getCallKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAppelAccess().getCallKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appel__Group__0__Impl"


    // $ANTLR start "rule__Appel__Group__1"
    // InternalRat.g:2106:1: rule__Appel__Group__1 : rule__Appel__Group__1__Impl rule__Appel__Group__2 ;
    public final void rule__Appel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2110:1: ( rule__Appel__Group__1__Impl rule__Appel__Group__2 )
            // InternalRat.g:2111:2: rule__Appel__Group__1__Impl rule__Appel__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Appel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Appel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appel__Group__1"


    // $ANTLR start "rule__Appel__Group__1__Impl"
    // InternalRat.g:2118:1: rule__Appel__Group__1__Impl : ( ( rule__Appel__NomAppelAssignment_1 ) ) ;
    public final void rule__Appel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2122:1: ( ( ( rule__Appel__NomAppelAssignment_1 ) ) )
            // InternalRat.g:2123:1: ( ( rule__Appel__NomAppelAssignment_1 ) )
            {
            // InternalRat.g:2123:1: ( ( rule__Appel__NomAppelAssignment_1 ) )
            // InternalRat.g:2124:2: ( rule__Appel__NomAppelAssignment_1 )
            {
             before(grammarAccess.getAppelAccess().getNomAppelAssignment_1()); 
            // InternalRat.g:2125:2: ( rule__Appel__NomAppelAssignment_1 )
            // InternalRat.g:2125:3: rule__Appel__NomAppelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Appel__NomAppelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAppelAccess().getNomAppelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appel__Group__1__Impl"


    // $ANTLR start "rule__Appel__Group__2"
    // InternalRat.g:2133:1: rule__Appel__Group__2 : rule__Appel__Group__2__Impl rule__Appel__Group__3 ;
    public final void rule__Appel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2137:1: ( rule__Appel__Group__2__Impl rule__Appel__Group__3 )
            // InternalRat.g:2138:2: rule__Appel__Group__2__Impl rule__Appel__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Appel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Appel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appel__Group__2"


    // $ANTLR start "rule__Appel__Group__2__Impl"
    // InternalRat.g:2145:1: rule__Appel__Group__2__Impl : ( '(' ) ;
    public final void rule__Appel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2149:1: ( ( '(' ) )
            // InternalRat.g:2150:1: ( '(' )
            {
            // InternalRat.g:2150:1: ( '(' )
            // InternalRat.g:2151:2: '('
            {
             before(grammarAccess.getAppelAccess().getLeftParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAppelAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appel__Group__2__Impl"


    // $ANTLR start "rule__Appel__Group__3"
    // InternalRat.g:2160:1: rule__Appel__Group__3 : rule__Appel__Group__3__Impl rule__Appel__Group__4 ;
    public final void rule__Appel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2164:1: ( rule__Appel__Group__3__Impl rule__Appel__Group__4 )
            // InternalRat.g:2165:2: rule__Appel__Group__3__Impl rule__Appel__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Appel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Appel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appel__Group__3"


    // $ANTLR start "rule__Appel__Group__3__Impl"
    // InternalRat.g:2172:1: rule__Appel__Group__3__Impl : ( ( rule__Appel__ParamAssignment_3 ) ) ;
    public final void rule__Appel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2176:1: ( ( ( rule__Appel__ParamAssignment_3 ) ) )
            // InternalRat.g:2177:1: ( ( rule__Appel__ParamAssignment_3 ) )
            {
            // InternalRat.g:2177:1: ( ( rule__Appel__ParamAssignment_3 ) )
            // InternalRat.g:2178:2: ( rule__Appel__ParamAssignment_3 )
            {
             before(grammarAccess.getAppelAccess().getParamAssignment_3()); 
            // InternalRat.g:2179:2: ( rule__Appel__ParamAssignment_3 )
            // InternalRat.g:2179:3: rule__Appel__ParamAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Appel__ParamAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAppelAccess().getParamAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appel__Group__3__Impl"


    // $ANTLR start "rule__Appel__Group__4"
    // InternalRat.g:2187:1: rule__Appel__Group__4 : rule__Appel__Group__4__Impl ;
    public final void rule__Appel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2191:1: ( rule__Appel__Group__4__Impl )
            // InternalRat.g:2192:2: rule__Appel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Appel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appel__Group__4"


    // $ANTLR start "rule__Appel__Group__4__Impl"
    // InternalRat.g:2198:1: rule__Appel__Group__4__Impl : ( ')' ) ;
    public final void rule__Appel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2202:1: ( ( ')' ) )
            // InternalRat.g:2203:1: ( ')' )
            {
            // InternalRat.g:2203:1: ( ')' )
            // InternalRat.g:2204:2: ')'
            {
             before(grammarAccess.getAppelAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAppelAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appel__Group__4__Impl"


    // $ANTLR start "rule__Rationnel__Group__0"
    // InternalRat.g:2214:1: rule__Rationnel__Group__0 : rule__Rationnel__Group__0__Impl rule__Rationnel__Group__1 ;
    public final void rule__Rationnel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2218:1: ( rule__Rationnel__Group__0__Impl rule__Rationnel__Group__1 )
            // InternalRat.g:2219:2: rule__Rationnel__Group__0__Impl rule__Rationnel__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Rationnel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rationnel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rationnel__Group__0"


    // $ANTLR start "rule__Rationnel__Group__0__Impl"
    // InternalRat.g:2226:1: rule__Rationnel__Group__0__Impl : ( '[' ) ;
    public final void rule__Rationnel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2230:1: ( ( '[' ) )
            // InternalRat.g:2231:1: ( '[' )
            {
            // InternalRat.g:2231:1: ( '[' )
            // InternalRat.g:2232:2: '['
            {
             before(grammarAccess.getRationnelAccess().getLeftSquareBracketKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRationnelAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rationnel__Group__0__Impl"


    // $ANTLR start "rule__Rationnel__Group__1"
    // InternalRat.g:2241:1: rule__Rationnel__Group__1 : rule__Rationnel__Group__1__Impl rule__Rationnel__Group__2 ;
    public final void rule__Rationnel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2245:1: ( rule__Rationnel__Group__1__Impl rule__Rationnel__Group__2 )
            // InternalRat.g:2246:2: rule__Rationnel__Group__1__Impl rule__Rationnel__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Rationnel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rationnel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rationnel__Group__1"


    // $ANTLR start "rule__Rationnel__Group__1__Impl"
    // InternalRat.g:2253:1: rule__Rationnel__Group__1__Impl : ( ( rule__Rationnel__E1Assignment_1 ) ) ;
    public final void rule__Rationnel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2257:1: ( ( ( rule__Rationnel__E1Assignment_1 ) ) )
            // InternalRat.g:2258:1: ( ( rule__Rationnel__E1Assignment_1 ) )
            {
            // InternalRat.g:2258:1: ( ( rule__Rationnel__E1Assignment_1 ) )
            // InternalRat.g:2259:2: ( rule__Rationnel__E1Assignment_1 )
            {
             before(grammarAccess.getRationnelAccess().getE1Assignment_1()); 
            // InternalRat.g:2260:2: ( rule__Rationnel__E1Assignment_1 )
            // InternalRat.g:2260:3: rule__Rationnel__E1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rationnel__E1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRationnelAccess().getE1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rationnel__Group__1__Impl"


    // $ANTLR start "rule__Rationnel__Group__2"
    // InternalRat.g:2268:1: rule__Rationnel__Group__2 : rule__Rationnel__Group__2__Impl rule__Rationnel__Group__3 ;
    public final void rule__Rationnel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2272:1: ( rule__Rationnel__Group__2__Impl rule__Rationnel__Group__3 )
            // InternalRat.g:2273:2: rule__Rationnel__Group__2__Impl rule__Rationnel__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Rationnel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rationnel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rationnel__Group__2"


    // $ANTLR start "rule__Rationnel__Group__2__Impl"
    // InternalRat.g:2280:1: rule__Rationnel__Group__2__Impl : ( '/' ) ;
    public final void rule__Rationnel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2284:1: ( ( '/' ) )
            // InternalRat.g:2285:1: ( '/' )
            {
            // InternalRat.g:2285:1: ( '/' )
            // InternalRat.g:2286:2: '/'
            {
             before(grammarAccess.getRationnelAccess().getSolidusKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRationnelAccess().getSolidusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rationnel__Group__2__Impl"


    // $ANTLR start "rule__Rationnel__Group__3"
    // InternalRat.g:2295:1: rule__Rationnel__Group__3 : rule__Rationnel__Group__3__Impl rule__Rationnel__Group__4 ;
    public final void rule__Rationnel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2299:1: ( rule__Rationnel__Group__3__Impl rule__Rationnel__Group__4 )
            // InternalRat.g:2300:2: rule__Rationnel__Group__3__Impl rule__Rationnel__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Rationnel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rationnel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rationnel__Group__3"


    // $ANTLR start "rule__Rationnel__Group__3__Impl"
    // InternalRat.g:2307:1: rule__Rationnel__Group__3__Impl : ( ( rule__Rationnel__E2Assignment_3 ) ) ;
    public final void rule__Rationnel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2311:1: ( ( ( rule__Rationnel__E2Assignment_3 ) ) )
            // InternalRat.g:2312:1: ( ( rule__Rationnel__E2Assignment_3 ) )
            {
            // InternalRat.g:2312:1: ( ( rule__Rationnel__E2Assignment_3 ) )
            // InternalRat.g:2313:2: ( rule__Rationnel__E2Assignment_3 )
            {
             before(grammarAccess.getRationnelAccess().getE2Assignment_3()); 
            // InternalRat.g:2314:2: ( rule__Rationnel__E2Assignment_3 )
            // InternalRat.g:2314:3: rule__Rationnel__E2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rationnel__E2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRationnelAccess().getE2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rationnel__Group__3__Impl"


    // $ANTLR start "rule__Rationnel__Group__4"
    // InternalRat.g:2322:1: rule__Rationnel__Group__4 : rule__Rationnel__Group__4__Impl ;
    public final void rule__Rationnel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2326:1: ( rule__Rationnel__Group__4__Impl )
            // InternalRat.g:2327:2: rule__Rationnel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rationnel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rationnel__Group__4"


    // $ANTLR start "rule__Rationnel__Group__4__Impl"
    // InternalRat.g:2333:1: rule__Rationnel__Group__4__Impl : ( ']' ) ;
    public final void rule__Rationnel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2337:1: ( ( ']' ) )
            // InternalRat.g:2338:1: ( ']' )
            {
            // InternalRat.g:2338:1: ( ']' )
            // InternalRat.g:2339:2: ']'
            {
             before(grammarAccess.getRationnelAccess().getRightSquareBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRationnelAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rationnel__Group__4__Impl"


    // $ANTLR start "rule__Numerateur__Group__0"
    // InternalRat.g:2349:1: rule__Numerateur__Group__0 : rule__Numerateur__Group__0__Impl rule__Numerateur__Group__1 ;
    public final void rule__Numerateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2353:1: ( rule__Numerateur__Group__0__Impl rule__Numerateur__Group__1 )
            // InternalRat.g:2354:2: rule__Numerateur__Group__0__Impl rule__Numerateur__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Numerateur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Numerateur__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numerateur__Group__0"


    // $ANTLR start "rule__Numerateur__Group__0__Impl"
    // InternalRat.g:2361:1: rule__Numerateur__Group__0__Impl : ( 'num' ) ;
    public final void rule__Numerateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2365:1: ( ( 'num' ) )
            // InternalRat.g:2366:1: ( 'num' )
            {
            // InternalRat.g:2366:1: ( 'num' )
            // InternalRat.g:2367:2: 'num'
            {
             before(grammarAccess.getNumerateurAccess().getNumKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNumerateurAccess().getNumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numerateur__Group__0__Impl"


    // $ANTLR start "rule__Numerateur__Group__1"
    // InternalRat.g:2376:1: rule__Numerateur__Group__1 : rule__Numerateur__Group__1__Impl ;
    public final void rule__Numerateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2380:1: ( rule__Numerateur__Group__1__Impl )
            // InternalRat.g:2381:2: rule__Numerateur__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Numerateur__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numerateur__Group__1"


    // $ANTLR start "rule__Numerateur__Group__1__Impl"
    // InternalRat.g:2387:1: rule__Numerateur__Group__1__Impl : ( ( rule__Numerateur__ValNumAssignment_1 ) ) ;
    public final void rule__Numerateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2391:1: ( ( ( rule__Numerateur__ValNumAssignment_1 ) ) )
            // InternalRat.g:2392:1: ( ( rule__Numerateur__ValNumAssignment_1 ) )
            {
            // InternalRat.g:2392:1: ( ( rule__Numerateur__ValNumAssignment_1 ) )
            // InternalRat.g:2393:2: ( rule__Numerateur__ValNumAssignment_1 )
            {
             before(grammarAccess.getNumerateurAccess().getValNumAssignment_1()); 
            // InternalRat.g:2394:2: ( rule__Numerateur__ValNumAssignment_1 )
            // InternalRat.g:2394:3: rule__Numerateur__ValNumAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Numerateur__ValNumAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumerateurAccess().getValNumAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numerateur__Group__1__Impl"


    // $ANTLR start "rule__Denominateur__Group__0"
    // InternalRat.g:2403:1: rule__Denominateur__Group__0 : rule__Denominateur__Group__0__Impl rule__Denominateur__Group__1 ;
    public final void rule__Denominateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2407:1: ( rule__Denominateur__Group__0__Impl rule__Denominateur__Group__1 )
            // InternalRat.g:2408:2: rule__Denominateur__Group__0__Impl rule__Denominateur__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Denominateur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Denominateur__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Denominateur__Group__0"


    // $ANTLR start "rule__Denominateur__Group__0__Impl"
    // InternalRat.g:2415:1: rule__Denominateur__Group__0__Impl : ( 'denom' ) ;
    public final void rule__Denominateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2419:1: ( ( 'denom' ) )
            // InternalRat.g:2420:1: ( 'denom' )
            {
            // InternalRat.g:2420:1: ( 'denom' )
            // InternalRat.g:2421:2: 'denom'
            {
             before(grammarAccess.getDenominateurAccess().getDenomKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDenominateurAccess().getDenomKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Denominateur__Group__0__Impl"


    // $ANTLR start "rule__Denominateur__Group__1"
    // InternalRat.g:2430:1: rule__Denominateur__Group__1 : rule__Denominateur__Group__1__Impl ;
    public final void rule__Denominateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2434:1: ( rule__Denominateur__Group__1__Impl )
            // InternalRat.g:2435:2: rule__Denominateur__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Denominateur__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Denominateur__Group__1"


    // $ANTLR start "rule__Denominateur__Group__1__Impl"
    // InternalRat.g:2441:1: rule__Denominateur__Group__1__Impl : ( ( rule__Denominateur__ValDenumAssignment_1 ) ) ;
    public final void rule__Denominateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2445:1: ( ( ( rule__Denominateur__ValDenumAssignment_1 ) ) )
            // InternalRat.g:2446:1: ( ( rule__Denominateur__ValDenumAssignment_1 ) )
            {
            // InternalRat.g:2446:1: ( ( rule__Denominateur__ValDenumAssignment_1 ) )
            // InternalRat.g:2447:2: ( rule__Denominateur__ValDenumAssignment_1 )
            {
             before(grammarAccess.getDenominateurAccess().getValDenumAssignment_1()); 
            // InternalRat.g:2448:2: ( rule__Denominateur__ValDenumAssignment_1 )
            // InternalRat.g:2448:3: rule__Denominateur__ValDenumAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Denominateur__ValDenumAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDenominateurAccess().getValDenumAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Denominateur__Group__1__Impl"


    // $ANTLR start "rule__OpBin__Group__0"
    // InternalRat.g:2457:1: rule__OpBin__Group__0 : rule__OpBin__Group__0__Impl rule__OpBin__Group__1 ;
    public final void rule__OpBin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2461:1: ( rule__OpBin__Group__0__Impl rule__OpBin__Group__1 )
            // InternalRat.g:2462:2: rule__OpBin__Group__0__Impl rule__OpBin__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__OpBin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpBin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpBin__Group__0"


    // $ANTLR start "rule__OpBin__Group__0__Impl"
    // InternalRat.g:2469:1: rule__OpBin__Group__0__Impl : ( '(' ) ;
    public final void rule__OpBin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2473:1: ( ( '(' ) )
            // InternalRat.g:2474:1: ( '(' )
            {
            // InternalRat.g:2474:1: ( '(' )
            // InternalRat.g:2475:2: '('
            {
             before(grammarAccess.getOpBinAccess().getLeftParenthesisKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getOpBinAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpBin__Group__0__Impl"


    // $ANTLR start "rule__OpBin__Group__1"
    // InternalRat.g:2484:1: rule__OpBin__Group__1 : rule__OpBin__Group__1__Impl rule__OpBin__Group__2 ;
    public final void rule__OpBin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2488:1: ( rule__OpBin__Group__1__Impl rule__OpBin__Group__2 )
            // InternalRat.g:2489:2: rule__OpBin__Group__1__Impl rule__OpBin__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__OpBin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpBin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpBin__Group__1"


    // $ANTLR start "rule__OpBin__Group__1__Impl"
    // InternalRat.g:2496:1: rule__OpBin__Group__1__Impl : ( ( rule__OpBin__E1Assignment_1 ) ) ;
    public final void rule__OpBin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2500:1: ( ( ( rule__OpBin__E1Assignment_1 ) ) )
            // InternalRat.g:2501:1: ( ( rule__OpBin__E1Assignment_1 ) )
            {
            // InternalRat.g:2501:1: ( ( rule__OpBin__E1Assignment_1 ) )
            // InternalRat.g:2502:2: ( rule__OpBin__E1Assignment_1 )
            {
             before(grammarAccess.getOpBinAccess().getE1Assignment_1()); 
            // InternalRat.g:2503:2: ( rule__OpBin__E1Assignment_1 )
            // InternalRat.g:2503:3: rule__OpBin__E1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OpBin__E1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOpBinAccess().getE1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpBin__Group__1__Impl"


    // $ANTLR start "rule__OpBin__Group__2"
    // InternalRat.g:2511:1: rule__OpBin__Group__2 : rule__OpBin__Group__2__Impl rule__OpBin__Group__3 ;
    public final void rule__OpBin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2515:1: ( rule__OpBin__Group__2__Impl rule__OpBin__Group__3 )
            // InternalRat.g:2516:2: rule__OpBin__Group__2__Impl rule__OpBin__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__OpBin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpBin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpBin__Group__2"


    // $ANTLR start "rule__OpBin__Group__2__Impl"
    // InternalRat.g:2523:1: rule__OpBin__Group__2__Impl : ( ( rule__OpBin__OpAssignment_2 ) ) ;
    public final void rule__OpBin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2527:1: ( ( ( rule__OpBin__OpAssignment_2 ) ) )
            // InternalRat.g:2528:1: ( ( rule__OpBin__OpAssignment_2 ) )
            {
            // InternalRat.g:2528:1: ( ( rule__OpBin__OpAssignment_2 ) )
            // InternalRat.g:2529:2: ( rule__OpBin__OpAssignment_2 )
            {
             before(grammarAccess.getOpBinAccess().getOpAssignment_2()); 
            // InternalRat.g:2530:2: ( rule__OpBin__OpAssignment_2 )
            // InternalRat.g:2530:3: rule__OpBin__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OpBin__OpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOpBinAccess().getOpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpBin__Group__2__Impl"


    // $ANTLR start "rule__OpBin__Group__3"
    // InternalRat.g:2538:1: rule__OpBin__Group__3 : rule__OpBin__Group__3__Impl rule__OpBin__Group__4 ;
    public final void rule__OpBin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2542:1: ( rule__OpBin__Group__3__Impl rule__OpBin__Group__4 )
            // InternalRat.g:2543:2: rule__OpBin__Group__3__Impl rule__OpBin__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__OpBin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpBin__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpBin__Group__3"


    // $ANTLR start "rule__OpBin__Group__3__Impl"
    // InternalRat.g:2550:1: rule__OpBin__Group__3__Impl : ( ( rule__OpBin__E2Assignment_3 ) ) ;
    public final void rule__OpBin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2554:1: ( ( ( rule__OpBin__E2Assignment_3 ) ) )
            // InternalRat.g:2555:1: ( ( rule__OpBin__E2Assignment_3 ) )
            {
            // InternalRat.g:2555:1: ( ( rule__OpBin__E2Assignment_3 ) )
            // InternalRat.g:2556:2: ( rule__OpBin__E2Assignment_3 )
            {
             before(grammarAccess.getOpBinAccess().getE2Assignment_3()); 
            // InternalRat.g:2557:2: ( rule__OpBin__E2Assignment_3 )
            // InternalRat.g:2557:3: rule__OpBin__E2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OpBin__E2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOpBinAccess().getE2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpBin__Group__3__Impl"


    // $ANTLR start "rule__OpBin__Group__4"
    // InternalRat.g:2565:1: rule__OpBin__Group__4 : rule__OpBin__Group__4__Impl ;
    public final void rule__OpBin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2569:1: ( rule__OpBin__Group__4__Impl )
            // InternalRat.g:2570:2: rule__OpBin__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpBin__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpBin__Group__4"


    // $ANTLR start "rule__OpBin__Group__4__Impl"
    // InternalRat.g:2576:1: rule__OpBin__Group__4__Impl : ( ')' ) ;
    public final void rule__OpBin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2580:1: ( ( ')' ) )
            // InternalRat.g:2581:1: ( ')' )
            {
            // InternalRat.g:2581:1: ( ')' )
            // InternalRat.g:2582:2: ')'
            {
             before(grammarAccess.getOpBinAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOpBinAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpBin__Group__4__Impl"


    // $ANTLR start "rule__Prog__FunAssignment_0"
    // InternalRat.g:2592:1: rule__Prog__FunAssignment_0 : ( ruleFun ) ;
    public final void rule__Prog__FunAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2596:1: ( ( ruleFun ) )
            // InternalRat.g:2597:2: ( ruleFun )
            {
            // InternalRat.g:2597:2: ( ruleFun )
            // InternalRat.g:2598:3: ruleFun
            {
             before(grammarAccess.getProgAccess().getFunFunParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFun();

            state._fsp--;

             after(grammarAccess.getProgAccess().getFunFunParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__FunAssignment_0"


    // $ANTLR start "rule__Prog__NomProgAssignment_1"
    // InternalRat.g:2607:1: rule__Prog__NomProgAssignment_1 : ( RULE_ID ) ;
    public final void rule__Prog__NomProgAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2611:1: ( ( RULE_ID ) )
            // InternalRat.g:2612:2: ( RULE_ID )
            {
            // InternalRat.g:2612:2: ( RULE_ID )
            // InternalRat.g:2613:3: RULE_ID
            {
             before(grammarAccess.getProgAccess().getNomProgIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProgAccess().getNomProgIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__NomProgAssignment_1"


    // $ANTLR start "rule__Prog__BlocAssignment_2"
    // InternalRat.g:2622:1: rule__Prog__BlocAssignment_2 : ( ruleBloc ) ;
    public final void rule__Prog__BlocAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2626:1: ( ( ruleBloc ) )
            // InternalRat.g:2627:2: ( ruleBloc )
            {
            // InternalRat.g:2627:2: ( ruleBloc )
            // InternalRat.g:2628:3: ruleBloc
            {
             before(grammarAccess.getProgAccess().getBlocBlocParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBloc();

            state._fsp--;

             after(grammarAccess.getProgAccess().getBlocBlocParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__BlocAssignment_2"


    // $ANTLR start "rule__Fun__TypeAssignment_0"
    // InternalRat.g:2637:1: rule__Fun__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Fun__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2641:1: ( ( ruleType ) )
            // InternalRat.g:2642:2: ( ruleType )
            {
            // InternalRat.g:2642:2: ( ruleType )
            // InternalRat.g:2643:3: ruleType
            {
             before(grammarAccess.getFunAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFunAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__TypeAssignment_0"


    // $ANTLR start "rule__Fun__NomFunAssignment_1"
    // InternalRat.g:2652:1: rule__Fun__NomFunAssignment_1 : ( RULE_ID ) ;
    public final void rule__Fun__NomFunAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2656:1: ( ( RULE_ID ) )
            // InternalRat.g:2657:2: ( RULE_ID )
            {
            // InternalRat.g:2657:2: ( RULE_ID )
            // InternalRat.g:2658:3: RULE_ID
            {
             before(grammarAccess.getFunAccess().getNomFunIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunAccess().getNomFunIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__NomFunAssignment_1"


    // $ANTLR start "rule__Fun__ParamAssignment_3"
    // InternalRat.g:2667:1: rule__Fun__ParamAssignment_3 : ( ruleDP ) ;
    public final void rule__Fun__ParamAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2671:1: ( ( ruleDP ) )
            // InternalRat.g:2672:2: ( ruleDP )
            {
            // InternalRat.g:2672:2: ( ruleDP )
            // InternalRat.g:2673:3: ruleDP
            {
             before(grammarAccess.getFunAccess().getParamDPParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDP();

            state._fsp--;

             after(grammarAccess.getFunAccess().getParamDPParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__ParamAssignment_3"


    // $ANTLR start "rule__Fun__IsAssignment_6"
    // InternalRat.g:2682:1: rule__Fun__IsAssignment_6 : ( ruleI ) ;
    public final void rule__Fun__IsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2686:1: ( ( ruleI ) )
            // InternalRat.g:2687:2: ( ruleI )
            {
            // InternalRat.g:2687:2: ( ruleI )
            // InternalRat.g:2688:3: ruleI
            {
             before(grammarAccess.getFunAccess().getIsIParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleI();

            state._fsp--;

             after(grammarAccess.getFunAccess().getIsIParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__IsAssignment_6"


    // $ANTLR start "rule__Fun__RetourAssignment_8"
    // InternalRat.g:2697:1: rule__Fun__RetourAssignment_8 : ( ruleE ) ;
    public final void rule__Fun__RetourAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2701:1: ( ( ruleE ) )
            // InternalRat.g:2702:2: ( ruleE )
            {
            // InternalRat.g:2702:2: ( ruleE )
            // InternalRat.g:2703:3: ruleE
            {
             before(grammarAccess.getFunAccess().getRetourEParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleE();

            state._fsp--;

             after(grammarAccess.getFunAccess().getRetourEParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__RetourAssignment_8"


    // $ANTLR start "rule__Bloc__IsAssignment_2"
    // InternalRat.g:2712:1: rule__Bloc__IsAssignment_2 : ( ruleI ) ;
    public final void rule__Bloc__IsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2716:1: ( ( ruleI ) )
            // InternalRat.g:2717:2: ( ruleI )
            {
            // InternalRat.g:2717:2: ( ruleI )
            // InternalRat.g:2718:3: ruleI
            {
             before(grammarAccess.getBlocAccess().getIsIParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleI();

            state._fsp--;

             after(grammarAccess.getBlocAccess().getIsIParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__IsAssignment_2"


    // $ANTLR start "rule__Declaration__TypeAssignment_0"
    // InternalRat.g:2727:1: rule__Declaration__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Declaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2731:1: ( ( ruleType ) )
            // InternalRat.g:2732:2: ( ruleType )
            {
            // InternalRat.g:2732:2: ( ruleType )
            // InternalRat.g:2733:3: ruleType
            {
             before(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__TypeAssignment_0"


    // $ANTLR start "rule__Declaration__NomDeclAssignment_1"
    // InternalRat.g:2742:1: rule__Declaration__NomDeclAssignment_1 : ( RULE_ID ) ;
    public final void rule__Declaration__NomDeclAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2746:1: ( ( RULE_ID ) )
            // InternalRat.g:2747:2: ( RULE_ID )
            {
            // InternalRat.g:2747:2: ( RULE_ID )
            // InternalRat.g:2748:3: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getNomDeclIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getNomDeclIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__NomDeclAssignment_1"


    // $ANTLR start "rule__Declaration__EAssignment_3"
    // InternalRat.g:2757:1: rule__Declaration__EAssignment_3 : ( ruleE ) ;
    public final void rule__Declaration__EAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2761:1: ( ( ruleE ) )
            // InternalRat.g:2762:2: ( ruleE )
            {
            // InternalRat.g:2762:2: ( ruleE )
            // InternalRat.g:2763:3: ruleE
            {
             before(grammarAccess.getDeclarationAccess().getEEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleE();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getEEParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__EAssignment_3"


    // $ANTLR start "rule__Affectation__NomAffAssignment_0"
    // InternalRat.g:2772:1: rule__Affectation__NomAffAssignment_0 : ( RULE_ID ) ;
    public final void rule__Affectation__NomAffAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2776:1: ( ( RULE_ID ) )
            // InternalRat.g:2777:2: ( RULE_ID )
            {
            // InternalRat.g:2777:2: ( RULE_ID )
            // InternalRat.g:2778:3: RULE_ID
            {
             before(grammarAccess.getAffectationAccess().getNomAffIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getNomAffIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__NomAffAssignment_0"


    // $ANTLR start "rule__Affectation__EAssignment_2"
    // InternalRat.g:2787:1: rule__Affectation__EAssignment_2 : ( ruleE ) ;
    public final void rule__Affectation__EAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2791:1: ( ( ruleE ) )
            // InternalRat.g:2792:2: ( ruleE )
            {
            // InternalRat.g:2792:2: ( ruleE )
            // InternalRat.g:2793:3: ruleE
            {
             before(grammarAccess.getAffectationAccess().getEEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleE();

            state._fsp--;

             after(grammarAccess.getAffectationAccess().getEEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__EAssignment_2"


    // $ANTLR start "rule__Constante__NomConstAssignment_1"
    // InternalRat.g:2802:1: rule__Constante__NomConstAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constante__NomConstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2806:1: ( ( RULE_ID ) )
            // InternalRat.g:2807:2: ( RULE_ID )
            {
            // InternalRat.g:2807:2: ( RULE_ID )
            // InternalRat.g:2808:3: RULE_ID
            {
             before(grammarAccess.getConstanteAccess().getNomConstIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstanteAccess().getNomConstIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constante__NomConstAssignment_1"


    // $ANTLR start "rule__Constante__ValAssignment_3"
    // InternalRat.g:2817:1: rule__Constante__ValAssignment_3 : ( RULE_INT ) ;
    public final void rule__Constante__ValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2821:1: ( ( RULE_INT ) )
            // InternalRat.g:2822:2: ( RULE_INT )
            {
            // InternalRat.g:2822:2: ( RULE_INT )
            // InternalRat.g:2823:3: RULE_INT
            {
             before(grammarAccess.getConstanteAccess().getValINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConstanteAccess().getValINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constante__ValAssignment_3"


    // $ANTLR start "rule__Print__ValAssignment_1"
    // InternalRat.g:2832:1: rule__Print__ValAssignment_1 : ( ruleE ) ;
    public final void rule__Print__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2836:1: ( ( ruleE ) )
            // InternalRat.g:2837:2: ( ruleE )
            {
            // InternalRat.g:2837:2: ( ruleE )
            // InternalRat.g:2838:3: ruleE
            {
             before(grammarAccess.getPrintAccess().getValEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleE();

            state._fsp--;

             after(grammarAccess.getPrintAccess().getValEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__ValAssignment_1"


    // $ANTLR start "rule__Conditionnelle__CondcAssignment_1"
    // InternalRat.g:2847:1: rule__Conditionnelle__CondcAssignment_1 : ( ruleE ) ;
    public final void rule__Conditionnelle__CondcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2851:1: ( ( ruleE ) )
            // InternalRat.g:2852:2: ( ruleE )
            {
            // InternalRat.g:2852:2: ( ruleE )
            // InternalRat.g:2853:3: ruleE
            {
             before(grammarAccess.getConditionnelleAccess().getCondcEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleE();

            state._fsp--;

             after(grammarAccess.getConditionnelleAccess().getCondcEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditionnelle__CondcAssignment_1"


    // $ANTLR start "rule__Conditionnelle__Bloc1condAssignment_2"
    // InternalRat.g:2862:1: rule__Conditionnelle__Bloc1condAssignment_2 : ( ruleBloc ) ;
    public final void rule__Conditionnelle__Bloc1condAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2866:1: ( ( ruleBloc ) )
            // InternalRat.g:2867:2: ( ruleBloc )
            {
            // InternalRat.g:2867:2: ( ruleBloc )
            // InternalRat.g:2868:3: ruleBloc
            {
             before(grammarAccess.getConditionnelleAccess().getBloc1condBlocParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBloc();

            state._fsp--;

             after(grammarAccess.getConditionnelleAccess().getBloc1condBlocParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditionnelle__Bloc1condAssignment_2"


    // $ANTLR start "rule__Conditionnelle__Bloc2condAssignment_4"
    // InternalRat.g:2877:1: rule__Conditionnelle__Bloc2condAssignment_4 : ( ruleBloc ) ;
    public final void rule__Conditionnelle__Bloc2condAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2881:1: ( ( ruleBloc ) )
            // InternalRat.g:2882:2: ( ruleBloc )
            {
            // InternalRat.g:2882:2: ( ruleBloc )
            // InternalRat.g:2883:3: ruleBloc
            {
             before(grammarAccess.getConditionnelleAccess().getBloc2condBlocParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBloc();

            state._fsp--;

             after(grammarAccess.getConditionnelleAccess().getBloc2condBlocParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditionnelle__Bloc2condAssignment_4"


    // $ANTLR start "rule__Tantque__CondtAssignment_1"
    // InternalRat.g:2892:1: rule__Tantque__CondtAssignment_1 : ( ruleE ) ;
    public final void rule__Tantque__CondtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2896:1: ( ( ruleE ) )
            // InternalRat.g:2897:2: ( ruleE )
            {
            // InternalRat.g:2897:2: ( ruleE )
            // InternalRat.g:2898:3: ruleE
            {
             before(grammarAccess.getTantqueAccess().getCondtEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleE();

            state._fsp--;

             after(grammarAccess.getTantqueAccess().getCondtEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tantque__CondtAssignment_1"


    // $ANTLR start "rule__Tantque__BoucleAssignment_2"
    // InternalRat.g:2907:1: rule__Tantque__BoucleAssignment_2 : ( ruleBloc ) ;
    public final void rule__Tantque__BoucleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2911:1: ( ( ruleBloc ) )
            // InternalRat.g:2912:2: ( ruleBloc )
            {
            // InternalRat.g:2912:2: ( ruleBloc )
            // InternalRat.g:2913:3: ruleBloc
            {
             before(grammarAccess.getTantqueAccess().getBoucleBlocParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBloc();

            state._fsp--;

             after(grammarAccess.getTantqueAccess().getBoucleBlocParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tantque__BoucleAssignment_2"


    // $ANTLR start "rule__DP__TypeAssignment_0"
    // InternalRat.g:2922:1: rule__DP__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__DP__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2926:1: ( ( ruleType ) )
            // InternalRat.g:2927:2: ( ruleType )
            {
            // InternalRat.g:2927:2: ( ruleType )
            // InternalRat.g:2928:3: ruleType
            {
             before(grammarAccess.getDPAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDPAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DP__TypeAssignment_0"


    // $ANTLR start "rule__DP__IdAssignment_1"
    // InternalRat.g:2937:1: rule__DP__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__DP__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2941:1: ( ( RULE_ID ) )
            // InternalRat.g:2942:2: ( RULE_ID )
            {
            // InternalRat.g:2942:2: ( RULE_ID )
            // InternalRat.g:2943:3: RULE_ID
            {
             before(grammarAccess.getDPAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDPAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DP__IdAssignment_1"


    // $ANTLR start "rule__Type__TAssignment"
    // InternalRat.g:2952:1: rule__Type__TAssignment : ( ( rule__Type__TAlternatives_0 ) ) ;
    public final void rule__Type__TAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2956:1: ( ( ( rule__Type__TAlternatives_0 ) ) )
            // InternalRat.g:2957:2: ( ( rule__Type__TAlternatives_0 ) )
            {
            // InternalRat.g:2957:2: ( ( rule__Type__TAlternatives_0 ) )
            // InternalRat.g:2958:3: ( rule__Type__TAlternatives_0 )
            {
             before(grammarAccess.getTypeAccess().getTAlternatives_0()); 
            // InternalRat.g:2959:3: ( rule__Type__TAlternatives_0 )
            // InternalRat.g:2959:4: rule__Type__TAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__TAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TAssignment"


    // $ANTLR start "rule__CP__EAssignment_1"
    // InternalRat.g:2967:1: rule__CP__EAssignment_1 : ( ruleE ) ;
    public final void rule__CP__EAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2971:1: ( ( ruleE ) )
            // InternalRat.g:2972:2: ( ruleE )
            {
            // InternalRat.g:2972:2: ( ruleE )
            // InternalRat.g:2973:3: ruleE
            {
             before(grammarAccess.getCPAccess().getEEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleE();

            state._fsp--;

             after(grammarAccess.getCPAccess().getEEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CP__EAssignment_1"


    // $ANTLR start "rule__Appel__NomAppelAssignment_1"
    // InternalRat.g:2982:1: rule__Appel__NomAppelAssignment_1 : ( RULE_ID ) ;
    public final void rule__Appel__NomAppelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:2986:1: ( ( RULE_ID ) )
            // InternalRat.g:2987:2: ( RULE_ID )
            {
            // InternalRat.g:2987:2: ( RULE_ID )
            // InternalRat.g:2988:3: RULE_ID
            {
             before(grammarAccess.getAppelAccess().getNomAppelIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAppelAccess().getNomAppelIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appel__NomAppelAssignment_1"


    // $ANTLR start "rule__Appel__ParamAssignment_3"
    // InternalRat.g:2997:1: rule__Appel__ParamAssignment_3 : ( ruleCP ) ;
    public final void rule__Appel__ParamAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:3001:1: ( ( ruleCP ) )
            // InternalRat.g:3002:2: ( ruleCP )
            {
            // InternalRat.g:3002:2: ( ruleCP )
            // InternalRat.g:3003:3: ruleCP
            {
             before(grammarAccess.getAppelAccess().getParamCPParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCP();

            state._fsp--;

             after(grammarAccess.getAppelAccess().getParamCPParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appel__ParamAssignment_3"


    // $ANTLR start "rule__Rationnel__E1Assignment_1"
    // InternalRat.g:3012:1: rule__Rationnel__E1Assignment_1 : ( ruleE ) ;
    public final void rule__Rationnel__E1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:3016:1: ( ( ruleE ) )
            // InternalRat.g:3017:2: ( ruleE )
            {
            // InternalRat.g:3017:2: ( ruleE )
            // InternalRat.g:3018:3: ruleE
            {
             before(grammarAccess.getRationnelAccess().getE1EParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleE();

            state._fsp--;

             after(grammarAccess.getRationnelAccess().getE1EParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rationnel__E1Assignment_1"


    // $ANTLR start "rule__Rationnel__E2Assignment_3"
    // InternalRat.g:3027:1: rule__Rationnel__E2Assignment_3 : ( ruleE ) ;
    public final void rule__Rationnel__E2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:3031:1: ( ( ruleE ) )
            // InternalRat.g:3032:2: ( ruleE )
            {
            // InternalRat.g:3032:2: ( ruleE )
            // InternalRat.g:3033:3: ruleE
            {
             before(grammarAccess.getRationnelAccess().getE2EParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleE();

            state._fsp--;

             after(grammarAccess.getRationnelAccess().getE2EParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rationnel__E2Assignment_3"


    // $ANTLR start "rule__Numerateur__ValNumAssignment_1"
    // InternalRat.g:3042:1: rule__Numerateur__ValNumAssignment_1 : ( ruleE ) ;
    public final void rule__Numerateur__ValNumAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:3046:1: ( ( ruleE ) )
            // InternalRat.g:3047:2: ( ruleE )
            {
            // InternalRat.g:3047:2: ( ruleE )
            // InternalRat.g:3048:3: ruleE
            {
             before(grammarAccess.getNumerateurAccess().getValNumEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleE();

            state._fsp--;

             after(grammarAccess.getNumerateurAccess().getValNumEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numerateur__ValNumAssignment_1"


    // $ANTLR start "rule__Denominateur__ValDenumAssignment_1"
    // InternalRat.g:3057:1: rule__Denominateur__ValDenumAssignment_1 : ( ruleE ) ;
    public final void rule__Denominateur__ValDenumAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:3061:1: ( ( ruleE ) )
            // InternalRat.g:3062:2: ( ruleE )
            {
            // InternalRat.g:3062:2: ( ruleE )
            // InternalRat.g:3063:3: ruleE
            {
             before(grammarAccess.getDenominateurAccess().getValDenumEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleE();

            state._fsp--;

             after(grammarAccess.getDenominateurAccess().getValDenumEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Denominateur__ValDenumAssignment_1"


    // $ANTLR start "rule__Identificateur__IdAssignment"
    // InternalRat.g:3072:1: rule__Identificateur__IdAssignment : ( RULE_ID ) ;
    public final void rule__Identificateur__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:3076:1: ( ( RULE_ID ) )
            // InternalRat.g:3077:2: ( RULE_ID )
            {
            // InternalRat.g:3077:2: ( RULE_ID )
            // InternalRat.g:3078:3: RULE_ID
            {
             before(grammarAccess.getIdentificateurAccess().getIdIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentificateurAccess().getIdIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identificateur__IdAssignment"


    // $ANTLR start "rule__Boolean__ValAssignment"
    // InternalRat.g:3087:1: rule__Boolean__ValAssignment : ( ( rule__Boolean__ValAlternatives_0 ) ) ;
    public final void rule__Boolean__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:3091:1: ( ( ( rule__Boolean__ValAlternatives_0 ) ) )
            // InternalRat.g:3092:2: ( ( rule__Boolean__ValAlternatives_0 ) )
            {
            // InternalRat.g:3092:2: ( ( rule__Boolean__ValAlternatives_0 ) )
            // InternalRat.g:3093:3: ( rule__Boolean__ValAlternatives_0 )
            {
             before(grammarAccess.getBooleanAccess().getValAlternatives_0()); 
            // InternalRat.g:3094:3: ( rule__Boolean__ValAlternatives_0 )
            // InternalRat.g:3094:4: rule__Boolean__ValAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__ValAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getValAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__ValAssignment"


    // $ANTLR start "rule__Entier__IntAssignment"
    // InternalRat.g:3102:1: rule__Entier__IntAssignment : ( RULE_INT ) ;
    public final void rule__Entier__IntAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:3106:1: ( ( RULE_INT ) )
            // InternalRat.g:3107:2: ( RULE_INT )
            {
            // InternalRat.g:3107:2: ( RULE_INT )
            // InternalRat.g:3108:3: RULE_INT
            {
             before(grammarAccess.getEntierAccess().getIntINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntierAccess().getIntINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entier__IntAssignment"


    // $ANTLR start "rule__OpBin__E1Assignment_1"
    // InternalRat.g:3117:1: rule__OpBin__E1Assignment_1 : ( ruleE ) ;
    public final void rule__OpBin__E1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:3121:1: ( ( ruleE ) )
            // InternalRat.g:3122:2: ( ruleE )
            {
            // InternalRat.g:3122:2: ( ruleE )
            // InternalRat.g:3123:3: ruleE
            {
             before(grammarAccess.getOpBinAccess().getE1EParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleE();

            state._fsp--;

             after(grammarAccess.getOpBinAccess().getE1EParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpBin__E1Assignment_1"


    // $ANTLR start "rule__OpBin__OpAssignment_2"
    // InternalRat.g:3132:1: rule__OpBin__OpAssignment_2 : ( ruleOperande ) ;
    public final void rule__OpBin__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:3136:1: ( ( ruleOperande ) )
            // InternalRat.g:3137:2: ( ruleOperande )
            {
            // InternalRat.g:3137:2: ( ruleOperande )
            // InternalRat.g:3138:3: ruleOperande
            {
             before(grammarAccess.getOpBinAccess().getOpOperandeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperande();

            state._fsp--;

             after(grammarAccess.getOpBinAccess().getOpOperandeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpBin__OpAssignment_2"


    // $ANTLR start "rule__OpBin__E2Assignment_3"
    // InternalRat.g:3147:1: rule__OpBin__E2Assignment_3 : ( ruleE ) ;
    public final void rule__OpBin__E2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:3151:1: ( ( ruleE ) )
            // InternalRat.g:3152:2: ( ruleE )
            {
            // InternalRat.g:3152:2: ( ruleE )
            // InternalRat.g:3153:3: ruleE
            {
             before(grammarAccess.getOpBinAccess().getE2EParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleE();

            state._fsp--;

             after(grammarAccess.getOpBinAccess().getE2EParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpBin__E2Assignment_3"


    // $ANTLR start "rule__Operande__OpAssignment"
    // InternalRat.g:3162:1: rule__Operande__OpAssignment : ( ( rule__Operande__OpAlternatives_0 ) ) ;
    public final void rule__Operande__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRat.g:3166:1: ( ( ( rule__Operande__OpAlternatives_0 ) ) )
            // InternalRat.g:3167:2: ( ( rule__Operande__OpAlternatives_0 ) )
            {
            // InternalRat.g:3167:2: ( ( rule__Operande__OpAlternatives_0 ) )
            // InternalRat.g:3168:3: ( rule__Operande__OpAlternatives_0 )
            {
             before(grammarAccess.getOperandeAccess().getOpAlternatives_0()); 
            // InternalRat.g:3169:3: ( rule__Operande__OpAlternatives_0 )
            // InternalRat.g:3169:4: rule__Operande__OpAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Operande__OpAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOperandeAccess().getOpAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operande__OpAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000203800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000005C803810L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000005C003812L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000198010C030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000005E003810L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000198010C032L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000000F0000L});

}