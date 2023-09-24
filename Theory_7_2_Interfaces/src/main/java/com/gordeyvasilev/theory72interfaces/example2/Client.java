package com.gordeyvasilev.theory72interfaces.example2;

public class Client extends Base implements Call {
    public void call() {
        System.out.println ("call() of class Client: NUM = " + NUM);
        super.call();
    }
}