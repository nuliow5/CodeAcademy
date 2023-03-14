package org.MyProjects.Bugdet.records;

import org.MyProjects.Bugdet.information.Information;
import org.MyProjects.Bugdet.sort.*;
import org.MyProjects.Bugdet.workWithFiles.BudgetDataFile;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;

import static org.MyProjects.Bugdet.records.ExpensesCategory.*;
import static org.MyProjects.Bugdet.Simulaion.InputOutputSimulations.simulateWithRecords;
import static org.MyProjects.Bugdet.records.Order.getOrderTypeIndex;
import static org.MyProjects.Bugdet.records.Order.printOrderTypes;
import static org.MyProjects.Bugdet.records.Record.printMoneyWithDoubleFormat;


public class Budget implements InputOutput {
    private static final String FULL_COST_INFORMATION = "%20s | %-10s | %s\n";

    protected static List<Record> records = new ArrayList<>();
    protected static HashMap<Integer, Record> recordHashMap = new HashMap<>();

    protected ArrayList<ExpensObj> expensObjArrayList = new ArrayList<>();
    private int sumAllIncome;
    Scanner scanner = new Scanner(System.in);

    BudgetDataFile budgetDataFile = new BudgetDataFile();
    private String orderType;
    private int expensesIndex;
    private String additionalInfo;


    public Budget() {

    }

    public void startProgram() {
        simulateWithRecords();
        createExpensesObj();
        Information.programIntro();

        boolean start = true;
        while (start) {

            Information.MAIN_MENU_INFO();
            int mainMenu = setMainManuValue(scanner.next());

            // #1
            if (mainMenu == 1) {
                fillIncome();

                // #2
            } else if (mainMenu == 2) {
                fillExpenses();


                // #3
            } else if (mainMenu == 3) {
                printIncomingFromList();
                printExpensesList();
                printFullCostInformation();



                // #4
            } else if (mainMenu == 4) {
                choseSortType();

            } else if (mainMenu == 5) {
                editBudget();

            } else if (mainMenu == 6) {
                workWithFile();


            } else if (mainMenu == -1) {
                continue;
            } else if (mainMenu == 0) {
                Information.printExitProgram();
                start = false;
            }

        }

    }

