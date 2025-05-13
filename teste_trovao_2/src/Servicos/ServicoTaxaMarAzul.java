package Servicos;

public class ServicoTaxaMarAzul implements ServicoTaxa {
	public Double calculaTaxa(Double valorDiaria) {
		Double taxa;
		taxa = ((0.02*valorDiaria)+15);
		return taxa;
	}
}
