package entidades;

import java.time.Duration;
import java.time.LocalDate;

public class Aluguel {

	private LocalDate entrada;
	private LocalDate saida;
	private Integer numeroDiarias;
	
	private Imovel imovel;
	private Boleto boleto;
	
	
	
	public Aluguel(LocalDate entrada, LocalDate saida, Imovel imovel, Boleto boleto) {
		super();
		this.entrada = entrada;
		this.saida = saida;
		this.imovel = imovel;
		this.boleto = boleto;
		
		calcularNumeroDiarias();
	}




	private void calcularNumeroDiarias() {
		// Para calcular a duração entre duas datas
		Duration duracao = Duration.between(entrada.atStartOfDay(), saida.atStartOfDay());
		numeroDiarias = (int)duracao.toDays();
	}
	
	
	
	
	public LocalDate getEntrada() {
		return entrada;
	}
	public void setEntrada(LocalDate entrada) {
		this.entrada = entrada;
	}
	public LocalDate getSaida() {
		return saida;
	}
	public void setSaida(LocalDate saida) {
		this.saida = saida;
	}
	public Imovel getImovel() {
		return imovel;
	}
	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
	public Boleto getBoleto() {
		return boleto;
	}
	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}
	public Integer getNumeroDiarias() {
		return numeroDiarias;
	}
	public void setNumeroDiarias(Integer numeroDiarias) {
		this.numeroDiarias = numeroDiarias;
	}
	
	
}
