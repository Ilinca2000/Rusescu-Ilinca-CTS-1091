package ex8.main;

import ex8.proxyClases.Autobuz;
import ex8.proxyClases.AutobuzDeNoapte;
import ex8.proxyClases.MijlocTransport;

public class MainProxy {

    public static void main(String[] args) {
        MijlocTransport autobuzNormal= new Autobuz(0, "Nume1");
        autobuzNormal.opresteInStatie();
        ((Autobuz)autobuzNormal).setNrCalatori(2);


        MijlocTransport autobuzDeNoapte= new AutobuzDeNoapte(autobuzNormal);

        autobuzDeNoapte.opresteInStatie();
        autobuzDeNoapte.opresteInStatie();
        autobuzDeNoapte.opresteInStatie();
        autobuzDeNoapte.opresteInStatie();

    }
}