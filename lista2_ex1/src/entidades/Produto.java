package entidades;

public class Produto {

	
	public String nome;
	public double preco;
	public int qtd;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public double valorTotalNoEstoque() {
		
		double valor = qtd*preco;
		
		return valor;
	}
	
	public void adicionarItens(int qtd) {
	
		this.qtd = this.qtd + qtd;
	}
	
	public void removerItens(int qtd) {
		this.qtd = this.qtd - qtd;
	}
}
