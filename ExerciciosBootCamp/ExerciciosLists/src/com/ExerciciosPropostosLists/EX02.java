package com.ExerciciosPropostosLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> respostas = new ArrayList<>();

		System.out.println("Responda as perguntas: ");
		System.out.println("Telefonou para a vítima?");
		respostas.add(scan.next().toLowerCase());
		System.out.println("Esteve no local do crime?");
		respostas.add(scan.next().toLowerCase());
		System.out.println("Mora perto da vítima?");
		respostas.add(scan.next().toLowerCase());
		System.out.println("Devia para a vitima?");
		respostas.add(scan.next().toLowerCase());
		System.out.println("Já trabalhou com a vítima?");
		respostas.add(scan.next().toLowerCase());

		System.out.println(respostas);

		int qtdRespostasPositivas = 0;

		Iterator<String> contador = respostas.iterator();
		while (contador.hasNext()) {
			String resp = contador.next();
			if (resp.contains("sim")) {
				qtdRespostasPositivas++;
			}
		}

		if (qtdRespostasPositivas == 2) {
			System.out.println("Suspeita");
		} else if (qtdRespostasPositivas == 3 || qtdRespostasPositivas == 4) {
			System.out.println("Cúmplice");
		} else if (qtdRespostasPositivas == 5) {
			System.out.println("Assasina");
		} else {
			System.out.println("Inocente");
		}

	}

}
