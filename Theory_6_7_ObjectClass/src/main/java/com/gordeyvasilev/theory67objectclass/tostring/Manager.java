package com.gordeyvasilev.theory67objectclass.tostring;

public class Manager extends Employee{
    private String bonus;

    public Manager(String name, String salary, String hireDay, String bonus) {
        super(name, salary, hireDay);
        this.bonus = bonus;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String toString()    {
        return super.toString()
                + " [bonus=" + bonus
                + "]";
    }
}
