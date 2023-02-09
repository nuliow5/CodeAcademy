package org.OOO.FirstLessonOOP;

import java.util.Arrays;
import java.util.Scanner;

public class LastKata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length");
        int arrayLength = scanner.nextInt();

        int[] m = new int[arrayLength];

        for (int i = arrayLength - 1; i >= 0; i--) {
            m[i] = i;
            System.out.println(i + " -> " + m[i]);
            if (m[i] % 2 != 0) {
                m[i] = 0 - i;
            }
        }

        //print Array
        for (int i = 0; i < m.length; i++) {
            System.out.println("index " + i + " -> " + m[i]);
        }
        // %3

        for (int i = 0; i < m.length; i++) {
            if (m[i] % 3 == 0) {
                m[i] = m[i] * 2;
            }
        }
        System.out.println("------------ if %3 = x2 testing------------");
        System.out.println(Arrays.toString(m));

        //last
        System.out.println("------------every two------------");
        for (int i = 0; i < m.length; i += 2) {
            if (m.length - 1 == i) {
                System.out.println("index " + i + " -> " + m[i]);
            }else System.out.println("index " + i + " -> "+ m[i] + ", " + m[i+1]);
        }

        System.out.println("Array length = " + m.length);

    }
}
