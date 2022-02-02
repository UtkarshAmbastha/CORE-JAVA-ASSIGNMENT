// QUESTION --- 01

package com.CoreJava;

import java.util.Scanner;

public class Q1_String_pop {

//    Function to return true if a given string contain the string 'pop', but the middle 'o' also may other character.

    public static boolean pop (String str){

        int len = str.length();

        for (int i = 0; i < len - 2; i++) {
            if (str.charAt(i) == 'p' && str.charAt(i + 2) == 'p')
                return true;
        }
        return false;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to check");

        String str1 = sc.nextLine();
        System.out.println(pop(str1));
    }

    }

