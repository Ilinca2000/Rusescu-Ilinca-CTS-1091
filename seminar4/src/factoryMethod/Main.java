package factoryMethod;

public class Main {

    public static void modulAfisareMijlocTransport(Factory fabrica, String nrInmatriculare) {
        MijlocTransportComun mijloc = new MijlocTransportComun(nrInmatriculare) {

        };
    }

    public static void Main(String[] args) {
        Factory factory = new FactoryAutobuz();
        System.out.println(factory.creareMijloc("Merge").toString());
    }
}
