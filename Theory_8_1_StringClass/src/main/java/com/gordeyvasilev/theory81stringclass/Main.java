package com.gordeyvasilev.theory81stringclass;

public class Main {
    public static void main(String[] args) {
        String s = "Hello world!";
        String s2 = "hello world!";
        String s3 = s2;
        System.out.println(s == s2);

        String s4 = new String(s2);

        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        String str = "Software And Hardware!";
        int start = 9;
        int end = 12;
        char[] dst = new char[end - start];
        str.getChars(start, end, dst, 0);
        System.out.println(dst);

        String str1 = "Java";
        String str2 = "java";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));


        String str1_2 = "Learn Java";
        String str2_2 = "Cool avatar!";
        // regionMatches() - This method compares specific substrings within two strings.
        boolean result = str1_2.regionMatches(7, str2_2, 5, 3);
        System.out.println(result);


        String str1_3 = "JavaDoc";
        String str2_3 = "World";
        String str3_3 = "Java";

        // The int compareTo(String anotherString) and int compareToIgnoreCase(String str) methods allow you
        // to compare two strings. Also, the results of these methods can answer the question,
        // which of two strings is larger in lexicographical order, and which one is smaller.

        // Lexicographical order means, for example, that string "A" is smaller than string "B"
        // since the character 'A' comes before the character 'B' in the alphabet.
        // If the first characters of the strings are equal,
        // then the following characters are taken into account.
        System.out.println(str1_3.compareTo(str2_3));
        System.out.println(str1_3.compareTo(str3_3));

        /**
         * %d – integer (int, long, ...)
         * %f – real number (float, double)
         * %s – string
         * %c – symbol
         * %% - symbol %
         * %t – date/time
         * %b – boolean value
         */
        String formatString = "We are printing double variable (%f), string (\"%s\") and integer variable (%d).";
        System.out.println(String.format(formatString, 0.7, "Java", 10));
        System.out.printf((formatString) + "%n", 0.7, "Java", 10);

        String str1_4 = new String("Paul");
        String str2_4 = new String("Paul");
        System.out.println(str1_4 == str2_4);
        System.out.println(str1_4 == "Paul");

        String str1_5 = "Paul";
        String str2_5 = "Paul";
        System.out.println(str1_5 == str2_5);
        System.out.println(str1_5 == "Paul");
    }
}