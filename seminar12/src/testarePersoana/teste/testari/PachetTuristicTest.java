package testarePersoana.teste.testari;


import  org.junit.Test;
import org.junit.experimental.categories.Category;
import testarePersoana.clase.claseAgentie.IPachetTuristic;
import testarePersoana.clase.claseAgentie.PachetTuristic;
import testarePersoana.clase.persoana.IPersoana;
import testarePersoana.teste.categorii.ITesteCuFake;
import testarePersoana.teste.categorii.ITesteCuStub;
import testarePersoana.teste.categorii.ITesteDeRight;
import testarePersoana.teste.dubluri.PersoanaFake;
import testarePersoana.teste.dubluri.PersoanaStub;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PachetTuristicTest {

    @Test
    @Category(ITesteCuStub.class)
    public void testPoateRezerva(){
        IPersoana persoana= new PersoanaStub();
        IPachetTuristic pachetTuristic= new PachetTuristic(persoana, "Moscova", 2000.5);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({ITesteCuFake.class, ITesteDeRight.class})
    public void testNuPoateRezerva(){
        PersoanaFake persoanaFake= new PersoanaFake();
        persoanaFake.setVarsta(17);
        IPachetTuristic pachetTuristic= new PachetTuristic(persoanaFake, "Moscova", 1800.5);
        assertFalse(pachetTuristic.poateRezerva());
    }

}