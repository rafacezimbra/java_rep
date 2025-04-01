package entidades;

public class Servicos {
	private int numero;
    private Entidades estudante;

    public Servicos(int numero, Entidades estudante) {
        this.numero = numero;
        this.estudante = estudante;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Quarto " + numero + ": " + estudante;
    }
}
