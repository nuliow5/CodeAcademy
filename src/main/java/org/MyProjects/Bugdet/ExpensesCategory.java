package org.MyProjects.Bugdet;

public class ExpensesCategory {
    static final String[] expenditureCategory = {
            "Fuel",
            "Clothes",
            "Food",
            "Taxes",
            "Restaurant",
            "Entertainment",
            "Obligations",
            "Beauty, health",
            "Other"};

    public static String getExpenditureCategory(int index){
        return expenditureCategory[index];
    }

    public static void printExpenditureCategoryLikeMenu(){
        for (int i = 0; i < expenditureCategory.length; i++) {
            System.out.println("#" + i + " " + expenditureCategory[i]);
        }
    }


}
