package parsing;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import core.CsvData;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {

    public List<CsvData> parseCsvFile(File file) throws IOException, CsvValidationException {
        CSVReader reader = new CSVReader(new FileReader(file));
        List<CsvData> data = new ArrayList<>();
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            String name = nextLine[0];
            int lineNumber = Integer.parseInt(nextLine[1]);
            data.add(new CsvData(name, lineNumber));
        }
        return data;
    }
}