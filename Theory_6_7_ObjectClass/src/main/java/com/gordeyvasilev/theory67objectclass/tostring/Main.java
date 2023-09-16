package com.gordeyvasilev.theory67objectclass.tostring;

public class Main {
    public static void main(String[] args) {
        Object obj = new Object();

        System.out.println(obj.toString());
        System.out.println(obj.hashCode());

        Employee employee = new Employee("John", "1337", "2007");
        Manager manager = new Manager("Smith", "404", "1961", "1337");

        System.out.println(employee);
        // super.toString() (employee) + toString() (manager).
        System.out.println(manager);

        String message = "\nThe current position is = " + manager;
        System.out.println(message);

        System.out.println(employee.equals(manager));
    }
}