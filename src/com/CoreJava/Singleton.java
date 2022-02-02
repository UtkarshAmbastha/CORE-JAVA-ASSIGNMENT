package com.CoreJava;

class FormingSingletonClass {
    private static FormingSingletonClass singleInstance = null;
    public String str;
    private FormingSingletonClass() {
        str = "Formation of Singleton class String";
    }

    public static FormingSingletonClass getInstance() {
        if (singleInstance == null)
            singleInstance = new FormingSingletonClass();

        return singleInstance;
    }
}


public class Singleton {
    public static void main(String[] args) {
        FormingSingletonClass val1 = FormingSingletonClass.getInstance();
        FormingSingletonClass val2 = FormingSingletonClass.getInstance();
        FormingSingletonClass val3 = FormingSingletonClass.getInstance();
        System.out.println("value1: "+val1.str + "\nvalue2: "+val2.str + "\nvalue 3: "+val3.str);
    }
}
