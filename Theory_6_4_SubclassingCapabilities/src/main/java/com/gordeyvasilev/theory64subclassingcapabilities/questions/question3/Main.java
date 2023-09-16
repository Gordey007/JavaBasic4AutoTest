package com.gordeyvasilev.theory64subclassingcapabilities.questions.question3;

public class Main {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan("super vision", "Clark Kent");
        /**
         * The skills field will be initialized with the value passed to the constructor of the SuperMan class.
         * The name field of the Person superclass received a default value because the value was not passed
         * from the SuperMan constructor to the superclass constructor.
         */
        System.out.print(superMan.showInfo());
    }
}
