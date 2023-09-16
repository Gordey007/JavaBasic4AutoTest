package com.gordeyvasilev.theory64subclassingcapabilities.override;

public class  Derived extends Base {
    /** *
     * When overriding a method, you can change its access modifier to a broader one. For example,
     * if an inherited superclass method had access type protected, then when overridden, it can be replaced with public.
     */
    @Override
    public void show() {
        System.out.println("Derived");
    }
}