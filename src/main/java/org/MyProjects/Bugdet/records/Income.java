package org.MyProjects.Bugdet.records;

import java.time.LocalDate;
public class Income extends Record {
    private final static String INFO = "%2s | %-8s | %-17s | %14s$ " +
            "| %10s | %-10s | %s \n";
    private String sourceOfIncome;

    public Income(int money, LocalDate date, String sourceOfIncome, String orderType, String additionalInfo) {
        super(money, date, orderType, additionalInfo);
        this.sourceOfIncome = sourceOfIncome;
        recordType = RecordType.INCOME;

    }

    public String getSourceOfIncome() {
        return sourceOfIncome;
    }

    public void setSourceOfIncome(String sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome;
    }

    public void printIncomeInfo(){
        System.out.printf("\u001B[30m\u001B[43m" + INFO,
                getObjId(),
                getRecordType(),
                getSourceOfIncome(),
                getMoney(),
                getDate(),
                getOrderType(),
                getAdditionalInfo());
    }
    @Override
    public String toString() {
        return "\"" + recordType + "\"" +
                ",\"" + sourceOfIncome +  "\"" +
                super.toString();
    }

    @Override
    public void printRecord(String getValue) {
        super.printRecord(getSourceOfIncome());
    }
}
