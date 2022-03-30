package factoryMethod;

public class Tramvai extends MijlocTransportComun {
    public Tramvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }
    @Override
    public String toString() {
        return "Tramvai" + nrInmatriculare;
    }

}
