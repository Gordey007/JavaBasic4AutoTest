package com.gordeyvasilev.theory62staticandfinal;

/**
 * В классе CustomMath нет полей экземпляра. Методы получают данные для работы через свои параметры, то есть класс
 * не имеет состояния. В этом случае методы лучше описать как статические.
 */
public class CustomMath {
    /**
     * Статические поля класса:
     * <p>
     * создаются при первом обращении к классу
     * создаются в единственном числе
     * существуют независимо от экземпляров класса
     * допускают обращение к ним до создания экземпляра класса.
     */
    public static int percent;

    public static int add(int x, int y) {
        return x + y + percent;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }
}