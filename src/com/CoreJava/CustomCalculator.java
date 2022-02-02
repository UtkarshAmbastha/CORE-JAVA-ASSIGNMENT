package com.CoreJava;

@FunctionalInterface
interface Calculator
{
    public int calculate(int num1, int num2);
}
class MyCalculator implements Calculator
{
    @Override
    public int calculate(int num1, int num2)
    {
        return num1 + num2;
    }
}
class CustomCalculator1
{
    public int calculate(int num1, int num2)
    {
        return num1 + num2;
    }
}
class CustomCalculator
{
    public static void main(String[] args)
    {
        Calculator calc = (num1, num2) -> {
            return num1 + num2;
        };
        System.out.println(calc.calculate(45, 68));
    }
}
