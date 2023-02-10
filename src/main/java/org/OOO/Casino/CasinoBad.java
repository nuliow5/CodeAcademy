package org.OOO.Casino;

import java.util.Random;

public class CasinoBad {
    Player player = new Player("Player");

    private String color;
    private int guessNumber; //ar reikia?
    Random random = new Random();

    public Player getPlayer() {
        return player;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        //only red or black
        if (color.toLowerCase().equals("red") || color.toLowerCase().equals("black")){
            this.color = color;
        } else {
            System.out.println("Wrong input COLOR");
        }

    }

    public int getGuessNumber() {
        return guessNumber;
    }

    public void setGuessNumber(int guessNumber) {
        if (guessNumber >=0 && guessNumber <=36){
            this.guessNumber = guessNumber;
        } else {
            System.out.println("Wrong input NUMBER");
        }
    }

//    public Player getSecomdPlayer() {
//        return secomdPlayer;
//    }
//
//    public void printAllPlayersInfo(){
//        player.printInfo();
//        secomdPlayer.printInfo();
//    }

    public int spinningCasinoRoulette(){
        int randomValue = random.nextInt(35);
        return randomValue;
    }

    public void winOrLose(int intNumber){
        System.out.println("Casino spinning -> " );
        if (intNumber == spinningCasinoRoulette()){
            int winPay = player.getBetMoney()*35;
            player.setAllMoney(player.getAllMoney() + winPay);
            System.out.println("Congratulation YOU WIN " + winPay + "$");
        }else {
            System.out.printf("");
        }
    }

    public String randomColor(){
        String colorResult = "";

        if (spinningCasinoRoulette() == 0){
            System.out.println(spinningCasinoRoulette() + " ZERO");
            return colorResult = "ZERO".toLowerCase();
        } else if (spinningCasinoRoulette() % 2 != 0) {
            System.out.println(spinningCasinoRoulette() + " Red ");
            return colorResult = "red".toLowerCase();
        } else {
            System.out.println(spinningCasinoRoulette() + " Black ");
            return colorResult = "black".toLowerCase();
        }
    }




}
