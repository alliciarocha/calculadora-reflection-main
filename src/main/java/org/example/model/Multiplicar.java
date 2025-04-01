package org.example.model;

public class Multiplicar implements IOperation {
    public int calcular(int a, int b) {
        return a * b;
    }
    public int calcular(int[] var1) {
        return 0;
    }
}
