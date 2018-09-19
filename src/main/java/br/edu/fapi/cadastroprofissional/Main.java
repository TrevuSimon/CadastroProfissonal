package br.edu.fapi.cadastroprofissional;

import java.util.Date;
import br.edu.fapi.cadastroprofissional.view.Menu;
import br.edu.fapi.cadastroprofissional.view.Register;

public class Main {

    public static void main(String[] args) {

        int op = 0, aux;

        Menu screen = new Menu();
        Register dados = new Register();
        
        //View -----------------------
        op = screen.homeScreen();

        switch (op) {
            case 1:
                screen.registerProfessional();
                dados.cadastrarFuncionarioAdvogado();
                break;
            case 3:
                screen.registerProfessional();
                dados.cadastrarFuncionarioDentista();
                break;
            case 4:
                screen.registerProfessional();
                dados.cadastrarFuncionarioMedico();
                break;
        }
    }
}