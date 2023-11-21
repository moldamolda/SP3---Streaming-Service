package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileIO {
    ArrayList<String[]> movieList = new ArrayList<>();
    public ArrayList<String[]> readMovieData(String path) {


        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(";");
                movieList.add(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        return movieList;
    }

    ArrayList<String[]> SeriesList = new ArrayList<>();
    public ArrayList<String[]> readSeriesdata(String path) {


        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split("[,;]");
                SeriesList.add(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        return SeriesList;
    }

}