package decorator.decoratorClases;

public class DecoratorOcazional extends Decorator{
    private String mesaj;


    @Override
    public void printeazaMesaj() {

    }

    public DecoratorOcazional(Printer printer, String mesaj) {
        super(printer);
        this.mesaj = mesaj;
    }
}
