package org.MyProjects.Bugdet.records;

public class ExpensObj {
    private String expType;
    private int allSpendMoney;

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

    public int getAllSpendMoney() {
        return allSpendMoney;
    }

    public void setAllSpendMoney(int allSpendMoney) {
        this.allSpendMoney += allSpendMoney;
    }
}
