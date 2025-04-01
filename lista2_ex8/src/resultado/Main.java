package resultado;

import java.util.Scanner;

import entidades.Aplicacao;
import entidades.Entidades;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aplicacao pensionato = new Aplicacao();

		System.out.print("Quantos estudantes vão alugar quartos? (1 a 10): ");
		int n = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("\nEstudante " + (i + 1));
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			System.out.print("Email: ");
			String email = scanner.nextLine();
			Entidades estudante = new Entidades(nome, email);

			int quarto;
			while (true) {
				System.out.print("Escolha um quarto (0 a 9): ");
				quarto = scanner.nextInt();
				scanner.nextLine();

				if (pensionato.alugarQuarto(quarto, estudante)) {
					break;
				}
				System.out.println("Quarto já ocupado! Escolha outro.");
			}
		}

		pensionato.mostrarRelatorio();
		scanner.close();
	}
}
