package org.MyProjects.Bugdet;

public class Information {

    private final static String BLACK_WHITE = "\u001B[37m\u001B[40m";
    private final static String YELLOW_BLACK = "\u001B[30m\u001B[43m";
    private final static String INCOME_OUT_PRINT_TOP = "COMPANY | INCOME [$] | DATE | ORDER TYPE ";

    private final static String MAIN_MENU_INFO = BLACK_WHITE + "MAIN MENU\n" +
            "#1 Fill income\n" +
            "#2 Fill expenses\n" +
            "#3 Get budget information\n" +
            "#4 Edit your Income and Expenses lists\n" +
            "# - press any number for close program";
    private final static String ALL_INCOME_MONEY_INFO = "\u001B[43mAll income money for this month is: %s$\n";

    public static void MAIN_MENU_INFO(){
        System.out.println(MAIN_MENU_INFO);
    }
    // #1 MENU
    public static void firstMainQuestCompanyName(){
        System.out.println(BLACK_WHITE + "Enter source of income [Company name]");
    }
    public static void firstMainQuestIncomeMoney(){
        System.out.println(BLACK_WHITE + "Enter income money [$]");
    }
    public static void firstMainQuestDataYear(){
        System.out.println(BLACK_WHITE + "Enter data -> YEAR");
    }
    public static void firstMainQuestDataMonth(){
        System.out.println(BLACK_WHITE + "Enter data -> MONTH");
    }
    public static void firstMainQuestDataDay(){
        System.out.println(BLACK_WHITE + "Enter data -> DAY");
    }

    // #2 MENU
    public static void secondMainQuestExpenses(){
        System.out.println("Chose expenses category:");
    }
    public static void secondMainQuestExpensesMoney(){
        System.out.println("Enter expenses money [$]");
    }
    public static void secondMainQuestAdditionalInfo(){
        System.out.println("Enter additional information");
    }

    // #3 MENU
    public static void printIncomingTop(){
        printLine();
        System.out.println(INCOME_OUT_PRINT_TOP);
    }
    public static void YellowBlackStyle(int sumAllIncome, int countSpendingMoney, String countBudget ){
        System.out.printf(YELLOW_BLACK + ALL_INCOME_MONEY_INFO, sumAllIncome);
        System.out.println("All spend money is " + countSpendingMoney + "\n" +
                        "Budget is: " + countBudget);

    }

    public static void printLine(){
        System.out.print("\u001B[30m\u001B[43m");
        String line = "-";
        for (int i = 0; i < 100; i++) {
            System.out.print(line);
        }
        System.out.println();
    }

    public static void expensesTopOutputMenu(){
        System.out.println("ID | EXPENSES CATEGORY | SPEND MONEY [$] |    DATA    | ORDER TYPE | ADDITIONAL INFORMATION");
        printLine();

    }

    // #4 MENU






}
