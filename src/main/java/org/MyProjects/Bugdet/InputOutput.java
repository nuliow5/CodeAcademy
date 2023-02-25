package org.MyProjects.Bugdet;

import java.util.ArrayList;

public interface InputOutput {
    void inputRecord (Record record);

    ArrayList<Expenses> getExpensesList();

    ArrayList<Income> getIncomeList();


}
