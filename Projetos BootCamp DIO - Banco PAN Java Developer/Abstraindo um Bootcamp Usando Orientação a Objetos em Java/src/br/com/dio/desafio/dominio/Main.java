package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(10);

		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("Descrição curso js");
		curso2.setCargaHoraria(5);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de Java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java developer");
		bootcamp.setDescricao("Descrição bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devGabriel = new Dev();
		devGabriel.setNome("Gabriel");
		devGabriel.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Gabriel: " + devGabriel.getConteudosInscritos());
		devGabriel.progredir();
		devGabriel.progredir();
		System.out.println("- - - ");
		System.out.println("Conteudos inscritos Gabriel: " + devGabriel.getConteudosInscritos());
		System.out.println("Conteudos concluidos Gabriel: " + devGabriel.getConteudosConcluidos());
		System.out.println("XP: " + devGabriel.calcularXp());
		
		System.out.println("- - - - - - - - - - - - - -");
		
		
		Dev devFulano = new Dev();
		devFulano.setNome("Fulano");
		devFulano.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Fulano: " + devFulano.getConteudosInscritos());
		devFulano.progredir();
		devFulano.progredir();
		devFulano.progredir();		
		System.out.println("- - - ");
		System.out.println("Conteudos inscritos Fulano: " + devFulano.getConteudosInscritos());
		System.out.println("Conteudos concluidos Fulano: " + devFulano.getConteudosConcluidos());
		System.out.println("XP: " + devFulano.calcularXp());
		
		
	}

}
