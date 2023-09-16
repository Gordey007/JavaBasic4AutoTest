package com.gordeyvasilev.theory67objectclass.equals;

public class Point2 {
    protected int x;
    protected int y;
    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }


    /**
     * There will be a problem when running this code. However, starting with Java SE 5.0, it became possible
     * to insure against such an error. To do this, you need to indicate that the method being developed is intended
     * to replace the corresponding superclass method. The @Override handle is used for this purpose
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        // It is necessary to compare the classes this and obj. If the semantics of the check can change in a subclass,
        // then the getClass() method should be used.
        if (this.getClass() != obj.getClass()) return false;

        // If the verification principle remains valid for all subclasses, then the instanceof operation should be used.
        // if (!(obj instanceof NameClass)) return false;

        Point2 other = (Point2) obj;

        return this.x == other.x && this.y == other.y;
    }

    // Error.
    // If the verification principle remains valid for all subclasses, then the instanceof operation should be used.
    // @Override
    // public boolean equals(Point2/Object obj){
    //    return true;
    // }

}
