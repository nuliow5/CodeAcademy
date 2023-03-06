package org.TrainingInFreeTime.CodeWars.CreditCardMask;

public class Maskify {
    public static void main(String[] args) {
        String firstTest = "4556364607935616";
        String secondTest = "1";

        System.out.println(maskify(secondTest));
    }

    public static String maskify(String str) {
//        throw new UnsupportedOperationException("Unimplemented");
        if (str.length() <= 4){
            return str;
        }
        String result = "";
        for (int i = 0; i < str.length()-4; i++) {
            result += "#";
        }
        result += str.substring(str.length()-4);

        return result;
    }
}
