//QUESTION ---- 4

package com.CoreJava;

import java.util.Scanner;

public class Q4_Reverse_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to reverse: ");

        String str = sc.nextLine();

        String rev_String = "";

        for (int i = str.length() - 1; i >= 0; --i){

            rev_String += str.charAt(i);
        }

        System.out.println("Reversed String Is: ");

        System.out.println(rev_String);
    }
}
