package entidades;

public class Triangulo {

	private double altura;
	private double largura;
	private double area;
	private double perimetro;
	private double diagonal;
	
	
	
	
	public Triangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	//Getters e Setters
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getArea() {
		return area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public double getDiagonal() {
		return diagonal;
	}

	//toString substitui o que sera printado quando se tentar printar a classe
	@Override
	public String toString() {
		return "area = " + this.altura + "\n" + "altura = " + this.largura;
	}
	
	public void calcularArea(){
		area = altura * largura;
	}
	
	public void calcularPerimetro() {
		perimetro = altura + largura + diagonal;
	}
	
	public void calcularDiagonal() {
		diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
	}
	
	public void calcularTriangulo() {
		calcularArea();
		calcularDiagonal();
		calcularPerimetro();
		
		
		
	}
	

}
