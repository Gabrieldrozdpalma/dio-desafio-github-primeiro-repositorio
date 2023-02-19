package com.ExerciciosPropostosMaps;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class EX01 {

	public static void main(String[] args) {
//#1 Crie um dicionário e relacione os estados e suas populações:
		Map<String, Integer> populacaoEstadosNE = new HashMap<>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);
			}
		};
		System.out.println(populacaoEstadosNE);
		System.out.println();
//#2 Substitua a população do estado do RN por 3.534.165:		
		System.out.println(populacaoEstadosNE.put("RN", 3534165));
		System.out.println(populacaoEstadosNE);
		System.out.println();

//#3 Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277:
		System.out.println(populacaoEstadosNE.containsKey("PB"));
		populacaoEstadosNE.put("PB", 4039277);
		System.out.println(populacaoEstadosNE);
		System.out.println();
//#4 Exibia a população do PE:
		System.out.println("Pop PE: " + populacaoEstadosNE.get("PE"));
		System.out.println();

//#5 Exiba todos os estados e suas populações na ordem que foi informado:

		Map<String, Integer> populacaoEstadosNE2 = new LinkedHashMap<>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);
				put("PB", 4039277);
			}
		};
		System.out.println(populacaoEstadosNE2);
		System.out.println();

//#6 Exiba os estados e suas populações em ordem alfabética:

		Map<String, Integer> populacaoEstadosNE3 = new TreeMap<>(populacaoEstadosNE);
		System.out.println(populacaoEstadosNE3);

//#7 Exiba o estado com o menor população e sua quantidade:
//#8 Exiba o estado com a maior população e sua quantidade:

		Collection<Integer> populacao = populacaoEstadosNE.values();
		String estadoMaiorPopulacao = "";
		String estadoMenorPopulacao = "";
		for (Map.Entry<String, Integer> entry : populacaoEstadosNE.entrySet()) {
			if (entry.getValue().equals(Collections.max(populacao)))
				estadoMaiorPopulacao = entry.getKey();
			if (entry.getValue().equals(Collections.min(populacao)))
				estadoMenorPopulacao = entry.getKey();
		}
		System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
				estadoMenorPopulacao, Collections.min(populacao));
		System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
				estadoMaiorPopulacao, Collections.max(populacao));
		
//#9 Exiba a soma da população desses estados:
		
		int soma = 0;
		Iterator<Integer> iterator = populacaoEstadosNE.values().iterator();
		while(iterator.hasNext()) {
			soma+= iterator.next();
		}
		System.out.println("A soma da população desses estados é: " + soma);
		
//#10 Exiba a média da população deste dicionário de estados:
		
		System.out.println("A média da população desses estados é: " + (soma/populacaoEstadosNE.size()));
	}
}