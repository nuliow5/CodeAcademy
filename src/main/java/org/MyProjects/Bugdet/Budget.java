package org.MyProjects.Bugdet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static org.MyProjects.Bugdet.ExpensesCategory.expenditureCategory;
import static org.MyProjects.Bugdet.ExpensesCategory.printExpenditureCategoryLikeMenu;
import static org.MyProjects.Bugdet.Order.getOrderTypeIndex;
import static org.MyProjects.Bugdet.Order.printOrderTypes;


public class Budget {

    private static final String FULL_COST_INFORMATION = "%20s | %-5s | %s\n";

    ArrayList<Income> incomeList = new ArrayList<>();
    ArrayList<Expenses> expensesList = new ArrayList<>();
    ArrayList<ExpensObj> expensObjArrayList = new ArrayList<>();
    private int sumAllIncome;
    Scanner scanner = new Scanner(System.in);
    private boolean start = true;

    //data for date
    private int year, month, day;
    private String orderType;

    //Expenses menu values
    private int expensesIndex;
    private int expensesMoney;
    private String additionalInfo;

    ExpensObj expensObj;

    Budget() {

    }

    public void startProgram() {
        simulation();
        createExpensesObj();

        while (start) {
            Information.MAIN_MENU_INFO();
            int mainMenu = scanner.nextInt();

            if (mainMenu < 1 || mainMenu > 5) {
                start = false;
            }
            // #1
            if (mainMenu == 1) {
                Information.firstMainQuestCompanyName();
                //Data for Income obj
                String sourceOfIncome = scanner.next();
                Information.firstMainQuestIncomeMoney();
                int incomeMoney = scanner.nextInt();
                Information.firstMainQuestDataYear();
                year = scanner.nextInt();
                Information.firstMainQuestDataMonth();
                month = scanner.nextInt();
                Information.firstMainQuestDataDay();
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
                Information.secondMainQuestExpenses();
                printExpenditureCategoryLikeMenu();
                expensesIndex = scanner.nextInt();
                Information.secondMainQuestExpensesMoney();
                expensesMoney = scanner.nextInt();
                Information.firstMainQuestDataYear();
                year = scanner.nextInt();
                Information.firstMainQuestDataMonth();
                month = scanner.nextInt();
                Information.firstMainQuestDataDay();
                day = scanner.nextInt();

                printOrderTypes();
                mainMenu = scanner.nextInt();
                orderType = getOrderTypeIndex(mainMenu);

                Information.secondMainQuestAdditionalInfo();
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

                printIncomingFromList();

                printListOfExpenses();

                //all spend
                printFullCostInformation();

                // #4
            } else if (mainMenu == 4) {
                Information.forMenuEditing();
                int deleteMenu = 0;
                mainMenu = scanner.nextInt();

                if (mainMenu == 1) {
                    printIncomingFromList();
                    Information.printChoseDelete();

                    deleteMenu = scanner.nextInt() - 1;
                    incomeList.remove(deleteMenu);

                } else if (mainMenu == 2) {

                    printListOfExpenses();
                    Information.printChoseDelete();

                    deleteMenu = scanner.nextInt() - 1;
                    expensesList.remove(deleteMenu);

                }
            }
        }
    }

    public void simulation() {
        expensesList.add(new Expenses(
                0,
                85,
                LocalDate.of(2023, 2, 15),
                "BANK",
                "MSI"));

        expensesList.add(new Expenses(
                2,
                130,
                LocalDate.of(2023, 2, 13),
                "BANK",
                "LIDL"));

        expensesList.add(new Expenses(
                3,
                630,
                LocalDate.of(2023, 2, 10),
                "BANK",
                "-"));

        expensesList.add(new Expenses(
                7,
                60,
                LocalDate.of(2023, 2, 11),
                "BANK",
                "-"));

        expensesList.add(new Expenses(
                2,
                32,
                LocalDate.of(2023, 2, 13),
                "BANK",
                "Silas"));

        expensesList.add(new Expenses(
                6,
                520,
                LocalDate.of(2023, 2, 23),
                "BANK",
                "House credit"));

        incomeList.add(new Income(
                4200,
                LocalDate.of(2023, 2, 5),
                "Netflix",
                "Bank"));

    }


    public int countSpendingMoney() {
        int sumOfSpendingMoney = 0;

        for (int i = 0; i < expensesList.size(); i++) {
            sumOfSpendingMoney += expensesList.get(i).getExpMoney();
        }
        return sumOfSpendingMoney;
    }

    public String countBudget() {
        int budgetValue = sumAllIncome - countSpendingMoney();
        String budgetType;
        if (budgetValue < 0) {
            budgetType = " (negative) ";
        } else {
            budgetType = " (positive) ";
        }

        return budgetValue + "$" + budgetType;
    }

    public void printListOfExpenses() {
        Information.expensesTopOutputMenu();
        for (Expenses expenses : expensesList) {
            expenses.printExpensesInfo();
        }
    }

    public void printIncomingFromList() {
        Information.printIncomingTop();
        for (int i = 0; i < incomeList.size(); i++) {
            incomeList.get(i).printIncomeInfo();
            sumAllIncome += incomeList.get(i).getIncomeMoney();
        }

        Information.printLine();
        System.out.println();
        Information.YellowBlackStyle(sumAllIncome, countSpendingMoney(), countBudget());

    }

    public void createExpensesObj() {
        for (int i = 0; i < expenditureCategory.length; i++) {
            expensObjArrayList.add(new ExpensObj(expenditureCategory[i]));


        }
    }

    public void provideFullCostInformation() {
        for (int i = 0; i < expensObjArrayList.size(); i++) {
            for (int j = 0; j < expensesList.size(); j++) {
                if (expensObjArrayList.get(i).getExpType().equals(expensesList.get(j).getExpCategory())) {
                    expensObjArrayList.get(i).setAllSpendMoney(expensesList.get(j).getExpMoney());
                }
            }
        }
    }

    public void printFullCostInformation() {
        provideFullCostInformation();
        Information.printLine();
        for (int i = 0; i < expensObjArrayList.size(); i++) {

            int indicator = (expensObjArrayList.get(i).getAllSpendMoney() * 100) / countSpendingMoney();

            System.out.printf(FULL_COST_INFORMATION,
                    expensObjArrayList.get(i).getExpType(),
                    expensObjArrayList.get(i).getAllSpendMoney(), printIndicator(indicator));
        }


    }

    public String printIndicator(int indicator) {
        //paint *
        String paintSymbol = "";
        for (int j = 0; j < indicator; j++) {
            paintSymbol += "⏹";
        }
        return paintSymbol;
    }


}
