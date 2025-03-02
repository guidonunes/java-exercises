package Part10.LiteracyComparison;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class LiteracyComparison {

    public static void main(String[] args) {
        List<LiteracyData> data = read("literacy.csv");
        Collections.sort(data);
        data.forEach(System.out::println);
    }


    public static List<LiteracyData> read(String file) {
        try {
            return Files.lines(Paths.get(file))
                       .map(line -> line.split(","))
                       .map(parts -> {
                           String country = parts[3].trim();
                           int year = Integer.parseInt(parts[4].trim());
                           String gender = parts[2].trim().split(" ")[0];
                           double literacyRate = Double.parseDouble(parts[5].trim());
                           return new LiteracyData(country, year, gender, literacyRate);
                       })
                       .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return List.of();
        }
    }
}
