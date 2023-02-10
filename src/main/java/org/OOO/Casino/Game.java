package org.OOO.Casino;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    private Player player = new Player("Player");
    Casino casino = new Casino();
    public void gameStart(){
        boolean start = true;

        player.printInfo();

        while (start){
            //print menu
            System.out.println("#1 Bet on a number [1-36]\n" +
                    "#2 Bet on color [red or black]\n" +
                    "#3 print your info\n" +
                    "press any number for EXIT");

            int inputMenu = scanner.nextInt();
            if (inputMenu > 3){
                System.out.println("Game over");
                start = false;
            } else if (inputMenu == 1) {
                player.setPlayerGuessNumber(scanner.nextInt());
                System.out.println("How much money do you want to bet?");
                player.setBetMoney(scanner.nextInt());
                //game logic
            }
        }
    }
}
