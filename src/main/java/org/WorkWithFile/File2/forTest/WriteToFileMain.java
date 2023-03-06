package org.WorkWithFile.File2.forTest;

import java.io.*;
import java.util.Scanner;

public class WriteToFileMain {

    private static final String TEST_FILE_PATH = "src\\main\\java\\org\\WorkWithFile\\File2\\files\\testForWrite.txt";
    private static File myFile = new File(TEST_FILE_PATH);
    public static void main(String[] args) {

        //WRITE WITHOUT BufferedWriter
//        try {
//            FileWriter fileWriter = new FileWriter(myFile);
//            fileWriter.write("Hello world");
//            fileWriter.write("\nHello java");
//
//            fileWriter.close();
//        } catch (IOException e) {
//            System.out.println("File not found");
//        }

        // WRITE WITH BufferedWriter
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(myFile));
            bufferedWriter.write("Hello world");
            bufferedWriter.write("\nHello Java");
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //READ WITH SCANNER
//        try {
//            Scanner scanner = new Scanner(myFile);
//            while (scanner.hasNext()){
//                System.out.println(scanner.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Error FromScanner - no file");
//        }

        //READ WITH BufferedReader
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
