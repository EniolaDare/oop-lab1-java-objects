package ie.atu.oop.week1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path file = Path.of("data", "books.csv");

        List<String> lines = new ArrayList<>();
        lines.add("title,author,pageCount,status");
        lines.add("Dune,Frank Herbert,412,AVAILABLE");
        lines.add("Clean Code,Robert C. Martin,464,AVAILABLE");

        try{
            Files.createDirectories(file.getParent());
            Files.write(file, lines);
            System.out.println("CSV file written");
        } catch (IOException e) {
            System.out.println("Could not write file: " + e.getMessage());
        }
    }
}