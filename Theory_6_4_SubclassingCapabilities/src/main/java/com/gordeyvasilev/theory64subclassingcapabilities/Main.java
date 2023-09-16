package com.gordeyvasilev.theory64subclassingcapabilities;

public class Main {
    public static void main(String[] args) {

        /**
         * Rule 3: If a subclass's constructor does not explicitly call any of the superclass's constructors,
         * then the superclass's default constructor is automatically called.
         *
         * Rule 4: If the superclass has no default constructor and the subclass's constructor does not explicitly
         * call any other superclass constructor, the Java compiler will generate an error message.
         * */

        BritishCat Cat = new BritishCat();
        System.out.println();
        BritishCat Cat2 = new BritishCat("Mulberry");
        System.out.println();
        BritishCat2 Cat3 = new BritishCat2("Mulberry");
        System.out.println();
        // BritishCat3 Cat4 = new BritishCat3("Mulberry"); // Error

        /**
         * The final keyword can be used to break a chain of inheritance. In other words,
         * you can prevent a class from inheriting: create an immutable class. To do this, use the following syntax:
         * <code>
         *     public final class Cat {
         *          //...
         *      }
         *      public class BritishCat extends Cat {
         *          //...
         *      }
         * </code>
         *
         * A compilation error will occur because inheritance from the Cat class is not allowed.
         * */
    }
}