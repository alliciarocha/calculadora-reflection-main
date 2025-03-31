package org.example.model;
import org.example.model.IOperation;
import org.reflections.Reflections;

import java.util.Set;

public class Calculadora {
    private static final Set<Class<? extends IOperation>> operacoes;

    static {
        Reflections reflections = new Reflections("org.example.model");
        operacoes = reflections.getSubTypesOf(IOperation.class);
    }

    public int calcular(String op, int a, int b) {
        for (Class<? extends IOperation> clazz : operacoes) {
            if (clazz.getSimpleName().equalsIgnoreCase(op)) {
                try {
                    IOperation opAtual = clazz.getDeclaredConstructor().newInstance();
                    return opAtual.calcular(a, b);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        throw new IllegalArgumentException("Operação Inválida: " + op);
    }
}
