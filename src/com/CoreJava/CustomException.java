package com.CoreJava;

class InvalidAgeException extends Exception{
    public InvalidAgeException (String str){
        super(str);
    }
}

public class CustomException {
    static void validate(int age) throws InterruptedException{
        if (age < 18){
            throw new InterruptedException("Person cannot vote in upcoming elections");
        }
        else {
            System.out.println("You Can vote in the upcoming elections");
        }
    }

    public static void main(String[] args) {
        try {
            validate(17);
        }
        catch (InterruptedException ex){
            System.out.println("Exception occurred: " + ex);
        }
    }
}
