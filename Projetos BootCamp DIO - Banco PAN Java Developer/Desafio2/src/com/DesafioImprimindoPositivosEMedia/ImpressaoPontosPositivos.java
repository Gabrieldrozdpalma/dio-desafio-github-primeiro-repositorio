package com.DesafioImprimindoPositivosEMedia;

import java.io.IOException;
import java.util.Scanner;

public class ImpressaoPontosPositivos {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int qtdNumPositivos = 0;
		double media = 0;

		for (int i = 1; i <= 6; i++) {
			double input = scan.nextDouble();
			if (input > 0) {
				qtdNumPositivos++;
				media += input;
			}
		}
		media = media / qtdNumPositivos;
		
		System.out.println(qtdNumPositivos + " valores positivos");
        System.out.println(String.format("%.1f", media));
	}
}
