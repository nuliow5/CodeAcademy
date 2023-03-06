package org.TrainingInFreeTime.Kata.BuyItem;

import org.TrainingInFreeTime.Kata.BuyItem.information.Info;
import org.TrainingInFreeTime.Kata.BuyItem.item.PcItem;

public class Main {
    public static void main(String[] args) {
        PcItem myPc = new PcItem("Lenovo", 959.50d, "USA", 30);

        Info.printObj(myPc);
        Info.printObjByGetters(myPc);

    }
}
