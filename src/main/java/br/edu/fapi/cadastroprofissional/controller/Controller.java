package br.edu.fapi.cadastroprofissional.controller;



import java.util.List;
import java.util.Scanner;
import br.edu.fapi.cadastroprofissional.database.dao.DAO;
import br.edu.fapi.cadastroprofissional.model.Funcionario;

public class Controller {

	DAO funcionario = new DAO();
	br.edu.fapi.cadastroprofissional.file.dao.DAO file = new br.edu.fapi.cadastroprofissional.file.dao.DAO();


	Scanner scanner = new Scanner(System.in);

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

	public void cadastroProfissionalAdvogado(Funcionario dadosPreenchidos) {
		funcionario.cadastrarFuncionarioAdvogado(dadosPreenchidos);
	}

	public void cadastroProfissionalDentista(Funcionario dadosPreenchidos) {
		funcionario.cadastrarFuncionarioDentista(dadosPreenchidos);
	}

	public void cadastroProfissionalMedico(Funcionario dadosPreenchidos) {
		funcionario.cadastrarFuncionarioMedico(dadosPreenchidos);
	}


	public boolean ControllerReportName(){
		List<Funcionario> funcionarios = funcionario.listarProfissionais();
		if(file.reportName(funcionarios)){
			return true;
		}else{
			return false;
		}

	}
}

