package org.MyProjects.Bugdet.sort;

import org.MyProjects.Bugdet.records.Expenses;
import org.MyProjects.Bugdet.records.Record;


import java.util.Comparator;

public class SortByExpensesCategory implements Comparator<Expenses> {

    @Override
    public int compare(Expenses o1, Expenses o2) {
        return o1.getExpCategory().compareTo(o2.getExpCategory());
    }
}
