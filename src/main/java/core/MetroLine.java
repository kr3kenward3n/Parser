package core;

public class MetroLine {
    private final String name;
    private final int number;

    public MetroLine(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "MetroLine{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}