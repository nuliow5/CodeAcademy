package org.MyProjects.Bugdet.records;

import static org.MyProjects.Bugdet.information.Information.BLACK_WHITE;

public class Order {
    private static final String[] orderTypeArray = {"CASH", "BANK"};

    public static String getOrderTypeIndex(int index){
        return orderTypeArray[index];
    }

    public static void printOrderTypes(){
        for (int i = 0; i < orderTypeArray.length; i++) {
            System.out.println(BLACK_WHITE + "#" + i + " " + orderTypeArray[i]);
        }
    }
}
