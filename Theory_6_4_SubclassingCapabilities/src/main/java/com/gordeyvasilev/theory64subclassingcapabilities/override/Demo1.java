package com.gordeyvasilev.theory64subclassingcapabilities.override;

public class Demo1 {
    public static void main(String[] args) {
        Base base = new Base();
        Derived obj = new Derived();
        base.show();
        obj.show();

        System.out.println("\n");
        Derived2 obj2 = new Derived2();
        obj2.show();
    }
}
