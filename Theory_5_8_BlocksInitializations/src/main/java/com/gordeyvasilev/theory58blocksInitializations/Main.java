package com.gordeyvasilev.theory58blocksInitializations;

import java.util.Arrays;

/**
 * Class initialization order:
 * 1. Initialize class fields to default values.
 * 2. Initialization of class fields with expressions.
 * 3. Execution of static initialization blocks.
 * 4. If the program launch command specifies exactly this class to execute,
 * then the main method contained in it is executed. This method becomes the entry point.
 */

/**
 * Initialization order when creating an instance of a class:
 * 1. Recursive call and execution of constructors of superclasses - parent classes.
 * 2. Initialize instance fields with default or initial values.
 * 3. Execution of dynamic initialization blocks.
 * 4. Execution of the class constructor body.
 */

public class Main {
    /**
     * The first step of class initialization is automatic initialization with default values. For example,
     * the default value for the char type is the character 'NULL', that is, a non-renderable character. note
     * for example, describing a class with several static fields of different types. Let's leave them without explicit initialization
     * and display their values in the console.
     */
    static char ch;
    private static boolean bb;
    private static byte by;
    private static int ii;
    private static float ff;
    private static String str;
    private static int[] array;

    /**
     * The second step is to explicitly initialize the class fields to their initial values. By the way, each class field can
     * explicitly be initialized to some value if this initialization can be written on one line.
     * Consider an example of a class description with several static fields of different types. Let's initialize them at
     * declare our type as literals and display their values in the console.
     */
    private static char ch2 = 'A';
    private static boolean bb2 = true;
    private static byte by2 = -56;
    private static int ii2 = 1000;
    private static float ff2 = 1.25e-2F;
    private static String str2 = "Data";
    private static int[] array2 = {1, 2, 3, 4};


    // class field initialization expressions are inserted into the class initialization method in the order they appear in the source code.
    // As a consequence, previously declared fields of this class can be used in a class field initialization expression.
    private static byte by3 = 17;
    private static int ii3 = 24 * by3;


    // In a class field initialization expression, you can use a call to a static method.
    // The advantage is reuse if there is a need to use the method code more than once.
    private static int ii4 = initSt();

    private static int initSt() {
        System.out.println("Init ii value");
        return 1000;
    }


    private static char[] alph;
    /**
     * The third step is static initialization blocks. Used when some logic is required and
     * these are expected to be used only once (for example, error handling or loops for
     * filling complex data sets).
     * */

    /**
     * Restrictions:
     * the return statement cannot be used inside static initialization blocks
     * the keyword cannot be used inside static initialization blocks
     * an instance field cannot be referenced from static initialization blocks.
     * */

    /**
     * The Java compiler places the static initialization block code in the clinit() method after the fields are initialized
     * class expressions. The following example uses a static initialization block to initialize an array
     * characters in Latin letters (this needs to be done only once, so describe the method
     * not necessary
     * */

    /**
     * The execution system ensures that static initialization blocks are called in the order
     * in which they are given in the source code.
     * */

    /** The static initialization block is executed only once, when the class is initialized or loaded for the first time.*/
    static {
        alph = new char[26];
        int i = 0;
        for (char c = 'a'; i < alph.length; c++, i++) {
            alph[i] = c;
        }
    }


    /**
     * Fields with the final modifier are used to describe immutable properties of a class or object.
     * These are constants. Once initialized, the value of a final type variable cannot be changed. Consequently,
     * there are specifics for initializing such a field. The field must be initialized in one of three ways:
     * - on the same line in which it was declared
     * - in each constructor
     * - in one of the dynamic initialization blocks.
     */
    private final int XX = 50;
    private final int ZZ;
    private final int YY;

    {
        ZZ = 20;
        System.out.println("Dynamic section");
    }

    public Main() {
        YY = 30;
        System.out.println("Constructor");
    }

    // Note that if a class with an entry point to a Java program is initialized,
    // then the main() method is executed after the class fields are initialized.
    public static void main(String[] args) {
        /**
         * Initialization blocks are special class constructs that are designed to initialize class fields
         * (static) and instance fields. Initialization of a class begins with loading its description into RAM.
         * */

        /**
         * There are several initialization steps or initialization blocks:
         * - automatic initialization of class fields
         * - explicit initializers of class fields
         * - static initialization blocks
         * - dynamic initialization blocks/constructors.
         * */

        System.out.println("char: " + ch);
        System.out.println("boolean: " + bb);

        System.out.println("char: " + ch2);
        System.out.println("boolean: " + bb2);

        System.out.println("int: " + ii4);

        System.out.print(Arrays.toString(alph));

        Main obj = new Main();


    }
}
