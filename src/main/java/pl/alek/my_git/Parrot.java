package pl.alek.my_git;

public class Parrot extends Animal{

    String talking;

    public Parrot(String name, String talking) {
        super(name);
        this.talking = talking;
    }

    @Override
    public String toString() {
        return "Parrot{" + '}';
    }

    public String getTalking() {
        return talking;
    }
}
