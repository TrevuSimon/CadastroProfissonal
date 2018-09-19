package br.edu.fapi.cadastroprofissional.view;

import java.util.Scanner;

import br.edu.fapi.cadastroprofissional.controller.Controller;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    Controller opcao = new Controller();
    int aux;

    public int homeScreen() {
        System.out.println("===========================================================================");
        System.out.println("+   Sistema de Genr�nciamento de Profissionais:                           +\n+                                                                         +");
        System.out.println("+   01 � Cadastrar Profissional                                           +");
        System.out.println("+   02 � Criar relat�rio de profissionais ordenada por Nome               +");
        System.out.println("+   03 � Criar relat�rio de profissionais ordenado por Data de Nascimento +");
        System.out.println("+   04 � Criar relat�rio de profissionais ordenado por Estado             +");
        System.out.println("+   05 � Criar relat�rio de profissionais ordenado por sal�rio            +");
        System.out.println("+   06 � Consolidar relat�rio de profissionais                            +");
        System.out.println("+   07 � Pesquisar dados                                                  +");
        System.out.println("+   08 � Excluir Profissional                                             +");
        System.out.println("+   09 - Sair                                                             +");
        System.out.println("===========================================================================");
        aux = opcao.opcaoMenu();
        return aux;
    }

    public int registerProfessional() {
        System.out.println("===========================================================================");
        System.out.println("+   Cadastrar Profissionais:                                              +\n+                                                                         +");
        System.out.println("+   01 � Advogado                                                         +");
        System.out.println("+   02 � Dentista                                                         +");
        System.out.println("+   03 � M�dico                                                           +");
        System.out.println("===========================================================================");
        aux = opcao.opcaoRegisterProfissional();
        return aux;
    }

}
