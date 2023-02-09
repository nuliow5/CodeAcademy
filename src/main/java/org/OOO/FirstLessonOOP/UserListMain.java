package org.OOO.FirstLessonOOP;

import java.util.LinkedList;
import java.util.Scanner;

public class UserListMain {
    public static void main(String[] args) {

        printUsersList();

//        Scanner scanMain = new Scanner(System.in);
//        int mainMenu = 0;
//
//        System.out.println("Array is " + newUsers());
//
//
//        do {
//            System.out.println("*********************");
//            System.out.println("* #1 - I want register new user");
//            System.out.println("* #2 - I want print all users");
//            System.out.println("*********************");
//            mainMenu = scanMain.nextInt();
//
//            if (mainMenu == 1){
//                System.out.println("You chose " + mainMenu);
//                newUsers();
//            }
//            if (mainMenu == 2) {
//                System.out.println("You chose " + mainMenu);
//                System.out.println("pppppppppppppp");
//
//            } else System.out.println("End");
//
//        }while(true);
    }

    public static LinkedList<String> newUsers() {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> usersList = new LinkedList<>(); //ar musu masyvas turi priklausyti klasei?

        boolean registerNewUsers = true;
        int menu = 0;

        while (registerNewUsers){
            System.out.println("---------------------------");
            System.out.println("| 1. register new uses");
            System.out.println("| any number key - CLOSE registration");
            System.out.println("---------------------------");

            menu = scanner.nextInt();

            if (menu == 1){
                System.out.println("Write user name");
                usersList.add(scanner.next());

            } else registerNewUsers = false;
        }
        return usersList;
    }

    public static void printUsersList(){
        System.out.println("User List: " + newUsers());
    }

}
