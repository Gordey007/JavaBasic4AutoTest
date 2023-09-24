package com.gordeyvasilev.theory72interfaces.example1;

public class Main {
    public static void main(String[] args) {
        // starting with Java 8 - methods with implementation (static and default).

        //  An interface is a contract that describes how several objects interact with each other.

        /**
         * In Java, interfaces are a reference type, which is similar to a class. However, the interface may contain:
         * - only immutable fields;
         * - declarations of methods (abstract methods) and nested types;
         * - starting from Java 8 - methods with implementation (static and default).
         */
        System.out.println("Hello world!");

        /**
         * One common example of an interface is the interaction of a person with a standard door: one object in this
         * example is a person, the second object is a door. The interface in this case is a door handle.
         * A person, knowing how to interact with one handle and open a door with its help, can easily cope
         * with opening another door. In this case, the door handle creates a layer of abstraction on top of the door,
         * and the person does not care about the size of the door, its location, or its manufacturer. Result:
         * two objects, a person and a door, interact with each other through the door-handle interface.
         * A person knows how to work with this interface, and this knowledge is enough to open doors with a handle,
         * regardless of the specific details.
         */

        /**
         * Interfaces in this case allow us to abstract away from implementation details by defining
         * the minimum number of methods required for the correct interaction of modules with each other,
         * and adding these methods to interfaces. Thus, having defined the interfaces between modules,
         * we get weak coupling between classes, we abstract from implementation details
         * and reduce the risk of disrupting the functionality of related modules.
         */


        /**
         * Interface
         * - Describes behavior only
         * - Can only contain fields that are public static final
         * - A class can implement several interfaces
         * - Used in cases where it defines a contract between unrelated classes
         * - A class that implements interfaces simply extends its functionality
         */

        /**
         * Abstract class
         * - Describes the state and behavior
         * - May contain fields that describe the characteristics of the object
         * - A class inherits only one abstract class
         * - Used only in cases where the relationship between an abstract class and a concrete one can be expressed
         * by is-a relation
         * - The descendant class of an abstract class becomes part of the hierarchy and is included in a family of similar objects
         */

        /** is-a:
         * Inheritance is a property that allows you to create a new class based on an existing one with partial
         * or complete borrowing characteristics. This allows you to arrange classes in a hierarchy that represents
         * relations of type
         */
    }
}