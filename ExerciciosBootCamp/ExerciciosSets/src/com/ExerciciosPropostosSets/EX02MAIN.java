package com.ExerciciosPropostosSets;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class EX02MAIN {

	public static void main(String[] args) {

		Set<LinguagemFavoritaEX02> minhasLinguagensFavoritas = new HashSet<>();
		minhasLinguagensFavoritas.add(new LinguagemFavoritaEX02("Java", 1991, "Eclipse"));
		minhasLinguagensFavoritas.add(new LinguagemFavoritaEX02("Python", 1991, "Pycharm"));
		minhasLinguagensFavoritas.add(new LinguagemFavoritaEX02("HTML", 1989, "Atom"));

		// #1 Ordenando por ordem de inserção:

		Set<LinguagemFavoritaEX02> minhasLinguagensFavoritas1 = new LinkedHashSet<>(Arrays.asList(
				new LinguagemFavoritaEX02("Java", 1991, "Eclipse"),
				new LinguagemFavoritaEX02("Python", 1991, "Pycharm"), new LinguagemFavoritaEX02("HTML", 1989, "Atom")));
		for (LinguagemFavoritaEX02 linguagem : minhasLinguagensFavoritas1)
			System.out.println(linguagem);
		System.out.println();

		// #2 Ordenando por ordem natural:

		Set<LinguagemFavoritaEX02> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas);
		for (LinguagemFavoritaEX02 linguagem : minhasLinguagensFavoritas2)
			System.out.println(linguagem);
		System.out.println();

		// #3 Ordenando por IDE:
		Set<LinguagemFavoritaEX02> minhasLinguagensFavoritas3 = new TreeSet<>(new ComparatorIDE());
		minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas3);
		for (LinguagemFavoritaEX02 linguagem : minhasLinguagensFavoritas)
			System.out.println(linguagem);
		System.out.println();

		// #4 Ordenando por ano de criação e nome:
		Set<LinguagemFavoritaEX02> minhasLinguagensFavoritas4 = new TreeSet<>(new ComparatorAnoDeCriacaoENome());
		minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
		for (LinguagemFavoritaEX02 linguagem : minhasLinguagensFavoritas4)
			System.out.println(linguagem);

		// #5 Ordenando por nome, ano de criação e IDE:
		Set<LinguagemFavoritaEX02> minhasLinguagensFavoritas5 = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIde());
		minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas3);
		for (LinguagemFavoritaEX02 linguagem : minhasLinguagensFavoritas5)
			System.out.println(linguagem);

	}

	public static class LinguagemFavoritaEX02 implements Comparable<LinguagemFavoritaEX02> {

		public String nome;
		public int anoDeCriacao;
		public String ide;

		public LinguagemFavoritaEX02(String nome, Integer anoDeCriacao, String ide) {
			this.nome = nome;
			this.anoDeCriacao = anoDeCriacao;
			this.ide = ide;
		}

		@Override
		public String toString() {
			return " nome = " + nome + ", anoDeCriacao = " + anoDeCriacao + ", ide = " + ide;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			LinguagemFavoritaEX02 other = (LinguagemFavoritaEX02) obj;
			return Objects.equals(nome, other.nome);
		}

		@Override
		public int hashCode() {
			return Objects.hash(nome);
		}

		@Override
		public int compareTo(LinguagemFavoritaEX02 linguagemfavoritaEX02) {
			return this.nome.compareTo(linguagemfavoritaEX02.nome);
		}
	}

	static class ComparatorIDE implements Comparator<LinguagemFavoritaEX02> {

		@Override
		public int compare(LinguagemFavoritaEX02 o1, LinguagemFavoritaEX02 o2) {
			return o1.ide.compareToIgnoreCase(o2.ide);
		}

	}

	static class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavoritaEX02> {

		@Override
		public int compare(LinguagemFavoritaEX02 o1, LinguagemFavoritaEX02 o2) {
			int anoDeCriacao = Integer.compare(o1.anoDeCriacao, o2.anoDeCriacao);
			if (anoDeCriacao != 0)
				return anoDeCriacao;
			return o1.nome.compareToIgnoreCase(o2.nome);
		}

	}

	static class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavoritaEX02> {

		@Override
		public int compare(LinguagemFavoritaEX02 o1, LinguagemFavoritaEX02 o2) {
			int nome = o1.nome.compareToIgnoreCase(o2.nome);
			int anoDeCriacao = Integer.compare(o1.anoDeCriacao, o2.anoDeCriacao);
			return o1.ide.compareToIgnoreCase(o2.ide);
		}

	}

}
