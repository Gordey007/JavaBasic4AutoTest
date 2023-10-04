package com.gordeyvasilev.theory83regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupMain {
    public static void main(String[] args) {
        String base = "java";
        groupView(base, "([a-z]*)([a-z]+)");
        groupView(base, "([a-z]?)([a-z]+)");
        groupView(base, "([a-z]+)([a-z]*)");
        groupView(base, "([a-z]?)([a-z]?)");
    }

    /**
* - In the first case, the first group includes all possible characters,
     * but this leaves a minimum number of characters for the second group.
     * - In the second case, the smallest number of characters is selected for the first group,
     * since a weak match is used.
     * - In the third case, the first group will correspond to the entire line,
     * and for the second there is not a single character left, since the second group uses a weak match.
     * - In the fourth case, the string does not match the regular expression,
     * since the least number of characters is selected for the two groups.
     * - Group 0 is always the same because it represents the entire expression.
     */
    private static void groupView(String base, String regExp) {
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(base);
        if (matcher.matches()) {
            System.out.println("group 1: " + matcher.group(1));
            System.out.println("group 2: " + matcher.group(2));
            System.out.println("main group: " + matcher.group() + " [end]");//eq.group(0)
        } else {
            System.out.println("nothing matches");
        }
    }
}
