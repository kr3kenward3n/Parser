package core;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class JsonData {

    private final String name;
    private final int lineNumber;

    public JsonData(String name, int lineNumber) {
        this.name = name;
        this.lineNumber = lineNumber;
    }

}
