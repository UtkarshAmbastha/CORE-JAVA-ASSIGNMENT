package com.CoreJava;

import java.util.*;

public class CoffeeShop {

    static String str;
    static int Price;
    static int token_no;

    void Cashier(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Abraco Coffee Shop");
        System.out.println("Our Special Coffee's for today are: ");
        System.out.println("Black Coffee \t Price = 150/- \n" +
                "Cappuccino \t Price = 170/- \n" +
                "Cold Coffee \t Price = 180/- \n" +
                "Regular Coffee \t Price = 155/- ");

        System.out.println("Please enter the name of the coffee of your choice :");
        str = sc.nextLine();
        System.out.println("Your bill is of ["+str+"]=");
        Price = sc.nextInt();
    }
    void Customer () throws InterruptedException {
        if ((Objects.equals(str, "Black Coffee")) && (Price == 150)) {
            token_no = 102;

            System.out.println("Your token no is :" + token_no);
            System.out.println("Yay!! Payment Successful\nPlease wait while we prepare your order:");
            Thread.sleep(5000);

        } else if ((Objects.equals(str, "Cappuccino")) && (Price == 170)) {
            token_no = 202;

            System.out.println("Your token no is :" + token_no);
            System.out.println("Yay!! Payment Successful\nPlease wait while we prepare your order:");
            Thread.sleep(5000);

        } else if ((Objects.equals(str, "Cold Coffee")) && (Price == 180)) {
            token_no = 302;

            System.out.println("Your token no is :" + token_no);
            System.out.println("Yay!! Payment Successful\nPlease wait while we prepare your order:");
            Thread.sleep(5000);

        } else if ((Objects.equals(str, "Regular Coffee")) && (Price == 155)) {
            token_no = 402;

            System.out.println("Your token no is :" + token_no);
            System.out.println("Yay!! Payment Successful\nPlease wait while we prepare your order:");
            Thread.sleep(5000);

        } else {
            System.out.println("Snap! Looks like something went wrong :(");
            System.out.println("Either you choose something which is not on the menu OR the amount you paid was insufficient : ");
        }
    }
    void Barista() {
        if (token_no == 102) {
            System.out.println("Thanks for waiting :) Here is your order [" + str + "] Have a nice day!!");
        }
        if (token_no == 202) {
            System.out.println("Thanks for waiting :) Here is your order [" + str + "] Have a nice day!!");
        }
        if (token_no == 302) {
            System.out.println("Thanks for waiting :) Here is your order [" + str + "] Have a nice day!!");
        }
        if (token_no == 402) {
            System.out.println("Thanks for waiting :) Here is your order [" + str + "] Have a nice day!!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CoffeeShop shop = new CoffeeShop();

        shop.Cashier();
        shop.Customer();
        shop.Barista();
    }

}
