package com.gordeyvasilev.practice510classes;

public class Practice_5_10_2_Line {
    int k, b;

    public Practice_5_10_2_Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Practice_5_10_2_Point intersection(Practice_5_10_2_Line other) {
        if (k == other.k) return null;
        int x = (other.b - b) / (k - other.k);
        return new Practice_5_10_2_Point(x, k * x + b);
    }
}
