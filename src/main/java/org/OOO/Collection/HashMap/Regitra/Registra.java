package org.OOO.Collection.HashMap.Regitra;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Registra {
    static HashMap<Integer, Car> registerList = new HashMap<>();
    private static final String stingFormat = "%20s, | %8s, | %11s, | Owner - %s \n";

    Registra(){

    }
    public void startProgram(){
        simulation();

        printAllRegisterList(registerList);
        System.out.println("-----------------------------------");


        printCarOwner(registerList, "ERT987");

        printCarNumbers(registerList, 2022);

        printOwnerInfo(registerList, "porsche panamera");

    }


    public static void simulation(){
        registerList.put(1, new Car(
                "vw_passat",
                "AAB123",
                LocalDate.of(2022, 02, 03),
                "Petras"));

        registerList.put(2, new Car(
                "porsche panamera",
                "ERT987",
                LocalDate.of(2022, 02, 21),
                "Antanas"));

        registerList.put(3, new Car(
                "kia sportage",
                "WER785",
                LocalDate.of(2021, 03, 05),
                "Petras"));

        registerList.put(4, new Car(
                "tesla model 3",
                "WER785",
                LocalDate.of(2022, 02, 15),
                "Petras"));
    }

    public void printAllRegisterList(HashMap<Integer, Car> hashMap){

        for (Map.Entry<Integer, Car> entry : hashMap.entrySet()){
            System.out.printf(stingFormat,
                    hashMap.get(entry.getKey()).getCarModel(),
                    hashMap.get(entry.getKey()).getCarNumber(),
                    hashMap.get(entry.getKey()).getRegisterDate(),
                    hashMap.get(entry.getKey()).getCarOwner()
            );

        }
    }
    public void printCarOwner(HashMap<Integer, Car> hashMap, String carNumber){
        for (Map.Entry<Integer, Car> entry : hashMap.entrySet()){
            if (carNumber.equals(hashMap.get(entry.getKey()).getCarNumber())){
                System.out.println(carNumber + " OWNER IS "
                        + hashMap.get(entry.getKey()).getCarOwner()
                        + " and car model is - "
                        + hashMap.get(entry.getKey()).getCarModel()

                );
            }
        }
    }

    public void printCarNumbers(HashMap<Integer, Car> hashMap, int year){
        for (Map.Entry<Integer, Car> entry : hashMap.entrySet()){
            if (year == hashMap.get(entry.getKey()).getRegisterDate().getYear()){
                System.out.println(year + " registered " + hashMap.get(entry.getKey()).getCarNumber());
            }
        }
    }

    public void printOwnerInfo(HashMap<Integer, Car> hashMap, String carModel){
        for (Map.Entry<Integer, Car> entry : hashMap.entrySet()){
            if (carModel.equals(hashMap.get(entry.getKey()).getCarModel())){
                System.out.println(carModel + " have " + hashMap.get(entry.getKey()).getCarOwner());
            }
        }
    }





}
