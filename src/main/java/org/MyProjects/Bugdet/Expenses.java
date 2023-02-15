package org.MyProjects.Bugdet;

import java.time.LocalDate;

import static org.MyProjects.Bugdet.ExpensesCategory.getExpenditureCategory;

public class Expenses {
    private final static String EXPENSES_INFO = "%2s | %-18s| %14s$ " +
            "| %s | %-10s | %s \n";
    private String expCategory;
    private int expMoney;
    private LocalDate date;
    private String paymentMethod;
    private String additionalInfo;
    private static int id = 0;

    private int objId;

    public Expenses(int expenditureCategory, int expMoney, LocalDate date, String paymentMethod, String additionalInfo) {
        this.expCategory = getExpenditureCategory(expenditureCategory);
        this.expMoney = expMoney;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.additionalInfo = additionalInfo;
        id++;
        objId += id;

    }

    public int getObjId() {
        return objId;
    }

    public String getExpCategory() {
        return expCategory;
    }

    public int getExpMoney() {
        return expMoney;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public void printExpensesInfo(){
        System.out.printf("\u001B[30m\u001B[43m" + EXPENSES_INFO, getObjId(),
                getExpCategory(), getExpMoney(), getDate(),getPaymentMethod(), getAdditionalInfo());
    }


}
