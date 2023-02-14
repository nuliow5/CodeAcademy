package org.MyProjects.Bugdet;

import java.util.ArrayList;

public class ExpensesCategory {
    String[] expenditureCategory = {"Fuel",
            "Clothes",
            "Food",
            "Taxes",
            "Restaurant",
            "Entertainment",
            "Obligations",
            "Beauty, health",
            "Other"};

    public String getExpCategory(int index){
        return expenditureCategory[index];
    }
}
