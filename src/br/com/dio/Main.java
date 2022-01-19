package br.com.dio;

import br.com.dio.exercicios.CalcularEmprestimo;
import br.com.dio.exercicios.MensagemApartirDoHorario;
import br.com.dio.exercicios.OperacoesMatematicas;
import br.com.dio.exercicios.Quadrilatero;

public class Main {

    public static void main(String[] args) {
        System.out.println("Operações da matemática!");
        OperacoesMatematicas.somar(3, 8);
        OperacoesMatematicas.retirar(9, 5);
        OperacoesMatematicas.dividir(24, 3);
        OperacoesMatematicas.multiplicar(20, 4);

        System.out.println("Mensagem -----------");
        MensagemApartirDoHorario.obterMensagem(10);
        MensagemApartirDoHorario.obterMensagem(13);
        MensagemApartirDoHorario.obterMensagem(21);

        System.out.println("Exercício para calcular emprestimo!!");
        CalcularEmprestimo.calcular(100.40, 2);
        CalcularEmprestimo.calcular(40.40, 3);
        CalcularEmprestimo.calcular(20.40, 1);

        System.out.println("Calculando usando metodo de sobrecarga");
        Quadrilatero.area(4.4);
        Quadrilatero.area(2.2, 4.8);
        Quadrilatero.area(8.6, 7.4, 12);
    }
}
