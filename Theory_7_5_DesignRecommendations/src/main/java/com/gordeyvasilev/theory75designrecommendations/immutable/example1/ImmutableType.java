package com.gordeyvasilev.theory75designrecommendations.immutable.example1;

import java.util.Arrays;

public final class ImmutableType {
    private String name;
    private int id;

    // If a field of such an immutable class needs to declare a mutable type,
    // then you should ensure that the corresponding getter returns a copy or immutable object,
    // not a reference to an object. For example, if a field of such a class is declared as:
    private String[] strings;


    public ImmutableType(String name, int id, String[] strings) {
        this.name = name;
        this.id = id;
        this.strings = strings;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String[] getStrings() {
        return Arrays.copyOf(strings, strings.length);
    }

    // equals, hashCode, toString
}