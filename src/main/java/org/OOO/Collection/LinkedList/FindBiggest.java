package org.OOO.Collection.LinkedList;

import java.util.ArrayList;

public class FindBiggest {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("qq");
        words.add("aaa");
        words.add("bbbb");
        words.add("cccccc");
        words.add("dddd");

        String maxValue = "";

        int max = words.get(0).length();

        for (int i = 0; i < words.size(); i++) {
            if (maxValue.length() < words.get(i).length()){
                maxValue = words.get(i);
            }
        }

    }
}
