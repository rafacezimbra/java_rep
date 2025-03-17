package aplicacao;

import java.util.Scanner;

import entidades.Aluno;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int matricula;
		String nome;
		float media;
		
		System.out.println("Informe a matricula: ");
		matricula = sc.nextInt();
		System.out.println("Informe o nome: ");
		nome = sc.next();
		System.out.println("Informe a media: ");
		media = sc.nextFloat();
		
		Aluno aluno = new Aluno(matricula, nome, media);
		
		System.out.println(aluno);
		
		System.out.println("Informe um novo nome: ");
		nome = sc.next();
		aluno.setNome(nome);
		
		System.out.println(aluno);
		
		sc.close();

	}
}
