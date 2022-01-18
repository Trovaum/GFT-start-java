package br.com.dio.exercicios;

import java.util.Scanner;

public class OperacoesMatematicas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos calcular 2 números com as 4 regras da matemática");
        System.out.println("Vamos começar, digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.println("Agora digite o segundo número: ");
        int num2 = scan.nextInt();
        System.out.println(somar(num1, num2));
        System.out.println(multiplicar(num1, num2));
        System.out.println(dividir(num1, num2));
        System.out.println(retirar(num1, num2));
    }

    private static String somar(int num1, int num2) {
        int total = num1 + num2;
        return "A somatória de " + num1 + " + " + num2 + " = " + total;

    }

    private static String multiplicar(int num1, int num2) {
        int total = num1 * num2;
        return "A multiplicação de " + num1 + " + " + num2 + " = " + total;

    }

    private static String dividir(int num1, int num2) {
        int total = num1 / num2;
        return "A divisão de " + num1 + " / " + num2 + " = " + total;
    }

    private static String retirar(int num1, int num2) {
        int total = num1 - num2;
        return "A diminuição de " + num1 + " - " + num2 + " = " + total;
    }
}
