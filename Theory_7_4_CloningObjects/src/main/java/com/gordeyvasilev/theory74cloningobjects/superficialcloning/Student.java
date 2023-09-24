package com.gordeyvasilev.theory74cloningobjects.superficialcloning;

import java.util.Date;

// The Cloneable interface contains no abstract methods.
// It is used as a marker interface to indicate to the system that objects of a certain class can be cloned.
public class Student implements Cloneable
{
    private Date yearSet;

    private Data year2;

    private int group;

    public Student(Date year, int group, int year2) {
        this.yearSet = year;
        this.group = group;
        this.year2 = new Data(year2);
    }

    public int getYear2() {
        return year2.getYear();
    }

    public void setYear2(int year2) {
        this.year2.setYear(year2);
    }

    public void setYear(int year) {
        this.yearSet = new Date(year);
    }

    public Date getYearSet() {
        System.out.println(yearSet.hashCode());
        return yearSet;
    }

    public String toString() {
        return "year = " + yearSet + ", group = " + group + "year2 = " + year2.getYear();
    }

    // How are these two objects stored in memory? There will be two objects of type Student,
    // however they will both refer to the same Date object,
    // because shallow cloning copied a reference, not the date object itself.
    // Shallow copies are simple and cheap and can usually be implemented by simply copying bits.

    // The clone() method is marked protected and cannot be called explicitly outside the class.
    // For the cloning mechanism to work correctly, you need to override the clone() method
    // and inside its implementation make a call to super.clone().
    public Object clone() throws CloneNotSupportedException {
        // Student stud = (Student) super.clone();
        // stud.yearSet = (Date) this.yearSet.clone();
        // stud.year2 = (Data) this.year2.clone();
        // return stud;

        return super.clone();
    }
}