package org.OOO.FirstLessonOOP.Tasks;

import java.util.Arrays;

public class KataOop {
    public static void main(String[] args) {
        char [] mass  = {
                'b', 'c', 'd', 't', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'w', 'n', 'o', 'p', 'q', 'r', 's', 'v', 'x', 'y', 'z', 'u', 'a'
        };
//        Arrays.sort(mass);
//        System.out.println(Arrays.toString(mass));

        for (int i=0; i< mass.length; i++){
            for (int j=0; j< mass.length; j++){
                if (mass[i] <= mass[j]){
                    char tempValue = mass[j];
                    mass[j] = mass[i];
                    mass[i] = tempValue;
                }
            }
        }

        System.out.println(Arrays.toString(mass));
    }
}
