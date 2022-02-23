package seminar1;

public class Zebra extends  Animal{
    private String name;

    public String getName() {
        return name;
    }

    public Zebra(String name) {
        super(name);
    }

    @Override
    public void mananca(String hrana) {
        System.out.println("Zebra " + getNume() +" mananca " + hrana);
    }
}