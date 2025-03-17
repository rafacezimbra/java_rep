package aplicacao;
import java.util.Scanner;

import entidades.Estudante;

public class Programa4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Nota1: ");
		float nota1 = sc.nextFloat();
		
		System.out.print("Nota2: ");
		float nota2 = sc.nextFloat();
		
		System.out.print("Nota3: ");
		float nota3 = sc.nextFloat();
				
				
		Estudante aluno = new Estudante(nome, nota1, nota2, nota3);
		
		System.out.printf("Nota Final: %.2f\n", aluno.notaFinal());
		System.out.println(aluno.aprovacao());
		if(aluno.aprovacao() == "Reprovado"){System.out.printf("Faltaram %.2f pontos", aluno.pontosFaltando());}
		
		sc.close();
	}

}
