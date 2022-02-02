package com.CoreJava;

public class TryCatch {
    public static void main(String[] args) throws Exception {

        try {
            System.out.println("If you see me I'm from try block");

            throw new NullPointerException("Null Occurred");
        }
        catch (ArithmeticException e) {
            System.out.println("Hey there I'm from catch block");
        }
        catch (NullPointerException e) {
            System.out.println("You seeing me again ;) I'm still from catch block");
        }
        finally {
            System.out.println("I'm from finally block");
        }
        System.out.println();
        System.out.println("I'm off..... This ends here.");

    }
}
