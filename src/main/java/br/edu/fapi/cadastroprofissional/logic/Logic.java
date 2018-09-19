package br.edu.fapi.cadastroprofissional.logic;

import br.edu.fapi.cadastroprofissional.view.Register;

public class Logic {

	Register dados = new Register();

	public void ecolherProfissional(int op) {
		switch (op) {
		case 1:
			dados.cadastrarFuncionarioAdvogado();
			break;
		case 2:
			dados.cadastrarFuncionarioDentista();
			break;
		case 3:
			dados.cadastrarFuncionarioMedico();
			break;
		}
	}
}