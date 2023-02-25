//package org.OOO.FirstLessonOOO;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Test2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//
//
//        boolean start = true;
//        String[] usersArray;
//
//        int inputArray = -1;
//
//        do {
//            System.out.println("MENU:");
//            System.out.println("# 1 - users registrations");
//            System.out.println("# 2 - print all users list");
//            System.out.println("# 0 - Exit");
//
//            int inputMenu = scan.nextInt();
//
//            if (inputMenu == 1){
//                System.out.println("You chose " + inputMenu + " | users registration");
//                System.out.println("How many users tou want to register?");
//
//                inputArray = scan.nextInt();
//                registerUsers(inputArray);
//            } else if (inputMenu == 2) {
//                if (inputArray != -1){
//                   //code here
//                    registerUsers(inputArray).toString();
//               } else System.out.println("List is empty");
//
//
//
//
//
//            } else if (inputMenu == 0) {
//                System.out.println("You chose EXIT");
//                start = false;
//            }
//        }while (start);
//
//        System.out.println("Enter hou many users you want register");
////        System.out.println("Users list are -> " + Arrays.toString(registerUsers(scan.nextInt())));
//
//    }
//
//
//
//    private static void printAllUsers(String printValue){
//        System.out.println(printValue);
//
//    }
//}
