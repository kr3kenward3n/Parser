package core;

public class Station {
    private final String name;
    private final int line;
    private final String date;
    private final int depth;
    private final boolean isTransfer;

    public Station(String name, int line, String date, int depth, boolean isTransfer) {
        this.name = name;
        this.line = line;
        this.date = date;
        this.depth = depth;
        this.isTransfer = isTransfer;
    }

    public String getName() {
        return name;
    }

    public int getLine() {
        return line;
    }

    public String getDate() {
        return date;
    }

    public int getDepth() {
        return depth;
    }

    public boolean isTransfer() {
        return isTransfer;
    }
}