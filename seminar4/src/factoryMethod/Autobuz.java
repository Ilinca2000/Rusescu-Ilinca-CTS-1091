package factoryMethod;

public class Autobuz extends MijlocTransportComun{

    public Autobuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("simpleFactory.Autobuz{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}