package parsing;

import core.MetroLine;
import core.MetroStation;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebPageParser {
    public List<MetroLine> parseMetroLines(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        Elements metroLines = doc.select("div.metro-line");
        List<MetroLine> lines = new ArrayList<>();
        for (Element metroLine : metroLines) {
            String name = metroLine.text();
            int number = Integer.parseInt(metroLine.attr("data-line-number"));
            lines.add(new MetroLine(name, number));
        }
        return lines;
    }

    public List<MetroStation> parseMetroStations(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        Elements metroStations = doc.select("div.station");
        List<MetroStation> stations = new ArrayList<>();
        for (Element metroStation : metroStations) {
            String name = metroStation.text();
            int lineNumber = Integer.parseInt(metroStation.attr("data-line-number"));
            stations.add(new MetroStation(name, lineNumber));
        }
        return stations;
    }
}