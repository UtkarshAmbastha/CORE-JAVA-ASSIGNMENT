package com.CoreJava;

import java.util.Scanner;

public class CreditCard
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 9 digit account no");
        int []arr=new int[9];
        int sum=0;
        for(int i=0;i<=8;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Sum of the elements are: "+sum);
        int checkDigit=sum%10;
        System.out.println(checkDigit);
        int [] newArr = new int[11];
        newArr = arr;
        for(int i=0;i<newArr.length;)
        {
            newArr[i+2]=checkDigit;
            break;
        }
        if(arr!=newArr)
        {
            System.out.println("Okay");
        }else {
            System.out.println("Not Okay");
        }
    }
}
