package com.gordeyvasilev;

import com.gordeyvasilev.finaltest.Person;

public class Main {
    public static void main(String[] args) {
        /**
         * Определен класс DemoStatic, содержащий только статические элементы. В методе main() класса DemoMain
         * показано обращение (взаимодействие) к полям и методу класса DemoStatic без создания его экземпляра,
         * так как в этом нет необходимости.
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
         * Поскольку метод addFriend() не меняет ссылку, а только изменяет состояние коллекции, то ошибки не происходит.
         * */
        man3.addFriend(man1);
        man3.addFriend(man2);
        System.out.println(man3.getFriends());
    }
}