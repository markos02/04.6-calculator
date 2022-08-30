package com.kodilla;

public class Calculator {

    public int add (int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int substract (int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Wynik dodawania: " + calculator.add(5,4));
        System.out.println("Wynik odejmowania: " + calculator.substract(10,2));
    }
}
