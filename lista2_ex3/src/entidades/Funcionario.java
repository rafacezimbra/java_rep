package entidades;

public class Funcionario {
	
	private String nome;
	private double salarioBruto;
	private double imposto;
	private double salarioLiquido;
	
	//Getters e Setterss
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	//metodos de calculo
	public void calcularSalarioLiquido() {
		salarioLiquido = salarioBruto - imposto;
	}
	
	public void mudarSalarioEmPorcentagem(double porcentagem) {
		salarioBruto = salarioBruto + salarioBruto * (porcentagem/100);
		calcularSalarioLiquido();
	}
	
	//construtores
	//pode ter dois metodos com mesmo nome, contanto que tenham parametros diferentes
		public Funcionario(){}
		
		public Funcionario(String nome, double salarioBruto, double imposto) {
			this.nome = nome;
			this.salarioBruto = salarioBruto;
			this.imposto = imposto;
			calcularSalarioLiquido();
		}
}
