package br.edu.fapi.cadastroprofissional.view;

import java.util.Date;
import java.util.Scanner;

import br.edu.fapi.cadastroprofissional.controller.Controller;
import br.edu.fapi.cadastroprofissional.model.Advogado;
import br.edu.fapi.cadastroprofissional.model.Dentista;
import br.edu.fapi.cadastroprofissional.model.Funcionario;
import br.edu.fapi.cadastroprofissional.model.Medico;

public class Register {

	Date dataNascimento;
	Scanner scanner = new Scanner(System.in);
	Controller cadastro = new Controller();
	Funcionario funcionario;

	public void cadastrarFuncionarioAdvogado() {

		funcionario = new Advogado();

		System.out.println("===========================================================================");
		System.out.println(
				"+   Cadastrar Advogado - preencha os campos abaixo                        +\n+                                                                         +");

		System.out.println("Nome Completo: ");
		funcionario.setNome(scanner.nextLine());

		System.out.println("Data de Nascimento:");
		funcionario.setNascimento(dataNascimento);

		System.out.println("Rua: ");
		funcionario.setRua(scanner.nextLine());

		System.out.println("Cidade: ");
		funcionario.setCidade(scanner.nextLine());

		System.out.println("Estado:");
		funcionario.setEstado(scanner.nextLine());

		System.out.println("Salário:");
		funcionario.setSalario(scanner.nextFloat());
		System.out.println("===========================================================================");
		cadastro.cadastroProfissionalAdvogado(funcionario);
	}

	public void cadastrarFuncionarioDentista() {

		funcionario = new Dentista();

		System.out.println("===========================================================================");
		System.out.println(
				"+   Cadastrar Dentista - preencha os campos abaixo                        +\n+                                                                         +");

		System.out.println("Nome Completo: ");
		funcionario.setNome(scanner.nextLine());

		System.out.println("Data de Nascimento:");
		funcionario.setNascimento(dataNascimento);

		System.out.println("Rua: ");
		funcionario.setRua(scanner.nextLine());

		System.out.println("Cidade: ");
		funcionario.setCidade(scanner.nextLine());

		System.out.println("Estado:");
		funcionario.setEstado(scanner.nextLine());

		System.out.println("Salário:");
		funcionario.setSalario(scanner.nextFloat());
		System.out.println("===========================================================================");
		cadastro.cadastroProfissionalDentista(funcionario);
	}

	public void cadastrarFuncionarioMedico() {

		funcionario = new Medico();

		System.out.println("===========================================================================");
		System.out.println(
				"+   Cadastrar Médico - preencha os campos abaixo                          +\n+                                                                         +");

		System.out.println("Nome Completo: ");
		funcionario.setNome(scanner.nextLine());

		System.out.println("Data de Nascimento:");
		funcionario.setNascimento(dataNascimento);

		System.out.println("Rua: ");
		funcionario.setRua(scanner.nextLine());

		System.out.println("Cidade: ");
		funcionario.setCidade(scanner.nextLine());

		System.out.println("Estado:");
		funcionario.setEstado(scanner.nextLine());

		System.out.println("Salário:");
		funcionario.setSalario(scanner.nextFloat());
		System.out.println("===========================================================================");
		cadastro.cadastroProfissionalMedico(funcionario);
	}
}
