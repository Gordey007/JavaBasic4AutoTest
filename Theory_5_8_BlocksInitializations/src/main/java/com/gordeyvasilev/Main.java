package com.gordeyvasilev;
import java.util.Arrays;

/**
 * Порядок инициализации класса:
 * 1. Инициализация полей класса в значения по умолчанию.
 * 2. Инициализация полей класса выражениями.
 * 3. Выполнение статических блоков инициализации.
 * 4. Если команда запуска программы указывает именно этот класс для выполнения,
 * то выполняется содержащийся в нем метод main. Этот метод становится точкой входа.
 *
 * */
/**
 * Порядок инициализации при создании экземпляра класса:
 * 1. Рекурсивный вызов и исполнение конструкторов суперклассов – родительских классов.
 * 2. Инициализация полей экземпляра значениями по умолчанию или начальными значениями.
 * 3. Выполнение динамических блоков инициализации.
 * 4. Выполнение тела конструктора класса.
 * */

public class Main {
    /**
     * Первый шаг инициализации класса – это автоматическая инициализация значениями по умолчанию. Например,
     * значение по умолчанию для типа char – это символ ‘NULL’, то есть неотображаемый символ. Обратите внимание
     * на пример описания класса с несколькими статическими полями различных типов. Оставим их без явной инициализации
     * и отобразим в консоль их значения.
     * */
    static char ch;
    private static boolean bb;
    private static byte by;
    private static int ii;
    private static float ff;
    private static String str;
    private static int[] array;

    /**
     * Второй шаг – это явные инициализаторы полей класса в их начальные значения. К слову, каждое поле класса может
     * явно быть проинициализировано некоторым значением, если эту инициализацию можно записать в одну строку.
     * Рассмотрим пример описания класса с несколькими статическими полями различных типов. Проинициализируем их при
     * объявлении литералами своего типа и отобразим в консоль их значения.
     * */
    private static char ch2 = 'A';
    private static boolean bb2 = true;
    private static byte by2 = -56;
    private static int ii2 = 1000;
    private static float ff2 = 1.25e-2F;
    private static String str2 = "Data";
    private static int[] array2 = {1, 2, 3, 4};


    // выражения инициализации полей класса вставляются в метод инициализации класса в порядке их появления в исходном коде.
    // Как следствие, в выражении инициализации поля класса можно использовать ранее объявленные поля этого класса.
    private static byte by3 = 17;
    private static int ii3  = 24 * by3;


    // В выражении инициализации поля класса можно использовать обращение к статическому методу.
    // Преимущество – повторное использование, если есть необходимость в использовании кода метода неоднократно.
    private static int ii4 = initSt();
    private static int initSt() {
        System.out.println("Init ii value");
        return 1000;
    }


    private static char[] alph;
    /**
     * Третий шаг – это статические блоки инициализации. Используются, когда требуется некоторая логика и
     * предполагается, что они будут использоваться только один раз (например, обработка ошибок или циклы для
     * заполнения сложных наборов данных).
     * */

    /**
     * Ограничения:
     * оператор return не может использоваться внутри статических блоков инициализации
     * ключевое слово this не может использоваться внутри статических блоков инициализации
     * на поле экземпляра нельзя ссылаться из статических блоков инициализации.
     * */

    /**
     * Компилятор Java размещает код статического блока инициализации в методе clinit() после инициализации полей
     * класса выражениями. В следующем примере статический блок инициализации используется для инициализации массива
     * символов литерами латинского алфавита (это требуется сделать только один раз, поэтому метод описывать
     * нет необходимости
     * */

    /**
     * Исполнительная система гарантирует, что статические блоки инициализации вызываются в том порядке,
     * в котором они приведены в исходном коде.
     * */

    /** Статический блок инициализации исполняется только один раз, когда класс инициализируется или загружается впервые.*/
    static {
        alph = new char[26];
        int i = 0;
        for (char c = 'a'; i < alph.length; c++, i++) {
            alph[i] = c;
        }
    }


    /**
     * Поля с модификатором final используются для описания неизменяемых свойств класса или объекта.
     * Это константы. После инициализации значение переменной типа final изменить нельзя. Как следствие,
     * существуют особенности инициализации такого поля. Поле должно быть инициализировано в одном из трех вариантов:
     * - в той же строке, в которой и объявлено
     * - в каждом конструкторе
     * - в одном из динамических блоков инициализаций.
     * */
    private final int XX = 50;
    private final int ZZ;
    private final int YY;
    {
        ZZ = 20;
        System.out.println("Dynamic section");
    }
    public Main() {
        YY = 30;
        System.out.println("Constructor");
    }

    // Обратите внимание: если инициализируется класс с точкой входа в Java-программу,
    // то метод main() выполняется после инициализации полей класса.
    public static void main(String[] args) {
        /**
         * Блоки инициализации – это специальные конструкции класса, которые предназначены для инициализации полей класса
         * (статических) и полей экземпляра. Инициализация класса начинается с загрузки его описания в оперативную память.
         * */

        /**
         * Существует несколько шагов инициализации или блоков инициализации:
         * - автоматическая инициализация полей классов
         * - явные инициализаторы полей класса
         * - статические блоки инициализации
         * - динамические блоки инициализации/конструкторы.
         * */

        System.out.println("char: " + ch);
        System.out.println("boolean: " + bb);

        System.out.println("char: " + ch2);
        System.out.println("boolean: " + bb2);

        System.out.println("int: " + ii4);

        System.out.print(Arrays.toString(alph));

        Main obj = new Main();


    }
}
