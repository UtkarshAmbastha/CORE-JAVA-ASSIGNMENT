//QUESTION ---- 05

package com.CoreJava;
import java.util.*;

public class FirstFactorial {

    int firstFactorial(int num){
        if (num != 1){
            return num * firstFactorial(num - 1);
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check first factorial for: ");

        FirstFactorial f = new FirstFactorial();
        System.out.println(f.firstFactorial(sc.nextInt()));


    }
}
