package br.edu.fapi.cadastroprofissional.view;

import java.util.Scanner;

import br.edu.fapi.cadastroprofissional.controller.Controller;
import br.edu.fapi.cadastroprofissional.file.dao.DAO;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    Controller opcao = new Controller();
    DAO files = new DAO();
    int aux;
    boolean close = false;

    public int homeScreen() {
        System.out.println("===========================================================================");
        System.out.println("+   Sistema de Genrenciamento de Profissionais:                           +\n+                                                                         +");
        System.out.println("+   01 - Cadastrar Profissional                                           +");
        System.out.println("+   02 - Criar relatorio de profissionais ordenada por Nome               +");
        System.out.println("+   03 - Criar relatorio de profissionais ordenado por Data de Nascimento +");
        System.out.println("+   04 - Criar relatorio de profissionais ordenado por Estado             +");
        System.out.println("+   05 - Criar relatorio de profissionais ordenado por salario            +");
        System.out.println("+   06 - Consolidar relatorio de profissionais                            +");
        System.out.println("+   07 - Pesquisar dados                                                  +");
        System.out.println("+   08 - Excluir Profissional                                             +");
        System.out.println("+   09 - Sair                                                             +");
        System.out.println("===========================================================================");
        aux = opcao.testeOpcoes(1,9);
        return aux;
    }

    public int registerProfessional() {
        System.out.println("===========================================================================");
        System.out.println("+   Cadastrar Profissionais:                                              +\n+                                                                         +");
        System.out.println("+   01 - Advogado                                                         +");
        System.out.println("+   02 - Dentista                                                         +");
        System.out.println("+   03 - Medico                                                           +");
        System.out.println("===========================================================================");
        aux = opcao.testeOpcoes(1,3);
        return aux;
    } 
    
    public void createReportName() throws Exception{
        System.out.println("===========================================================================");
        System.out.println("+   Baixar Relatorios:                                                    +\n+                                                                         +");
        System.out.println("+   01 - Relatorio por Nome                                               +");
        System.out.println("+   02 - Voltar ao menu inicial                                           +");
        System.out.println("===========================================================================");

        String esc = "";

        try {
            files.files_createDirectory();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.print(">");
        esc = scanner.nextLine();

        if("1".equals(esc)){
            if(opcao.ControllerReportName()) {
                System.out.println("Sucesso! relatorio gerado");
            }else{
                System.out.println("Erro arquivo não gerado");
            }
        }


    }
    
    public void createReportDate() {
        System.out.println("===========================================================================");
        System.out.println("+   Baixar Relatorios:                                                    +\n+                                                                         +");
        System.out.println("+   01 - Relatorio por Data de Nascimento                                 +");
        System.out.println("+   02 - Voltar ao menu inicial                                           +");
        System.out.println("===========================================================================");
    }
    
    public void createReportState() {
        System.out.println("===========================================================================");
        System.out.println("+   Baixar Relatorios:                                                    +\n+                                                                         +");
        System.out.println("+   01 - Relatorio por Estado                                             +");
        System.out.println("+   02 - Voltar ao menu inicial                                           +");
        System.out.println("===========================================================================");
    }
    
    public void createReportSalary() {
        System.out.println("===========================================================================");
        System.out.println("+   Baixar Relatorios:                                                    +\n+                                                                         +");
        System.out.println("+   01 - Relatorio por Salario                                            +");
        System.out.println("+   02 - Voltar ao menu inicial                                           +");
        System.out.println("===========================================================================");
    }
    
    public void consolidateReport() {
        System.out.println("===========================================================================");
        System.out.println("+   Baixar Relatorios:                                                    +");
        System.out.println("===========================================================================");
    }
    
    public void searchDate() {
    	System.out.println("===========================================================================");
        System.out.println("+   Pesquisar Dados:                                                      +");
        System.out.println("===========================================================================");
    }
    
    public void excludeProfissional() {
    	System.out.println("===========================================================================");
        System.out.println("+   Excluir Profissional:                                                 +");
        System.out.println("===========================================================================");
    }  
    
    public void closeProgram() {
    	System.out.println("===========================================================================");
        System.out.println("+   PROGRAMA ENCERRADO:                                                   +");
        System.out.println("===========================================================================");
    } 
}
