package com.gordeyvasilev.theory72interfaces.example2;

public class Demo2 {
    public static void main(String[] args) {
        Call object = new Client();

        // the overridden call() method of the Client class is called,
        // which in turn calls the inherited call() method of the Base class.
        object.call();
    }
}
