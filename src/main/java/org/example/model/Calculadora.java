package org.example.model;

public class Calculadora {

    public int calcular (String operacao, int a, int b){
        IOperation op = null;

        if (operacao.equals("Somar")){
            op = new Somar();
        }

        if (operacao.equals("Subtrair")){
            op = new Subtrair();
        }
        return op.calcular(a, b);
    }

}