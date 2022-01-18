package br.com.dio.exercicios;

public class CalcularEmprestimo {

    public static double getDuasParcelas() {
        return 0.3;
    }

    public static double getTresParcelas() {
        return 0.45;
    }

    public static void calcular(double valor, int parcelas){
        if (parcelas == 2){
            double valorFinal = valor + (valor * getDuasParcelas());
            System.out.println("Valos final para o emprestimo para 2 parcelas é: "+valorFinal);
        }else if (parcelas == 3){
            double valorFinal = valor + (valor * getTresParcelas());
            System.out.println("Valor final para emprestimo para 3 parcelas é: " + valorFinal);
        } else {
            System.out.println("Valor indisponível!!!");
        }
    }
}
