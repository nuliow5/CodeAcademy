package org.TrainingInFreeTime.Kata.Kata03_15.shop;

public class InappropriateProduct extends Exception{

    private double cost;


    public InappropriateProduct(String message, double cost) {
        super(message);
        this.cost = cost;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
