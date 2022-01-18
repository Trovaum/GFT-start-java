package br.com.dio;

import br.com.dio.exercicios.MensagemApartirDoHorario;
import br.com.dio.exercicios.OperacoesMatematicas;

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
    }
}
