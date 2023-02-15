package com.DesafioFabricaDeCarros;

import java.util.*;

public class ClasseMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {
			int rodando = 1;
			do {
				System.out.println("Digite o custo de Fábrica do carro: ");
				int custoFabrica = scan.nextInt();
				System.out.println("Digite a porcentagem do distribuidor: ");
				int porcentagemDistribuidor = scan.nextInt();
				System.out.println("Digite o percentual de imposto que incide sobre o carro: ");
				int percentualImpostos = scan.nextInt();

				int margemDistribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
				int valorImpostos = (custoFabrica * percentualImpostos) / 100;
				int custoConsumidor = (custoFabrica + margemDistribuidor + valorImpostos);

				System.out.println("O custo final do carro para o consumidor será: " + custoConsumidor + " reais");

				System.out.println("Deseja consultar o custo final de outro carro? Digite 1 para 'sim' e 2 para 'não'. ");
				rodando = scan.nextInt();
				if (rodando == 2) {
					System.out.println("Obrigado por utilizar meu programa!");
				}
			} while (rodando != 2);

		} catch (InputMismatchException e) {
			System.out.println("Erro. Informe um input valido: deve ser um numero inteiro.");
		}

	}
}
