package pl.alek.my_git;

public class Monkey extends Animal{

    String size;

    public Monkey(String name, String size) {
        super(name);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monkey{" + '}';
    }

    public String getSize() {
        return size;
    }
}
