package entidades;

public class Entidades {
	private String nome;
    private String email;

    public Entidades(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public String toString() {
        return nome + ", " + email;
    }
}