package core;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class CsvData {
    private String name;
    private int lineNumber;

    public CsvData(String name, int lineNumber) {
        this.name = name;
        this.lineNumber = lineNumber;
    }

}