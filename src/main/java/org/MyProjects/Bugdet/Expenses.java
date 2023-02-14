package org.MyProjects.Bugdet;

import java.time.LocalDate;
import java.util.ArrayList;


public class Expenses {
    private String expCategory;
    private int expMoney;
    private LocalDate date;
    private String paymentMethod;
    private String additionalInfo;

    public Expenses() {

    }

    public String getExpCategory() {
        return expCategory;
    }

    public void setExpCategory(String expCategory) {
        this.expCategory = expCategory;
    }

    public int getExpMoney() {
        return expMoney;
    }

    public void setExpMoney(int expMoney) {
        this.expMoney = expMoney;
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


}
