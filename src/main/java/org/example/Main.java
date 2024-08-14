package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


    Calculadora calc = new Calculadora(10,10);
        System.out.println("Resultado 2 + 3 = " + new Calculadora(2,3).somar());

        System.out.println("Resultado 10 + 10 = " + calc.somar());
        System.out.println("Resultado 10 - 10 = " + calc.subtrair());

    }
}