package org.OOP.ClassAndMethods.BikesShop;

import java.math.BigDecimal;

public class Bike {

    /**
            Gamintojas - tipas - ratu sakcius - kaina
     **/
    private static final String INFO_FORMAT = "%s - %s - %s - %d";

    public static final BigDecimal INSURANCE = new BigDecimal("30.99");;
    private Manufacture manufacture;
    private BikeType bikeType;
    private BigDecimal price;
    private byte wheelCount;





    public Bike(Manufacture manufacture, BikeType bikeType, BigDecimal price, byte wheelCount){

        this.manufacture = manufacture;
        this.bikeType = bikeType;
        this.price = price;
        this.wheelCount = wheelCount;
    }

    public BigDecimal getPrice() {
        return priceWithInsurance();
    }

    public String printInfo(){
        return String.format(INFO_FORMAT, manufacture, bikeType, getPrice(), wheelCount);

    }

    public BigDecimal priceWithInsurance(){
        if (manufacture.getName().equals("Classic")){
            return price.add(INSURANCE);
        }
        return price;

    }


}
