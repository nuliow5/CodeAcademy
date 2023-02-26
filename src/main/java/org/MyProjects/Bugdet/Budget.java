package org.MyProjects.Bugdet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static org.MyProjects.Bugdet.ExpensesCategory.*;
import static org.MyProjects.Bugdet.Simulaion.InputOutputSimulations.simulateWithRecords;
import static org.MyProjects.Bugdet.Order.getOrderTypeIndex;
import static org.MyProjects.Bugdet.Order.printOrderTypes;


public class Budget implements InputOutput {
    private static final String FULL_COST_INFORMATION = "%20s | %-5s | %s\n";

    protected static ArrayList<Record> records = new ArrayList<>();

    protected ArrayList<ExpensObj> expensObjArrayList = new ArrayList<>();
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

    public Budget() {

    }

    public void startProgram() {
        simulateWithRecords();
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
                Information.secondMainQuestAdditionalInfo();
                additionalInfo = scanner.next();


                printOrderTypes();
                mainMenu = scanner.nextInt();

                orderType = getOrderTypeIndex(mainMenu);

                inputRecord(new Income(incomeMoney,
                        LocalDate.of(year, month, day),
                        sourceOfIncome,
                        orderType,
                        additionalInfo));


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

                inputRecord(new Expenses(
                        expensesIndex,
                        expensesMoney,
                        LocalDate.of(year, month, day),
                        orderType,
                        additionalInfo
                ));


                // #3
            } else if (mainMenu == 3) {
                printIncomingFromList();
                printExpensesList();
                printFullCostInformation();


                // #4
            } else if (mainMenu == 4) {
                Information.forMenu();
                mainMenu = scanner.nextInt();

                //Delete
                if (mainMenu == 1) {
                    printOnlyIncome();
                    printExpensesList();
                    Information.printChoseDelete();

                    int deleteMenu = scanner.nextInt();
                    records.remove(findArrayIndexById(deleteMenu));


                    //edit
                } else if (mainMenu == 2) {
                    printOnlyIncome();
                    printExpensesList();
                    Information.choseLineForEdit();
                    int editMenu = scanner.nextInt();
                    int index = findArrayIndexById(editMenu);
                    if (index >= 0){
                        updateRecord(records.get(index));
                    } else {
                        Information.badInput();
                    }

                } else {
                    Information.badInput();
                }


            }
        }
    }

    @Override
    public void inputRecord(Record record) {
        records.add(record);
    }

    @Override
    public ArrayList<Expenses> getExpensesList() {
        ArrayList<Expenses> expensesList = new ArrayList<>();

        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getRecordType().equals(RecordType.EXPENSES)) {
                expensesList.add((Expenses) records.get(i));
            }
        }

        return expensesList;

    }

    public void printExpensesList() {

        Information.expensesTopOutputMenu();
        for (Expenses expenses : getExpensesList()) {
            expenses.printExpensesInfo();

        }
    }

    @Override
    public ArrayList<Income> getIncomeList() {
        ArrayList<Income> incomeList = new ArrayList<>();
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getRecordType().equals(RecordType.INCOME)) {
                incomeList.add((Income) records.get(i));
            }
        }

        return incomeList;
    }

    public int countSpendingMoney() {
        int sumOfSpendingMoney = 0;

        for (int i = 0; i < getExpensesList().size(); i++) {
            sumOfSpendingMoney += getExpensesList().get(i).getMoney();
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

    public void printOnlyIncome() {
        Information.printIncomingTop();
        for (int i = 0; i < getIncomeList().size(); i++) {
            getIncomeList().get(i).printIncomeInfo();
            sumAllIncome += getIncomeList().get(i).getMoney();
        }
    }

    public void printIncomingFromList() {
        printOnlyIncome();

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
            for (int j = 0; j < getExpensesList().size(); j++) {
                if (expensObjArrayList.get(i).getExpType().equals(getExpensesList().get(j).getExpCategory())) {
                    expensObjArrayList.get(i).setAllSpendMoney(getExpensesList().get(j).getMoney());
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
        //paint
        StringBuilder paintSymbol = new StringBuilder();
        for (int j = 0; j < indicator; j++) {
            paintSymbol.append("⏹");
        }
        return paintSymbol.toString();
    }

    public int findArrayIndexById(int id) {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getObjId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void updateRecord(Record record) {
        if (record.getRecordType().equals(RecordType.EXPENSES)) {
            ((Expenses) record).printExpensesInfo();

            System.out.println("\u001B[37m\u001B[40mDo you want change " +
                    "EXPENSES category? " + ((Expenses) record).getExpCategory() + "\n" +
                    "#1 YES \n" +
                    "#2 NO");
            int yesNo = scanner.nextInt();
            if (yesNo == 1) {
                Information.secondMainQuestExpenses();
                printExpenditureCategoryLikeMenu();
                expensesIndex = scanner.nextInt();
                ((Expenses) record).setExpCategory(getExpenditureCategory(expensesIndex));
            }

        } else {
            ((Income) record).printIncomeInfo();
            System.out.println("Do you want change " +
                    "source of income [Company name]? " + ((Income) record).getSourceOfIncome() + "\n" +
                    "#1 YES \n" +
                    "#2 NO");
            int yesNo = scanner.nextInt();
            if (yesNo == 1) {
                Information.firstMainQuestCompanyName();
                String sourceOfIncome = scanner.next();
                ((Income) record).setSourceOfIncome(sourceOfIncome);
            }
        }

        String covertInformation = "" + record.getMoney();
        Information.changeQuestion("money [$]", covertInformation);
        int yesNo = scanner.nextInt();
        if (yesNo == 1) {
            Information.infoInputChanges();
            int money = scanner.nextInt();
            record.setMoney(money);
        }

        covertInformation = "" + record.getDate();
        Information.changeQuestion("DATE", covertInformation);
        yesNo = scanner.nextInt();
        if (yesNo == 1) {
            Information.firstMainQuestDataYear();
            year = scanner.nextInt();
            Information.firstMainQuestDataMonth();
            month = scanner.nextInt();
            Information.firstMainQuestDataDay();
            day = scanner.nextInt();
            record.setDate(LocalDate.of(year, month, day));
        }

        covertInformation = "" + record.getOrderType();
        Information.changeQuestion("ORDER TYPE", covertInformation);
        yesNo = scanner.nextInt();
        if (yesNo == 1) {
            printOrderTypes();
            int orderType = scanner.nextInt();
            record.setOrderType(getOrderTypeIndex(orderType));
        }

        covertInformation = "" + record.getAdditionalInfo();
        Information.changeQuestion("ADDITIONAL INFORMATION", covertInformation);
        yesNo = scanner.nextInt();
        if (yesNo == 1) {
            Information.infoInputChanges();
            additionalInfo = scanner.next();
            record.setAdditionalInfo(additionalInfo);
        }

    }




}
