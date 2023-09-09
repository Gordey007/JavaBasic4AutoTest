package com.gordeyvasilev;

public class Student {
    private String firstName;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**@note т.к. имя переменной отличается, то this не нужен */
    public void setFirstName2(String name) {
        firstName = name;
    }
}
