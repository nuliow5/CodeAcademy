package org.TrainingInFreeTime.Kata.Kata03_15.shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shop implements Nursing {
    private String address;
    private int employeeCount;
    private ShopNetwork shopNetwork;

    private List<Product> products = new ArrayList<>();


    public Shop(String address, int employeeCount, ShopNetwork shopNetwork, List<Product> products) {
        this.address = address;
        this.employeeCount = employeeCount;
        this.shopNetwork = shopNetwork;
        this.products = products;
    }

    public Shop(){

    }


    public String getAddress() {
        return address;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public ShopNetwork getShopNetwork() {
        return shopNetwork;
    }

    public void printInfo(){
        System.out.println(getAddress() + " " +  employeeCount + " " + shopNetwork);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public void setShopNetwork(ShopNetwork shopNetwork) {
        this.shopNetwork = shopNetwork;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "address='" + address + '\'' +
                ", employeeCount=" + employeeCount +
                ", shopNetwork=" + shopNetwork +
                '}';
    }

    @Override
    public void turnOnConditioner() {
        switch (getShopNetwork()){
            case IKI -> {
                System.out.println("Temperature 19C");
                break;
            }
            case MAXIMA -> {
                System.out.println("Temperature 20C");
                break;
            }
            case RIMI -> {
                System.out.println("Temperature 18C");
                break;
            }
            case LIDL -> {
                System.out.println("Temperature 17C");
                break;
            }
        }
    }

    public void cheapestStoresItem(){
        Product min = products.get(0);
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getCost() > min.getCost()){
                min = products.get(i);
            }
        }

    }
}
