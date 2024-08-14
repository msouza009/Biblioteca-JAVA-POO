package org.example;

public class Main {
    public static void main(String[] args) {


    Calculadora calc = new Calculadora(10,10);
        System.out.println("Resultado 2 + 3 = " + new Calculadora(2,3).somar());

        System.out.println("Resultado 10 + 10 = " + calc.somar());
        System.out.println("Resultado 10 - 10 = " + calc.subtrair());

    }
}