package com.gordeyvasilev.theory64subclassingcapabilities.questions.question1;

public class Boy {
    private int age = 19;
    private String name = "Michael";

    public static void main(String[] args) {
        Boy b = new Boy();
        // Nothing will be printed to the console, since there is no System.out.print(b)
        // or System.out.print(b.toString()) operator, which is actually the same thing.
        b.toString();
    }
    public String toString() {
        return name + " is " + age + " years old";
    }
}