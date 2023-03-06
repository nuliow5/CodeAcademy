package org.WorkWithFile.FirstLesson.ErrorsAndExceptions;

public class MyException extends Exception {
    private String message;
    public MyException(String message){
//        super(s);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public void printError(){
        System.out.println("Error123");
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
