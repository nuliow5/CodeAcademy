package org.OOO.Casino;

import java.util.Random;

public class Casino {
    Random random = new Random();

    private final int WIN_IN_GUESS_NUMBER = 35;
    private final int WIN_IN_GUESS_COLOR = 2;
    //    private Player player;
    private String casinoColor;
    private int casinoNumber;

    private final String BET_QUESTION = "How much money do you want to bet?";

    private final String CASINO_ROLLED_OUT = "The casino rolled out -> %s %s\n";

    public Casino() {

    }

    public int getWIN_IN_GUESS_COLOR() {
        return WIN_IN_GUESS_COLOR;
    }

    public int getWIN_IN_GUESS_NUMBER() {
        return WIN_IN_GUESS_NUMBER;
    }

    public String getCasinoColor() {
        return casinoColor;
    }

    public void setCasinoColor() {
        if (getCasinoNumber() == 0) {
            this.casinoColor = "zero";
        } else if (getCasinoNumber() % 2 == 0 && getCasinoNumber() != 0) {
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

    public void printBetQuestion() {
        System.out.println(BET_QUESTION);
    }

    //print methods
    public void printRolledOut(){
        System.out.printf(CASINO_ROLLED_OUT, getCasinoNumber(), getCasinoColor());
    }



}
