// In Java packages (packages) are used for warning with names, for access control,
// to facilitate the search, finding and use of classes, interfaces, enumerations and annotations.
package com.gordeyvasilev.theory59packages;

// Static constants and static class methods can be used
// without class membership by using static imports, as shown below.

/**
 * При вызове статических методов и обращении к статическим константам приходится использовать в качестве префикса
 * имя класса, что утяжеляет код и снижает скорость его восприятия.
 */

import static java.lang.Math.*;

import static java.lang.Math.E; // for one constant
import static java.lang.Math.cos; // for one method


public class Main {
    public static void main(String[] args) {
        System.out.println(2 * PI * 3);
        System.out.println(floor(cos(PI / 3)));

        System.out.println(E);
    }
}