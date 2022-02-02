package com.CoreJava;
import java.util.Scanner;

public class KeyBoardInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        do{

            System.out.println("Enter a Word: ");
            word = sc.next();
            int len = word.length();
            if(word.charAt(0) == word.charAt(len-1)){
                System.out.println("First and last character of given word is same");
            }
            else{
                System.out.println("First and last character of given word is not same");
            }
        }while(!word.equals("Done"));
    }
}
