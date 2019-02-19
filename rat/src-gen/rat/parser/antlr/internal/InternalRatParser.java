package rat.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import rat.services.RatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRatParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'{'", "'return'", "';'", "'}'", "'='", "'const'", "'print'", "'if'", "'else'", "'while'", "'bool'", "'int'", "'rat'", "'call'", "'['", "'/'", "']'", "'num'", "'denom'", "'false'", "'true'", "'+'", "'*'", "'<'"
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

        public InternalRatParser(TokenStream input, RatGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Prog";
       	}

       	@Override
       	protected RatGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProg"
    // InternalRat.g:64:1: entryRuleProg returns [EObject current=null] : iv_ruleProg= ruleProg EOF ;
    public final EObject entryRuleProg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProg = null;


        try {
            // InternalRat.g:64:45: (iv_ruleProg= ruleProg EOF )
            // InternalRat.g:65:2: iv_ruleProg= ruleProg EOF
            {
             newCompositeNode(grammarAccess.getProgRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProg=ruleProg();

            state._fsp--;

             current =iv_ruleProg; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProg"


    // $ANTLR start "ruleProg"
    // InternalRat.g:71:1: ruleProg returns [EObject current=null] : ( ( (lv_fun_0_0= ruleFun ) )* this_ID_1= RULE_ID ( (lv_bloc_2_0= ruleBloc ) ) ) ;
    public final EObject ruleProg() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        EObject lv_fun_0_0 = null;

        EObject lv_bloc_2_0 = null;



        	enterRule();

        try {
            // InternalRat.g:77:2: ( ( ( (lv_fun_0_0= ruleFun ) )* this_ID_1= RULE_ID ( (lv_bloc_2_0= ruleBloc ) ) ) )
            // InternalRat.g:78:2: ( ( (lv_fun_0_0= ruleFun ) )* this_ID_1= RULE_ID ( (lv_bloc_2_0= ruleBloc ) ) )
            {
            // InternalRat.g:78:2: ( ( (lv_fun_0_0= ruleFun ) )* this_ID_1= RULE_ID ( (lv_bloc_2_0= ruleBloc ) ) )
            // InternalRat.g:79:3: ( (lv_fun_0_0= ruleFun ) )* this_ID_1= RULE_ID ( (lv_bloc_2_0= ruleBloc ) )
            {
            // InternalRat.g:79:3: ( (lv_fun_0_0= ruleFun ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=23 && LA1_0<=25)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRat.g:80:4: (lv_fun_0_0= ruleFun )
            	    {
            	    // InternalRat.g:80:4: (lv_fun_0_0= ruleFun )
            	    // InternalRat.g:81:5: lv_fun_0_0= ruleFun
            	    {

            	    					newCompositeNode(grammarAccess.getProgAccess().getFunFunParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_fun_0_0=ruleFun();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fun",
            	    						lv_fun_0_0,
            	    						"rat.Rat.Fun");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(this_ID_1, grammarAccess.getProgAccess().getIDTerminalRuleCall_1());
            		
            // InternalRat.g:102:3: ( (lv_bloc_2_0= ruleBloc ) )
            // InternalRat.g:103:4: (lv_bloc_2_0= ruleBloc )
            {
            // InternalRat.g:103:4: (lv_bloc_2_0= ruleBloc )
            // InternalRat.g:104:5: lv_bloc_2_0= ruleBloc
            {

            					newCompositeNode(grammarAccess.getProgAccess().getBlocBlocParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_bloc_2_0=ruleBloc();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgRule());
            					}
            					set(
            						current,
            						"bloc",
            						lv_bloc_2_0,
            						"rat.Rat.Bloc");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProg"


    // $ANTLR start "entryRuleFun"
    // InternalRat.g:125:1: entryRuleFun returns [EObject current=null] : iv_ruleFun= ruleFun EOF ;
    public final EObject entryRuleFun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFun = null;


        try {
            // InternalRat.g:125:44: (iv_ruleFun= ruleFun EOF )
            // InternalRat.g:126:2: iv_ruleFun= ruleFun EOF
            {
             newCompositeNode(grammarAccess.getFunRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFun=ruleFun();

            state._fsp--;

             current =iv_ruleFun; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFun"


    // $ANTLR start "ruleFun"
    // InternalRat.g:132:1: ruleFun returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleDP ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_is_6_0= ruleI ) )* otherlv_7= 'return' ( (lv_e_8_0= ruleE ) ) otherlv_9= ';' otherlv_10= '}' ) ;
    public final EObject ruleFun() throws RecognitionException {
        EObject current = null;

        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_type_0_0 = null;

        EObject lv_param_3_0 = null;

        EObject lv_is_6_0 = null;

        EObject lv_e_8_0 = null;



        	enterRule();

        try {
            // InternalRat.g:138:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleDP ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_is_6_0= ruleI ) )* otherlv_7= 'return' ( (lv_e_8_0= ruleE ) ) otherlv_9= ';' otherlv_10= '}' ) )
            // InternalRat.g:139:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleDP ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_is_6_0= ruleI ) )* otherlv_7= 'return' ( (lv_e_8_0= ruleE ) ) otherlv_9= ';' otherlv_10= '}' )
            {
            // InternalRat.g:139:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleDP ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_is_6_0= ruleI ) )* otherlv_7= 'return' ( (lv_e_8_0= ruleE ) ) otherlv_9= ';' otherlv_10= '}' )
            // InternalRat.g:140:3: ( (lv_type_0_0= ruleType ) ) ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleDP ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_is_6_0= ruleI ) )* otherlv_7= 'return' ( (lv_e_8_0= ruleE ) ) otherlv_9= ';' otherlv_10= '}'
            {
            // InternalRat.g:140:3: ( (lv_type_0_0= ruleType ) )
            // InternalRat.g:141:4: (lv_type_0_0= ruleType )
            {
            // InternalRat.g:141:4: (lv_type_0_0= ruleType )
            // InternalRat.g:142:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getFunAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"rat.Rat.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRat.g:159:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalRat.g:160:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalRat.g:160:4: (lv_nom_1_0= RULE_ID )
            // InternalRat.g:161:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getFunAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFunAccess().getLeftParenthesisKeyword_2());
            		
            // InternalRat.g:181:3: ( (lv_param_3_0= ruleDP ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=23 && LA2_0<=25)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRat.g:182:4: (lv_param_3_0= ruleDP )
            	    {
            	    // InternalRat.g:182:4: (lv_param_3_0= ruleDP )
            	    // InternalRat.g:183:5: lv_param_3_0= ruleDP
            	    {

            	    					newCompositeNode(grammarAccess.getFunAccess().getParamDPParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_param_3_0=ruleDP();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunRule());
            	    					}
            	    					add(
            	    						current,
            	    						"param",
            	    						lv_param_3_0,
            	    						"rat.Rat.DP");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getFunAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getFunAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalRat.g:208:3: ( (lv_is_6_0= ruleI ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=18 && LA3_0<=20)||(LA3_0>=22 && LA3_0<=25)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRat.g:209:4: (lv_is_6_0= ruleI )
            	    {
            	    // InternalRat.g:209:4: (lv_is_6_0= ruleI )
            	    // InternalRat.g:210:5: lv_is_6_0= ruleI
            	    {

            	    					newCompositeNode(grammarAccess.getFunAccess().getIsIParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_is_6_0=ruleI();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunRule());
            	    					}
            	    					add(
            	    						current,
            	    						"is",
            	    						lv_is_6_0,
            	    						"rat.Rat.I");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getFunAccess().getReturnKeyword_7());
            		
            // InternalRat.g:231:3: ( (lv_e_8_0= ruleE ) )
            // InternalRat.g:232:4: (lv_e_8_0= ruleE )
            {
            // InternalRat.g:232:4: (lv_e_8_0= ruleE )
            // InternalRat.g:233:5: lv_e_8_0= ruleE
            {

            					newCompositeNode(grammarAccess.getFunAccess().getEEParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_e_8_0=ruleE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_8_0,
            						"rat.Rat.E");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getFunAccess().getSemicolonKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFunAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFun"


    // $ANTLR start "entryRuleBloc"
    // InternalRat.g:262:1: entryRuleBloc returns [EObject current=null] : iv_ruleBloc= ruleBloc EOF ;
    public final EObject entryRuleBloc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloc = null;


        try {
            // InternalRat.g:262:45: (iv_ruleBloc= ruleBloc EOF )
            // InternalRat.g:263:2: iv_ruleBloc= ruleBloc EOF
            {
             newCompositeNode(grammarAccess.getBlocRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBloc=ruleBloc();

            state._fsp--;

             current =iv_ruleBloc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBloc"


    // $ANTLR start "ruleBloc"
    // InternalRat.g:269:1: ruleBloc returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_is_2_0= ruleI ) )* otherlv_3= '}' ) ;
    public final EObject ruleBloc() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_is_2_0 = null;



        	enterRule();

        try {
            // InternalRat.g:275:2: ( ( () otherlv_1= '{' ( (lv_is_2_0= ruleI ) )* otherlv_3= '}' ) )
            // InternalRat.g:276:2: ( () otherlv_1= '{' ( (lv_is_2_0= ruleI ) )* otherlv_3= '}' )
            {
            // InternalRat.g:276:2: ( () otherlv_1= '{' ( (lv_is_2_0= ruleI ) )* otherlv_3= '}' )
            // InternalRat.g:277:3: () otherlv_1= '{' ( (lv_is_2_0= ruleI ) )* otherlv_3= '}'
            {
            // InternalRat.g:277:3: ()
            // InternalRat.g:278:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlocAccess().getBlocAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getBlocAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRat.g:288:3: ( (lv_is_2_0= ruleI ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=18 && LA4_0<=20)||(LA4_0>=22 && LA4_0<=25)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRat.g:289:4: (lv_is_2_0= ruleI )
            	    {
            	    // InternalRat.g:289:4: (lv_is_2_0= ruleI )
            	    // InternalRat.g:290:5: lv_is_2_0= ruleI
            	    {

            	    					newCompositeNode(grammarAccess.getBlocAccess().getIsIParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_is_2_0=ruleI();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBlocRule());
            	    					}
            	    					add(
            	    						current,
            	    						"is",
            	    						lv_is_2_0,
            	    						"rat.Rat.I");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBlocAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBloc"


    // $ANTLR start "entryRuleI"
    // InternalRat.g:315:1: entryRuleI returns [EObject current=null] : iv_ruleI= ruleI EOF ;
    public final EObject entryRuleI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleI = null;


        try {
            // InternalRat.g:315:42: (iv_ruleI= ruleI EOF )
            // InternalRat.g:316:2: iv_ruleI= ruleI EOF
            {
             newCompositeNode(grammarAccess.getIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleI=ruleI();

            state._fsp--;

             current =iv_ruleI; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleI"


    // $ANTLR start "ruleI"
    // InternalRat.g:322:1: ruleI returns [EObject current=null] : (this_Declaration_0= ruleDeclaration | this_Affectation_1= ruleAffectation | this_Constante_2= ruleConstante | this_Print_3= rulePrint | this_Conditionnelle_4= ruleConditionnelle | this_Tantque_5= ruleTantque ) ;
    public final EObject ruleI() throws RecognitionException {
        EObject current = null;

        EObject this_Declaration_0 = null;

        EObject this_Affectation_1 = null;

        EObject this_Constante_2 = null;

        EObject this_Print_3 = null;

        EObject this_Conditionnelle_4 = null;

        EObject this_Tantque_5 = null;



        	enterRule();

        try {
            // InternalRat.g:328:2: ( (this_Declaration_0= ruleDeclaration | this_Affectation_1= ruleAffectation | this_Constante_2= ruleConstante | this_Print_3= rulePrint | this_Conditionnelle_4= ruleConditionnelle | this_Tantque_5= ruleTantque ) )
            // InternalRat.g:329:2: (this_Declaration_0= ruleDeclaration | this_Affectation_1= ruleAffectation | this_Constante_2= ruleConstante | this_Print_3= rulePrint | this_Conditionnelle_4= ruleConditionnelle | this_Tantque_5= ruleTantque )
            {
            // InternalRat.g:329:2: (this_Declaration_0= ruleDeclaration | this_Affectation_1= ruleAffectation | this_Constante_2= ruleConstante | this_Print_3= rulePrint | this_Conditionnelle_4= ruleConditionnelle | this_Tantque_5= ruleTantque )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 23:
            case 24:
            case 25:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
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
            case 20:
                {
                alt5=5;
                }
                break;
            case 22:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRat.g:330:3: this_Declaration_0= ruleDeclaration
                    {

                    			newCompositeNode(grammarAccess.getIAccess().getDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Declaration_0=ruleDeclaration();

                    state._fsp--;


                    			current = this_Declaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRat.g:339:3: this_Affectation_1= ruleAffectation
                    {

                    			newCompositeNode(grammarAccess.getIAccess().getAffectationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Affectation_1=ruleAffectation();

                    state._fsp--;


                    			current = this_Affectation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRat.g:348:3: this_Constante_2= ruleConstante
                    {

                    			newCompositeNode(grammarAccess.getIAccess().getConstanteParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constante_2=ruleConstante();

                    state._fsp--;


                    			current = this_Constante_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRat.g:357:3: this_Print_3= rulePrint
                    {

                    			newCompositeNode(grammarAccess.getIAccess().getPrintParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Print_3=rulePrint();

                    state._fsp--;


                    			current = this_Print_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRat.g:366:3: this_Conditionnelle_4= ruleConditionnelle
                    {

                    			newCompositeNode(grammarAccess.getIAccess().getConditionnelleParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Conditionnelle_4=ruleConditionnelle();

                    state._fsp--;


                    			current = this_Conditionnelle_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRat.g:375:3: this_Tantque_5= ruleTantque
                    {

                    			newCompositeNode(grammarAccess.getIAccess().getTantqueParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tantque_5=ruleTantque();

                    state._fsp--;


                    			current = this_Tantque_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleI"


    // $ANTLR start "entryRuleDeclaration"
    // InternalRat.g:387:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalRat.g:387:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalRat.g:388:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalRat.g:394:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_e_3_0= ruleE ) ) otherlv_4= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;

        EObject lv_e_3_0 = null;



        	enterRule();

        try {
            // InternalRat.g:400:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_e_3_0= ruleE ) ) otherlv_4= ';' ) )
            // InternalRat.g:401:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_e_3_0= ruleE ) ) otherlv_4= ';' )
            {
            // InternalRat.g:401:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_e_3_0= ruleE ) ) otherlv_4= ';' )
            // InternalRat.g:402:3: ( (lv_type_0_0= ruleType ) ) ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_e_3_0= ruleE ) ) otherlv_4= ';'
            {
            // InternalRat.g:402:3: ( (lv_type_0_0= ruleType ) )
            // InternalRat.g:403:4: (lv_type_0_0= ruleType )
            {
            // InternalRat.g:403:4: (lv_type_0_0= ruleType )
            // InternalRat.g:404:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"rat.Rat.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRat.g:421:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalRat.g:422:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalRat.g:422:4: (lv_nom_1_0= RULE_ID )
            // InternalRat.g:423:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getDeclarationAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalRat.g:443:3: ( (lv_e_3_0= ruleE ) )
            // InternalRat.g:444:4: (lv_e_3_0= ruleE )
            {
            // InternalRat.g:444:4: (lv_e_3_0= ruleE )
            // InternalRat.g:445:5: lv_e_3_0= ruleE
            {

            					newCompositeNode(grammarAccess.getDeclarationAccess().getEEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_e_3_0=ruleE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarationRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_3_0,
            						"rat.Rat.E");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeclarationAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleAffectation"
    // InternalRat.g:470:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // InternalRat.g:470:52: (iv_ruleAffectation= ruleAffectation EOF )
            // InternalRat.g:471:2: iv_ruleAffectation= ruleAffectation EOF
            {
             newCompositeNode(grammarAccess.getAffectationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAffectation=ruleAffectation();

            state._fsp--;

             current =iv_ruleAffectation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // InternalRat.g:477:1: ruleAffectation returns [EObject current=null] : ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_e_2_0= ruleE ) ) otherlv_3= ';' ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token lv_nom_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalRat.g:483:2: ( ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_e_2_0= ruleE ) ) otherlv_3= ';' ) )
            // InternalRat.g:484:2: ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_e_2_0= ruleE ) ) otherlv_3= ';' )
            {
            // InternalRat.g:484:2: ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_e_2_0= ruleE ) ) otherlv_3= ';' )
            // InternalRat.g:485:3: ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_e_2_0= ruleE ) ) otherlv_3= ';'
            {
            // InternalRat.g:485:3: ( (lv_nom_0_0= RULE_ID ) )
            // InternalRat.g:486:4: (lv_nom_0_0= RULE_ID )
            {
            // InternalRat.g:486:4: (lv_nom_0_0= RULE_ID )
            // InternalRat.g:487:5: lv_nom_0_0= RULE_ID
            {
            lv_nom_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_nom_0_0, grammarAccess.getAffectationAccess().getNomIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAffectationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getEqualsSignKeyword_1());
            		
            // InternalRat.g:507:3: ( (lv_e_2_0= ruleE ) )
            // InternalRat.g:508:4: (lv_e_2_0= ruleE )
            {
            // InternalRat.g:508:4: (lv_e_2_0= ruleE )
            // InternalRat.g:509:5: lv_e_2_0= ruleE
            {

            					newCompositeNode(grammarAccess.getAffectationAccess().getEEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_e_2_0=ruleE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAffectationRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_2_0,
            						"rat.Rat.E");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAffectationAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleConstante"
    // InternalRat.g:534:1: entryRuleConstante returns [EObject current=null] : iv_ruleConstante= ruleConstante EOF ;
    public final EObject entryRuleConstante() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstante = null;


        try {
            // InternalRat.g:534:50: (iv_ruleConstante= ruleConstante EOF )
            // InternalRat.g:535:2: iv_ruleConstante= ruleConstante EOF
            {
             newCompositeNode(grammarAccess.getConstanteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstante=ruleConstante();

            state._fsp--;

             current =iv_ruleConstante; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstante"


    // $ANTLR start "ruleConstante"
    // InternalRat.g:541:1: ruleConstante returns [EObject current=null] : (otherlv_0= 'const' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_e_3_0= RULE_INT ) ) otherlv_4= ';' ) ;
    public final EObject ruleConstante() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token lv_e_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRat.g:547:2: ( (otherlv_0= 'const' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_e_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            // InternalRat.g:548:2: (otherlv_0= 'const' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_e_3_0= RULE_INT ) ) otherlv_4= ';' )
            {
            // InternalRat.g:548:2: (otherlv_0= 'const' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_e_3_0= RULE_INT ) ) otherlv_4= ';' )
            // InternalRat.g:549:3: otherlv_0= 'const' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_e_3_0= RULE_INT ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstanteAccess().getConstKeyword_0());
            		
            // InternalRat.g:553:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalRat.g:554:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalRat.g:554:4: (lv_nom_1_0= RULE_ID )
            // InternalRat.g:555:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getConstanteAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstanteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getConstanteAccess().getEqualsSignKeyword_2());
            		
            // InternalRat.g:575:3: ( (lv_e_3_0= RULE_INT ) )
            // InternalRat.g:576:4: (lv_e_3_0= RULE_INT )
            {
            // InternalRat.g:576:4: (lv_e_3_0= RULE_INT )
            // InternalRat.g:577:5: lv_e_3_0= RULE_INT
            {
            lv_e_3_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_e_3_0, grammarAccess.getConstanteAccess().getEINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstanteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"e",
            						lv_e_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConstanteAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstante"


    // $ANTLR start "entryRulePrint"
    // InternalRat.g:601:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalRat.g:601:46: (iv_rulePrint= rulePrint EOF )
            // InternalRat.g:602:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalRat.g:608:1: rulePrint returns [EObject current=null] : (otherlv_0= 'print' ( (lv_e_1_0= ruleE ) ) otherlv_2= ';' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_e_1_0 = null;



        	enterRule();

        try {
            // InternalRat.g:614:2: ( (otherlv_0= 'print' ( (lv_e_1_0= ruleE ) ) otherlv_2= ';' ) )
            // InternalRat.g:615:2: (otherlv_0= 'print' ( (lv_e_1_0= ruleE ) ) otherlv_2= ';' )
            {
            // InternalRat.g:615:2: (otherlv_0= 'print' ( (lv_e_1_0= ruleE ) ) otherlv_2= ';' )
            // InternalRat.g:616:3: otherlv_0= 'print' ( (lv_e_1_0= ruleE ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            // InternalRat.g:620:3: ( (lv_e_1_0= ruleE ) )
            // InternalRat.g:621:4: (lv_e_1_0= ruleE )
            {
            // InternalRat.g:621:4: (lv_e_1_0= ruleE )
            // InternalRat.g:622:5: lv_e_1_0= ruleE
            {

            					newCompositeNode(grammarAccess.getPrintAccess().getEEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_e_1_0=ruleE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_1_0,
            						"rat.Rat.E");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPrintAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleConditionnelle"
    // InternalRat.g:647:1: entryRuleConditionnelle returns [EObject current=null] : iv_ruleConditionnelle= ruleConditionnelle EOF ;
    public final EObject entryRuleConditionnelle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionnelle = null;


        try {
            // InternalRat.g:647:55: (iv_ruleConditionnelle= ruleConditionnelle EOF )
            // InternalRat.g:648:2: iv_ruleConditionnelle= ruleConditionnelle EOF
            {
             newCompositeNode(grammarAccess.getConditionnelleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionnelle=ruleConditionnelle();

            state._fsp--;

             current =iv_ruleConditionnelle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionnelle"


    // $ANTLR start "ruleConditionnelle"
    // InternalRat.g:654:1: ruleConditionnelle returns [EObject current=null] : (otherlv_0= 'if' ( (lv_e_1_0= ruleE ) ) ( (lv_bloc1_2_0= ruleBloc ) ) otherlv_3= 'else' ( (lv_bloc2_4_0= ruleBloc ) ) ) ;
    public final EObject ruleConditionnelle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_e_1_0 = null;

        EObject lv_bloc1_2_0 = null;

        EObject lv_bloc2_4_0 = null;



        	enterRule();

        try {
            // InternalRat.g:660:2: ( (otherlv_0= 'if' ( (lv_e_1_0= ruleE ) ) ( (lv_bloc1_2_0= ruleBloc ) ) otherlv_3= 'else' ( (lv_bloc2_4_0= ruleBloc ) ) ) )
            // InternalRat.g:661:2: (otherlv_0= 'if' ( (lv_e_1_0= ruleE ) ) ( (lv_bloc1_2_0= ruleBloc ) ) otherlv_3= 'else' ( (lv_bloc2_4_0= ruleBloc ) ) )
            {
            // InternalRat.g:661:2: (otherlv_0= 'if' ( (lv_e_1_0= ruleE ) ) ( (lv_bloc1_2_0= ruleBloc ) ) otherlv_3= 'else' ( (lv_bloc2_4_0= ruleBloc ) ) )
            // InternalRat.g:662:3: otherlv_0= 'if' ( (lv_e_1_0= ruleE ) ) ( (lv_bloc1_2_0= ruleBloc ) ) otherlv_3= 'else' ( (lv_bloc2_4_0= ruleBloc ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionnelleAccess().getIfKeyword_0());
            		
            // InternalRat.g:666:3: ( (lv_e_1_0= ruleE ) )
            // InternalRat.g:667:4: (lv_e_1_0= ruleE )
            {
            // InternalRat.g:667:4: (lv_e_1_0= ruleE )
            // InternalRat.g:668:5: lv_e_1_0= ruleE
            {

            					newCompositeNode(grammarAccess.getConditionnelleAccess().getEEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_e_1_0=ruleE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionnelleRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_1_0,
            						"rat.Rat.E");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRat.g:685:3: ( (lv_bloc1_2_0= ruleBloc ) )
            // InternalRat.g:686:4: (lv_bloc1_2_0= ruleBloc )
            {
            // InternalRat.g:686:4: (lv_bloc1_2_0= ruleBloc )
            // InternalRat.g:687:5: lv_bloc1_2_0= ruleBloc
            {

            					newCompositeNode(grammarAccess.getConditionnelleAccess().getBloc1BlocParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_bloc1_2_0=ruleBloc();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionnelleRule());
            					}
            					set(
            						current,
            						"bloc1",
            						lv_bloc1_2_0,
            						"rat.Rat.Bloc");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionnelleAccess().getElseKeyword_3());
            		
            // InternalRat.g:708:3: ( (lv_bloc2_4_0= ruleBloc ) )
            // InternalRat.g:709:4: (lv_bloc2_4_0= ruleBloc )
            {
            // InternalRat.g:709:4: (lv_bloc2_4_0= ruleBloc )
            // InternalRat.g:710:5: lv_bloc2_4_0= ruleBloc
            {

            					newCompositeNode(grammarAccess.getConditionnelleAccess().getBloc2BlocParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_bloc2_4_0=ruleBloc();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionnelleRule());
            					}
            					set(
            						current,
            						"bloc2",
            						lv_bloc2_4_0,
            						"rat.Rat.Bloc");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionnelle"


    // $ANTLR start "entryRuleTantque"
    // InternalRat.g:731:1: entryRuleTantque returns [EObject current=null] : iv_ruleTantque= ruleTantque EOF ;
    public final EObject entryRuleTantque() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTantque = null;


        try {
            // InternalRat.g:731:48: (iv_ruleTantque= ruleTantque EOF )
            // InternalRat.g:732:2: iv_ruleTantque= ruleTantque EOF
            {
             newCompositeNode(grammarAccess.getTantqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTantque=ruleTantque();

            state._fsp--;

             current =iv_ruleTantque; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTantque"


    // $ANTLR start "ruleTantque"
    // InternalRat.g:738:1: ruleTantque returns [EObject current=null] : (otherlv_0= 'while' ( (lv_e_1_0= ruleE ) ) ( (lv_bloc_2_0= ruleBloc ) ) ) ;
    public final EObject ruleTantque() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_e_1_0 = null;

        EObject lv_bloc_2_0 = null;



        	enterRule();

        try {
            // InternalRat.g:744:2: ( (otherlv_0= 'while' ( (lv_e_1_0= ruleE ) ) ( (lv_bloc_2_0= ruleBloc ) ) ) )
            // InternalRat.g:745:2: (otherlv_0= 'while' ( (lv_e_1_0= ruleE ) ) ( (lv_bloc_2_0= ruleBloc ) ) )
            {
            // InternalRat.g:745:2: (otherlv_0= 'while' ( (lv_e_1_0= ruleE ) ) ( (lv_bloc_2_0= ruleBloc ) ) )
            // InternalRat.g:746:3: otherlv_0= 'while' ( (lv_e_1_0= ruleE ) ) ( (lv_bloc_2_0= ruleBloc ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTantqueAccess().getWhileKeyword_0());
            		
            // InternalRat.g:750:3: ( (lv_e_1_0= ruleE ) )
            // InternalRat.g:751:4: (lv_e_1_0= ruleE )
            {
            // InternalRat.g:751:4: (lv_e_1_0= ruleE )
            // InternalRat.g:752:5: lv_e_1_0= ruleE
            {

            					newCompositeNode(grammarAccess.getTantqueAccess().getEEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_e_1_0=ruleE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTantqueRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_1_0,
            						"rat.Rat.E");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRat.g:769:3: ( (lv_bloc_2_0= ruleBloc ) )
            // InternalRat.g:770:4: (lv_bloc_2_0= ruleBloc )
            {
            // InternalRat.g:770:4: (lv_bloc_2_0= ruleBloc )
            // InternalRat.g:771:5: lv_bloc_2_0= ruleBloc
            {

            					newCompositeNode(grammarAccess.getTantqueAccess().getBlocBlocParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_bloc_2_0=ruleBloc();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTantqueRule());
            					}
            					set(
            						current,
            						"bloc",
            						lv_bloc_2_0,
            						"rat.Rat.Bloc");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTantque"


    // $ANTLR start "entryRuleDP"
    // InternalRat.g:792:1: entryRuleDP returns [EObject current=null] : iv_ruleDP= ruleDP EOF ;
    public final EObject entryRuleDP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDP = null;


        try {
            // InternalRat.g:792:43: (iv_ruleDP= ruleDP EOF )
            // InternalRat.g:793:2: iv_ruleDP= ruleDP EOF
            {
             newCompositeNode(grammarAccess.getDPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDP=ruleDP();

            state._fsp--;

             current =iv_ruleDP; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDP"


    // $ANTLR start "ruleDP"
    // InternalRat.g:799:1: ruleDP returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDP() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalRat.g:805:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_id_1_0= RULE_ID ) ) ) )
            // InternalRat.g:806:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_id_1_0= RULE_ID ) ) )
            {
            // InternalRat.g:806:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_id_1_0= RULE_ID ) ) )
            // InternalRat.g:807:3: ( (lv_type_0_0= ruleType ) ) ( (lv_id_1_0= RULE_ID ) )
            {
            // InternalRat.g:807:3: ( (lv_type_0_0= ruleType ) )
            // InternalRat.g:808:4: (lv_type_0_0= ruleType )
            {
            // InternalRat.g:808:4: (lv_type_0_0= ruleType )
            // InternalRat.g:809:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getDPAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDPRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"rat.Rat.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRat.g:826:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalRat.g:827:4: (lv_id_1_0= RULE_ID )
            {
            // InternalRat.g:827:4: (lv_id_1_0= RULE_ID )
            // InternalRat.g:828:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_1_0, grammarAccess.getDPAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDP"


    // $ANTLR start "entryRuleType"
    // InternalRat.g:848:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalRat.g:848:45: (iv_ruleType= ruleType EOF )
            // InternalRat.g:849:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalRat.g:855:1: ruleType returns [EObject current=null] : ( ( (lv_t_0_1= 'bool' | lv_t_0_2= 'int' | lv_t_0_3= 'rat' ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_t_0_1=null;
        Token lv_t_0_2=null;
        Token lv_t_0_3=null;


        	enterRule();

        try {
            // InternalRat.g:861:2: ( ( ( (lv_t_0_1= 'bool' | lv_t_0_2= 'int' | lv_t_0_3= 'rat' ) ) ) )
            // InternalRat.g:862:2: ( ( (lv_t_0_1= 'bool' | lv_t_0_2= 'int' | lv_t_0_3= 'rat' ) ) )
            {
            // InternalRat.g:862:2: ( ( (lv_t_0_1= 'bool' | lv_t_0_2= 'int' | lv_t_0_3= 'rat' ) ) )
            // InternalRat.g:863:3: ( (lv_t_0_1= 'bool' | lv_t_0_2= 'int' | lv_t_0_3= 'rat' ) )
            {
            // InternalRat.g:863:3: ( (lv_t_0_1= 'bool' | lv_t_0_2= 'int' | lv_t_0_3= 'rat' ) )
            // InternalRat.g:864:4: (lv_t_0_1= 'bool' | lv_t_0_2= 'int' | lv_t_0_3= 'rat' )
            {
            // InternalRat.g:864:4: (lv_t_0_1= 'bool' | lv_t_0_2= 'int' | lv_t_0_3= 'rat' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRat.g:865:5: lv_t_0_1= 'bool'
                    {
                    lv_t_0_1=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_t_0_1, grammarAccess.getTypeAccess().getTBoolKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "t", lv_t_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalRat.g:876:5: lv_t_0_2= 'int'
                    {
                    lv_t_0_2=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_t_0_2, grammarAccess.getTypeAccess().getTIntKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "t", lv_t_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalRat.g:887:5: lv_t_0_3= 'rat'
                    {
                    lv_t_0_3=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_t_0_3, grammarAccess.getTypeAccess().getTRatKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "t", lv_t_0_3, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleCP"
    // InternalRat.g:903:1: entryRuleCP returns [EObject current=null] : iv_ruleCP= ruleCP EOF ;
    public final EObject entryRuleCP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCP = null;


        try {
            // InternalRat.g:903:43: (iv_ruleCP= ruleCP EOF )
            // InternalRat.g:904:2: iv_ruleCP= ruleCP EOF
            {
             newCompositeNode(grammarAccess.getCPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCP=ruleCP();

            state._fsp--;

             current =iv_ruleCP; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCP"


    // $ANTLR start "ruleCP"
    // InternalRat.g:910:1: ruleCP returns [EObject current=null] : ( () ( (lv_e_1_0= ruleE ) )* ) ;
    public final EObject ruleCP() throws RecognitionException {
        EObject current = null;

        EObject lv_e_1_0 = null;



        	enterRule();

        try {
            // InternalRat.g:916:2: ( ( () ( (lv_e_1_0= ruleE ) )* ) )
            // InternalRat.g:917:2: ( () ( (lv_e_1_0= ruleE ) )* )
            {
            // InternalRat.g:917:2: ( () ( (lv_e_1_0= ruleE ) )* )
            // InternalRat.g:918:3: () ( (lv_e_1_0= ruleE ) )*
            {
            // InternalRat.g:918:3: ()
            // InternalRat.g:919:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCPAccess().getCPAction_0(),
            					current);
            			

            }

            // InternalRat.g:925:3: ( (lv_e_1_0= ruleE ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||LA7_0==11||(LA7_0>=26 && LA7_0<=27)||(LA7_0>=30 && LA7_0<=33)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRat.g:926:4: (lv_e_1_0= ruleE )
            	    {
            	    // InternalRat.g:926:4: (lv_e_1_0= ruleE )
            	    // InternalRat.g:927:5: lv_e_1_0= ruleE
            	    {

            	    					newCompositeNode(grammarAccess.getCPAccess().getEEParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_e_1_0=ruleE();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCPRule());
            	    					}
            	    					add(
            	    						current,
            	    						"e",
            	    						lv_e_1_0,
            	    						"rat.Rat.E");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCP"


    // $ANTLR start "entryRuleE"
    // InternalRat.g:948:1: entryRuleE returns [EObject current=null] : iv_ruleE= ruleE EOF ;
    public final EObject entryRuleE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE = null;


        try {
            // InternalRat.g:948:42: (iv_ruleE= ruleE EOF )
            // InternalRat.g:949:2: iv_ruleE= ruleE EOF
            {
             newCompositeNode(grammarAccess.getERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleE=ruleE();

            state._fsp--;

             current =iv_ruleE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleE"


    // $ANTLR start "ruleE"
    // InternalRat.g:955:1: ruleE returns [EObject current=null] : (this_Appel_0= ruleAppel | this_Rationnel_1= ruleRationnel | this_Numerateur_2= ruleNumerateur | this_Denominateur_3= ruleDenominateur | this_Identificateur_4= ruleIdentificateur | this_Boolean_5= ruleBoolean | this_Entier_6= ruleEntier | this_OpBin_7= ruleOpBin ) ;
    public final EObject ruleE() throws RecognitionException {
        EObject current = null;

        EObject this_Appel_0 = null;

        EObject this_Rationnel_1 = null;

        EObject this_Numerateur_2 = null;

        EObject this_Denominateur_3 = null;

        EObject this_Identificateur_4 = null;

        EObject this_Boolean_5 = null;

        EObject this_Entier_6 = null;

        EObject this_OpBin_7 = null;



        	enterRule();

        try {
            // InternalRat.g:961:2: ( (this_Appel_0= ruleAppel | this_Rationnel_1= ruleRationnel | this_Numerateur_2= ruleNumerateur | this_Denominateur_3= ruleDenominateur | this_Identificateur_4= ruleIdentificateur | this_Boolean_5= ruleBoolean | this_Entier_6= ruleEntier | this_OpBin_7= ruleOpBin ) )
            // InternalRat.g:962:2: (this_Appel_0= ruleAppel | this_Rationnel_1= ruleRationnel | this_Numerateur_2= ruleNumerateur | this_Denominateur_3= ruleDenominateur | this_Identificateur_4= ruleIdentificateur | this_Boolean_5= ruleBoolean | this_Entier_6= ruleEntier | this_OpBin_7= ruleOpBin )
            {
            // InternalRat.g:962:2: (this_Appel_0= ruleAppel | this_Rationnel_1= ruleRationnel | this_Numerateur_2= ruleNumerateur | this_Denominateur_3= ruleDenominateur | this_Identificateur_4= ruleIdentificateur | this_Boolean_5= ruleBoolean | this_Entier_6= ruleEntier | this_OpBin_7= ruleOpBin )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt8=1;
                }
                break;
            case 27:
                {
                alt8=2;
                }
                break;
            case 30:
                {
                alt8=3;
                }
                break;
            case 31:
                {
                alt8=4;
                }
                break;
            case RULE_ID:
                {
                alt8=5;
                }
                break;
            case 32:
            case 33:
                {
                alt8=6;
                }
                break;
            case RULE_INT:
                {
                alt8=7;
                }
                break;
            case 11:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRat.g:963:3: this_Appel_0= ruleAppel
                    {

                    			newCompositeNode(grammarAccess.getEAccess().getAppelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Appel_0=ruleAppel();

                    state._fsp--;


                    			current = this_Appel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRat.g:972:3: this_Rationnel_1= ruleRationnel
                    {

                    			newCompositeNode(grammarAccess.getEAccess().getRationnelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rationnel_1=ruleRationnel();

                    state._fsp--;


                    			current = this_Rationnel_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRat.g:981:3: this_Numerateur_2= ruleNumerateur
                    {

                    			newCompositeNode(grammarAccess.getEAccess().getNumerateurParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Numerateur_2=ruleNumerateur();

                    state._fsp--;


                    			current = this_Numerateur_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRat.g:990:3: this_Denominateur_3= ruleDenominateur
                    {

                    			newCompositeNode(grammarAccess.getEAccess().getDenominateurParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Denominateur_3=ruleDenominateur();

                    state._fsp--;


                    			current = this_Denominateur_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRat.g:999:3: this_Identificateur_4= ruleIdentificateur
                    {

                    			newCompositeNode(grammarAccess.getEAccess().getIdentificateurParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Identificateur_4=ruleIdentificateur();

                    state._fsp--;


                    			current = this_Identificateur_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRat.g:1008:3: this_Boolean_5= ruleBoolean
                    {

                    			newCompositeNode(grammarAccess.getEAccess().getBooleanParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Boolean_5=ruleBoolean();

                    state._fsp--;


                    			current = this_Boolean_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRat.g:1017:3: this_Entier_6= ruleEntier
                    {

                    			newCompositeNode(grammarAccess.getEAccess().getEntierParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entier_6=ruleEntier();

                    state._fsp--;


                    			current = this_Entier_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRat.g:1026:3: this_OpBin_7= ruleOpBin
                    {

                    			newCompositeNode(grammarAccess.getEAccess().getOpBinParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpBin_7=ruleOpBin();

                    state._fsp--;


                    			current = this_OpBin_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleE"


    // $ANTLR start "entryRuleAppel"
    // InternalRat.g:1038:1: entryRuleAppel returns [EObject current=null] : iv_ruleAppel= ruleAppel EOF ;
    public final EObject entryRuleAppel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppel = null;


        try {
            // InternalRat.g:1038:46: (iv_ruleAppel= ruleAppel EOF )
            // InternalRat.g:1039:2: iv_ruleAppel= ruleAppel EOF
            {
             newCompositeNode(grammarAccess.getAppelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppel=ruleAppel();

            state._fsp--;

             current =iv_ruleAppel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppel"


    // $ANTLR start "ruleAppel"
    // InternalRat.g:1045:1: ruleAppel returns [EObject current=null] : (otherlv_0= 'call' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleCP ) ) otherlv_4= ')' ) ;
    public final EObject ruleAppel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_param_3_0 = null;



        	enterRule();

        try {
            // InternalRat.g:1051:2: ( (otherlv_0= 'call' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleCP ) ) otherlv_4= ')' ) )
            // InternalRat.g:1052:2: (otherlv_0= 'call' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleCP ) ) otherlv_4= ')' )
            {
            // InternalRat.g:1052:2: (otherlv_0= 'call' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleCP ) ) otherlv_4= ')' )
            // InternalRat.g:1053:3: otherlv_0= 'call' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleCP ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAppelAccess().getCallKeyword_0());
            		
            // InternalRat.g:1057:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalRat.g:1058:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalRat.g:1058:4: (lv_nom_1_0= RULE_ID )
            // InternalRat.g:1059:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getAppelAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getAppelAccess().getLeftParenthesisKeyword_2());
            		
            // InternalRat.g:1079:3: ( (lv_param_3_0= ruleCP ) )
            // InternalRat.g:1080:4: (lv_param_3_0= ruleCP )
            {
            // InternalRat.g:1080:4: (lv_param_3_0= ruleCP )
            // InternalRat.g:1081:5: lv_param_3_0= ruleCP
            {

            					newCompositeNode(grammarAccess.getAppelAccess().getParamCPParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_param_3_0=ruleCP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppelRule());
            					}
            					add(
            						current,
            						"param",
            						lv_param_3_0,
            						"rat.Rat.CP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAppelAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAppel"


    // $ANTLR start "entryRuleRationnel"
    // InternalRat.g:1106:1: entryRuleRationnel returns [EObject current=null] : iv_ruleRationnel= ruleRationnel EOF ;
    public final EObject entryRuleRationnel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRationnel = null;


        try {
            // InternalRat.g:1106:50: (iv_ruleRationnel= ruleRationnel EOF )
            // InternalRat.g:1107:2: iv_ruleRationnel= ruleRationnel EOF
            {
             newCompositeNode(grammarAccess.getRationnelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRationnel=ruleRationnel();

            state._fsp--;

             current =iv_ruleRationnel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRationnel"


    // $ANTLR start "ruleRationnel"
    // InternalRat.g:1113:1: ruleRationnel returns [EObject current=null] : (otherlv_0= '[' ( (lv_e1_1_0= ruleE ) ) otherlv_2= '/' ( (lv_e2_3_0= ruleE ) ) otherlv_4= ']' ) ;
    public final EObject ruleRationnel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_e1_1_0 = null;

        EObject lv_e2_3_0 = null;



        	enterRule();

        try {
            // InternalRat.g:1119:2: ( (otherlv_0= '[' ( (lv_e1_1_0= ruleE ) ) otherlv_2= '/' ( (lv_e2_3_0= ruleE ) ) otherlv_4= ']' ) )
            // InternalRat.g:1120:2: (otherlv_0= '[' ( (lv_e1_1_0= ruleE ) ) otherlv_2= '/' ( (lv_e2_3_0= ruleE ) ) otherlv_4= ']' )
            {
            // InternalRat.g:1120:2: (otherlv_0= '[' ( (lv_e1_1_0= ruleE ) ) otherlv_2= '/' ( (lv_e2_3_0= ruleE ) ) otherlv_4= ']' )
            // InternalRat.g:1121:3: otherlv_0= '[' ( (lv_e1_1_0= ruleE ) ) otherlv_2= '/' ( (lv_e2_3_0= ruleE ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRationnelAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalRat.g:1125:3: ( (lv_e1_1_0= ruleE ) )
            // InternalRat.g:1126:4: (lv_e1_1_0= ruleE )
            {
            // InternalRat.g:1126:4: (lv_e1_1_0= ruleE )
            // InternalRat.g:1127:5: lv_e1_1_0= ruleE
            {

            					newCompositeNode(grammarAccess.getRationnelAccess().getE1EParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_e1_1_0=ruleE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRationnelRule());
            					}
            					set(
            						current,
            						"e1",
            						lv_e1_1_0,
            						"rat.Rat.E");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getRationnelAccess().getSolidusKeyword_2());
            		
            // InternalRat.g:1148:3: ( (lv_e2_3_0= ruleE ) )
            // InternalRat.g:1149:4: (lv_e2_3_0= ruleE )
            {
            // InternalRat.g:1149:4: (lv_e2_3_0= ruleE )
            // InternalRat.g:1150:5: lv_e2_3_0= ruleE
            {

            					newCompositeNode(grammarAccess.getRationnelAccess().getE2EParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_e2_3_0=ruleE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRationnelRule());
            					}
            					set(
            						current,
            						"e2",
            						lv_e2_3_0,
            						"rat.Rat.E");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRationnelAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRationnel"


    // $ANTLR start "entryRuleNumerateur"
    // InternalRat.g:1175:1: entryRuleNumerateur returns [EObject current=null] : iv_ruleNumerateur= ruleNumerateur EOF ;
    public final EObject entryRuleNumerateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumerateur = null;


        try {
            // InternalRat.g:1175:51: (iv_ruleNumerateur= ruleNumerateur EOF )
            // InternalRat.g:1176:2: iv_ruleNumerateur= ruleNumerateur EOF
            {
             newCompositeNode(grammarAccess.getNumerateurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumerateur=ruleNumerateur();

            state._fsp--;

             current =iv_ruleNumerateur; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumerateur"


    // $ANTLR start "ruleNumerateur"
    // InternalRat.g:1182:1: ruleNumerateur returns [EObject current=null] : (otherlv_0= 'num' ( (lv_e_1_0= ruleE ) ) ) ;
    public final EObject ruleNumerateur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_e_1_0 = null;



        	enterRule();

        try {
            // InternalRat.g:1188:2: ( (otherlv_0= 'num' ( (lv_e_1_0= ruleE ) ) ) )
            // InternalRat.g:1189:2: (otherlv_0= 'num' ( (lv_e_1_0= ruleE ) ) )
            {
            // InternalRat.g:1189:2: (otherlv_0= 'num' ( (lv_e_1_0= ruleE ) ) )
            // InternalRat.g:1190:3: otherlv_0= 'num' ( (lv_e_1_0= ruleE ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getNumerateurAccess().getNumKeyword_0());
            		
            // InternalRat.g:1194:3: ( (lv_e_1_0= ruleE ) )
            // InternalRat.g:1195:4: (lv_e_1_0= ruleE )
            {
            // InternalRat.g:1195:4: (lv_e_1_0= ruleE )
            // InternalRat.g:1196:5: lv_e_1_0= ruleE
            {

            					newCompositeNode(grammarAccess.getNumerateurAccess().getEEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_e_1_0=ruleE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumerateurRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_1_0,
            						"rat.Rat.E");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumerateur"


    // $ANTLR start "entryRuleDenominateur"
    // InternalRat.g:1217:1: entryRuleDenominateur returns [EObject current=null] : iv_ruleDenominateur= ruleDenominateur EOF ;
    public final EObject entryRuleDenominateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDenominateur = null;


        try {
            // InternalRat.g:1217:53: (iv_ruleDenominateur= ruleDenominateur EOF )
            // InternalRat.g:1218:2: iv_ruleDenominateur= ruleDenominateur EOF
            {
             newCompositeNode(grammarAccess.getDenominateurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDenominateur=ruleDenominateur();

            state._fsp--;

             current =iv_ruleDenominateur; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDenominateur"


    // $ANTLR start "ruleDenominateur"
    // InternalRat.g:1224:1: ruleDenominateur returns [EObject current=null] : (otherlv_0= 'denom' ( (lv_e_1_0= ruleE ) ) ) ;
    public final EObject ruleDenominateur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_e_1_0 = null;



        	enterRule();

        try {
            // InternalRat.g:1230:2: ( (otherlv_0= 'denom' ( (lv_e_1_0= ruleE ) ) ) )
            // InternalRat.g:1231:2: (otherlv_0= 'denom' ( (lv_e_1_0= ruleE ) ) )
            {
            // InternalRat.g:1231:2: (otherlv_0= 'denom' ( (lv_e_1_0= ruleE ) ) )
            // InternalRat.g:1232:3: otherlv_0= 'denom' ( (lv_e_1_0= ruleE ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDenominateurAccess().getDenomKeyword_0());
            		
            // InternalRat.g:1236:3: ( (lv_e_1_0= ruleE ) )
            // InternalRat.g:1237:4: (lv_e_1_0= ruleE )
            {
            // InternalRat.g:1237:4: (lv_e_1_0= ruleE )
            // InternalRat.g:1238:5: lv_e_1_0= ruleE
            {

            					newCompositeNode(grammarAccess.getDenominateurAccess().getEEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_e_1_0=ruleE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDenominateurRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_1_0,
            						"rat.Rat.E");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDenominateur"


    // $ANTLR start "entryRuleIdentificateur"
    // InternalRat.g:1259:1: entryRuleIdentificateur returns [EObject current=null] : iv_ruleIdentificateur= ruleIdentificateur EOF ;
    public final EObject entryRuleIdentificateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentificateur = null;


        try {
            // InternalRat.g:1259:55: (iv_ruleIdentificateur= ruleIdentificateur EOF )
            // InternalRat.g:1260:2: iv_ruleIdentificateur= ruleIdentificateur EOF
            {
             newCompositeNode(grammarAccess.getIdentificateurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentificateur=ruleIdentificateur();

            state._fsp--;

             current =iv_ruleIdentificateur; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentificateur"


    // $ANTLR start "ruleIdentificateur"
    // InternalRat.g:1266:1: ruleIdentificateur returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleIdentificateur() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalRat.g:1272:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalRat.g:1273:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalRat.g:1273:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalRat.g:1274:3: (lv_id_0_0= RULE_ID )
            {
            // InternalRat.g:1274:3: (lv_id_0_0= RULE_ID )
            // InternalRat.g:1275:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getIdentificateurAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIdentificateurRule());
            				}
            				setWithLastConsumed(
            					current,
            					"id",
            					lv_id_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentificateur"


    // $ANTLR start "entryRuleBoolean"
    // InternalRat.g:1294:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalRat.g:1294:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalRat.g:1295:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalRat.g:1301:1: ruleBoolean returns [EObject current=null] : ( ( (lv_b_0_1= 'false' | lv_b_0_2= 'true' ) ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_b_0_1=null;
        Token lv_b_0_2=null;


        	enterRule();

        try {
            // InternalRat.g:1307:2: ( ( ( (lv_b_0_1= 'false' | lv_b_0_2= 'true' ) ) ) )
            // InternalRat.g:1308:2: ( ( (lv_b_0_1= 'false' | lv_b_0_2= 'true' ) ) )
            {
            // InternalRat.g:1308:2: ( ( (lv_b_0_1= 'false' | lv_b_0_2= 'true' ) ) )
            // InternalRat.g:1309:3: ( (lv_b_0_1= 'false' | lv_b_0_2= 'true' ) )
            {
            // InternalRat.g:1309:3: ( (lv_b_0_1= 'false' | lv_b_0_2= 'true' ) )
            // InternalRat.g:1310:4: (lv_b_0_1= 'false' | lv_b_0_2= 'true' )
            {
            // InternalRat.g:1310:4: (lv_b_0_1= 'false' | lv_b_0_2= 'true' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            else if ( (LA9_0==33) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRat.g:1311:5: lv_b_0_1= 'false'
                    {
                    lv_b_0_1=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_b_0_1, grammarAccess.getBooleanAccess().getBFalseKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanRule());
                    					}
                    					setWithLastConsumed(current, "b", lv_b_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalRat.g:1322:5: lv_b_0_2= 'true'
                    {
                    lv_b_0_2=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_b_0_2, grammarAccess.getBooleanAccess().getBTrueKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanRule());
                    					}
                    					setWithLastConsumed(current, "b", lv_b_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleEntier"
    // InternalRat.g:1338:1: entryRuleEntier returns [EObject current=null] : iv_ruleEntier= ruleEntier EOF ;
    public final EObject entryRuleEntier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntier = null;


        try {
            // InternalRat.g:1338:47: (iv_ruleEntier= ruleEntier EOF )
            // InternalRat.g:1339:2: iv_ruleEntier= ruleEntier EOF
            {
             newCompositeNode(grammarAccess.getEntierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntier=ruleEntier();

            state._fsp--;

             current =iv_ruleEntier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntier"


    // $ANTLR start "ruleEntier"
    // InternalRat.g:1345:1: ruleEntier returns [EObject current=null] : ( (lv_int_0_0= RULE_INT ) ) ;
    public final EObject ruleEntier() throws RecognitionException {
        EObject current = null;

        Token lv_int_0_0=null;


        	enterRule();

        try {
            // InternalRat.g:1351:2: ( ( (lv_int_0_0= RULE_INT ) ) )
            // InternalRat.g:1352:2: ( (lv_int_0_0= RULE_INT ) )
            {
            // InternalRat.g:1352:2: ( (lv_int_0_0= RULE_INT ) )
            // InternalRat.g:1353:3: (lv_int_0_0= RULE_INT )
            {
            // InternalRat.g:1353:3: (lv_int_0_0= RULE_INT )
            // InternalRat.g:1354:4: lv_int_0_0= RULE_INT
            {
            lv_int_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_int_0_0, grammarAccess.getEntierAccess().getIntINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEntierRule());
            				}
            				setWithLastConsumed(
            					current,
            					"int",
            					lv_int_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntier"


    // $ANTLR start "entryRuleOpBin"
    // InternalRat.g:1373:1: entryRuleOpBin returns [EObject current=null] : iv_ruleOpBin= ruleOpBin EOF ;
    public final EObject entryRuleOpBin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpBin = null;


        try {
            // InternalRat.g:1373:46: (iv_ruleOpBin= ruleOpBin EOF )
            // InternalRat.g:1374:2: iv_ruleOpBin= ruleOpBin EOF
            {
             newCompositeNode(grammarAccess.getOpBinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpBin=ruleOpBin();

            state._fsp--;

             current =iv_ruleOpBin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpBin"


    // $ANTLR start "ruleOpBin"
    // InternalRat.g:1380:1: ruleOpBin returns [EObject current=null] : (otherlv_0= '(' ( (lv_e1_1_0= ruleE ) ) ( (lv_op_2_0= ruleOperande ) ) ( (lv_e2_3_0= ruleE ) ) otherlv_4= ')' ) ;
    public final EObject ruleOpBin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_e1_1_0 = null;

        EObject lv_op_2_0 = null;

        EObject lv_e2_3_0 = null;



        	enterRule();

        try {
            // InternalRat.g:1386:2: ( (otherlv_0= '(' ( (lv_e1_1_0= ruleE ) ) ( (lv_op_2_0= ruleOperande ) ) ( (lv_e2_3_0= ruleE ) ) otherlv_4= ')' ) )
            // InternalRat.g:1387:2: (otherlv_0= '(' ( (lv_e1_1_0= ruleE ) ) ( (lv_op_2_0= ruleOperande ) ) ( (lv_e2_3_0= ruleE ) ) otherlv_4= ')' )
            {
            // InternalRat.g:1387:2: (otherlv_0= '(' ( (lv_e1_1_0= ruleE ) ) ( (lv_op_2_0= ruleOperande ) ) ( (lv_e2_3_0= ruleE ) ) otherlv_4= ')' )
            // InternalRat.g:1388:3: otherlv_0= '(' ( (lv_e1_1_0= ruleE ) ) ( (lv_op_2_0= ruleOperande ) ) ( (lv_e2_3_0= ruleE ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getOpBinAccess().getLeftParenthesisKeyword_0());
            		
            // InternalRat.g:1392:3: ( (lv_e1_1_0= ruleE ) )
            // InternalRat.g:1393:4: (lv_e1_1_0= ruleE )
            {
            // InternalRat.g:1393:4: (lv_e1_1_0= ruleE )
            // InternalRat.g:1394:5: lv_e1_1_0= ruleE
            {

            					newCompositeNode(grammarAccess.getOpBinAccess().getE1EParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_e1_1_0=ruleE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpBinRule());
            					}
            					set(
            						current,
            						"e1",
            						lv_e1_1_0,
            						"rat.Rat.E");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRat.g:1411:3: ( (lv_op_2_0= ruleOperande ) )
            // InternalRat.g:1412:4: (lv_op_2_0= ruleOperande )
            {
            // InternalRat.g:1412:4: (lv_op_2_0= ruleOperande )
            // InternalRat.g:1413:5: lv_op_2_0= ruleOperande
            {

            					newCompositeNode(grammarAccess.getOpBinAccess().getOpOperandeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_op_2_0=ruleOperande();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpBinRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_2_0,
            						"rat.Rat.Operande");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRat.g:1430:3: ( (lv_e2_3_0= ruleE ) )
            // InternalRat.g:1431:4: (lv_e2_3_0= ruleE )
            {
            // InternalRat.g:1431:4: (lv_e2_3_0= ruleE )
            // InternalRat.g:1432:5: lv_e2_3_0= ruleE
            {

            					newCompositeNode(grammarAccess.getOpBinAccess().getE2EParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_e2_3_0=ruleE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpBinRule());
            					}
            					set(
            						current,
            						"e2",
            						lv_e2_3_0,
            						"rat.Rat.E");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOpBinAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpBin"


    // $ANTLR start "entryRuleOperande"
    // InternalRat.g:1457:1: entryRuleOperande returns [EObject current=null] : iv_ruleOperande= ruleOperande EOF ;
    public final EObject entryRuleOperande() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperande = null;


        try {
            // InternalRat.g:1457:49: (iv_ruleOperande= ruleOperande EOF )
            // InternalRat.g:1458:2: iv_ruleOperande= ruleOperande EOF
            {
             newCompositeNode(grammarAccess.getOperandeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperande=ruleOperande();

            state._fsp--;

             current =iv_ruleOperande; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperande"


    // $ANTLR start "ruleOperande"
    // InternalRat.g:1464:1: ruleOperande returns [EObject current=null] : ( ( (lv_op_0_1= '+' | lv_op_0_2= '=' | lv_op_0_3= '*' | lv_op_0_4= '<' ) ) ) ;
    public final EObject ruleOperande() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        Token lv_op_0_3=null;
        Token lv_op_0_4=null;


        	enterRule();

        try {
            // InternalRat.g:1470:2: ( ( ( (lv_op_0_1= '+' | lv_op_0_2= '=' | lv_op_0_3= '*' | lv_op_0_4= '<' ) ) ) )
            // InternalRat.g:1471:2: ( ( (lv_op_0_1= '+' | lv_op_0_2= '=' | lv_op_0_3= '*' | lv_op_0_4= '<' ) ) )
            {
            // InternalRat.g:1471:2: ( ( (lv_op_0_1= '+' | lv_op_0_2= '=' | lv_op_0_3= '*' | lv_op_0_4= '<' ) ) )
            // InternalRat.g:1472:3: ( (lv_op_0_1= '+' | lv_op_0_2= '=' | lv_op_0_3= '*' | lv_op_0_4= '<' ) )
            {
            // InternalRat.g:1472:3: ( (lv_op_0_1= '+' | lv_op_0_2= '=' | lv_op_0_3= '*' | lv_op_0_4= '<' ) )
            // InternalRat.g:1473:4: (lv_op_0_1= '+' | lv_op_0_2= '=' | lv_op_0_3= '*' | lv_op_0_4= '<' )
            {
            // InternalRat.g:1473:4: (lv_op_0_1= '+' | lv_op_0_2= '=' | lv_op_0_3= '*' | lv_op_0_4= '<' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 35:
                {
                alt10=3;
                }
                break;
            case 36:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRat.g:1474:5: lv_op_0_1= '+'
                    {
                    lv_op_0_1=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_op_0_1, grammarAccess.getOperandeAccess().getOpPlusSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperandeRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalRat.g:1485:5: lv_op_0_2= '='
                    {
                    lv_op_0_2=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_op_0_2, grammarAccess.getOperandeAccess().getOpEqualsSignKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperandeRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalRat.g:1496:5: lv_op_0_3= '*'
                    {
                    lv_op_0_3=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_op_0_3, grammarAccess.getOperandeAccess().getOpAsteriskKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperandeRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalRat.g:1507:5: lv_op_0_4= '<'
                    {
                    lv_op_0_4=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_op_0_4, grammarAccess.getOperandeAccess().getOpLessThanSignKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperandeRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_4, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperande"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003800010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003801010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003DC4010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000003CC000830L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003DD0010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000003CC000832L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000003CC001830L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001C00020000L});

}