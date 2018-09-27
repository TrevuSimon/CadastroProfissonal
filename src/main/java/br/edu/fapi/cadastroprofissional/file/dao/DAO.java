package br.edu.fapi.cadastroprofissional.file.dao;

import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DAO {

	public void files_createDirectory() throws Exception {
		Path path = Paths.get(System.getProperty("user.dir")).resolve("Ralatorios");
		
		try {
			Files.createDirectory(path);
		} catch (FileAlreadyExistsException e) {
		}
	}
	
	

}
