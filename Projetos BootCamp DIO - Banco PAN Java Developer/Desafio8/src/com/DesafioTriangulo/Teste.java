package com.DesafioTriangulo;

import java.io.IOException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double maior = 0;
		double soma = 0;
		double area = 0;
		boolean triangulo;

		triangulo = true;

		if (triangulo == ((Math.abs(B - C)) < A && A < (B + C)) && (Math.abs(A - C) < B && B < (A + C))
				&& (Math.abs(A - B) < C && C < (B + A))) {
			soma = A + B + C;
			System.out.println("Perimetro = " + String.format("%1f", soma));

		} else {
			if (A > B) {
				maior = A;
				area = ((maior + B) * C) / 2;

			} else {
				maior = B;
				area = ((maior + A) * C) / 2;
			}
			System.out.println("Area = " + String.format("%.1f", area));
		}
	}

}
