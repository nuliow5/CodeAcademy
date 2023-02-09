package org.Basic.Tasks;

public class Task8 {
    public static void main(String[] args) {

        System.out.format("      ");
        for(int i = 1; i<=5;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("------------------------------------------");

        for(int i = 1 ;i<=5;i++) {

            // print left most column first
            System.out.format("%4d |",i);
            for(int j=1;j<=5;j++) {
                System.out.format("%4d",i*j);
            }
            System.out.println();
        }
    }
}
