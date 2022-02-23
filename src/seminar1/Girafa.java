package seminar1;

public class Girafa extends  Animal{
    private String name;

    public String getName() {
        return name;
    }

    public Girafa(String name) {
        super(name);
    }

    @Override
    public void mananca(String hrana) {
        System.out.println("Girafa " + getNume() +" mananca " + hrana);
    }
}
