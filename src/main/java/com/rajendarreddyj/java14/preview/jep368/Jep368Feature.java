package com.rajendarreddyj.java14.preview.jep368;

/**
 * JEP 368: Text Blocks (Second Preview)
 * The first preview appeared in Java 13 – JEP 354, now added two more new escape sequences:
 * <p>
 * \<end-of-line> suppresses the line termination.
 * \s is translated into a single space.
 */
public class Jep368Feature {

    public static void main(String[] args) {

        String html = "<html>\n" +
                "   <body>\n" +
                "      <p>Hello, World</p>\n" +
                "   </body>\n" +
                "</html>\n";

        String java13 = """
                <html>
                    <body>
                        <p>Hello, World</p>
                    </body>
                </html>""";

        String java14 = """
                <html>
                    <body>\
                        <p>Hello, '\s' World</p>\
                    </body>
                </html>""";

        System.out.println(html);
        System.out.println(java13);
        System.out.println(java14);

    }
}
