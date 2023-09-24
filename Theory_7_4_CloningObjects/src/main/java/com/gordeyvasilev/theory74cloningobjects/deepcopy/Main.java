package com.gordeyvasilev.theory74cloningobjects.deepcopy;

import java.util.Date;

public class Main {
    public static void main(String[] arg) throws Exception  {
        Date dd = new Date( System.currentTimeMillis() );
        Student stud1 = new Student(dd, 201);

        System.out.println(stud1);
        Student stud2 = (Student) stud1.clone();
        System.out.println(stud2);

        // The result is the same as in the previous example, however if you look at storing objects in memory,
        // we will find that in this example the two references refer to two different objects.
    }
}