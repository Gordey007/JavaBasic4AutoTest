package com.gordeyvasilev.theory67objectclass.hashcode;

public class Demo9 {
    public static void main(String[] arg) {
        Student stud1 = new Student("Peter", 5558956L, 20);
        Student stud2 = new Student("Ivan", 9876543L, 18);
        Student stud3 = new Student("Dasha", 5558956L, 20);
        Student stud4 = new Student("Ivan", 9876543L, 18);

        System.out.println(stud1.hashCode());
        System.out.println(stud2.hashCode());
        System.out.println(stud3.hashCode());
        System.out.println(stud4.hashCode());
    }
}
