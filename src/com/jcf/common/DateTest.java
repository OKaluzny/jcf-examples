package com.jcf.common;

public class DateTest implements Comparable<DateTest> {

    private final int month, day, year;

    public DateTest(int month, int day, int year) {

        this.month = month;
        this.day = day;
        this.year = year;
    }

    public static void main(String[] args) {
    }

    @Override
    public int compareTo(DateTest that) {

        if (this.month < that.month)
            return -1;
        if (this.month > that.month)
            return 1;
        if (this.day < that.day)
            return -1;
        if (this.day > that.day)
            return 1;
        if (this.year < that.year)
            return -1;
        if (this.year > that.year)
            return 1;
        return 0;
    }
}
