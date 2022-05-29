package testarePersoana.teste.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testarePersoana.teste.categorii.ITesteCuFake;
import testarePersoana.teste.categorii.ITesteCuStub;
import testarePersoana.teste.categorii.ITesteDeRight;
import testarePersoana.teste.testari.AgentieTurismTest;
import testarePersoana.teste.testari.PachetTuristicTest;

@RunWith(Categories.class)//!!F important. daca punem Suite.class nu mai tine cont de include si exclude si ruleaza toate testele
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.ExcludeCategory(ITesteDeRight.class)
@Categories.IncludeCategory({ITesteCuFake.class, ITesteCuStub.class})
public class SuitaDaFakeNuRight {
}