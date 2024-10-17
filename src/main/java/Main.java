import com.opencsv.exceptions.CsvValidationException;
import core.*;
import file.FileSearcher;
import parsing.CsvParser;
import parsing.JsonParser;
import parsing.WebPageParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, CsvValidationException {

        WebPageParser webPageParser = new WebPageParser();
        List<MetroLine> metroLines = webPageParser.parseMetroLines("https://skillbox-java.github.io/");
        List<MetroStation> metroStations = webPageParser.parseMetroStations("https://skillbox-java.github.io/");

        FileSearcher fileSearcher = new FileSearcher();
        List<File> files = fileSearcher.searchFiles("C:\\Users\\Elena\\Desktop\\Java");

        FileReader fr = new FileReader("text.txt");
        BufferedReader reader = new BufferedReader(fr);
        List<String> lines = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }

        for (String temp : lines) {
            System.out.println(temp);
        }

        JsonParser jsonParser = new JsonParser();
        List<JsonData> jsonData = new ArrayList<>();
        for (File file : files) {
            if (file.getName().endsWith(".json")) {
                jsonData.addAll(jsonParser.parseJsonFile(file));
            }
        }

        CsvParser csvParser = new CsvParser();
        List<CsvData> csvData = new ArrayList<>();
        for (File file : files) {
            if (file.getName().endsWith(".csv")) {
                csvData.addAll(csvParser.parseCsvFile(file));
            }
        }

        DataCollector dataCollector = new DataCollector();
        dataCollector.addMetroLines(metroLines);
        dataCollector.addMetroStations(metroStations);
        dataCollector.addJsonData(jsonData);
        dataCollector.addCsvData(csvData);

        dataCollector.writeJsonFiles();
    }
}