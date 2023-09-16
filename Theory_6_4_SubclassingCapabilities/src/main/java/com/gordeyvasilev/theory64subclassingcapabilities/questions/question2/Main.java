package com.gordeyvasilev.theory64subclassingcapabilities.questions.question2;

public class Main {
    public static void main(String[] args) {
        Person person = new Student ();
        /**
         * Fields in Java are not polymorphic. This means that which field is accessed outside the body
         * of the subclass depends on the type of the reference, not the type of the object. In this case,
         * the Student class has two fields named version (its own and inherited). The field is accessed through
         * a reference to the Person superclass, so an inherited field is used.
         * */
        System.out.println(person.version);
    }
}
