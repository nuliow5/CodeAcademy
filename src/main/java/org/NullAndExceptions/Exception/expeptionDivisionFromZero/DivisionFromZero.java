package org.NullAndExceptions.Exception.expeptionDivisionFromZero;

public class DivisionFromZero extends NullPointerException{
    public DivisionFromZero(String s) {
        super(s);
    }

    @Override
    public String getMessage() {
        return  this.getClass().getName() + " " + super.getMessage();
    }
}
