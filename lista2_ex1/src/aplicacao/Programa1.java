package aplicacao;

import java.util.Scanner;
import entidades.Produto;


public class Programa1 {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		Produto tv = new Produto();
		
		System.out.print("Digite o nome do produto: ");
		
		tv.nome = sc.next();
		
		System.out.print("Digite o preço do produto: ");
		
		tv.setPreco(sc.nextDouble());
		
		System.out.print("Digite a quantidade no estoque: ");
		
		tv.qtd = sc.nextInt();
		
		
		System.out.printf("Dados do produto: %s, R$ %.2f, %d unidades, Total: R$ %.2f\n", tv.nome, tv.preco, tv.qtd, tv.valorTotalNoEstoque());
		//System.out.printf("Dados do produto: " + tv.nome +" ,R$ "+ tv.preco + ", " + tv.qtd + " unidades, Total: R$ " + tv.valorTotalNoEstoque() );
		
		
		System.out.print("Digite a quantidade de itens a serem adicionados: ");
		
		int itens;
		itens = sc.nextInt();
		tv.adicionarItens(itens);
		
		System.out.printf("Dados atualizados: %s, R$ %.2f, %d unidades, Total: R$ %.2f\n", tv.nome, tv.preco, tv.qtd, tv.valorTotalNoEstoque());
		
		
		System.out.print("Digite a quantidade de itens a serem removidos: ");
		
		itens = sc.nextInt();
		
		tv.removerItens(itens);
		System.out.printf("Dados atualizados: %s, R$ %.2f, %d unidades, Total: R$ %.2f\n", tv.nome, tv.preco, tv.qtd, tv.valorTotalNoEstoque());
		sc.close();

	}

}
