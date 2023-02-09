package org.OOO.FirstLessonOOP;

import java.util.Scanner;

public class Users {
    private String userName;
    private String[] usersArray;
    private int userCount;

    public Users(String userName, String[] usersArray, int userCount) {
        this.userName = userName;
        this.usersArray = usersArray;
        this.userCount = userCount;
    }

    public String getUserName() {
        return userName;
    }

    public String[] getUsersArray() {
        return usersArray;
    }

    public int getUserCount() {
        return userCount;
    }

    public static String[] registerUsers(int arrayLength) {
        Scanner scanner = new Scanner(System.in);
        String[] usersArray = new String[arrayLength];
        for (int i = 0; i < usersArray.length; i++) {
            System.out.println("Write user name");
            usersArray[i] = scanner.nextLine();
        }
        return usersArray;
    }
}
