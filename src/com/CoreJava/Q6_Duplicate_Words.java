package com.CoreJava;

public class Q6_Duplicate_Words {
    public static void main(String[] args) {

        String str = "Nory was a Catholic because her mother was a Catholic, and Nory’s mother was a Catholic because her father was a Catholic";
        int count;

        str = str.toLowerCase();

        String words [] = str.split(" ");

        System.out.println("Duplicate words in this string");
        for (int i = 0; i < words.length; i++){
            count = 1;

            for (int j = i + 1; j < words.length; j++){
                if (words[i].equals(words[j])){
                    count++;

                    words[j] = "0";
                }
            }

            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }
}
