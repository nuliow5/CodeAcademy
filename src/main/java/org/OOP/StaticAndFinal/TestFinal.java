package org.OOP.StaticAndFinal;

public class TestFinal {
    private final int INT_VALUE;

    private final String STRING_VALUE;

    private int firstIntValue;


    public TestFinal(int INT_VALUE, String STRING_VALUE, int firstIntValue) {
        this.INT_VALUE = INT_VALUE;
        this.STRING_VALUE = STRING_VALUE;
        this.firstIntValue = firstIntValue;
    }

    public void changeValue(final int myValue){
        int temp = firstIntValue / 2;
        int tempFinal = myValue + temp;

        System.out.println(temp + " " + tempFinal);

    }


}
