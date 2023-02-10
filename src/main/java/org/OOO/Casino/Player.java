package org.OOO.Casino;

public class Player {
    private String name;
    private int allMoney;
    private int betMoney;
    private String playerColor;
    private int playerGuessNumber;
    private int winCount;

    public Player(String name) {
        this.name = name;
        //starting with 100$
        this.allMoney = 100;
        this.betMoney = 0;
        this.winCount = 0;
    }

    public String getPlayerColor() {
        return playerColor;
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
        this.betMoney = 0;
        if (betMoney >= this.allMoney){
            this.betMoney = betMoney;
            this.allMoney -= this.betMoney;
        } else {
            System.out.println("You don't have enough money. " +
                    "\nYou try bet = " + betMoney + " but you have = " + this.allMoney);
        }

    }

    public void printInfo(){
        System.out.println(this.name + " have " + this.allMoney + "$");
    }
}
