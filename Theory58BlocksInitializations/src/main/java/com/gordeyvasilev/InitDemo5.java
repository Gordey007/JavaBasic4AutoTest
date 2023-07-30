package com.gordeyvasilev;

import java.util.Arrays;

public class InitDemo5 {
    // Fields with the final modifier are used to
    // describe immutable properties of a class or object (constant).
    private static final char[] alpha;

    // In the following example, a static initialization block
    // is used to initialize an array of characters with
    // Latin characters (this only needs to be done once,
    // so there is no need to describe the method)
    static {
        alpha = new char[26];
        int i = 0;
        for (char c = 'a'; i < alpha.length; c++, i++) {
            alpha[i] = c;
        }
    }

    public static void main(String[] arg) {
        System.out.print(Arrays.toString(alpha));
    }
}
