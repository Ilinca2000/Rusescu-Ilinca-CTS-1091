package testarePersoana.teste.testari;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import testarePersoana.clase.claseAgentie.AgentieTurism;
import testarePersoana.clase.claseAgentie.IPachetTuristic;
import testarePersoana.teste.categorii.ITesteCuDummy;
import testarePersoana.teste.categorii.ITesteCuFake;
import testarePersoana.teste.categorii.ITesteDeRight;
import testarePersoana.teste.dubluri.PachetDummy;
import testarePersoana.teste.dubluri.PachetFake;
import static org.junit.Assert.*;
public class AgentieTurismTest {

    @Test
    @Category(ITesteCuDummy.class)
    public void testAdaugaPachet(){
        AgentieTurism agentieTurism= new AgentieTurism();
        IPachetTuristic pachetD= new PachetDummy();

        agentieTurism.adaugaPachet(pachetD);
        assertEquals(1, agentieTurism.getNumarPacheteTuristice());
    }

    @Test
    @Category({ITesteCuFake.class, ITesteDeRight.class})
    public void calculSumaPachete(){
        AgentieTurism agentieTurism= new AgentieTurism();
        PachetFake pachetF1= new PachetFake();
        PachetFake pachetF2= new PachetFake();

        pachetF1.setPret(1000);
        pachetF2.setPret(500);

        agentieTurism.adaugaPachet(pachetF1);
        agentieTurism.adaugaPachet(pachetF2);
        assertEquals(1500, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }


}