package br.com.dio.exercicios;

public class OperacoesMatematicas {

    public static void somar(int num1, int num2) {
        int total = num1 + num2;
        System.out.println("A somatória de " + num1 + " + " + num2 + " = " + total);

    }

    public static void multiplicar(int num1, int num2) {
        int total = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " * " + num2 + " = " + total);

    }

    public static void dividir(int num1, int num2) {
        int total = num1 / num2;
        System.out.println("A divisão de " + num1 + " / " + num2 + " = " + total);
    }

    public static void retirar(int num1, int num2) {
        int total = num1 - num2;
        System.out.println("A diminuição de " + num1 + " - " + num2 + " = " + total);
    }
}
