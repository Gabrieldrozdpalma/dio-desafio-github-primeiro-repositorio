package com.ExerciciosPropostosSets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EX01 {

	public static void main(String[] args) {

		Set<String> coresArcoIris = new HashSet<>();

		coresArcoIris.add("vermelho");
		coresArcoIris.add("laranja");
		coresArcoIris.add("amarelo");
		coresArcoIris.add("verde");
		coresArcoIris.add("Azul");
		coresArcoIris.add("Azul - escuro");
		coresArcoIris.add("violeta");

//#1 exiba todas as cores uma abaixo da outra:
		for (String cor : coresArcoIris) {
			System.out.println(cor);
		}
//#2 A quantidade de cores que o arco-íris tem:
		System.out.println(coresArcoIris.size());
		
//#3 Exiba as cores em ordem alfabética:
		Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
		System.out.println(coresArcoIris2);
		
//#4  Exiba as cores na ordem inversa da que foi informada
		Set<String> coresArcoIris3 = new LinkedHashSet<>(
				Arrays.asList("violeta", "azul - escuro", "azul", "verde", "amarelo", "laranja","vermelho"));
		System.out.println(coresArcoIris3);
		List<String>coresArcoIrisList = new ArrayList<>(coresArcoIris3);
		Collections.reverse(coresArcoIrisList);
		System.out.println(coresArcoIrisList);
		
//#5 Exiba todas as cores que começam com a letra "v":
		for(String cor: coresArcoIris) {
			if(cor.startsWith("v")) System.out.print(cor + ", ");
		}
		System.out.println();
		
//#6 Remova todas as cores que não começam com a letra “v”:
		Iterator<String> iterator2 = coresArcoIris.iterator();
		while(iterator2.hasNext()) {
			if(!iterator2.next().startsWith("v")) iterator2.remove();
		}
		System.out.println(coresArcoIris);
		
//#7 Limpe o conjunto:
		
		coresArcoIris.clear();
		
//#8 Confira se o conjunto está vazio:
		
		System.out.println(coresArcoIris.isEmpty());
	}
}
