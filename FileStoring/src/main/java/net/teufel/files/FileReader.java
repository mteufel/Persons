package net.teufel.files;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private final String filename;

    public FileReader(String filename) {
        this.filename = filename;
    }

    public List<String> read() throws Exception {

        List<String> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(this.filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
            return data;
        }
    }

}
