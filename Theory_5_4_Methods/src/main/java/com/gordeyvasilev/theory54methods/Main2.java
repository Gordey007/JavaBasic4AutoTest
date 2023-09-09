package com.gordeyvasilev.theory54methods;

public class Main2 {
    public static void main(String... args) {
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

        System.out.println(tstvarg.calcSum3(3));
//        System.out.println(tstvarg.calcSum3());

    }
}