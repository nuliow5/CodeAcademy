package org.OOO.Casino;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private static final String CONGRATULATION = "\u001B[32mCONGRATULATION, TOU WIN! %s$, in your wallet is %s$\n";
    private static final String LOSE = "\u001B[31mYOU LOSE %s$, in your wallet is %s$\n";
    private static final String LOSE_NUMBER = "\u001B[31mYour number %s is unlucky, YOU LOSE %s$\n";
    private static final String WIN_NUMBER = "\u001B[32mYour number %s is lucky, YOU WIN %s$\n";

    Scanner scanner = new Scanner(System.in);
    private final Player player = new Player("Player");
    Casino casino = new Casino();

    int inputGuessNum = -1;

    public void gameStart() {
        boolean start = true;

        player.printInfo();

        while (start) {
            if (player.getAllMoney() <= 0) {
                start = false;
            }

            //print menu
            casino.setCasinoNumber();
            casino.setCasinoColor();
            System.out.print("\u001B[40m\u001B[37m" +
                    "#1 Bet on a number [1-36]\n" +
                    "#2 Bet on color [red or black]\n" +
                    "#3 print your info\n");

            if (player.getAllMoney() < 100) {
                System.out.print("\u001B[40m\u001B[37m" +
                        "#4 Transfer more money in casino\n");
            }

            System.out.print("\u001B[40m\u001B[37m" +
                    "press any number for EXIT\n");

            int inputMenu = scanner.nextInt();
            if (inputMenu > 4 || inputMenu <= 0) {
                System.out.println("Game over");
                start = false;

                // 1 MENU
            } else if (inputMenu == 1) {
                System.out.println("\u001B[33mHow many numbers do you want to bet on?");
                int inputArrayLength = scanner.nextInt();

                casino.printBetQuestion();
                int moneyBet = scanner.nextInt();
                int setBetMoneyMultiply = moneyBet * inputArrayLength;
                player.setBetMoney(setBetMoneyMultiply);

                if (player.getBetMoney() == -1) {
                    continue;
                }

                int[] betNumbers = new int[inputArrayLength];


                for (int i = 0; i < betNumbers.length; i++) {
                    System.out.println("\u001B[33m..Guess a number [1-36]");
                    inputGuessNum = scanner.nextInt();

                    if (inputGuessNum > 36 || inputGuessNum < 0) {
                        System.out.println("\u001B[31mBAD INPUT!!!");
                        i--;
                    } else {
                        betNumbers[i] = inputGuessNum;
                    }

                }

                System.out.println("Your chosen numbers: " + Arrays.toString(betNumbers));
                casino.printRolledOut();

                for (int i = 0; i < betNumbers.length; i++) {
                    if (betNumbers[i] == casino.getCasinoNumber()) {
                        int win = player.getBetMoney() * casino.getWIN_IN_GUESS_NUMBER();
                        player.setAllMoney(player.getAllMoney() + win);
                        System.out.printf(WIN_NUMBER, betNumbers[i], win);
                        player.setWinCount();
                    } else {
                        System.out.printf(LOSE_NUMBER, betNumbers[i], moneyBet);
                        player.setLoseCount();
                    }
                }

                // 2 MENU
            } else if (inputMenu == 2) {
                casino.printBetQuestion();
                player.setBetMoney(scanner.nextInt());
                if (player.getBetMoney() == -1) {
                    continue;
                }

                System.out.println("\u001B[33mGuess a color [red or black]");
                String questColor = scanner.next().toLowerCase();
                player.setPlayerGuessColor(questColor);

                if (player.getPlayerGuessColor().equals("-1")) {
                    //get back bid moneys
                    player.setAllMoney(player.getAllMoney() + player.getBetMoney());
                } else {
                    casino.printRolledOut();
                    System.out.println(player.getPlayerGuessColor());
                    if (player.getPlayerGuessColor().equals(casino.getCasinoColor())) {
                        int win = player.getBetMoney() * casino.getWIN_IN_GUESS_COLOR();
                        player.setAllMoney(player.getAllMoney() + win);
                        System.out.printf(CONGRATULATION, win, player.getAllMoney());
                        player.setWinCount();
                    } else {
                        System.out.printf(LOSE, player.getBetMoney(), player.getAllMoney());
                        player.setLoseCount();
                    }
                }

                // 3 MENU
            } else if (inputMenu == 3) {
                player.printInfo();

            } else if (inputMenu == 4) {
                System.out.println("\u001B[33mHow much money you want put in casino account?");
                player.inputMoreMoney(scanner.nextInt());
            } else {
                start = false;
            }
        }
    }
}
