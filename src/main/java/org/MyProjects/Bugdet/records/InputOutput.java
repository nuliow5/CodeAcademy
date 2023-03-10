package org.MyProjects.Bugdet.records;

import java.util.ArrayList;

public interface InputOutput {
    void inputRecord (Record record);

    ArrayList<Expenses> getExpensesList();

    ArrayList<Income> getIncomeList();


}
