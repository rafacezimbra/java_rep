package entidades;

import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;

public class Aplicacao {
	private List<Entidades> funcionarios;

	public Aplicacao() {
		this.funcionarios = new ArrayList<>();
	}

	public boolean adicionarFuncionario(Entidades funcionario) {
		for (Entidades f : funcionarios) {
			if (f.getId() == funcionario.getId()) {
				return false;
			}
		}
		funcionarios.add(funcionario);
		return true;
	}

	public boolean aumentarSalario(int id, double porcentagem) {
		for (Entidades f : funcionarios) {
			if (f.getId() == id) {
				f.aumentarSalario(porcentagem);
				return true;
			}
		}
		return false;
	}

	public void mostrarFuncionarios() {
		System.out.println("\nLista de funcionários atualizada:");
		for (Entidades f : funcionarios) {
			System.out.println(f);
		}
	}
}
