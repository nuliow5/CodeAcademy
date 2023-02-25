package org.OOP.ClassAndMethods.TaskWithStatic;

public class MainStatic {
    public static void main(String[] args) {
        TestStatic testStatic1 = new TestStatic();
        TestStatic testStatic2 = new TestStatic();
        TestStatic testStatic3 = new TestStatic();
        TestStatic testStatic4 = new TestStatic();
        TestStatic testStatic5 = new TestStatic();

        System.out.print("Print -> ");
        TestStatic.printStaticValue();

        System.out.println("Clear method");
        TestStatic.clearStaticValue();

        System.out.print("Print -> ");
        TestStatic.printStaticValue();


    }
}
