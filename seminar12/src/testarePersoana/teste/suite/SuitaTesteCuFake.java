package testarePersoana.teste.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testarePersoana.teste.categorii.ITesteCuFake;
import testarePersoana.teste.testari.AgentieTurismTest;
import testarePersoana.teste.testari.PachetTuristicTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(ITesteCuFake.class)

public class SuitaTesteCuFake {
}