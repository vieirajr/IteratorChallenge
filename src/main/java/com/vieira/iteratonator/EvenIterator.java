package com.vieira.iteratonator;

public class EvenIterator implements Iterator {
    private final Integer to;
    private Integer currentValue;

    public EvenIterator(Integer from, Integer to) {
        this.to = to;
        this.currentValue = from;
    }

    @Override
    public boolean hasNext() {
        return this.currentValue < this.to;
    }

    @Override
    public Integer next() {
        if (this.currentValue % 2 != 0) {
            this.currentValue += 1;
        }
        if (this.currentValue > this.to) {
            return null;
        }
        var value = this.currentValue;
        this.currentValue += 2;
        return value;
    }
}
