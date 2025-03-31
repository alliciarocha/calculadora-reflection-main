package org.example.view;
import org.example.model.IOperation;
import org.example.controller.ControladorCalculadora;
import org.reflections.Reflections;
import java.util.Set;
import java.util.Scanner;

public class Menu {
    public static void show(){
        Reflections reflections = new Reflections("org.example.model");

        Set<Class<? extends IOperation>> classes = reflections.getSubTypesOf(IOperation.class);

        for (Class<? extends IOperation> clazz : classes) {
            System.out.println(clazz.getSimpleName());
        }
        System.out.println("Sair");
        System.out.println("Digite a operação desejada: ");
        Scanner sc = new Scanner(System.in);
        String operacao = sc.nextLine();
        System.out.println("Digite o Primeiro Valor");
        int a = sc.nextInt();
        System.out.println("Digite o Segundo Valor");
        int b = sc.nextInt();

        ControladorCalculadora control = new ControladorCalculadora();

        int resultado = control.calcular(operacao, a, b);

        System.out.println("Resultado: " + resultado);
    }
}
