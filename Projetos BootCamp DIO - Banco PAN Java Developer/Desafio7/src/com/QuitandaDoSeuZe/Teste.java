package com.QuitandaDoSeuZe;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int morangos = input.nextInt();
		int macas = input.nextInt();

		int totalKgFrutas = macas + morangos;
		double valorMorangos = 0;
		double valorMacas = 0;
		double desconto = 0;
		double valorAPagar = 0;

		if (morangos <= 5) {
			valorMorangos = 2.50 * morangos;
		} else {
			valorMorangos = 2.20 * morangos;
		}

		if (macas <= 5) {
			valorMacas = 1.80 * macas;
		} else {
			valorMacas = 1.50 * macas;
		}

		if (totalKgFrutas > 8 || totalKgFrutas > 25) {
			desconto = (valorMacas + valorMorangos) * 0.1;
		}

		valorAPagar = (valorMacas + valorMorangos) - desconto;

		System.out.println(valorAPagar);

	}

}
