package com.gordeyvasilev.theory74cloningobjects.superficialcloning;

import java.util.Date;

public class Data implements Cloneable{
    private int year;

    Data(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public Data clone() throws CloneNotSupportedException {
        return (Data) super.clone();
    }
}
