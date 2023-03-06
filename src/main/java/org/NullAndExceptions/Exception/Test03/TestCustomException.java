package org.NullAndExceptions.Exception.Test03;

public class TestCustomException {
    static void validateAge (int age) throws InvalidAgeException{
        if (age < 18){
            throw new InvalidAgeException("Age is not valid to vote");
        } else {
            System.out.println("Welcome to vote");
        }
    }
}
