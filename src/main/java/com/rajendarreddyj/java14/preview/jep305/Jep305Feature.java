package com.rajendarreddyj.java14.preview.jep305;

/**
 * JEP 305: Pattern Matching for instanceof (Preview)
 */
public class Jep305Feature {

    public static void main(String[] args) {
        java13InstanceOf("jdk13");
        java14InstanceOf("jdk14");
    }

    private static void java13InstanceOf(Object obj) {
        if (obj instanceof String) {        // instanceof
            String s = (String) obj;          // cast
            if ("jdk13".equalsIgnoreCase(s)) {
                System.out.println("string");
            }
        } else {
            System.out.println("not a string");
        }
    }

    private static void java14InstanceOf(Object obj) {
        if (obj instanceof String s) {      // instanceof, cast and bind variable in one line.
            if ("jdk14".equalsIgnoreCase(s)) {
                System.out.println("string");
            }
        } else {
            System.out.println("not a string");
        }
    }
}
