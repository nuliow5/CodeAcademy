package org.OOO.ClassAndMethods.BikesShop;

import java.math.BigDecimal;
import java.util.Scanner;

public class MiniBikeShopMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int menuInput;
        Bike[] myBikes = new Bike[4];

        for (int i = 0; i < myBikes.length; i++) {
            System.out.println("Do you want crate another bike?");
            System.out.println("1. YES");
            System.out.println("0. NO");

            menuInput = scanner.nextInt();

            if (menuInput == 1){
                Bike bike = createBike();
                myBikes[i] = bike;

            } else {
                break;
            }

        }

        for (Bike bike: myBikes) {
            if (bike == null){
                continue;
            }
            System.out.println(bike.printInfo());
        }



    }

    private static Bike createBike() {

        System.out.println("Enter manufacture");
        String manufactureName = scanner.next();

        System.out.println("Enter bike type");
        String bikeType = scanner.next();



        System.out.println("Enter price");
        BigDecimal price = scanner.nextBigDecimal();


        System.out.println("Enter wheels count");
        byte wheelCount = scanner.nextByte();

        // jeigu pasirenkame bike tipa => Road, prisideda draudimo kaina.

        if (bikeType.equals(BikeType.Road.getTypes())){
            BigDecimal insurance;
            System.out.println("Draudimas brangesnis");
            insurance = BigDecimal.valueOf(69);
            price = price.add(insurance);
        }

        Manufacture manufacture = new Manufacture(manufactureName);

        Bike bike = new Bike(
                manufacture,
                BikeType.valueOf(bikeType),
                price,
                wheelCount);

        return bike;

    }
}
