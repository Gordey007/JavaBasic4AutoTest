package com.gordeyvasilev.theory83regularexpressions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // The Pattern class is needed to create patterns that are used to search in a line, file or other object,
        // containing a sequence of characters.

        // The Matcher class is needed to create templates that use special syntax.

        // To use regular expressions, you need to create an object of the Pattern class.
        // To do this, you must call one of the two available static compile() methods.

        // compile(String regex) takes one parameter - a string with a regular expression.
        // The method compiles the given regular expression into a template.
        // public static Pattern compile (String literal)

        // compile(String regex, int flags) принимает два параметра – строку с регулярным выражением
        // и целочисленное представление набора флагов (режимов сравнения шаблона с текстом).
        // Метод компилирует данное регулярное выражение в шаблон с заданными флагами.
        // public static Pattern compile (String literal, int flags)

        // CASE_INSENSITIVE:
        // Find case-insensitive matches for ASCII characters,
        // that is, the strings: "abc", "Abc" and "ABC" will be considered to match the regular expression "abc".
        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);

        /**
         * The Pattern class is a regular expression constructor.
         *
         * The compile method calls the private constructor of the Pattern class to create a compiled view.
         * A regular expression specified as a string must first be compiled into an instance of this class.
         * The resulting template can then be used to create a Matcher object,
         * which can match arbitrary sequences of characters with a regular expression.
         * This creates an instance of the template as an immutable object.
         *
         * When creating a template instance, the regular expression is checked for syntactic correctness.
         * If errors are found, a PatternSyntaxException will be thrown.
         */

        // The pattern() method returns the regular expression (string) from which the pattern was compiled.
        Pattern pattern2 = Pattern.compile("java");
        System.out.println(pattern2.pattern());


        // The matches (String regex, CharSequence input) method compiles the given regular expression
        // (given by regex) and tries to match the given input (input parameter) against it.
        System.out.println(Pattern.matches("J.+a", "Java"));
        System.out.println(Pattern.matches("J.+a", "Java JavaScript"));

        // The flags() method returns the values of the regular expression flags parameter,
        // which were set when it was created (0 is the default value, that is, the value was not set).
        Pattern pattern3 = Pattern.compile("abc");
        System.out.println(pattern3.flags());
        Pattern otherPattern = Pattern.compile("abc", Pattern.CASE_INSENSITIVE);
        System.out.println(otherPattern.flags());

        System.out.println(Pattern.compile("java").flags());

        // The Matcher class is used to match a regular expression against a sequence of characters.
        // A Matcher object is created by calling the Matcher(String regex, CharSequence input) constructor.
        // The input parameter is the sequence of characters to be matched against the regular expression.
        // The Matcher object can then be used to match the input against the regular expression.
        // The Matcher object can also be used to retrieve the results of the match.
        // The Matcher object can also be used to replace the matched text with a replacement string.
        // The Matcher object can also be used to find the start and end index of the match.
        // The Matcher object can also be used to find the start and end index of the match within the input.


        /**
         * The split (CharSequence text, int limit) method splits the given input sequence
         * text to an array of strings String. The array returned by this method contains each substring
         * an input sequence that ends with another subsequence,
         * matching this pattern, or ends with the end of the input sequence.
         * The limit parameter controls the number of times the template will be applied and therefore
         * affects the length of the resulting array.
         *
         * - If limit>0 – the template will be applied with a maximum of limit-1 times,
         * the length of the array will not exceed limit, and the last entry of the array will contain all input data,
         * except the last matched delimiter.
         * - If limit<0 – the template will be applied as many times as possible, and the array can have any length.
         * - If limit=0 – the template will be applied as many times as possible,
         * the array can be of any length, and trailing empty lines will be discarded.
         */
        String str1 = "One two,three!four;five six.seven";
        Pattern p1 = Pattern.compile("[ ,!;.]");
        String[] s1 = p1.split(str1);
        String[] s2 = p1.split(str1, 2);

        System.out.println("source line " + str1);
        for (String i : s1) System.out.println("lexeme: " + i);
        System.out.println("\n");
        for (String i : s2) System.out.println("lexeme: " + i);

        // The Matcher class performs many different operations to compare the source sequence with the template.
        // To do this, an object is created that is responsible for searching for matches
        // to the pattern and further processing the search results.

        String text = "This is my second java 45 project.\n" +
                "It is wonderful to learn polysemantics and arrays.\n" +
                "The weather is cold like it should be in winter, but we are all looking forward to spring.";
        // Two character words
        Pattern p = Pattern.compile("\\b[\\w]{2}\\b");
        Matcher m = p.matcher(text);

        while (m.find()) {
            int start = m.start();
            int end = m.end();
            System.out.println("Found matches " + text.substring(start, end) +
                    " from " + start + " to " + (end - 1) + " positions");
        }

        // The matches() method works like this: all text is compared with the pattern.
        // If it matches the pattern, then the method returns a Boolean true.
        Pattern p2 = Pattern.compile("\\w*");
        Matcher m2 = p2.matcher("Thanks!");
        System.out.println(m2.matches());

        Pattern p3 = Pattern.compile("\\w*");
        Matcher m3 = p3.matcher("Thanks!");
        System.out.println(m3.lookingAt());

        String text2 = "This is my second java 45 project.\n" +
                "It is wonderful to learn polysemantics and arrays.\n" +
                "The weather is cold like it should be in winter, but we are all looking forward to spring.";
        System.out.println("Before:\n" + text2);
        Pattern p4 = Pattern.compile("\\b[\\w]{2}\\b");
        Matcher m4 = p4.matcher(text2);

        // text2 = m.replaceFirst("lab2");
        text2 = m4.replaceAll("lab2");
        System.out.println("\nAfter:\n" + text2);


    }
}