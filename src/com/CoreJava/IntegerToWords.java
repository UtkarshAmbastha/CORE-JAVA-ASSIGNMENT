package com.CoreJava;

import java.util.Scanner;

class NumberInWords {
        String [] singleDigits = new String[] {
                "zero", "one", "two",   "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        String [] twoDigits = new String[] {
                "",          "ten",      "eleven",  "twelve",
                "thirteen",  "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"
        };

        String [] tensMultiple = new String[] {
                "",      "",      "twenty",  "thirty", "forty",
                "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        String [] powerOfTen = new String[] {
                "", "Thousand", "Million", "Billion" , "Trillion" , "Quadrillion" ,"Quintillion"
        };

        public String numberToWords (long digit) {
            if (digit == 0)
                return "Zero";
            String result = "";
            int i = 0;

            while (digit > 0) {
                if (digit % 1000 != 0) {
                    result = solve(digit % 1000) + powerOfTen[i] + " " + result;
                }
                digit /= 1000;
                i++;
            }
            return result.trim();
        }
        public String solve (long digit ) {
            if (digit == 0)
                return "";
            if (digit < 20) {
                return singleDigits[(int) (digit % 20)] + " ";

            }else if (digit < 100) {
                return tensMultiple[(int) (digit / 10)] + " " +solve(digit % 10);

            }else {
                return singleDigits[(int) (digit / 100)] + "Hundred" + solve(digit % 100);

            }

    }
}
public class IntegerToWords {
    public static void main(String[] args) {
        long n;
        NumberInWords num = new NumberInWords();
        Scanner sc = new Scanner(System.in);
        try {
            n = sc.nextLong();
        }
        finally {
            sc.close();
        }
        System.out.println(num.numberToWords(n));
    }
}
