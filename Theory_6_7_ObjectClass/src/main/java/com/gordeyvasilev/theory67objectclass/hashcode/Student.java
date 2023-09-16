package com.gordeyvasilev.theory67objectclass.hashcode;

public class Student {
    private String name;
    private long phone;
    private int age;

    public Student(String name, long phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + (int) (phone ^ (phone >>> 32));
        result = 31 * result + age;
        return result;
    }
}
