package org.example.model;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.Set;

public class Calculadora {
    private static final Set<Class<? extends IOperation>> operacoes;

    static {
        Reflections reflections = new Reflections("org.example.model");
        operacoes = reflections.getSubTypesOf(IOperation.class);
    }

    public int calcular(String op, ArrayList<Integer> valores) {
        for (Class<? extends IOperation> clazz : operacoes) {
            if (clazz.getSimpleName().equalsIgnoreCase(op)) {
                try {
                    IOperation opAtual = clazz.getDeclaredConstructor().newInstance();
                    return opAtual.calcular(valores);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        throw new IllegalArgumentException("Operação Inválida: " + op);
    }
}
