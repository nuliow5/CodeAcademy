package org.NullAndExceptions.Exception.Test03;


import static org.NullAndExceptions.Exception.Test03.TestCustomException.validateAge;

public class Main {
    public static void main(String[] args) {
        try {
            validateAge(17);
        } catch (InvalidAgeException e) {
            System.out.println("Exception occured: " + e);
        }

        System.out.println("rest of the code...");
    }
}
