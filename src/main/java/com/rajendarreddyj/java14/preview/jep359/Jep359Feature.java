package com.rajendarreddyj.java14.preview.jep359;

/**
 * EP 359: Records (Preview)
 * A new class called record (aka data class), it is a final class, not abstract,
 * and all of its fields are final as well.
 * The record will automatically generate the tedious constructors, public get, equals(),
 * hashCode(), toString() during compile time.
 * <p>
 * P.S No setters, all fields are final.
 * A record or data class, create the class name and variables, and we can start using it.
 */
public class Jep359Feature {
    public static void main(String[] args) {

        Point p1 = new Point(10, 20);
        System.out.println(p1.x());         // 10
        System.out.println(p1.y());         // 20

        Point p2 = new Point(11, 22);
        System.out.println(p2.x());         // 11
        System.out.println(p2.y());         // 22

        Point p3 = new Point(10, 20);
        System.out.println(p3.x());         // 10
        System.out.println(p3.y());         // 20

        System.out.println(p1.hashCode());  // 330
        System.out.println(p2.hashCode());  // 363
        System.out.println(p3.hashCode());  // 330

        System.out.println(p1.equals(p2));  // false
        System.out.println(p1.equals(p3));  // true

        System.out.println(p1.equals(p3));  // Point[x=10, y=20]

    }

}

record Point(int x, int y) {
}