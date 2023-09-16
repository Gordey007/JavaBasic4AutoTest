package com.gordeyvasilev.theory64subclassingcapabilities.questions.question3;

public class SuperMan extends Person {
    String skills;
    SuperMan(String skills, String name) {
        super();
        this.skills = skills;
    }
    public String showInfo() {
        return name + " has " + skills;
    }
}
