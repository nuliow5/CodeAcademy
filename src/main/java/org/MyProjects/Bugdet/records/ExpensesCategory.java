package org.MyProjects.Bugdet.records;


import static org.MyProjects.Bugdet.information.Information.BLACK_WHITE;

public final class ExpensesCategory {
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
            System.out.println(BLACK_WHITE + "#" + i + " " + expenditureCategory[i]);
        }
    }


}
