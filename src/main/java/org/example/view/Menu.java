package org.example.view;
import org.example.model.IOperation;
import org.example.controller.ControladorCalculadora;
import org.reflections.Reflections;
import java.util.Set;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    public static void show(){
        System.out.println("****** CALCULADORA ******");
        Scanner sc = new Scanner(System.in);

        while(true){
            Reflections reflections = new Reflections("org.example.model");
            Set<Class<? extends IOperation>> classes = reflections.getSubTypesOf(IOperation.class);

            System.out.println("Operações:");
            for (Class<? extends IOperation> clazz : classes) {
                System.out.println("- " + clazz.getSimpleName());
            }
            System.out.println("- Sair");
            System.out.println("Digite a Operação Desejada: ");

            String operacao = sc.nextLine();

            if (operacao.equalsIgnoreCase("Sair")) {
                System.out.println("Saindo...");
                break;
            }

            ArrayList<Integer> valores = new ArrayList<>();

            System.out.println("Digite o Primeiro Valor: ");
            int valor = sc.nextInt();
            valores.add(valor);
            sc.nextLine();

            System.out.println("Digite um Segundo Valor: ");
            int valor2 = sc.nextInt();
            valores.add(valor2);
            sc.nextLine();

            while(true){
                System.out.println("Você deseja digitar um outro valor (sim ou não)?");
                String entrada = sc.nextLine();

                if (entrada.equalsIgnoreCase("não") || entrada.equalsIgnoreCase("nao")) {
                    break;
                } else if (entrada.equalsIgnoreCase("sim")) {
                    System.out.println("Digite um Valor: ");
                    int valorN = sc.nextInt();
                    valores.add(valorN);
                    sc.nextLine(); // Limpa o buffer
                } else {
                    System.out.println("Resposta inválida! Por favor, digite 'sim' ou 'não'.");
                }
            }

            ControladorCalculadora control = new ControladorCalculadora();
            int resultado = control.calcular(operacao, valores);

            System.out.println("Resultado: " + resultado);
        }
        sc.close();
    }
}
