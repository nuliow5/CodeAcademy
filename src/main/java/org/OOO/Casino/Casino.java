package org.OOO.Casino;

import java.util.Random;

public class Casino {
    Random random = new Random();

    private final int WIN_IN_GUESS_NUMBER = 35;
    private final int WIN_IN_GUESS_COLOR = 2;
//    private Player player;
    private String casinoColor;
    private int casinoNumber;
    private int casinoWinCount;

    public Casino() {

    }

    public int getWIN_IN_GUESS_NUMBER() {
        return WIN_IN_GUESS_NUMBER;
    }

    public String getCasinoColor() {
        return casinoColor;
    }

    public void setCasinoColor() {
        if (getCasinoNumber() == 0){
            this.casinoColor = "zero";
        } else if (getCasinoNumber() % 2 == 0 ) {
            this.casinoColor = "black";
        } else {
            this.casinoColor = "red";
        }
    }

    public int getCasinoNumber() {
        return casinoNumber;
    }

    public void setCasinoNumber() {
        this.casinoNumber = random.nextInt(36);
    }




}
