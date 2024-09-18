package core;

public class CsvData {
    private String name;
    private int lineNumber;

    public CsvData(String name, int lineNumber) {
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