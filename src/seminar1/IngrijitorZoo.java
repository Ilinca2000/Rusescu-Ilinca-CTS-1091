package seminar1;

public class IngrijitorZoo {
    private String nume;

    public IngrijitorZoo(String nume) {
        this.nume = nume;
    }

    public void hranesteAnimal(Animal animal, String mancare) {
        animal.mananca(mancare);
    }
}
