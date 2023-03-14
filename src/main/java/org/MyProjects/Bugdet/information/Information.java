package org.MyProjects.Bugdet.information;

import static org.MyProjects.Bugdet.records.Record.printMoneyWithDoubleFormat;

public class Information {
    private static final String RED = "\u001B[31m";
    public static final String BLACK_WHITE = "\u001B[37m\u001B[40m";
    public static final String YELLOW_BLACK = "\u001B[30m\u001B[43m";
    public static final String YELLOW = "\u001B[33m";
    private static final String INCOME_OUT_PRINT_TOP = "ID |   TYPE   |      COMPANY      |   INCOME [$]    |    DATE    | ORDER TYPE | ADDITIONAL INFORMATION \n";
    private static final String MAIN_MENU_INFO = BLACK_WHITE +
            "╔══════════════╗\n" +
            "   MAIN MENU\n" +
            "╚══════════════╝\n" +
            "#1 Fill income\n" +
            "#2 Fill expenses\n" +
            "#3 Get budget information\n" +
            "#4 Sort\n" +
            "#5 [Edit|Delete] budget\n" +
            "#6 File [Save|Read]\n" +
            YELLOW + "#0 - for close program";
    private final static String ALL_INCOME_MONEY_INFO = "\u001B[43mAll income money for this month is: %s$\n";

    private static final String SORT_MENU_INFO = BLACK_WHITE +
            "#1 sort by ID\n" +
            "#2 sort by MONEY [$] \n" +
            "#3 sort by DATE \n" +
            "#4 sort by ORDER TYPE\n" +
            "#5 sort by ADDITIONAL INFORMATION\n" +
            YELLOW + "#0 exit from sort menu";

    private static final String WORK_WITH_FILES_MENU = BLACK_WHITE +
            "#1 Save Ass.. data to .CSV file\n" +
            YELLOW + "   [!The data will be overwritten, you will lose the existing data in the file]\n" +
            BLACK_WHITE + "#2 Save data to .CSV file\n" +
            YELLOW + "   [!The file will be updated with new data. Old data will not disappear]\n" +
            BLACK_WHITE + "#3 Print data from file";

    public static void MAIN_MENU_INFO() {
        System.out.println(MAIN_MENU_INFO);
    }

    public static void sortMenu(){
        System.out.println(SORT_MENU_INFO);
    }

    // #1 MENU
    public static void firstMainQuestCompanyName() {
        System.out.println(BLACK_WHITE + "Enter source of income [Company name]");
    }

    public static void firstMainQuestIncomeMoney() {
        System.out.println(BLACK_WHITE + "Enter income money [$]");
    }

    public static void firstMainQuestDataYear() {
        System.out.println(BLACK_WHITE + "Enter data -> YEAR");
    }

    public static void firstMainQuestDataMonth() {
        System.out.println(BLACK_WHITE + "Enter data -> MONTH");
    }

    public static void firstMainQuestDataDay() {
        System.out.println(BLACK_WHITE + "Enter data -> DAY");
    }

    // #2 MENU
    public static void secondMainQuestExpenses() {
        System.out.println(BLACK_WHITE + "Chose expenses category:");
    }

    public static void secondMainQuestExpensesMoney() {
        System.out.println(BLACK_WHITE + "Enter expenses money [$]");
    }

    public static void secondMainQuestAdditionalInfo() {
        System.out.println("Enter additional information");
    }

    // #3 MENU
    public static void printIncomingTop() {
        printLine();
        System.out.printf(INCOME_OUT_PRINT_TOP);
        printLine();
    }

    public static void YellowBlackStyle(double sumAllIncome, double countSpendingMoney, String countBudget) {
        System.out.printf(YELLOW_BLACK + ALL_INCOME_MONEY_INFO, printMoneyWithDoubleFormat(sumAllIncome));
        System.out.println("All spend money is " + printMoneyWithDoubleFormat(countSpendingMoney) + "$\n" +
                "╔═══════════════════════════════════╗\n" +
                "  Budget is: " + countBudget + "\n" +
                "╚═══════════════════════════════════╝\n");

    }

    public static void printLine() {
        System.out.print("\u001B[30m\u001B[43m");
        String line = "-";
        for (int i = 0; i < 110; i++) {
            System.out.print(line);
        }
        System.out.println();
    }

    public static void expensesTopOutputMenu() {
        printLine();
        System.out.print("\u001B[30m\u001B[43mID |   TYPE   | EXPENSES CATEGORY | SPEND MONEY [$] |    DATE    | ORDER TYPE | ADDITIONAL INFORMATION \n");
        printLine();

    }

    // #4 MENU
    public static void forMenuEditing() {
        System.out.println(BLACK_WHITE + "What list you want edit?\n" +
                "#1 - Income\n" +
                "#2 - Expenses");
    }

    public static void printChoseDelete() {
        System.out.println(BLACK_WHITE + "Chose id what you want delete?");
    }

    //edit

    public static void changeQuestion(String columnInfo, String convertInformation) {
        System.out.println(BLACK_WHITE + "Do you want change " +
                columnInfo + "? [" + convertInformation + "]\n" +
                "#1 YES \n" +
                "#2 NO");
    }

    public static void infoInputChanges() {
        System.out.println("Input changes");
    }

    public static void choseLineForEdit() {
        System.out.println(BLACK_WHITE + "Chose id what you want edit ");
    }

    public static void badInput() {
        System.out.println(RED + "Bad input");
    }

    public static void badInput(String errorInformation) {
        System.out.println(RED + "Bad input," + " " + errorInformation);
    }

    public static void forMenu() {
        System.out.println(BLACK_WHITE + "You want: \n" +
                "#1 delete line\n" +
                "#2 edit line");
    }

    public static void programIntro() {
        System.out.println(YELLOW + "\u001B[40m" +
                "═══════════ ══════ ═══ ════ ═╗\n" +
                " WELCOME TO BUDGET APP ᵒ◦∘\n" +
                "═══════════ ══════ ═══ ════ ═╝"
        );


    }

    public static void workWithFileMenu() {
        System.out.println(WORK_WITH_FILES_MENU);
    }

    public static void printExitProgram() {
        System.out.println(YELLOW_BLACK + "Have a good day!\n" +
                "(っ◕‿◕)っ");
    }


}
