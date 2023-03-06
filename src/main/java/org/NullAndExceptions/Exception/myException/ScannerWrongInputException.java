package org.NullAndExceptions.Exception.myException;

public class ScannerWrongInputException extends RuntimeException{

    public ScannerWrongInputException(String s){
        super(s);
    }

    @Override
    public String getMessage() {
        return this.getClass().getName() + " " +  super.getMessage();
    }
}
