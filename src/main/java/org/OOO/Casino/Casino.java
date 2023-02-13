package org.OOO.Casino;


import java.util.Random;


public class Casino {
    Random random = new Random();
    private static final int WIN_IN_GUESS_NUMBER = 35;
    private static final int WIN_IN_GUESS_COLOR = 2;

    private String casinoColor;
    private int casinoNumber;

    private static final String BET_QUESTION = "How much money do you want to bet?";

    private static final String CASINO_ROLLED_OUT = "The casino rolled out -> %s %s\n";

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
    public void printRolledOut() {
        System.out.printf(CASINO_ROLLED_OUT, getCasinoNumber(), getCasinoColor());
    }

//    public void betOnSeveralNumbers(){
//        System.out.println("How many numbers do you want to bet on?");
//        setInputArrayLength(scanner.nextInt());
//
//        int[] betNumbers = new int[inputArrayLength];
//
//        printBetQuestion();
//        int setBetMoneyMultiply = scanner.nextInt() * betNumbers.length;
//        player.setBetMoney(setBetMoneyMultiply, true);
//
//        for (int i = 0; i < betNumbers.length; i++) {
//            System.out.println("..Guess a number [1-36]");
//            int inputGuessNumber = scanner.nextInt();
//            if (inputGuessNumber > 0 && inputGuessNumber <= 36 ){
//                betNumbers[i] = inputGuessNumber;
//            }else {
//                System.out.println("\u001B[31mBAD INPUT!!!");
//                //get back bid moneys
//                player.setAllMoney(player.getAllMoney() + player.getBetMoney());
//            }
//
//        }
//        System.out.println("Your chosen numbers: " + Arrays.toString(betNumbers));
//        printRolledOut();
//
//        //checking
//        for (int i = 0; i < betNumbers.length; i++) {
//            if (betNumbers[i] == casinoNumber){
//                int win = player.getBetMoney() * getWIN_IN_GUESS_NUMBER();
//                player.setAllMoney(player.getAllMoney() + win);
//                System.out.printf(CONGRATULATION, win, player.getAllMoney());
//                player.setWinCount();
//            } else {
//                System.out.printf(LOSE, player.getBetMoney(), player.getAllMoney());
//                player.setLoseCount();
//            }
//        }
//
//
//
//    }



}
