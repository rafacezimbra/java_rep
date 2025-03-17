package aplicacao;
import java.util.Scanner;
import entidades.Triangulo;

public class Programa2 {

	public static void main(String[] args) {
		
		double altura;
		double largura;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a altura do triangulo: ");
		altura = sc.nextDouble();
		System.out.println("digite a largura do triangulo: ");
		largura = sc.nextDouble();
		
		Triangulo tri = new Triangulo(altura, largura);
		
		tri.calcularTriangulo();
		System.out.printf("Área: %.2f \n", tri.getArea());
		System.out.printf("Perímetro: %.2f \n", tri.getPerimetro());
		System.out.printf("Diagonal: %.2f", tri.getDiagonal());
		
		
		sc.close();
		
		
	}

}
