package org.WorkWithFile.FirstLesson;

import org.WorkWithFile.FirstLesson.ErrorsAndExceptions.MyException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
    public static void main(String[] args) throws MyException {

        String location = "C:\\test\\test.txt";
        File file = new File("aaa");

        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            new MyException("321").printStackTrace();
        }




//        boolean myValue = scanner.hasNextInt();
//        System.out.println(myValue);
    }
}
