package com.gordeyvasilev;

public class Main {
    public static void main(String... args) {
        Cat kitty = new Cat();
        // collarStatus = false
        System.out.println("Old value of \"collarStatus\" in \"main\" method is:" + kitty.isCollarStatus()); // false #1
        // Set true in CollarStatus field
        adopt(kitty); // #2; #3
        // The value of the collarStatus field has changed in the adopt method
        System.out.println("New value of \"collarStatus\" in \"main\" method is:" + kitty.isCollarStatus()); // true #4


        VarArg tstvarg = new VarArg();

        int[] ints = {1, 2, 3};
        int a = 1, b = 2, c = 3;

        System.out.println(tstvarg.calcSum());
        System.out.println(tstvarg.calcSum(3));
        System.out.println(tstvarg.calcSum(55, 66));
        System.out.println(tstvarg.calcSum(77, 55, 33, 11, 99));
        System.out.println(tstvarg.calcSum(ints));
        System.out.println(tstvarg.calcSum(a, b, c));

        System.out.println(tstvarg.calcSumStr("Hi", a, b, c));
    }


    /**
     * Changes the value in the "collarStatus" field of the "Cat" object.
     * <br>
     * Returns nothing.
     */
    public static void adopt(Cat cat) {
        System.out.println("Old value of \"collarStatus\" in \"adopt\" method is:" + cat.isCollarStatus()); // false #2
        cat.setCollarStatus(true);
        System.out.println("New value of \"collarStatus\" in \"adopt\" method is:" + cat.isCollarStatus()); // true #3
    }
}