package br.edu.fapi.cadastroprofissional.file.dao;

import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DAO {
	
	
	public void files_createDirectory() throws Exception {		
		Path path = Paths.get(System.getProperty("user.dir")).resolve("Ralatorios");
		//Verifica se o path representa um diretorio, o retorno � false pois o diret�rio ainda n�o foi criado.
		System.out.println(Files.isDirectory(path));

		try {
			Files.createDirectory(path);
		}catch(FileAlreadyExistsException e) {
			System.out.println("Diret�rio j� criado.");
		}
		
		//Nesse momento o retorno � verdadeiro pois o diret�rio foi criado.
		System.out.println(Files.isDirectory(path));

	}

}
