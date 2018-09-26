package br.edu.fapi.cadastroprofissional.database.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Connections {

    public static String url = "jdbc:mysql://localhost:3306/cadastro_profissional";
    public static String usuario = "root";
    public static String senha = "";

    public static Connection openConnection() throws SQLException {
        return (Connection) DriverManager.getConnection(url, usuario, senha);
        //return DriverManager.getConnection(url, usuario, senha);
    }
}
