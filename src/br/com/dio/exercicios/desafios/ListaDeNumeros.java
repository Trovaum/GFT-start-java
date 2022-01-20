package br.com.dio.exercicios.desafios;

/*
 * Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.
 * */

import java.util.Scanner;

public class ListaDeNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i = 0; i < 10000; i++) {
            if (i % num == 2) System.out.println(i);
        }

        scan.close();
    }
}
