package com.gordeyvasilev.theory62staticandfinal.finaltest;

import java.util.ArrayList;

public class Person {
    /**
     * A reference variable declared as final cannot be assigned to another object.
     * However, the data inside the object can be changed.
     */
    private final ArrayList friends = new ArrayList<>();

    public ArrayList getFriends() {
        return friends;
    }

    public void addFriend(Person friend) {
        friends.add(friend);
    }

    public void addFriend2(final Person friend) {
        //System.out.println("friend");
        friends.add(friend);
    }
}