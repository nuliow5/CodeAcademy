package org.MyProjects.Bugdet.sort;

import org.MyProjects.Bugdet.records.Record;

import java.util.Comparator;

public class SortByMoney implements Comparator<Record> {
    @Override
    public int compare(Record o1, Record o2) {
        return Double.compare(o1.getMoney(), o2.getMoney());
    }
}
