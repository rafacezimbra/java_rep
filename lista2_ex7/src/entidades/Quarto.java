package entidades;


public class Quarto {
	
	
	private Estudante inquilino;
	private Integer numero;
	
	
	public Quarto() {
		inquilino = null;
	}
	
	public Estudante getInquilino() {
		return inquilino;
	}

	public void setInquilino(Estudante inquilino) {
		this.inquilino = inquilino;
	}

	
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String toString() {
		
		return numero + " : " + inquilino.getNome() + ", " + inquilino.getEmail();
	}
	
	public boolean checarOcupado() {
		
		if(inquilino == null) return false;
		else {return true;}
		
	}
	

}
