package seminar1;

public class Girafa extends  Animal{
    public Girafa(String name) {
        super(name);
    }

    @Override
    public void mananca(String hrana) {
        System.out.println("Girafa " + " mananca " + hrana);
    }
}
