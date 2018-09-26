package br.edu.fapi.cadastroprofissional.controller;

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
				System.out.println("Opcao Inv�lida digite novamente");
				op = scanner.nextInt();
			} else {
				ok = false;
			}
		}
		return op;
	}

	public void cadastroProfissionalAdvogado(Funcionario dadosPreenchidos) {
		funcionario.cadastrarFuncionarioAdvogado(dadosPreenchidos);
	}

	public void cadastroProfissionalDentista(Funcionario dadosPreenchidos) {
		funcionario.cadastrarFuncionarioDentista(dadosPreenchidos);
	}

	public void cadastroProfissionalMedico(Funcionario dadosPreenchidos) {
		funcionario.cadastrarFuncionarioMedico(dadosPreenchidos);
	}
	
}