package Servicos;

public class ServicoTaxaParaiso {
	public Double calculaTaxa(Double valorDiaria) {
		Double taxa;
		taxa = ((0.05*valorDiaria)+10);
		return taxa;
	}
}
