package br.edu.fapi.cadastroprofissional.file.dao;

import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DAO {
	
	
	public void files_createDirectory() throws Exception {		
		Path path = Paths.get(System.getProperty("user.dir")).resolve("Ralatorios");
		//Verifica se o path representa um diretorio, o retorno é false pois o diretório ainda não foi criado.
		System.out.println(Files.isDirectory(path));

		try {
			Files.createDirectory(path);
		}catch(FileAlreadyExistsException e) {
			System.out.println("Diretório já criado.");
		}
		
		//Nesse momento o retorno é verdadeiro pois o diretório foi criado.
		System.out.println(Files.isDirectory(path));

	}

}
