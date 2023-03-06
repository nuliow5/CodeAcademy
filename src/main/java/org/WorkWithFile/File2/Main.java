//package org.WorkWithFile.File2;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//
//public class Main {
//    private static final String PATERNAS = "[!@#$%&*()_+=|<>?{}\\[\\]~-]";
//    private static final String INTEGER_FILE_LOCATION = "src\\main\\java\\org\\WorkWithFile\\File2\\files\\intFile.txt";
//    private static final String DOUBLE_FILE_LOCATION = "src\\main\\java\\org\\WorkWithFile\\File2\\files\\doubleFile.txt";
//    private static final String STRING_FILE_LOCATION = "src\\main\\java\\org\\WorkWithFile\\File2\\files\\stringFile.txt";
//    private static final String ERR_FILE_LOCATION = "src\\main\\java\\org\\WorkWithFile\\File2\\files\\errFile.txt";
//    private static final String MAIN_FILE_LOCATION = "src\\main\\java\\org\\WorkWithFile\\File2\\files\\mainFile.txt";
//    private static final File integerFile = new File(INTEGER_FILE_LOCATION);
//    private static final File doubleFile = new File(DOUBLE_FILE_LOCATION);
//    private static final File stringFile = new File(STRING_FILE_LOCATION);
//    private static final File errFile = new File(ERR_FILE_LOCATION);
//    private static final File mainFile = new File(MAIN_FILE_LOCATION);
//    static Scanner sc;
//
//    private static FileWriter intWriter;
//    private static FileWriter doubleWriter;
//    private static FileWriter stringWriter;
//    private static FileWriter errWriter;
//
//    private static int err = 0;
//    public static void main(String[] args)  {
//        try {
//            Files.deleteIfExists(errFile.toPath());
//            Files.deleteIfExists(doubleFile.toPath());
//            Files.deleteIfExists(stringFile.toPath());
//            Files.deleteIfExists(errFile.toPath());
//
//            intWriter = new FileWriter(errFile, true);
//            doubleWriter = new FileWriter(doubleFile, true);
//            stringWriter = new FileWriter(stringFile, true);
//            errWriter = new FileWriter(errFile, true);
//            sc = new Scanner(mainFile);
//
//            while (sc.hasNext()) {
//                String kazkoksZodis = sc.next();
//                writeToFileByType(kazkoksZodis);
//            }
//
//            intWriter.close();
//            doubleWriter.close();
//            stringWriter.close();
//            errWriter.close();
//            sc.close();
//
//        } catch (FileNotFoundException e) {
//            err++;
//            System.out.println("Irasymas nepavyko");
//        } catch (IOException e) {
//            System.out.println("IOException");
//        } catch (Exception e) {
//            System.out.println("Isivele klaida");
//        } finally {
//            System.out.println("Darbas baigtas");
//            if (err > 0) {
//                System.out.print("Kaidos - " + err);
//            } else {
//                System.out.print("Klaidu nerasta");
//            }
//        }
//
//
//    }
//
//    private static void writeToFileByType(String kazkoksZodis) throws IOException {
//
//        if (isInteger(kazkoksZodis)) {
//            intWriter.write(kazkoksZodis);
//
//        } else if (isValidString(kazkoksZodis)) {
//            stringFile.write(kazkoksZodis + "\n");
//        } else {
//            err++;
//            errWriter.write(kazkoksZodis + "\n");
//        }
//    }
//
//    private static boolean isValidString(String kazkoksZodis) {
//
//        if (kazkoksZodis == null || kazkoksZodis.trim().isEmpty()) {
//            return false;
//        }
//
//        Pattern special = Pattern.compile(PATERNAS);
//        Matcher m = special.matcher(kazkoksZodis);
//        boolean b = m.find();
////        if (b) {
////            return false;
////        } else {
////            return true;
////        }
//        return !b;
//
//    }
//
//    public static boolean isInteger(String s) {
//        try {
//            Integer.parseInt(s);
//        } catch (NumberFormatException e) {
//            return false;
//        }
//        return true;
//    }
//
//    public static boolean isDouble(String s) {
//        try {
//            Double.parseDouble(s);
//        } catch (NumberFormatException e) {
//            return false;
//        }
//        return true;
//    }
//
//
//
//
//}
