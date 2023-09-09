package com.gordeyvasilev.theory54methods;

public class VarArg {

    /**
     * Такие методы называются методами переменной арности (varargs). Методы переменной арности используются в случае,
     * когда одно и тоже действие требуется выполнить над различным количеством значений одного типа.
     */
    public int calcSum(int... values) {
        int res = 0;
        for (int x : values) {
            res += x;
        }
        return res;
    }

    public String calcSumStr(String str, int... values) {
        int res = 0;
        for (int x : values) {
            res += x;
        }
        return str + "\n" + res;
    }

    public int calcSum3(int values) {
        return values + 1;
    }
}
