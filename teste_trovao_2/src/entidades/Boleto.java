package entidades;

public class Boleto {

	private Double taxaTotal;
	
	private Double valorTotal;

	
	public Boleto() {
	}

	
	public Double getTaxaTotal() {
		return taxaTotal;
	}

	public void setTaxaTotal(Double taxaTotal) {
		this.taxaTotal = taxaTotal;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
}
