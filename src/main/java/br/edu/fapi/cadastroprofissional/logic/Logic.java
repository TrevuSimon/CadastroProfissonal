package br.edu.fapi.cadastroprofissional.logic;

import br.edu.fapi.cadastroprofissional.file.dao.DAO;
import br.edu.fapi.cadastroprofissional.view.Register;

public class Logic {

	Register dados = new Register();
	DAO files = new DAO();

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
	
	public void criarDiretorio() throws Exception {
		try {
			files.files_createDirectory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}