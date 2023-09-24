package com.gordeyvasilev.theory72interfaces.example3;

public class Demo3 {
    public static void main(String[] args) {
        SomeClass obj = new SomeClass();

        System.out.println( obj.someMethod() );
        System.out.println();


        System.out.println( ( (Interface2)obj).someMethod() );
        System.out.println( ( (Interface1)obj).someMethod() );
        System.out.println();

        // you cannot access a field directly without specifying which interface you are referring to
        // System.out.println( obj.someField ); // Error

        // the field can be accessed by casting the object to one of the interfaces
        System.out.println( ( (Interface1)obj).someField );
        // the field can be accessed as a static element of one of the interfaces (via the interface name)
        System.out.println( Interface1.someField );
        System.out.println();

        System.out.println( ( (Interface2)obj).someField );
        System.out.println( Interface2.someField );

    }
}
