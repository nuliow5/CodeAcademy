package org.MyProjects.Bugdet;

import java.util.ArrayList;

public class ExpensesByCategory {

    private String expensesCategory;
    private int spendMoney;
   ArrayList<ExpensesByCategory> expensesByCategoriesList = new ArrayList<>();

    public ExpensesByCategory(String expensesCategory, int spendMoney) {
        this.expensesCategory = expensesCategory;
        this.spendMoney = spendMoney;
    }
}
