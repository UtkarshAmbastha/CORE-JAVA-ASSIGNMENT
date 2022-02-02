package com.CoreJava;

public class Cloning implements Cloneable{

    int employeeID;
    String name;
    Cloning(String name, int employeeID){
        this.employeeID = employeeID;
        this.name = name;
    }
    public Object clone () throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Cloning c1 = new Cloning("Utkarsh Ambastha", 1713);
            Cloning c2 = (Cloning) c1.clone();
            System.out.println("Original Employee ID- "+c1.employeeID+ " & Name- "+c1.name);
            System.out.println("Duplicate: Employee ID- "+c2.employeeID+" & Name- "+c2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
