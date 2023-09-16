package com.gordeyvasilev.theory65polymorphism.cast;

public class Main {
    public static void main(String[] arg) {
        Cat cat = new BritishCat();
        BritishCat cat2 = (BritishCat) cat;
        // However, if the Cat reference is cast to the PersianCat type,
        // we will receive a runtime error - ClassCastException.
        // This happens because the BritishCat and PersianCat types are on different inheritance branches.
        // PersianCat cat3 = (PersianCat)cat; // Error

        // The instanceof operator returns true if the RelationalExpression is not null and can be cast
        // to a ReferenceType without throwing a ClassCastException (that is, if the object is an object of this class,
        // or one of its subclasses, or one of its superclasses). Otherwise, the result is false.
        if (cat instanceof PersianCat) {
            System.out.println("Persian cat!");
            PersianCat сat3 = (PersianCat) cat;
        } else System.out.println("Not Persian cat!");


        Cat cat3_1 = new PersianCat();
        if (cat3_1 instanceof PersianCat) {
            System.out.println("Persian cat!");
            PersianCat сat3 = (PersianCat) cat3_1;
        } else System.out.println("Not Persian cat!");

        // The result of applying this operator to a null reference is always false,
        // because null cannot be assigned to any type.
        Cat catNull = null;
        if (catNull instanceof PersianCat) {
            System.out.println("Persian cat!");
            PersianCat сat3 = (PersianCat) cat3_1;
        } else System.out.println("Not Persian cat!");
    }
}