package com.gordeyvasilev;

public class Main {
    public static void main(String[] args) {

        // Литерал null может быть назначен переменной любого ссылочного типа или приведен к любому ссылочному типу.
        String str1 = null;
        Car car1 = null;

        String str2 = (String) null;
        Car car2 = (Car) null;

        // Литерал null нельзя использовать с другими операторами отношений, например, < или >.
        System.out.println(null == null);
        System.out.println(car1 == null);
        System.out.println(car1 != car2);

        // При вызове метода экземпляра через ссылочную переменную со значением null,
        // произойдет ошибка времени исполнения - NullPointerException!
        try {
            car1.getCarModel();
        } catch (NullPointerException e) {
            System.out.println("\nNULL\n");
            System.out.println(e.getMessage());
        }
    }
}