package core;

public class MetroStation {
    private final String name;
    private final int lineNumber;

    public MetroStation(String name, int lineNumber) {
        this.name = name;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "MetroStation{" +
                "name='" + name + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}