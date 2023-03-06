package org.TrainingInFreeTime.Kata.BuyItem.information;

import org.TrainingInFreeTime.Kata.BuyItem.item.PcItem;

public class Info {


    public static void printObj(PcItem pcItem){
        System.out.println(pcItem);
    }

    public static void printObjByGetters(PcItem pcItem){
        System.out.println(pcItem.getDeliveryTime());
        System.out.println(pcItem.getLocation());
        System.out.println(pcItem.getTitle());
        System.out.println(pcItem.getPrice());

    }
}
