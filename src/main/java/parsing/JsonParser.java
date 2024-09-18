package parsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import core.JsonData;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonParser {
    public List<JsonData> parseJsonFile(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(file);
        List<JsonData> data = new ArrayList<>();
        for (JsonNode jsonNode : node) {
            String name = jsonNode.get("name").asText();
            int lineNumber = jsonNode.get("lineNumber").asInt();
            data.add(new JsonData(name, lineNumber));
        }
        return data;
    }
}