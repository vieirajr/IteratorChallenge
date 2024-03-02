package com.vieira.iteratonator;

import java.util.List;

public class ListIterator implements Iterator{
    private final List<Integer> list;
    private Integer currentIndex = 0;

    public ListIterator(List<Integer> list) {
        this.list = list;
    }

    public boolean hasNext() {
        return this.list.size() > currentIndex;
    }

    public Integer next() {
        var value = list.get(currentIndex);
        this.currentIndex += 1;
        return value;
    }
}
