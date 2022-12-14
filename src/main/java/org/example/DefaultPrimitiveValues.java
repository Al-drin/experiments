package org.example;

public class DefaultPrimitiveValues {

    static boolean boolVal;
    static byte byteVal;
    static int intVal;
    static short shortVal;
    static long longVal;
    static double doubleVal;
    static float floatVal;
    static char charVal;

    public static void main(String[] args) {

        System.out.println("Default primitive values:");
        System.out.println("boolean: " + boolVal + "\n"
                + "byte: " + byteVal + "\n"
                + "int: " + intVal + "\n"
                + "short: " + shortVal + "\n"
                + "long: " + longVal + "\n"
                + "double: " + doubleVal + "\n"
                + "float: " + floatVal + "\n"
                + "char: " + charVal + "\n"
            );
        System.out.println("Wait, is that char \\u0000? - " + (charVal == '\u0000' ? "yes" : "no") );
        System.out.println("Wait, is \\u0000 the same as Character.MIN_VALUE? - "
                + (charVal == Character.MIN_VALUE ? "yes" : "no") );
    }
}