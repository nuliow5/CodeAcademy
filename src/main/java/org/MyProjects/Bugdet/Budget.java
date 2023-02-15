package org.MyProjects.Bugdet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static org.MyProjects.Bugdet.ExpensesCategory.printExpenditureCategoryLikeMenu;
import static org.MyProjects.Bugdet.Income.printIncomingTop;
import static org.MyProjects.Bugdet.Order.getOrderTypeIndex;
import static org.MyProjects.Bugdet.Order.printOrderTypes;


public class Budget {
    private final static String BLACK_WHITE = "\u001B[37m\u001B[40m";
    private final static String YELLOW_BLACK = "\u001B[30m\u001B[43m";
    private final static String MAIN_MENU_INFO = BLACK_WHITE + "MAIN MENU\n" +
            "#1 Fill income\n" +
            "#2 Fill expenses\n" +
            "#3 Get budget information\n" +
            "# - press any number for close program";
    private final static String ALL_INCOME_MONEY_INFO = "\u001B[43mAll income money for this month is: %s$\n";

    ArrayList<Income> incomeList = new ArrayList<>();
    ArrayList<Expenses> expensesList = new ArrayList<>();

    private int sumAllIncome;
    Scanner scanner = new Scanner(System.in);
    //    Expenses expenses1 = new Expenses();

    private boolean start = true;

    //data for date
    private int year, month, day;


    private String orderType;

    //Expenses menu values
    private int expensesIndex;
    private int expensesMoney;
    private String additionalInfo;

    Budget() {

    }

    public void startProgram() {
        simulation();

        while (start) {
            System.out.println(MAIN_MENU_INFO);
            int mainMenu = scanner.nextInt();

            if (mainMenu < 1 || mainMenu > 3) {
                start = false;
            }
            // #1
            if (mainMenu == 1) {
                System.out.println(BLACK_WHITE + "Enter source of income [Company name]");
                //Data for Income obj
                String sourceOfIncome = scanner.next();
                System.out.println(BLACK_WHITE + "Enter income money [$]");
                int incomeMoney = scanner.nextInt();
                System.out.println(BLACK_WHITE + "Enter data -> YEAR");
                year = scanner.nextInt();
                System.out.println(BLACK_WHITE + "Enter data -> MONTH");
                month = scanner.nextInt();
                System.out.println(BLACK_WHITE + "Enter data -> DAY");
                day = scanner.nextInt();

                printOrderTypes();
                mainMenu = scanner.nextInt();

                orderType = getOrderTypeIndex(mainMenu);

                incomeList.add(new Income(incomeMoney,
                        LocalDate.of(year, month, day),
                        sourceOfIncome,
                        orderType));


                // #2
            } else if (mainMenu == 2) {
                System.out.println("Chose expenses category:");
                printExpenditureCategoryLikeMenu();
                expensesIndex = scanner.nextInt();
                System.out.println("Enter expenses money [$]");
                expensesMoney = scanner.nextInt();
                System.out.println(BLACK_WHITE + "Enter data -> YEAR");
                year = scanner.nextInt();
                System.out.println(BLACK_WHITE + "Enter data -> MONTH");
                month = scanner.nextInt();
                System.out.println(BLACK_WHITE + "Enter data -> DAY");
                day = scanner.nextInt();

                printOrderTypes();
                mainMenu = scanner.nextInt();
                orderType = getOrderTypeIndex(mainMenu);

                System.out.println("Enter additional information");
                additionalInfo = scanner.next();

                expensesList.add(new Expenses(
                        expensesIndex,
                        expensesMoney,
                        LocalDate.of(year, month, day),
                        orderType,
                        additionalInfo
                ));

                // #3
            } else if (mainMenu == 3) {

                printLine();
                printIncomingTop();
                for (int i = 0; i < incomeList.size(); i++) {
                    incomeList.get(i).printIncomeInfo();
                    sumAllIncome += incomeList.get(i).getIncomeMoney();
                }
                //pinigu suma uz visas pajamas
                System.out.printf(YELLOW_BLACK + ALL_INCOME_MONEY_INFO, sumAllIncome);
                System.out.println("All spend money is " + countSpendingMoney() + "\n" +
                        "Budget is: " + countBudget());

                printLine();

                System.out.println("ID | EXPENSES CATEGORY | SPEND MONEY [$] |    DATA    | ORDER TYPE | ADDITIONAL INFORMATION");
                printLine();
                for (int i = 0; i < expensesList.size(); i++) {
                    expensesList.get(i).printExpensesInfo();
                }

            }
        }
    }

    public void simulation() {
        expensesList.add(new Expenses(
                0,
                85,
                LocalDate.of(2023, 02, 15),
                "BANK",
                "MSI"));

        expensesList.add(new Expenses(
                2,
                130,
                LocalDate.of(2023, 02, 13),
                "BANK",
                "LIDL"));

        expensesList.add(new Expenses(
                3,
                630,
                LocalDate.of(2023, 02, 10),
                "BANK",
                "-"));

        expensesList.add(new Expenses(
                7,
                60,
                LocalDate.of(2023, 02, 11),
                "BANK",
                "-"));

        expensesList.add(new Expenses(
                2,
                32,
                LocalDate.of(2023, 02, 13),
                "BANK",
                "Silas"));

    }

    public void printLine(){
        System.out.print("\u001B[30m\u001B[43m");
        String line = "-";
        for (int i = 0; i < 100; i++) {
            System.out.print(line);
        }
        System.out.println();
    }

    public int countSpendingMoney(){
        int sumOfSpendingMoney = 0;

        for (int i = 0; i < expensesList.size(); i++) {
            sumOfSpendingMoney += expensesList.get(i).getExpMoney();
        }
        return sumOfSpendingMoney;
    }

    public String countBudget(){
        int budgetValue = sumAllIncome - countSpendingMoney();
        String budgetType;
        if (budgetValue < 0){
            budgetType = " (negative) ";
        } else {
            budgetType = " (positive) ";
        }

        return budgetValue + budgetType;
    }


}
