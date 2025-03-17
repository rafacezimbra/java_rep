package aplicacao;
import entidades.Funcionario;
import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Salário Bruto: ");
		Double salarioBruto = sc.nextDouble();
		
		System.out.println("Imposto: ");
		Double imposto = sc.nextDouble();
		
		Funcionario clt = new Funcionario(nome, salarioBruto, imposto);
		
		System.out.printf("Empregado: %s, R$ %.2f\n", clt.getNome(), clt.getSalarioLiquido());
		
		System.out.println("Qual o percentual de aumento do salário? ");
		double percentual = sc.nextDouble();
		
		clt.mudarSalarioEmPorcentagem(percentual);
		
		System.out.printf("Dados Atualizados: %s, %.2f", clt.getNome(), clt.getSalarioLiquido());
		
		
		sc.close();
	}

}
