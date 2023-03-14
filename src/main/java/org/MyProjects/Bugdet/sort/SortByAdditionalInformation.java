package org.MyProjects.Bugdet.sort;

import org.MyProjects.Bugdet.records.Record;

import java.util.Comparator;

public class SortByAdditionalInformation implements Comparator<Record> {

    @Override
    public int compare(Record o1, Record o2) {
        return o2.getAdditionalInfo().compareTo(o2.getAdditionalInfo());
    }
}
