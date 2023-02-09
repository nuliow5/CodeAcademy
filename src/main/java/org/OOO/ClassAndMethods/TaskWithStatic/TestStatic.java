package org.OOO.ClassAndMethods.TaskWithStatic;

public class TestStatic {
    static int staticValue;

    public TestStatic() {

        ++staticValue;
        System.out.println(staticValue);
    }

    static void clearStaticValue(){
        staticValue = 0;
        System.out.println(staticValue);
    }

    static void printStaticValue(){
        System.out.println(staticValue);
    }
}


