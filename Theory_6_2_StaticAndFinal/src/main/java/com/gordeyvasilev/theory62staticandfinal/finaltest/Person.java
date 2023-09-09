package com.gordeyvasilev.theory62staticandfinal.finaltest;

import java.util.ArrayList;

public class Person {
    /**
     * Ссылочной переменной, объявленной как final, не может быть назначен другой объект.
     * Однако данные внутри объекта могут быть изменены.
     */
    private final ArrayList friends = new ArrayList<>();

    public ArrayList getFriends() {
        return friends;
    }

    public void addFriend(Person friend) {
        friends.add(friend);
    }
}