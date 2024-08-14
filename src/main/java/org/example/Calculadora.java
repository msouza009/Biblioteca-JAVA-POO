package org.example;

public class Calculadora {
    // atributo
    private int numeroA;
    private int numeroB;

    //metodo
    public Calculadora(int numeroA, int numeroB) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }

    public  int somar(){
        return this.numeroA + this.numeroB;
    }

    public  int subtrair(){
        return this.numeroA - this.numeroB;
    }
}
