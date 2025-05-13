package Servicos;
import entidades.Aluguel;

public class ServicoGerarBoleto {
	private Double valorDiaria;
	private ServicoTaxa servicoTaxa;
	
	public ServicoGerarBoleto(Double valorDiaria, ServicoTaxa servicoTaxa) {
		super();
		this.valorDiaria = valorDiaria;
		this.servicoTaxa = servicoTaxa;
	}

	
	public void processarBoleto(Aluguel aluguel) {
		
		Double taxaTotal = servicoTaxa.calculaTaxa(valorDiaria);
		aluguel.getBoleto().setTaxaTotal(taxaTotal);
		
		Double valorTotal = (valorDiaria * aluguel.getNumeroDiarias()) + taxaTotal;
		aluguel.getBoleto().setValorTotal(valorTotal);
	}
	


	public Double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public ServicoTaxa getServicoTaxa() {
		return servicoTaxa;
	}

	public void setServicoTaxa(ServicoTaxa servicoTaxa) {
		this.servicoTaxa = servicoTaxa;
	}




}
