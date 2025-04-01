package entidades;

import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;

public class Aplicacao {
	private List<Servicos> quartosOcupados;

	public Aplicacao() {
		this.quartosOcupados = new ArrayList<>();
	}

	public boolean alugarQuarto(int numero, Entidades estudante) {
		for (Servicos q : quartosOcupados) {
			if (q.getNumero() == numero) {
				return false;
			}
		}
		quartosOcupados.add(new Servicos(numero, estudante));
		return true;
	}

	public void mostrarRelatorio() {
		quartosOcupados.sort(Comparator.comparingInt(Servicos::getNumero));

		System.out.println("\nRelatório de ocupação dos quartos:");
		for (Servicos q : quartosOcupados) {
			System.out.println(q);
		}
	}
}
