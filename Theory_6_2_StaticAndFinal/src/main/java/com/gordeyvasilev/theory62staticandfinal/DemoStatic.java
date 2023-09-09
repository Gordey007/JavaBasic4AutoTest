package com.gordeyvasilev.theory62staticandfinal;

public class DemoStatic {
    public static int x;
    public static int y;
    public int y2;

    /**
     * Ограничения для статических методов:
     * <p>
     * - статические методы могут вызывать напрямую только статические методы
     * - статические методы могут обращаться напрямую только к статическим полям или к своим параметрам
     * к статическим методам нельзя обратиться через ссылки this и super
     * - статические методы могут перегружаться нестатическими и наоборот.
     */
    public static int lengthVector() {
        // System.out.println(y2); // Error
        // lengthVector(3); // Error
        return (int) Math.sqrt(x * x + y * y);
    }

    public int lengthVector(int x) {
        // System.out.println(y2); // Error
        return (int) Math.sqrt(x * x + y * y);
    }
}
