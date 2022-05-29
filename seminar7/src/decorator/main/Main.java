package decorator.main;

import decorator.decoratorClases.Decorator;
import decorator.decoratorClases.DecoratorOcazional;
import decorator.decoratorClases.PrinteazaBilet;
import decorator.decoratorClases.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new PrinteazaBilet();
        Decorator decorator = new DecoratorOcazional(printer, "La multi ani!");
        printer.printeazaBilet();
        decorator.printeazaMesaj();
    }
}