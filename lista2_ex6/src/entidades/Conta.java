package entidades;

public class Conta {

	private int numero;
	private String nome;
	private double saldo;
	
	public Conta(int numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = 0;
	}

	public Conta(int numero, String nome, double saldo) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo = saldo + valor;
	}
	
	public void saque(double valor) {
		saldo = saldo - 5;
		saldo = saldo - valor;
	}
	
	public String toString() {
		return "Número " + numero +  ", Nome do Titular: " + nome + ", Saldo: R$ "+ saldo;
	}
	
}
