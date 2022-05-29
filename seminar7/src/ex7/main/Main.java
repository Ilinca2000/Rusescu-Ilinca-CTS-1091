package ex7.main;

import ex7.decoratorClases.Decorator;
import ex7.decoratorClases.DecoratorOcazional;
import ex7.decoratorClases.PrinteazaBilet;
import ex7.decoratorClases.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new PrinteazaBilet();
        Decorator decorator = new DecoratorOcazional(printer, "La multi ani!");
        printer.printeazaBilet();
        decorator.printeazaMesaj();
    }
}