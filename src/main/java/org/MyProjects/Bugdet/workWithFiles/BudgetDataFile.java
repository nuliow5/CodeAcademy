package org.MyProjects.Bugdet.workWithFiles;

import org.MyProjects.Bugdet.information.Information;
import org.MyProjects.Bugdet.records.Record;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BudgetDataFile {
    private static final String RANDOM_FILE_LOCATION = "src\\main\\java\\org\\MyProjects\\Bugdet\\workWithFiles\\files\\";
    private static final String BUDGET_FILE_PATH = "src\\main\\java\\org\\MyProjects\\Bugdet\\workWithFiles\\files\\budgetFile.csv";

    private static final String LAST_INDEX = "src\\main\\java\\org\\MyProjects\\Bugdet\\workWithFiles\\files\\lastIndex.txt";


    public void saveToFile(List<Record> records){

        try (BufferedWriter bfWriter = new BufferedWriter(new FileWriter(BUDGET_FILE_PATH))) {

            for (int i = 0; i < records.size(); i++){
                bfWriter.write(String.valueOf(records.get(i)) + "\n");

            }
            System.out.println("File successfully created");
        } catch (IOException e){
            new Error("Error! " + e.getMessage());
        }
    }

    public static void readFile() {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(BUDGET_FILE_PATH));
            String line;
            System.out.println(Information.YELLOW_BLACK + BUDGET_FILE_PATH);
            while ((line = bfReader.readLine()) != null){
                System.out.println(Information.BLACK_WHITE + line);
            }
            System.out.println();
            bfReader.close();
        } catch (IOException e) {
            new Error("Error404 " + e.getMessage());
        }
    }


    public void saveLastIndexToFile(List<Record> records){
        try (BufferedWriter bfWriter = new BufferedWriter(new FileWriter(LAST_INDEX))) {
            bfWriter.write(records.get(records.size()-1).returnObjId());
            System.out.println(Information.BLACK_WHITE + "Last index from file = " + records.get(records.size()-1).returnObjId());

        } catch (IOException e){
            new Error("Error! " + e.getMessage());
        }
    }

    public static int readIndexFromFile() {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(LAST_INDEX));
            String line;

            while ((line = bfReader.readLine()) != null){
//                System.out.println(Information.BLACK_WHITE + "Last index from file = " +  line);
                return Integer.parseInt(line);

            }
            System.out.println();
            bfReader.close();
        } catch (IOException e) {
            new Error("Error404 " + e.getMessage());
        }
        return -1;
    }

    public static String createRandomFile(){
        LocalDate localDate = LocalDate.now();
        String randomName = String.valueOf(localDate) + "_" + LocalTime.now();
        String randomFilePath = RANDOM_FILE_LOCATION + randomName + ".csv";
        System.out.println(randomFilePath);
        return randomFilePath;
    }

    public void continueFillFile(List<Record> records) {
        try {

            FileWriter fw = new FileWriter(new File(BUDGET_FILE_PATH), true);
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(fw));

            printWriter.println("- " + LocalDate.now() + " " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));

            for (int i = 0; i < records.size(); i++) {
                printWriter.println(records.get(i));
            }

            printWriter.close();

            System.out.println("Data successfully appended at the end of file");

        } catch (IOException e) {
            new Error("Error404 " + e.getMessage());
            e.printStackTrace();


        }
    }




}

