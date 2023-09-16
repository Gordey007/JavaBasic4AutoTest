package com.gordeyvasilev.theory55this;

public class Student {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @note because the variable name is different, then this is not needed
     */
    public void setFirstName2(String name) {
        firstName = name;
    }
}
