package org.OOO.Casino;

import java.util.Scanner;

public class Game {
    private final String CONGRATULATION = "\u001B[32mCONGRATULATION, TOU WIN! %s$, in your wallet is %s$\n";
    private final String LOSE = "\u001B[31mYOU LOSE %s$, in your wallet is %s$\n";
    Scanner scanner = new Scanner(System.in);
    private Player player = new Player("Player");
    Casino casino = new Casino();
    public void gameStart(){
        boolean start = true;

        player.printInfo();

        while (start){
            if (player.getAllMoney() <= 0){
                start = false;
            }

            //print menu
            casino.setCasinoNumber();
            casino.setCasinoColor();
            System.out.printf("\u001B[40m\u001B[37m" +
                    "#1 Bet on a number [1-36]\n" +
                    "#2 Bet on color [red or black]\n" +
                    "#3 print your info\n" +
                    "press any number for EXIT\n");

            int inputMenu = scanner.nextInt();
            if (inputMenu > 3 || inputMenu <= 0){
                System.out.println("Game over");
                start = false;
            } else if (inputMenu == 1) {
                System.out.println("How much money do you want to bet?");
                player.setBetMoney(scanner.nextInt()); // kaip sutvarkyti?
                System.out.println("Guess a number [1-36]");
                int inputGuessNumber = scanner.nextInt();

                //game logic
                if (inputGuessNumber > 0 && inputGuessNumber <= 36 ){
                    player.setPlayerGuessNumber(inputGuessNumber);
                    System.out.println("The casino rolled out -> " + casino.getCasinoNumber());

                    if (player.getPlayerGuessNumber() == casino.getCasinoNumber()){
                        int win = player.getBetMoney() * casino.getWIN_IN_GUESS_NUMBER();
                        player.setAllMoney(player.getAllMoney() + win);
                        System.out.printf(CONGRATULATION, win, player.getAllMoney());
                    } else {
                        System.out.printf(LOSE, player.getBetMoney(), player.getAllMoney());

                    }
                } else {
                    System.out.println("BAD INPUT!!!");
                    //get back bid moneys
                    player.setAllMoney(player.getAllMoney() + player.getBetMoney());

                }




            } else if (inputMenu == 2) {
                //logic

            } else if (inputMenu == 3) {
                player.printInfo();
            }
        }
    }
}
