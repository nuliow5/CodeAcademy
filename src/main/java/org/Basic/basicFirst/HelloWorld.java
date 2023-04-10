package org.Basic.basicFirst;

public class HelloWorld {
    public static void main(String[] args) {
        //arguments 1, 2, 3
        //first step
        Integer integerOne = new Integer(args[0]);
        Integer integerTwo = new Integer(args[1]);
        Integer integerThree = new Integer(args[2]);

        System.out.println(integerOne + integerTwo + integerThree);

        //second step
        int intOne = Integer.parseInt(args[0]);
        int intTwo = Integer.parseInt(args[1]);
        int intThree = Integer.parseInt(args[2]);

        System.out.println(intOne + intTwo + intThree);
    }
}
