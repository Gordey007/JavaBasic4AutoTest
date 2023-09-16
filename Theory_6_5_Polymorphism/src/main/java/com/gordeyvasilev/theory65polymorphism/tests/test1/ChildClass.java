package com.gordeyvasilev.theory65polymorphism.tests.test1;

class ChildClass extends ParentClass{
    public void parentMethod(int i) {
        System.out.println("parentMethod ChildClass" + i);
    }
    public void childMethod(int i) {
        System.out.println("childMethod ChildClass" + i);
    }

    public static void main(String[] args) {
        ParentClass quest = new ChildClass (); // 1
        quest.parentMethod(1); // 2
        // quest.childMethod(1); // 3 // Error
        ((ChildClass) quest).childMethod(1);

        // There will be no error on line 1, since there is a safe upward conversion.
        // The second line calls the polymorphic method. A compilation error will occur
        // if you try to call a method that belongs only to a subclass through a superclass reference through which
        // it is simply not accessible.
    }
}
