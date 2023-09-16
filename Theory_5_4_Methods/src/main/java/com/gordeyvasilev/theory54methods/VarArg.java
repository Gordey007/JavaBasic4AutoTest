package com.gordeyvasilev.theory54methods;

public class VarArg {

    /**
     * Such methods are called variable arity methods (varargs). Variable arity methods are used
     * when the same action needs to be performed on different numbers of values of the same type.
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
