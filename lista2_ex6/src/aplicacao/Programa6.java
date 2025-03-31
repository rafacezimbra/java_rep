package aplicacao;

import java.util.Scanner;
import entidades.Conta;

public class Programa6 {

	public static void main(String[] args) {
		/*
		Informe o número da conta: 8532
		Informe o nome do titular da conta: Alex Green
		Haverá um deposito inicial (s/n)? s
		Informe o valor do deposito inicial: 500.00
		
		Dados da Conta:
Número 8532, Nome do Titular: Alex Green, Saldo: R$ 500,00
Informe um valor de Depósito: 200,00
Dados da conta atualizados:
Conta 8532, Nome do Titular: Alex Green, Saldo: R$ 700,00
Informe um valor de saque: 300,00
		*/
		Scanner sc = new Scanner(System.in);
		Conta conta = null; //declara a conta que sera criada logo
		int numero;
		String nome;
		char decisaoDeposito = 'x';
		double valor;
		
		System.out.print("Informe o número da conta: ");
		numero = sc.nextInt();
		System.out.print("Informe o nome do titular da conta: ");
		sc.nextLine(); //limpar buffer
		nome = sc.nextLine();
		
		while(decisaoDeposito != 's' && decisaoDeposito != 'n') {
		System.out.print("Haverá um deposito inicial (s/n)? ");
		decisaoDeposito = sc.next().charAt(0); //escaneia um char
		}
		
		if(decisaoDeposito == 's') {
		System.out.print("Informe o valor do deposito inicial: ");
		valor = sc.nextDouble();
		
			conta = new Conta(numero, nome, valor);
		}else {
			conta = new Conta(numero, nome);
		}
		
		System.out.println("Dados da conta:");
		System.out.println(conta);
		System.out.println("Informe um valor de depósito: ");
		valor = sc.nextDouble();
		conta.deposito(valor);
		
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		System.out.println("Informe um valor de  saque: ");
		valor = sc.nextDouble();
		conta.saque(valor);
		
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		sc.close();
	}

}
