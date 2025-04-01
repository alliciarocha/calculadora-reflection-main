package org.example.model;

public class Dividir implements IOperation {
    public int calcular(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Divisão por zero");
        }
        else{
            return a / b;
        }
    }
    public int calcular(int[] var1) {
        return 0;
    }
}