package main;

import java.util.Scanner;

import entidades.Aplicacao;
import entidades.Entidades;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aplicacao empresa = new Aplicacao();

		System.out.print("Quantos funcionários deseja cadastrar? ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("\nFuncionário #" + (i + 1));
			System.out.print("ID: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			System.out.print("Salário: ");
			double salario = scanner.nextDouble();

			Entidades funcionario = new Entidades(id, nome, salario);

			if (!empresa.adicionarFuncionario(funcionario)) {
				System.out.println("Erro: ID já cadastrado! Funcionário não adicionado.");
				i--;
			}
		}

		System.out.print("\nDigite o ID do funcionário para aumentar o salário: ");
		int idAumento = scanner.nextInt();
		System.out.print("Digite a porcentagem de aumento: ");
		double porcentagem = scanner.nextDouble();

		if (!empresa.aumentarSalario(idAumento, porcentagem)) {
			System.out.println("Erro: Funcionário com ID " + idAumento + " não encontrado!");
		}

		empresa.mostrarFuncionarios();
		scanner.close();
	}
}
