package aplicacao;

import java.time.LocalDate;
import java.util.Scanner;

public class Programa_trovao {

	public static void main(String[] args) {
		
		int codigo;
		String descricao;
		double valorDiaria;
		LocalDate entrada;
		LocalDate saida;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***Informe os dados da locação:***");
		System.out.print("Código do imóvel: ");
		sc.nextInt();
		System.out.print("Código do imóvel: ");
		sc.next();
		System.out.print("Valor da Diária: ");
		sc.nextDouble();
		System.out.print("Data Entrada(dd/MM/yyyy)");
		//botar scanner de localdate
		System.out.print("Data Saida(dd/MM/yyyy)");
		
		sc.close();
	}

}
