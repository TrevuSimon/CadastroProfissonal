package br.edu.fapi.cadastroprofissional;

import br.edu.fapi.cadastroprofissional.logic.Logic;
import br.edu.fapi.cadastroprofissional.view.Menu;

public class Main {

	public static void main(String[] args) {

		int op = 0, aux;

		Menu screen = new Menu();
		Logic function = new Logic();

		// View -----------------------
		op = screen.homeScreen();

		switch (op) {
		case 0:
			screen.closeProgram();
			break;
		case 1:
			aux = screen.registerProfessional();
			function.ecolherProfissional(aux);
			break;
		case 2:
			screen.createReportName();
			break;
		case 3:
			screen.createReportDate();
			break;
		case 4:
			screen.createReportState();
			break;
		case 5:
			screen.createReportSalary();
			break;
		case 6:
			screen.consolidateReport();
			break;
		case 7:
			screen.searchDate();
			break;
		case 8:
			screen.excludeProfissional();
			break;
		}
	}
}
