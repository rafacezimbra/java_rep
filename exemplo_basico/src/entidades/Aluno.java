package entidades;

public class Aluno {
	private int matricula;
	private String nome;
	private float mediaGeral;
	
	public Aluno(int matricula, String nome, float mediaGeral) {
		this.matricula = matricula;
		this.nome = nome;
		this.mediaGeral = mediaGeral;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getMediaGeral() {
		return mediaGeral;
	}

	public void setMediaGeral(float mediaGeral) {
		this.mediaGeral = mediaGeral;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", mediaGeral=" + mediaGeral + "]";
	}
}

