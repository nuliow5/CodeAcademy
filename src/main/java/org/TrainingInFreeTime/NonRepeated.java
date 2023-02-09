package org.TrainingInFreeTime;

public class NonRepeated {
    public static void main(String[] args) {
        String stringValue = "gibblegabbler";

//        char[] charArray = stringValue.toCharArray();

       for (int i = 0; i< stringValue.length(); i++){
           boolean start = true;
           for (int j = 0; j < stringValue.length(); j++) {
               if (i != j && stringValue.charAt(i) == stringValue.charAt(j)){
//                   System.out.println(i + " - " + stringValue.charAt(i));
                   start = false;
                   break;
               }
           }
           if (start){
               System.out.println(stringValue.charAt(i));
               break;
           }

       }


    }
}
