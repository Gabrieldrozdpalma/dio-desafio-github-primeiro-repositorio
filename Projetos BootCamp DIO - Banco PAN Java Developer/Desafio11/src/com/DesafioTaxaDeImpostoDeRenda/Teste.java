package com.DesafioTaxaDeImpostoDeRenda;

import java.io.IOException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws IOException {
	    Scanner leitor = new Scanner(System.in);
	    double renda = leitor.nextDouble();
	    double imposto;
	    
	    if(renda <=2000) {
	    	System.out.println("Isento");
	    }else if(renda > 2000 && renda <= 3000) {
	    	imposto = (renda - 2000) * 0.08;
	    	System.out.printf("R$ " + "%.2f",imposto);
	    }else if(renda >3000 && renda <= 4500) {
	    	imposto = (1000 * 0.08) + ((renda - 3000)* 0.18);
	    	System.out.printf("R$ " + "%.2f",imposto);
	    }else if(renda > 4500) {
	    	imposto = (1000 * 0.08) + (1500 * 0.18) + ((renda - 4500) * 0.28);
	    	System.out.printf("R$ " + "%.2f",imposto);
	    }
	      

	    }

}
