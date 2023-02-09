package org.Basic.StringLesson;

public class StringMain {
    public static void main(String[] args) {

        //method charAt(), substring(), indexOf(), equal(),compareTo(), trim(), concat(), toUpperCase(), toLowerCase()
        String city = "Kaunas";

        System.out.println("Last symbol is:" + city.charAt(city.length() -1));

        int serialNumber = 0;

        System.out.println(+serialNumber + " City array member is - " + city.charAt(serialNumber));

        System.out.println("City name length is - " + city.length());

        System.out.println(city.substring(2));
        System.out.println(city.substring(2, 4));



        String bigCity = "London";

        bigCity.indexOf("log");

        System.out.println("sam".compareTo("Sam"));


    }
}
