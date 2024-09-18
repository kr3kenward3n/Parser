package core;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataCollector {
    private final List<MetroLine> metroLines;
    private final List<MetroStation> metroStations;
    private final List<JsonData> jsonData;
    private final List<CsvData> csvData;

    public DataCollector() {
        this.metroLines = new ArrayList<>();
        this.metroStations = new ArrayList<>();
        this.jsonData = new ArrayList<>();
        this.csvData = new ArrayList<>();
    }

    public void addMetroLines(List<MetroLine> lines) {
        this.metroLines.addAll(lines);
    }

    public void addMetroStations(List<MetroStation> stations) {
        this.metroStations.addAll(stations);
    }

    public void addJsonData(List<JsonData> data) {
        this.jsonData.addAll(data);
    }

    public void addCsvData(List<CsvData> data) {
        this.csvData.addAll(data);
    }

    public void writeJsonFiles() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file1 = new File("map.json");
        File file2 = new File("stations.json");

        // Write map.json file
        List<MetroLine> lines = new ArrayList<>();
        for (MetroLine line : metroLines) {
            lines.add(new MetroLine(line.getName(), line.getNumber()));
        }
        mapper.writeValue(file1, lines);

        // Write stations.json file
        List<Station> stations = new ArrayList<>();
        for (MetroStation station : metroStations) {
            Station s = new Station(station.getName(), station.getLineNumber(), "13.10.1962", -16, true);
            stations.add(s);
        }
        mapper.writeValue(file2, stations);
    }
}