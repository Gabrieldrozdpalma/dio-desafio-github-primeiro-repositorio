package com.DesafioSomaHComNTermos;

import java.util.Scanner;

public class SomaHNTermos {

	public static void main(String[] args) {

		double h = 0;
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();

		for (int i = 1; i <= n; i++) {
			h += (double)1/i;
		}
		System.out.println(Math.round(h));

	}
}
