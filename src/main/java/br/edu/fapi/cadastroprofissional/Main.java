package br.edu.fapi.cadastroprofissional;

import br.edu.fapi.cadastroprofissional.logic.Logic;
import br.edu.fapi.cadastroprofissional.view.Menu;

public class Main {

	public static void main(String[] args) {

		int op = 0, aux;

		Menu screen = new Menu();
		Logic profissional = new Logic();

		// View -----------------------
		op = screen.homeScreen();

		switch (op) {
		case 1:
			aux = screen.registerProfessional();
			profissional.ecolherProfissional(aux);
			break;

		}
	}
}