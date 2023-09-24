package com.gordeyvasilev.theory74cloningobjects.superficialcloning;

import java.util.Date;

public class Main {
    public static void main(String[] arg) throws Exception  {
        Date dd = new Date( System.currentTimeMillis() );
        Student stud1 = new Student(dd, 201, 2023);

        System.out.println(stud1);

        Student stud2 = (Student) stud1.clone();
        System.out.println(stud2);

//        Student stud3 = stud1;
//        System.out.println(stud3);

        // As a result of executing this program, we received a CloneNotSupportedException error.
        // This happened because it is not enough to override the clone() method.
        // It is also necessary to indicate that such a process is possible.
        // The class must also implement the Cloneable interface.

//        stud1.setYear(dd.getYear());

        stud1.setYear2(1997);
        System.out.println("stud1");
        System.out.println(stud1);

        System.out.println("stud2");
        System.out.println(stud2);

//        System.out.println("stud3");
//        System.out.println(stud3);
//
//        System.out.println();
//        stud1.getYearSet();
//        stud2.getYearSet();
//        stud3.getYearSet();
    }
}