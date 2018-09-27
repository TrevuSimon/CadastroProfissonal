package br.edu.fapi.cadastroprofissional.controller;

import java.util.List;
import java.util.Scanner;

import br.edu.fapi.cadastroprofissional.database.dao.DAO;
import br.edu.fapi.cadastroprofissional.model.Funcionario;

public class Controller {

	DAO funcionario = new DAO();
	Scanner scanner = new Scanner(System.in);
	Funcionario employee = new Funcionario();

	// testar opcoes digitadas pelo usuario
	public int testeOpcoes(int numInicio, int numFim) {
		int op;
		boolean ok = true;
		System.out.println("+   Escolha uma opcao acima: ");
		op = scanner.nextInt();
		while (ok) {
			if (op < numInicio || op > numFim) {
				System.out.println("Opcao Inválida digite novamente");
				op = scanner.nextInt();
			} else {
				ok = false;
			}
		}
		return op;
	}

	// passa parametros para classe DAO implementar na tabela Advogado
	public void cadastroProfissionalAdvogado(Funcionario dadosPreenchidos) {
		funcionario.cadastrarFuncionarioAdvogado(dadosPreenchidos);
	}

	// passa parametros para classe DAO implementar na tabela Dentista
	public void cadastroProfissionalDentista(Funcionario dadosPreenchidos) {
		funcionario.cadastrarFuncionarioDentista(dadosPreenchidos);
	}

	// passa parametros para classe DAO implementar na tabela Médico
	public void cadastroProfissionalMedico(Funcionario dadosPreenchidos) {
		funcionario.cadastrarFuncionarioMedico(dadosPreenchidos);
	}

	// lista de dados de funcionario dados gerado apartir do banco de dados

	public void listarFuncionarios() {
		int aux = 1;
		switch (aux) {
		case 1:
			List<Funcionario> funcionariosADV = funcionario.listarFuncionarios_adv();
			for (Funcionario array : funcionariosADV) {
				System.out.println(array.getNome() + " " + array.getRua() + " " + array.getCidade() + " "
						+ array.getEstado() + " " + array.getSalario());
			}
			break;
		case 2:
			List<Funcionario> funcionariosDEN = funcionario.listarFuncionarios_adv();
			for (Funcionario array : funcionariosDEN) {
				System.out.println(array.getNome() + " " + array.getRua() + " " + array.getCidade() + " "
						+ array.getEstado() + " " + array.getSalario());
			}
			break;
		case 3:
			List<Funcionario> funcionariosMED = funcionario.listarFuncionarios_adv();
			for (Funcionario array : funcionariosMED) {
				System.out.println(array.getNome() + " " + array.getRua() + " " + array.getCidade() + " "
						+ array.getEstado() + " " + array.getSalario());
			}
			break;
		}
	}

	public void listaMedico() {
		List<Funcionario> funcionariosMED = funcionario.listarFuncionarios_adv();
		for (Funcionario array : funcionariosMED) {
			System.out.println(array.getNome() + " " + array.getRua() + " " + array.getCidade() + " "
					+ array.getEstado() + " " + array.getSalario());

		}
	}
}
