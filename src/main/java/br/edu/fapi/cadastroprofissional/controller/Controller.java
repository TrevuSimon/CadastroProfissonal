package br.edu.fapi.cadastroprofissional.controller;

import java.util.Scanner;

import br.edu.fapi.cadastroprofissional.database.dao.DAO;
import br.edu.fapi.cadastroprofissional.model.Funcionario;

public class Controller{

    int aux;
    Scanner scanner = new Scanner(System.in);
    Funcionario employee = new Funcionario();
    DAO funcionario = new DAO();

    //testar de opção na tela inicial
    public int opcaoMenu() {
        int op;
        boolean ok = true;
        System.out.println("+   Escolha uma opcao acima: ");
        op = scanner.nextInt();
        while (ok) {
            if (op < 1 || op > 9) {
                System.out.println("Opcao Inválida digite novamente");
                op = scanner.nextInt();
            } else {
                ok = false;
            }
        }
        return op;
    }

    //testar de opção na tela registrar profissional
    public int opcaoRegisterProfissional() {
        int op;
        boolean ok = true;
        System.out.println("+   Escolha uma opcao acima: ");
        op = scanner.nextInt();
        while (ok) {
            if (op < 1 || op > 3) {
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

}
