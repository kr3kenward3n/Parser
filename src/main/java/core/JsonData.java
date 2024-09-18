package core;

public class JsonData {
    private final String name;
    private final int lineNumber;

    public JsonData(String name, int lineNumber) {
        this.name = name;
        this.lineNumber = lineNumber;
    }

    public String getName() {
        return name;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}
