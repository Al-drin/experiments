package org.example;

public class ReplaceFileExtension {
    public static void main(String[] args) {
        String filename = "dupa.txt";

        System.out.println("Original filename: " + filename);

        int index = filename.lastIndexOf('.');
        String name = filename.substring(0, index);


        System.out.println(name + ".nex");
    }
}
