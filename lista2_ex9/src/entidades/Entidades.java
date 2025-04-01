package entidades;

public class Entidades {
	private int id;
	private String nome;
	private double salario;

	public Entidades(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public void aumentarSalario(double porcentagem) {
		this.salario += salario * (porcentagem / 100);
	}

	@Override
	public String toString() {
		return id + ", " + nome + ", R$ " + String.format("%.2f", salario);
	}
}