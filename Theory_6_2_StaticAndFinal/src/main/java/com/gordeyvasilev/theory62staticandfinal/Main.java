package com.gordeyvasilev.theory62staticandfinal;

import com.gordeyvasilev.theory62staticandfinal.finaltest.Person;
import com.gordeyvasilev.theory62staticandfinal.finaltest.Person;
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();

        person.addFriend2(person2);
        /**
         * The DemoStatic class is defined, containing only static elements. In the main() method of the DemoMain class
         * shows access (interaction) to the fields and method of the DemoStatic class without creating an instance of it,
         * since this is not necessary.
         * */

        DemoStatic.x = 3;
        DemoStatic.y = 4;
        System.out.println("length = " + DemoStatic.lengthVector());

        DemoStatic demoStatic = new DemoStatic();
        System.out.println("length = " + demoStatic.lengthVector(3));


        Person man1 = new Person();
        Person man2 = new Person();
        Person man3 = new Person();
        /**
         * Since the addFriend() method does not change the link, but only changes the state of the collection, no error occurs.
         * */
        man3.addFriend(man1);
        man3.addFriend(man2);
        System.out.println(man3.getFriends());
    }
}