package aplicacao;

import java.util.Scanner;

import entidades.ConversorMoeda;

public class Programa5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos dólares serão comprados? ");
		double valor = sc.nextDouble();
		
		System.out.print("Qual o valor do Dólar? ");
		double dolar = sc.nextDouble();
		sc.close();
		
		System.out.printf("O valor a ser pago em reais é R$%.2f", ConversorMoeda.DolarParaReal(valor, dolar));

	}

}
