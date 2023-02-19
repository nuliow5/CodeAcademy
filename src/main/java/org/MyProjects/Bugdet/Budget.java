package org.MyProjects.Bugdet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static org.MyProjects.Bugdet.ExpensesCategory.printExpenditureCategoryLikeMenu;
import static org.MyProjects.Bugdet.Order.getOrderTypeIndex;
import static org.MyProjects.Bugdet.Order.printOrderTypes;


public class Budget {
    ArrayList<Income> incomeList = new ArrayList<>();
    ArrayList<Expenses> expensesList = new ArrayList<>();
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

    Budget() {

    }

    public void startProgram() {
        simulation();

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

                Information.printIncomingTop();
                for (int i = 0; i < incomeList.size(); i++) {
                    incomeList.get(i).printIncomeInfo();
                    sumAllIncome += incomeList.get(i).getIncomeMoney();
                }
                Information.YellowBlackStyle(sumAllIncome, countSpendingMoney(), countBudget());
                Information.printLine();

                Information.expensesTopOutputMenu();
                printListOfExpenses();
            // #4
            } else if (mainMenu == 4) {
                System.out.println(4);
                System.out.println("What list you want edit?\n" +
                        "#1 - Income\n" +
                        "#2 - Expenses");
                mainMenu = scanner.nextInt();
                if (mainMenu == 1){

                } else if (mainMenu == 2) {
                    Information.expensesTopOutputMenu();
                    printListOfExpenses();

                    System.out.println("Chose id what tou want delete?");
                    int deleteMenu = scanner.nextInt()-1;
                    expensesList.remove(deleteMenu);

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

//    public void printLine(){
//        System.out.print("\u001B[30m\u001B[43m");
//        String line = "-";
//        for (int i = 0; i < 100; i++) {
//            System.out.print(line);
//        }
//        System.out.println();
//    }

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

    public void printListOfExpenses(){

        for (int i = 0; i < expensesList.size(); i++) {
            expensesList.get(i).printExpensesInfo();
        }
    }


}
