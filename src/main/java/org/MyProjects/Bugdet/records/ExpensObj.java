package org.MyProjects.Bugdet.records;

public class ExpensObj {
    private String expType;
    private double allSpendMoney;

    public ExpensObj(String expType) {
        this.expType = expType;
        this.allSpendMoney = 0;
    }

    public String getExpType() {
        return expType;
    }

    public void setExpType(String expType) {
        this.expType = expType;
    }

    public double getAllSpendMoney() {
        return allSpendMoney;
    }

    public void setAllSpendMoney(double allSpendMoney) {
        this.allSpendMoney = allSpendMoney;
    }

    @Override
    public String toString() {
        return "ExpensObj{" +
                "expType='" + expType + '\'' +
                ", allSpendMoney=" + allSpendMoney +
                '}' + "\n";
    }
}
