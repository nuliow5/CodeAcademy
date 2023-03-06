package org.WorkWithFile.File2.forTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestMain {
    private static final String separator = File.separator;
    private static final String TEST_FILE_PATH = "src\\main\\java\\org\\WorkWithFile\\File2\\files\\test.txt";
    static File myFile = new File(TEST_FILE_PATH);

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {

//                System.out.println(scanner.nextLine());
                arrayList.add(scanner.nextLine());


            }

            System.out.println(arrayList);


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


    }
}
