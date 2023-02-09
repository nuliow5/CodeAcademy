package org.Basic.StringLesson.StringFormat;

public class User {
    private final String name;
    private String secondName;
    private final int birthDay;
    private int length;



    public User(String name, String secondName, int birthDay, int length) {
        this.name = name;
        this.secondName = secondName;
        this.birthDay = birthDay;
        this.length = length;
    }

//    public void print(){
//        System.out.printf("Information about this user:\u001B[33m (%-10s- %10s), born in %d year, %d cm."
//                , this.name
//                , this.secondName
//                , this.birthDay
//                , this.length);
//    }
    public void print(){

        System.out.println(justPrintSomeWordsInFormat());
    }
    public String justPrintSomeWordsInFormat(){
        String info = String.format("\u001B[43m\u001B[30m|%20s| \n|%20s| \n|%20s| \n|%20s| \n|%-20s|", "Aš", "tikrai", "išmoksiu"
                , "programuoti"
                ,"Java");
        return info;
    }


}
