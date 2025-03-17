package entidades;

public class Estudante {

	private String nome;
	private float nota1;
	private float nota2;
	private float nota3;
	
	public Estudante(String nome, float nota1, float nota2, float nota3) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

	
	
	public float notaFinal() {
		return (nota1 + nota2 + nota3); 
	}
	
	public String aprovacao() {
		
		if(notaFinal() > 60) {
			return "Aprovado";
		}else {
			return "Reprovado";
		}
	}
	
	public float pontosFaltando() {
		if(aprovacao()=="Reprovado") {
			
			return  60 - notaFinal();
			
		}else return 0;
	}
	

}
