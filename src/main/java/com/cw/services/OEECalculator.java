package com.cw.services;
import java.util.Scanner;

public class OEECalculator {
    private Double disponibilidade;
    private Double desempenho;
    private Double satisfacao;

    public void calcularOEE() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir os valores em porcentagem
        this.disponibilidade = lerPorcentagemValida(scanner, "disponibilidade");
        this.desempenho = lerPorcentagemValida(scanner, "desempenho");
        this.satisfacao = lerPorcentagemValida(scanner, "Satisfação");
    }

    private double lerPorcentagemValida(Scanner scanner, String nomeMetrica) {
        double valor;
        for (;;) // for infinito ate passar por um break ou return//
             {
            System.out.println("Digite a " + nomeMetrica + " em porcentagem (entre 0 e 100):");
            valor = scanner.nextDouble();
            if (valor >= 0 && valor <= 100) {
                break;
            }
            System.out.println("Valor inválido! Por favor, digite um valor entre 0 e 100.");
        }
        return valor;
    }

    public void exibirDadosPessoais() {
        String nomeUsuario = "João da Silva";
        String setor = "Operador";

        String dadosPessoais = String.format("""
                Dados Pessoais:
                - Nome: %s
                - Setor: %s
                """, nomeUsuario, setor);

        // Exibe os dados pessoais
        System.out.println(dadosPessoais);
    }

    public void exibirResultadoOEE() {
        // Calcula a média da OEE
        double oee = (this.disponibilidade + this.desempenho + this.satisfacao) / 3.0;

        // Identifica qual dos três fatores (disponibilidade, desempenho ou qualidade) é o menor
        String pontoAtencao;
        if (this.disponibilidade <= this.desempenho && this.disponibilidade <= this.satisfacao) {
            pontoAtencao = "Disponibilidade";
        } else if (this.desempenho <= this.disponibilidade && this.desempenho <= this.satisfacao) {
            pontoAtencao = "Desempenho";
        } else {
            pontoAtencao = "Satisfação";
        }

        // Cria uma representação em formato de string do resultado do OEE
        String resultadoOEE = String.format("""
                Média da OEE:  %%%.2f
                Ponto de Atenção: Menor fator é %s
                """, oee, pontoAtencao);

        // Exibe o resultado do OEE e o ponto de atenção
        System.out.println(resultadoOEE);

        // Verifica se a média da OEE é maior ou igual a 80%
        if (oee >= 80) {
            System.out.println("Atingiu a média desejada de 80%.");
        } else {
            System.out.println("Não atingiu a média desejada de 80%.");
        }
    }
}
