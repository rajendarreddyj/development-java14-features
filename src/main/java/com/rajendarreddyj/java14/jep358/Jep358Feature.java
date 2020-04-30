package com.rajendarreddyj.java14.jep358;

import java.util.Locale;

/**
 * Improved the description of NullPointerExceptions by telling which variable was null.
 * Add -XX:+ShowCodeDetailsInExceptionMessages option to enable this feature.
 */
public class Jep358Feature {
    public static void main(String[] args) {

        String input = null;
        String result = showUpperCase(input); // NullPointerException
        System.out.println(result);

    }

    public static String showUpperCase(String str) {
        return str.toUpperCase(Locale.US);
    }
}
