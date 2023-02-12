package org.OOO.Casino;

public class Player {
    private final String PLAYER_INFO = "\u001B[43m\u001B[30m%s have %s$ | win: %s, lose %s\n";
    private String name;
    private int allMoney;
    private int betMoney;
    private String playerGuessColor;
    private int playerGuessNumber;

    Casino casino;

    private int winCount;
    private int loseCount;

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount() {
        this.winCount++;
    }

    public int getLoseCount() {
        return loseCount;
    }

    public void setLoseCount() {
        this.loseCount++;
    }

    public Player(String name) {
        this.name = name;
        //starting with 100$
        this.allMoney = 100;
        this.betMoney = 0;

    }

    public String getPlayerGuessColor() {
        return playerGuessColor;
    }

    public void setPlayerGuessColor(String playerGuessColor) {
        this.playerGuessColor = "-1";
        if (playerGuessColor.equals("red".toLowerCase()) || playerGuessColor.equals("black".toLowerCase())){
            this.playerGuessColor = playerGuessColor;
        } else {
            System.out.println("\u001B[31mBAD INPUT");
        }

    }

    public void setPlayerGuessNumber(int playerGuessNumber) {
        this.playerGuessNumber = playerGuessNumber;
    }

    public int getPlayerGuessNumber() {
        return playerGuessNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(int allMoney) {
        this.allMoney = allMoney;
    }

    public int getBetMoney() {
        return betMoney;
    }

    public void setBetMoney(int betMoney) {
        this.betMoney = -1;
        if (betMoney <= this.allMoney){
            this.betMoney = betMoney;
            this.allMoney -= this.betMoney;
        } else {
            System.out.println("\u001B[31mYou don't have enough money. " +
                    "\nYou try bet = " + betMoney + " but you have = " + this.allMoney);
        }

    }

    public void printInfo(){
//        System.out.println("\u001B[43m\u001B[30m" + this.name + " have " + this.allMoney + "$ " +
//                "| Player win: " + getWinCount()+ " lose: " + getLoseCount());

        System.out.printf(PLAYER_INFO, this.name, getAllMoney(), getWinCount(), getLoseCount());
    }


}
