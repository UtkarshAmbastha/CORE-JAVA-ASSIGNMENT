package com.CoreJava;

import java.util.*;

public class Occurrences {
    public static void main(String[] args) {
        System.out.println("enter the keyword to check the occorance of a Character");

        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray())
        {
            if (map.containsKey(ch))
            {
                int val = map.get(ch);
                map.put(ch, val + 1);
            }
            else
            {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }
}
