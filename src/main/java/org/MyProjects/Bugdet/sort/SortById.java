package org.MyProjects.Bugdet.sort;

import org.MyProjects.Bugdet.records.Record;

import java.util.Comparator;

public class SortById implements Comparator<Record> {
    @Override
    public int compare(Record o1, Record o2) {
        return o1.getObjId() - o2.getObjId();
    }
}
