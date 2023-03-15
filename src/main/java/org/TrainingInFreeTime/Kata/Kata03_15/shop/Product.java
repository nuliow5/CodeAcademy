package org.TrainingInFreeTime.Kata.Kata03_15.shop;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public Product(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void printProductInfo(){
        System.out.println("Product - " + name + " cost " + cost + "$");
    }

    public double sellProduct(){
        if (getCost() < 0){
            new InappropriateProduct("Bad cost", getCost());
            return -1;
        } else {
            System.out.println("Selling is " + getName());
            return getCost();
        }
    }
}
