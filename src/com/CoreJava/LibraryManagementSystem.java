package com.CoreJava;
import java.io.Serializable;

public class LibraryManagementSystem {
    public static class Book implements Serializable{

        public int book_number;
        protected String title;
        private final String author;
        protected double price;

        public Book() {
            book_number = 0;
            title = null;
            author = null;
            price = 0;
        }

        public Book(int book_number, String title, String author, double price){
            this.book_number = book_number;
            this.title = title;
            this.author = author;
            this.price = price;
        }
        public String toString() {
            return "\n TITTLE:" + title + "\n AUTHOR :" + author +
                    "\n B_NUMBER" + book_number + "\n PRICE" + price + "\n";
        }
    }

    interface libraryStaff {
        public void test();
    }
    static class library implements libraryStaff {
        public void test() {
            System.out.println("Interface implemented successfully ");
        }

        public static void main(String[] args) {
            library lib = new library();
            lib.test();
        }
    }
    abstract static class price {
        int mrp = 0;
        abstract public void calculatedPrice();
    }
    public static class account extends price {
        public static void main(String[] args) {
            account acc = new account();
            acc.mrp = 250;
            acc.calculatedPrice();
        }
        public void calculatedPrice() {
            System.out.println("Max Retail Price = " +mrp);
        }

    }
}
