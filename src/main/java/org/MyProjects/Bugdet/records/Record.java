package org.MyProjects.Bugdet.records;

import org.MyProjects.Bugdet.workWithFiles.BudgetDataFile;

import java.time.LocalDate;

public class Record {
    private static final String DOUBLE_FORMAT = "%.2f";
    private final static String INFO = "%2s | %-8s | %-17s | %14s$ " +
            "| %10s | %-10s | %s \n";
    private double money;
    private LocalDate date;
    private String orderType;
    private String additionalInfo;
    protected RecordType recordType;

    private static int id = new BudgetDataFile().readIndexFromFile();

    private int objId;

    public Record(double money, LocalDate date, String orderType, String additionalInfo) {
        this.money = money;
        this.date = date;
        this.orderType = orderType;
        this.additionalInfo = additionalInfo;
        id++;
        this.objId += id;

    }

    public double getMoney() {
        return money;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getOrderType() {
        return orderType;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public static int getId() {
        return id;
    }

    public int getObjId() {
        return objId;
    }


    @Override
    public String toString() {
        return ",\"" + objId + "\"" +
                ",\"" + printMoneyWithDoubleFormat(money) + "\"" +
                ",\"" + date + "\"" +
                ",\"" + orderType + "\"" +
                ",\"" + additionalInfo + "\"";

    }

    public String testPrint() {
        return ",\"" + objId + "\"" +
                ",\"" + printMoneyWithDoubleFormat(money) + "\"" +
                ",\"" + date + "\"" +
                ",\"" + orderType + "\"" +
                ",\"" + additionalInfo + "\"";

    }

    public String returnObjId() {
        return "" + objId;
    }

    public RecordType getRecordType() {
        return recordType;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public void printRecord(String getValue) {
        System.out.printf("\u001B[30m\u001B[43m" + INFO,
                getObjId(),
                getRecordType(),
                getValue,
                getMoney(),
                getDate(),
                getOrderType(),
                getAdditionalInfo());
    }

    public static String printMoneyWithDoubleFormat(double money) {
        return String.format(DOUBLE_FORMAT, money);
    }


}
