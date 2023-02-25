package org.OOP.Writers;

public class WritersMain {
    public static void main(String[] args) {

        Writer Writer1 =new Writer(1975-01-05, "Book1" );
        Writer Writer2 =new Writer(1964-05-04, "Book2" );
        Writer Writer3 =new Writer(1953-06-03, "Book3" );
        Writer Writer4 =new Writer(1942-02-02, "Book4" );
        Writer Writer5 =new Writer(1921-01-01, "Book5" );

        Writer[] writersArray = new Writer[5];

        writersArray[0] = Writer1;
        writersArray[1] = Writer2;
        writersArray[2] = Writer3;
        writersArray[3] = Writer4;
        writersArray[4] = Writer5;

        Year[] yearsArray = new Year[5];

        Year year = new Year(Writer1.getBirthDay());

        for (int i = 0; i < writersArray.length; i++) {
            yearsArray[i] = new Year(writersArray[i].getBirthDay());
        }


    }
}
