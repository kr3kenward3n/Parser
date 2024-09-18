package file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileSearcher {
    public List<File> searchFiles(String directoryPath) {
        List<File> files = new ArrayList<>();
        File directory = new File(directoryPath);
        searchFiles(directory, files);
        return files;
    }

    private void searchFiles(File directory, List<File> files) {
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.isDirectory()) {
                searchFiles(file, files);
            } else if (file.getName().endsWith(".json") || file.getName().endsWith(".csv")) {
                files.add(file);
            }
        }
    }
}