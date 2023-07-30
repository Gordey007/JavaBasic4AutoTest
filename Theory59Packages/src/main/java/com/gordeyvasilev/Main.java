// In Java packages (packages) are used for warning with names, for access control,
// to facilitate the search, finding and use of classes, interfaces, enumerations and annotations.
package com.gordeyvasilev;

// Static constants and static class methods can be used
// without class membership by using static imports, as shown below.
import static java.lang.Math.*;


public class Main {
    public static void main(String[ ] args) {
        System.out.println(2 * PI * 3);
        System.out.println(floor(cos(PI / 3)));
    }
}