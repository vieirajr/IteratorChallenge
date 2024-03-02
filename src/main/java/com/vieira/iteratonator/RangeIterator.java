package com.vieira.iteratonator;

public class RangeIterator implements Iterator {
    private final Integer to;
    private Integer currentValue;

    public RangeIterator(Integer from, Integer to) {
        this.to = to;
        this.currentValue = from;
    }

    @Override
    public boolean hasNext() {
        return this.currentValue <= this.to;
    }

    @Override
    public Integer next() {
        if (this.currentValue > this.to) {
            return null;
        }
        var value = this.currentValue;
        this.currentValue += 1;
        return value;
    }
}
