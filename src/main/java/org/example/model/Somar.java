package org.example.model;

public class Somar implements IOperation {
    public int calcular(int a, int b) {
        return a + b;
    }
    public int calcular(int [] valores) {
        return 0;
    }
}