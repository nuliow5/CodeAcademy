package org.MyProjects.Bugdet;

import java.time.LocalDate;

public class Record {
    private int money;
    private LocalDate date;
    private String orderType;
    private String additionalInfo;

    protected RecordType recordType;

    private static int id = 0;
    private int objId;


    public Record(int money, LocalDate date, String orderType, String additionalInfo) {
        this.money = money;
        this.date = date;
        this.orderType = orderType;
        this.additionalInfo = additionalInfo;
        id++;
        this.objId += id;


    }

    public int getMoney() {
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
        return "Record{" +
                "objId=" + objId +
                ", money=" + money +
                ", date=" + date +
                ", orderType='" + orderType + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';
    }

    public RecordType getRecordType() {
        return recordType;
    }
}
