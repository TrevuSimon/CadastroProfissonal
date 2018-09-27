package br.edu.fapi.cadastroprofissional.file.dao;

import br.edu.fapi.cadastroprofissional.model.Funcionario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class DAO {
<<<<<<< HEAD
	
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

	
	public void files_createDirectory() throws Exception {		
		Path path = Paths.get(System.getProperty("user.dir")).resolve("Ralatorios");
		//Verifica se o path representa um diretorio, o retorno � false pois o diret�rio ainda n�o foi criado.
		System.out.println(Files.isDirectory(path));
=======
>>>>>>> feature/alexandre

	public void files_createDirectory() throws Exception {
		Path path = Paths.get(System.getProperty("user.dir")).resolve("Ralatorios");
		
		try {
			Files.createDirectory(path);
<<<<<<< HEAD
		}catch(FileAlreadyExistsException e) {
			System.out.println("Diret�rio j� criado.");
		}
		
		//Nesse momento o retorno � verdadeiro pois o diret�rio foi criado.
		System.out.println(Files.isDirectory(path));

=======
		} catch (FileAlreadyExistsException e) {
		}
>>>>>>> feature/alexandre
	}
	
	

}