    private void workWithFile() {
        try {
            while (true) {
                Information.workWithFileMenu();
                int mainMenu = Integer.parseInt(scanner.next());
                if (mainMenu == 1) {
                    budgetDataFile.saveToFile(records);
                    budgetDataFile.saveLastIndexToFile(records);

                    break;
                } else if (mainMenu == 2) {
                    budgetDataFile.continueFillFile(records);
                    budgetDataFile.saveLastIndexToFile(records);

                    break;
                } else if (mainMenu == 3) {
                    budgetDataFile.readFile();
                    budgetDataFile.readIndexFromFile();
                    break;

                } else {
                    Information.badInput("try again!");
                }

            }
        } catch (NumberFormatException e) {
            Information.badInput(String.valueOf(e));

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

    public double countSpendingMoney() {
        double sumOfSpendingMoney = 0;

        for (int i = 0; i < getExpensesList().size(); i++) {
            sumOfSpendingMoney += getExpensesList().get(i).getMoney();
        }
        return sumOfSpendingMoney;
    }

    public String countBudget() {
        double budgetValue = sumAllIncome - countSpendingMoney();
        String budgetType;
        if (budgetValue < 0) {
            budgetType = " (negative) ";
        } else {
            budgetType = " (positive) ";
        }

        return printMoneyWithDoubleFormat(budgetValue) + "$" + budgetType;
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
        //clear expensObjArrayList
        for (int i = 0; i < expensObjArrayList.size(); i++) {
            expensObjArrayList.get(i).setAllSpendMoney(0);
        }

        //fill
        for (int i = 0; i < expensObjArrayList.size(); i++) {
            for (int j = 0; j < getExpensesList().size(); j++) {
                if (expensObjArrayList.get(i).getExpType().equals(getExpensesList().get(j).getExpCategory())) {
                    double existingMoney = expensObjArrayList.get(i).getAllSpendMoney();
                    expensObjArrayList.get(i).setAllSpendMoney(getExpensesList().get(j).getMoney() + existingMoney);
                }
            }
        }
    }

    public void printFullCostInformation() {
        provideFullCostInformation();
        Information.printLine();
        for (int i = 0; i < expensObjArrayList.size(); i++) {
            double indicator = (expensObjArrayList.get(i).getAllSpendMoney() * 50) / countSpendingMoney();

            System.out.printf(FULL_COST_INFORMATION,
                    expensObjArrayList.get(i).getExpType(),
                    expensObjArrayList.get(i).getAllSpendMoney(), printIndicator(indicator));
        }


    }

    public String printIndicator(double indicator) {
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
        try {
            if (record.getRecordType().equals(RecordType.EXPENSES)) {
                ((Expenses) record).printExpensesInfo();

                while (true) {
                    System.out.println("\u001B[37m\u001B[40mDo you want change " +
                            "EXPENSES category? " + ((Expenses) record).getExpCategory() + "\n" +
                            "#1 YES \n" +
                            "#2 NO");

                    int yesNo = Integer.parseInt(scanner.next());
                    if (yesNo > 0 && yesNo < 3) {
                        if (yesNo == 1) {
                            ((Expenses) record).setExpCategory(getExpenditureCategory(fillExpensesExpCategory()));
                        }
                        break;
                    } else {
                        Information.badInput();
                    }
                }

            } else {
                ((Income) record).printIncomeInfo();
                while (true) {
                    System.out.println("\u001B[37m\u001B[40mDo you want change " +
                            "source of income [Company name]? " + ((Income) record).getSourceOfIncome() + "\n" +
                            "#1 YES \n" +
                            "#2 NO");
                    int yesNo = Integer.parseInt(scanner.next());
                    if (yesNo > 0 && yesNo < 3) {
                        if (yesNo == 1) {
                            Information.firstMainQuestCompanyName();
                            String sourceOfIncome = scanner.next();
                            ((Income) record).setSourceOfIncome(sourceOfIncome);
                            break;
                        }
                        break;
                    } else {
                        Information.badInput();
                    }
                }
            }

            String covertInformation = "" + record.getMoney();
            while (true) {
                Information.changeQuestion("money [$]", covertInformation);
                int yesNo = Integer.parseInt(scanner.next());
                if (yesNo > 0 && yesNo < 3) {
                    if (yesNo == 1) {
                        Information.infoInputChanges();
                        double money = Double.parseDouble(scanner.next());
                        record.setMoney(money);
                        break;
                    }
                    break;
                } else {
                    Information.badInput();
                }
            }

            covertInformation = "" + record.getDate();
            while (true) {
                Information.changeQuestion("DATE", covertInformation);
                int yesNo = Integer.parseInt(scanner.next());
                if (yesNo > 0 && yesNo < 3) {
                    if (yesNo == 1) {
                        record.setDate(setLocalDate());
                        break;
                    }
                    break;
                } else {
                    Information.badInput();
                }
            }

            covertInformation = "" + record.getOrderType();
            while (true) {
                Information.changeQuestion("ORDER TYPE", covertInformation);
                int yesNo = Integer.parseInt(scanner.next());
                if (yesNo > 0 && yesNo < 3) {
                    if (yesNo == 1) {
                        record.setOrderType(fillOrderType());
                        break;
                    }
                    break;
                } else {
                    Information.badInput();
                }
            }

            covertInformation = "" + record.getAdditionalInfo();
            while (true) {
                Information.changeQuestion("ADDITIONAL INFORMATION", covertInformation);
                int yesNo = Integer.parseInt(scanner.next());
                if (yesNo > 0 && yesNo < 3) {
                    if (yesNo == 1) {
                        Information.infoInputChanges();
                        additionalInfo = scanner.next();
                        record.setAdditionalInfo(additionalInfo);
                        break;
                    }
                    break;
                } else {
                    Information.badInput();
                }
            }


        } catch (NumberFormatException e) {
            Information.badInput(String.valueOf(e));
        }


    }

    private int setMainManuValue(String sc) {
        try {
            int mainMenu = Integer.parseInt(sc);

            if ((mainMenu >= 0 && mainMenu < 7)) {
                return mainMenu;
            } else {
                Information.badInput();

            }
        } catch (NumberFormatException | NoSuchElementException e) {
            Information.badInput(String.valueOf(e));

        }
        return -1;

    }

    private int setIntegerValue(String sc) {
        try {
            int integerValue = Integer.parseInt(sc);
            if (integerValue >= 0) {
                return integerValue;
            } else {
                return -1;
            }
        } catch (NumberFormatException e) {
            Information.badInput();
            return -1;
        }
    }

    private void fillIncome() {
        try {
            Information.firstMainQuestCompanyName();
            String sourceOfIncome = scanner.next();

            Information.firstMainQuestIncomeMoney();
            double incomeMoney = Double.parseDouble(scanner.next());

            LocalDate localDate = setLocalDate();

            orderType = fillOrderType();

            Information.secondMainQuestAdditionalInfo();
            additionalInfo = scanner.next();

            if (localDate != null) {
                inputRecord(new Income(
                        incomeMoney,
                        localDate,
                        sourceOfIncome,
                        orderType,
                        additionalInfo));
            }

        } catch (NumberFormatException | DateTimeException e) {
            Information.badInput(String.valueOf(e));
        }

    }


    private final LocalDate setLocalDate() {
        /*
        [0] - year;
        [1] - month;
        [2] - day
         */

        int[] objLocalDate = new int[3];

        try {
            Information.firstMainQuestDataYear();
            int year = Integer.parseInt(scanner.next());
            objLocalDate[0] = year;

            boolean condition = true;
            while (condition) {
                Information.firstMainQuestDataMonth();
                int tempMonth = Integer.parseInt(scanner.next());

                if (tempMonth > 0 && tempMonth <= 12) {
                    objLocalDate[1] = tempMonth;
                    condition = false;
                } else {
                    Information.badInput("try again!");
                }
            }


            condition = true;
            while (condition) {
                Information.firstMainQuestDataDay();
                int day = Integer.parseInt(scanner.next());

                if (day > 0 && day <= 31) {
                    objLocalDate[2] = day;
                    condition = false;
                } else {
                    Information.badInput("try again!");

                }
            }

            return LocalDate.of(objLocalDate[0], objLocalDate[1], objLocalDate[2]);

        } catch (DateTimeException e) {
            Information.badInput(String.valueOf(e));
        }

        return null;

    }

    private void fillExpenses() {

        try {
            expensesIndex = fillExpensesExpCategory();

            Information.secondMainQuestExpensesMoney();
            double expensesMoney = Double.parseDouble(scanner.next());

            LocalDate localDate = setLocalDate();

            orderType = fillOrderType();


            Information.secondMainQuestAdditionalInfo();
            additionalInfo = scanner.next();

            if (localDate != null) {
                inputRecord(new Expenses(
                        expensesIndex,
                        expensesMoney,
                        localDate,
                        orderType,
                        additionalInfo
                ));
            }
        } catch (NumberFormatException | DateTimeException e) {
            Information.badInput(String.valueOf(e));
        }


    }

    private int checkInputToEditBudgetMenu() {
        int budgetMenu = -1;
        try {
            while (true) {
                Information.forMenu();
                budgetMenu = Integer.parseInt(scanner.next());
                if (budgetMenu >= 1 && budgetMenu < 3) {
                    break;
                } else {
                    Information.badInput("try again!");
                }
            }

        } catch (NumberFormatException e) {
            Information.badInput(String.valueOf(e));

        }

        return budgetMenu;


    }

    private void editBudget() {

        int editBudgetMenu = checkInputToEditBudgetMenu();

        try {

            //Delete
            if (editBudgetMenu == 1) {

                printOnlyIncome();
                printExpensesList();

                while (true) {
                    Information.printChoseDelete();
                    int deleteMenu = Integer.parseInt(scanner.next());

                    if (findArrayIndexById(deleteMenu) != -1) {
                        int index = findArrayIndexById(deleteMenu);
                        records.remove(index);
                        break;
                    } else {
                        Information.badInput("out of range!");
                    }

                }


                //edit
            } else if (editBudgetMenu == 2) {
                printOnlyIncome();
                printExpensesList();
                while (true) {
                    Information.choseLineForEdit();
                    int editMenu = Integer.parseInt(scanner.next());

                    if (findArrayIndexById(editMenu) != -1) {
                        int index = findArrayIndexById(editMenu);
                        updateRecord(records.get(index));
                        break;
                    } else {
                        Information.badInput();
                    }

                }

            }
        } catch (NumberFormatException e) {
            Information.badInput(String.valueOf(e));
        }


    }

    //fillExpenses components
    private int fillExpensesExpCategory() {
        while (true) {
            Information.secondMainQuestExpenses();
            printExpenditureCategoryLikeMenu();
            int tempExpensesIndex = Integer.parseInt(scanner.next());

            if (tempExpensesIndex >= 0 && tempExpensesIndex < 9) {
                expensesIndex = tempExpensesIndex;
                return expensesIndex;
            } else {
                Information.badInput("try again!");
            }
        }
    }

    private String fillOrderType() {
        while (true) {
            printOrderTypes();
            int orderTypeChose = Integer.parseInt(scanner.next());
            if (orderTypeChose >= 0 && orderTypeChose < 2) {
                orderType = getOrderTypeIndex(orderTypeChose);
                return orderType;
            } else {
                Information.badInput("try again!");
            }
        }
    }

    private void choseSortType() {
        try {
            while (true) {
                Information.sortMenu();
                int sortMenu = Integer.parseInt(scanner.next());
                if (sortMenu == 0) {
                    break;
                } else if (sortMenu == 1) {
                    Collections.sort(records, new SortById());
                    printExpensesList();
                } else if (sortMenu == 2) {
                    Collections.sort(records, new SortByMoney());
                    printExpensesList();

                } else if (sortMenu == 3) {
                    Collections.sort(records, new SortByDate());
                    printExpensesList();

                } else if (sortMenu == 4) {
                    Collections.sort(records, new SortByOrderType());
                    printExpensesList();
                } else if (sortMenu == 5) {
                    Collections.sort(records, new SortByAdditionalInformation());
                    printExpensesList();

                } else {
                    Information.badInput();
                }
            }

        } catch (NumberFormatException e) {
            Information.badInput(String.valueOf(e));
        }


    }




}
