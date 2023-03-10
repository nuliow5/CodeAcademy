package org.WorkWithFile.Stream;

import java.io.*;

public class MainInputStream {
    private static String ORIGINAL = "src\\main\\java\\org\\WorkWithFile\\Stream\\files\\original.txt";
    private static String COPY = "src\\main\\java\\org\\WorkWithFile\\Stream\\files\\copy.txt";
    public static void main(String[] args) throws IOException {

            InputStream inputStream = new FileInputStream(ORIGINAL);

            OutputStream outputStream = new FileOutputStream(COPY);

            for (int i = 0; (i = inputStream.read()) != -1;) {
                outputStream.write(i);
            }

            inputStream.close();
            outputStream.close();
    }
}
