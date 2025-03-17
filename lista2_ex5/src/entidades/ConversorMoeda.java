package entidades;

public class ConversorMoeda {
	
	public static double IOF = 0.06;

	public static double DolarParaReal(double valorEmDolar, double precoDolar) {
		
		return valorEmDolar * precoDolar * (1 + IOF);
	}
	
}
