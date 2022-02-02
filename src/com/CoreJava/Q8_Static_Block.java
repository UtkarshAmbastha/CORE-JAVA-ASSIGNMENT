package com.CoreJava;

public class Q8_Static_Block {

    static String firstName = "Utkarsh";
    static String lastName = "Ambastha";
    static int age = 21;
    private static void print()
    {
        System.out.println("I'm from static method");
    }

    public static void main(String[] args) {
        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Age: " + age);
        print();
    }
    static {
        System.out.println("I'm from static block");
    }
}
