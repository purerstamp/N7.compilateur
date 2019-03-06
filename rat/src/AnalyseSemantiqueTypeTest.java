import org.junit.*;
import exception.*;

public class AnalyseSemantiqueTypeTest {

	@Before
	public void setUp() {
	}
	
	@Test
	public void testerGlobal() {
		AnalyseSemantique.analyseFichier("./src-rat/type/test.rat");
	}
	
	@Test
	public void testerGlobal2() {
		AnalyseSemantique.analyseFichier("./src-rat/type/test2.rat");
	}
	
	@Test
	public void testerDeclaration1() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testDeclaration1.rat");
	}
	
	@Test
	public void testerDeclaration2() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testDeclaration2.rat");
	}
	
	@Test
	public void testerDeclaration3() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testDeclaration3.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerDeclaration4() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testDeclaration4.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerDeclaration5() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testDeclaration5.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerDeclaration6() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testDeclaration6.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerDeclaration7() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testDeclaration7.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerDeclaration8() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testDeclaration8.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerDeclaration9() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testDeclaration9.rat");
	}
	
	@Test
	public void testerAffectation1() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAffectation1.rat");
	}
	
	@Test
	public void testerAffectation2() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAffectation2.rat");
	}
	
	@Test
	public void testerAffectation3() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAffectation3.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerAffectation4() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAffectation4.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerAffectation5() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAffectation5.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerAffectation6() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAffectation6.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerAffectation7() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAffectation7.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerAffectation8() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAffectation8.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerAffectation9() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAffectation9.rat");
	}
	
	@Test
	public void testerConditionnelle1() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testConditionnelle1.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerConditionnelle2() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testConditionnelle2.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerConditionnelle3() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testConditionnelle3.rat");
	}
	
	@Test
	public void testerConditionnelle4() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testConditionnelle4.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerConditionnelle5() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testConditionnelle5.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerConditionnelle6() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testConditionnelle6.rat");
	}
	
	@Test
	public void testerRepetition1() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testRepetition1.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerRepetition2() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testRepetition2.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerRepetition3() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testRepetition3.rat");
	}
	
	@Test
	public void testerRepetition4() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testRepetition4.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerRepetition5() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testRepetition5.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerRepetition6() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testRepetition6.rat");
	}
	
	@Test
	public void testerPrint1() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testPrint1.rat");
	}
	
	@Test
	public void testerPrint2() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testPrint2.rat");
	}
	
	@Test
	public void testerPrint3() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testPrint3.rat");
	}
	
	@Test
	public void testerAppel1() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAppel1.rat");
	}
	
	@Test
	public void testerAppel2() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAppel2.rat");
	}
	
	@Test
	public void testerAppel3() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAppel3.rat");
	}
	
	@Test
	public void testerAppel4() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAppel4.rat");
	}
	
	@Test
	public void testerAppel5() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAppel5.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerAppel6() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAppel6.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerAppel7() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAppel7.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerAppel8() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAppel9.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerAppel10() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAppel10.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerAppel11() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAppel11.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerAppel12() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAppel12.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerAppel13() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testAppel13.rat");
	}
	
	@Test
	public void testerRetourFonction1() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testRetourFonction1.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerRetourFonction2() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testRetourFonction2.rat");
	}
	
	@Test
	public void testerRationnel1() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testRationnel1.rat");
	}
	
	@Test
	public void testerRationnel2() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testRationnel2.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerRationnel3() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testRationnel3.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerRationnel4() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testRationnel4.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerRationnel5() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testRationnel5.rat");
	}
	
	@Test
	public void testerNumerateur1() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testNumerateur1.rat");
	}
	
	@Test
	public void testerNumerateur2() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testNumerateur2.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerNumerateur3() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testNumerateur3.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerNumerateur4() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testNumerateur4.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerNumerateur5() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testNumerateur5.rat");
	}
	
	@Test
	public void testerDenominateur1() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testDenominateur1.rat");
	}
	
	@Test
	public void testerDenominateur2() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testDenominateur2.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerDenominateur3() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testDenominateur3.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerDenominateur4() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testDenominateur4.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerDenominateur5() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testDenominateur5.rat");
	}
	
	@Test
	public void testerIdent1() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testIdent1.rat");
	}
	
	@Test
	public void testerIdent2() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testIdent2.rat");
	}
	
	@Test
	public void testerIdent3() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testIdent3.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerIdent4() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testIdent4.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerIdent5() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testIdent5.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerIdent6() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testIdent6.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerIdent7() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testIdent7.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerIdent8() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testIdent8.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerIdent9() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testIdent9.rat");
	}
	
	@Test
	public void testerRecursiviteFonction() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testRecursiviteFonction.rat");
	}
	
	@Test
	public void testerOperation1() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testOperation1.rat");
	}
	
	@Test
	public void testerOperation2() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testOperation2.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerOperation3() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testOperation3.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerOperation4() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testOperation4.rat");
	}
	
	@Test
	public void testerOperation5() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testOperation5.rat");
	}
	
	@Test
	public void testerOperation6() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testOperation6.rat");
	}
	
	@Test
	public void testerOperation7() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testOperation7.rat");
	}
	
	@Test
	public void testerOperation8() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testOperation8.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerOperation9() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testOperation9.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerOperation10() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testOperation10.rat");
	}
	
	@Test(expected=TypeException.class)
	public void testerOperation11() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testOperation11.rat");
	}
	
	@Test
	public void testerOperation12() {
		AnalyseSemantique.analyseFichier("./src-rat/type/testOperation12.rat");
	}

	
	
	
}
