package br.edu.fapi.cadastroprofissional.file.dao;

import br.edu.fapi.cadastroprofissional.model.Funcionario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DAO {
	
	public boolean reportName(List<Funcionario> funcionarios) {

		File file = new File("src/x.txt");
		try {
			FileWriter fileWriter = new FileWriter("ReportFuncionarios", true);
			PrintWriter printWriter = new PrintWriter(fileWriter);

			for (Funcionario item: funcionarios) {
				printWriter.printf("\n" + "Nome:%s - Data de nascimento:%s - Cidade:%s - Estado:%s - Rua:%s - Slario:%f ", "Arquivo gerado em: ",
				item.getNome(),item.getNascimento(),item.getCidade(),item.getEstado(),item.getRua(),item.getSalario());
			}


			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public void reportDate() {	
		
	}
	
	public void reportState() {
		
	}
	
	public void reportSalary() {
		
	}	
}
