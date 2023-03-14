package org.MyProjects.Bugdet.records;

import java.time.LocalDate;

import static org.MyProjects.Bugdet.records.ExpensesCategory.getExpenditureCategory;

public class Expenses extends Record {
    private final static String EXPENSES_INFO = "%2s | %8s | %-18s| %14s$ " +
            "| %s | %-10s | %s \n";
    private String expCategory;

    public Expenses(int expenditureCategory, double money, LocalDate date, String orderType,
                    String additionalInfo) {
        super(money, date, orderType, additionalInfo);
        this.expCategory = getExpenditureCategory(expenditureCategory);
        recordType = RecordType.EXPENSES;
    }

    public String getExpCategory() {
        return expCategory;
    }


    public void printExpensesInfo(){
        System.out.printf("\u001B[30m\u001B[43m" + EXPENSES_INFO,
                getObjId(),
                getRecordType(),
                getExpCategory(),
                printMoneyWithDoubleFormat(getMoney()),
                getDate(),
                getOrderType(),
                getAdditionalInfo());

    }

    @Override
    public String toString() {
        return  "\"" + recordType + "\"" +
                ",\"" + expCategory + "\"" +
                super.toString();
    }

    public void setExpCategory(String expCategory) {
        this.expCategory = expCategory;
    }

    @Override
    public void printRecord(String getValue) {
        super.printRecord(getValue);
    }

    @Override
    public String testPrint() {
        return super.testPrint();
    }
}
