package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Estudante;
import entidades.Quarto;

public class Programa7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Quarto[] quartos; //declarando vetor
		quartos = new Quarto[10]; //construindo vetor
		
		List<Estudante> estudante = new ArrayList<>(); 
		
		int numQuartos;
		String nome;
		String email;
		int numeroDoQuarto;
		System.out.print("Quantos quartos serão alugados? ");
		numQuartos = sc.nextInt();
		
		for(int i = 0; i<numQuartos; i++) {
			
			System.out.println("Aluguel #" + i);
			System.out.print("Nome: ");
			nome = sc.nextLine();
			sc.nextLine(); //limpar buffer
			System.out.print("Email: ");
			email = sc.next();
			
			estudante.add(new Estudante(nome, email));
			
			System.out.print("Quarto: ");
			numeroDoQuarto = sc.nextInt();
			quartos[numeroDoQuarto] = new Quarto();
			
			quartos[numeroDoQuarto].setInquilino(estudante.get(i));
			quartos[numeroDoQuarto].setNumero(numeroDoQuarto);
		}	
		
		for(int i=0; i<10; i++) { //usar laço for each
				
			if(quartos[i].checarOcupado()) {
				System.out.println(quartos[i]);
			}
			
		}
			
			
		sc.close();
		
	}

}
