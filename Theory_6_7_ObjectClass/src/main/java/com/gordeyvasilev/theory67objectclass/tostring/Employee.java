package com.gordeyvasilev.theory67objectclass.tostring;

public class Employee {

    private String name;
    private String salary;
    private String hireDay;

    public Employee(String name, String salary, String hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getHireDay() {
        return hireDay;
    }

    public void setHireDay(String hireDay) {
        this.hireDay = hireDay;
    }


    public String toString() {
        return getClass().getName()
                + " [name=" + name
                + ", salary=" + salary
                + ", hireDay=" + hireDay
                +"]";
    }
}
