package com.gordeyvasilev;

public class Practice_5_10_2_Point {
    private final int x;
    private final int y;

    public Practice_5_10_2_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d;%d)", x, y);
    }
}
