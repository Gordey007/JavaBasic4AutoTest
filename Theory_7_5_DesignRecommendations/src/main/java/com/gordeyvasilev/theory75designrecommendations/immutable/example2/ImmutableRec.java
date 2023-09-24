package com.gordeyvasilev.theory75designrecommendations.immutable.example2;

// The record keyword provides another way to create a class with immutable instances.
// This class is a subclass of the java.lang.Record class and, of course, cannot inherit from another class,
// and also cannot act as a superclass itself.
// Implementation of interfaces is allowed.
// The record class can also declare its own methods.

// Such a record guarantees the immutability of the field values of the record and eliminates the need to create a constructor,
// methods equals(Object), hashCode() and toString(), which are generated automatically for record.
// Instead of getters, methods with the field name are generated. In this case, these are name() and id().
public record ImmutableRec(String name, int id) {
    void method() {}
}