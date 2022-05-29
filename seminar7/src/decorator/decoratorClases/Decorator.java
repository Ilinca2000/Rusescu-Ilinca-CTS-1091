package decorator.decoratorClases;

public abstract class Decorator implements Printer{
    private Printer printer;
    @Override
    public void printeazaBilet() {
        printer.printeazaBilet();
    }
    public abstract void printeazaMesaj();

    public Decorator(Printer printer) {
        this.printer = printer;
    }
}
