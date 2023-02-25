package org.OOP.Casino;


public class Player {
    private static final String PLAYER_INFO = "\u001B[43m\u001B[30m%s have %s$ | win: %s, lose %s\n" +
            "Total put money: %s$, total lose money: %s$\n";
    private String name;
    private int allMoney;
    private int betMoney;
    private String playerGuessColor;
    private int inputMoneyHistory;
    private int winCount;
    private int loseCount;

    public int getInputMoneyHistory() {
        return inputMoneyHistory;
    }

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
        this.inputMoneyHistory = 100;

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
        /*
        numberBetType{
         !!! color = is FALSE;
         !!! numbers = is TRUE;
         }
         */
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
        System.out.printf(PLAYER_INFO, this.name, getAllMoney(), getWinCount(), getLoseCount(),
                getInputMoneyHistory(), (getInputMoneyHistory()-allMoney));
    }


    public void inputMoreMoney(int inputMoney){
        if (inputMoney > 0){
            this.allMoney += inputMoney;
            //for statistic
            inputMoneyHistory += inputMoney;
            printInfo();
        } else {
            System.out.println("\u001B[31mBAD INPUT!!!");
        }

    }

}
