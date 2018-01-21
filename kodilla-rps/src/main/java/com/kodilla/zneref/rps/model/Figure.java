package com.kodilla.zneref.rps.model;

import java.util.List;

public class Figure implements Comparable<Figure> {
    private final String itemName;
    private final List<String> weakerList;

    public Figure(String itemName, List<String> weakerList) {
        this.itemName = itemName;
        this.weakerList = weakerList;
    }

    @Override
    public int compareTo(Figure other) {
        if (itemName.equals(other.getItemName())) return 0;
        if (weakerList.contains(other.getItemName())) return 1;
        return -1;
    }

    public String getItemName() {
        return itemName;
    }
}
