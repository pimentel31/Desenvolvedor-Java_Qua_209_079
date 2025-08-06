package com.escolha.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        int x, y;
        double result;
        String operacao;

        System.out.println("Informe o valor de x");
        x = leia.nextInt();
        System.out.println("Informe o valor de y");
        y = leia.nextInt();

        // menu limpeza de buffer
        leia.nextLine();

        // menu
        System.out.println("Eescolha a opreração");
        System.out.println("1 - Somar.");
        System.out.println("2 - Subtrair.");
        System.out.println("3 - Multiplicar.");
        System.out.println("4 - Dividir.");
        System.out.println("Operaçao desejada:");
        operacao = leia.nextLine();

        // Escolha caso
        switch (operacao) {
            case "1":
                result = x + y;
                System.out.println("O resultado da soma é: " + result);
                break;
            case "2":
                result = x - y;
                System.out.println("O resultado da subtração é: " + result);
                break;
            case "3":
                result = x * y;
                System.out.println("O resultado da Multiplicação  é: " + result);
                break;
            case "4":
                result = x / y;
                System.out.println("O resultado da divisão  é: " + result);
                break;
            default:
                System.out.println("Operador invalido");

        }

        leia.close();

    }
}
