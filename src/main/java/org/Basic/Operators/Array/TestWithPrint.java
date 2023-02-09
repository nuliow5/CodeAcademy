package org.Basic.Operators.Array;

public class TestWithPrint {
    public static void main(String[] args) {

        String stringValue = "%s-%d\n";
        String[] names = {"vadimas", "mantas"};
        System.out.printf(stringValue, names[0], names[0].length());

        //first test

        final Object[][] twoDimensionArray = new Object[4][];

        twoDimensionArray[0] = new String[] {"one ", "two", "three"};
        twoDimensionArray[1] = new String[] {"1", "2", "3"};

        for (final Object[] row : twoDimensionArray){
            System.out.format("%15s%15s%15s%n", row);
        }
    }

}
