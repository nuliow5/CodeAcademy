package org.MyProjects.Bugdet;

import java.time.LocalDate;
public class Income {
    private final static String INFO = "You received the income from | %s,| %s$, " +
            "| date - %s | order type - %s\n";
    private int incomeMoney;
    private LocalDate data;
    private String sourceOfIncome;
    private String orderType; //cash or in Bank Acc

    Budget budget;

    public Income(int sum, LocalDate data, String sourceOfIncome, String orderType) {
        this.incomeMoney = sum;
        this.data = data;
        this.sourceOfIncome = sourceOfIncome;
        this.orderType = orderType;
    }

    public int getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(int incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(int year, int month, int day) {

        data = LocalDate.of(year, month, day);
        this.data = data;
    }

    public String getSourceOfIncome() {
        return sourceOfIncome;
    }

    public void setSourceOfIncome(String sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void printIncomeInfo(){
        System.out.printf("\u001B[30m\u001B[43m" + INFO, getSourceOfIncome(), getIncomeMoney(), getData(), getOrderType());
    }


}
