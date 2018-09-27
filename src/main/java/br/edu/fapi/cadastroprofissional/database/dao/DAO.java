package br.edu.fapi.cadastroprofissional.database.dao;

import java.awt.List;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import br.edu.fapi.cadastroprofissional.model.Funcionario;

public class DAO {

	public int cadastrarFuncionarioAdvogado(Funcionario funcionario) {
		try (Connection connection = Connections.openConnection()) {

			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(
					"insert into funcionario_adv(nome, nascimento, rua, cidade, estado, salario) values (?,?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);

			preparedStatement.setString(1, funcionario.getNome());
			preparedStatement.setDate(2, (Date) funcionario.getNascimento());
			preparedStatement.setString(3, funcionario.getRua());
			preparedStatement.setString(4, funcionario.getCidade());
			preparedStatement.setString(5, funcionario.getEstado());
			preparedStatement.setFloat(6, funcionario.getSalario());

			int resultado = preparedStatement.executeUpdate();
			System.out.println("Registro inserido");
			//// Obtï¿½m a pk gerada.
			ResultSet res = preparedStatement.getGeneratedKeys();
			if (res.first()) {
				System.out.println("Cï¿½digo gerado: " + res.getInt(1));
			}
			return resultado;
		} catch (SQLException e) {
			System.out.println("Conexï¿½o nï¿½o estabelecida.");
			System.out.println(e.getMessage());
		}
		return 0;
	}

	public int cadastrarFuncionarioDentista(Funcionario funcionario) {
		try (Connection connection = Connections.openConnection()) {

			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(
					"insert into funcionario_den(nome, nascimento, rua, cidade, estado, salario) values (?,?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);

			preparedStatement.setString(1, funcionario.getNome());
			preparedStatement.setDate(2, (Date) funcionario.getNascimento());
			preparedStatement.setString(3, funcionario.getRua());
			preparedStatement.setString(4, funcionario.getCidade());
			preparedStatement.setString(5, funcionario.getEstado());
			preparedStatement.setFloat(6, funcionario.getSalario());

			int resultado = preparedStatement.executeUpdate();
			System.out.println("Registro inserido");
			//// Obtï¿½m a pk gerada.
			ResultSet res = preparedStatement.getGeneratedKeys();
			if (res.first()) {
				System.out.println("Cï¿½digo gerado: " + res.getInt(1));
			}
			return resultado;
		} catch (SQLException e) {
			System.out.println("Conexï¿½o nï¿½o estabelecida.");
			System.out.println(e.getMessage());
		}
		return 0;
	}

	public int cadastrarFuncionarioMedico(Funcionario funcionario) {
		try (Connection connection = Connections.openConnection()) {

			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(
					"insert into funcionario_med(nome, nascimento, rua, cidade, estado, salario) values (?,?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);

			preparedStatement.setString(1, funcionario.getNome());
			preparedStatement.setDate(2, (Date) funcionario.getNascimento());
			preparedStatement.setString(3, funcionario.getRua());
			preparedStatement.setString(4, funcionario.getCidade());
			preparedStatement.setString(5, funcionario.getEstado());
			preparedStatement.setFloat(6, funcionario.getSalario());

			int resultado = preparedStatement.executeUpdate();
			System.out.println("Registro inserido");
			//// Obtï¿½m a pk gerada.
			ResultSet res = preparedStatement.getGeneratedKeys();
			if (res.first()) {
				System.out.println("Cï¿½digo gerado: " + res.getInt(1));
			}
			return resultado;
		} catch (SQLException e) {
			System.out.println("Conexï¿½o nï¿½o estabelecida.");
			System.out.println(e.getMessage());
		}
		return 0;
	}

	public ArrayList<Funcionario> listarFuncionarios() {
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		try (Connection connection = Connections.openConnection()) {
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(
					"select * from funcionario_adv order by nome;", Statement.RETURN_GENERATED_KEYS);

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Funcionario funcionario = new Funcionario();
				funcionario.setNome(resultSet.getString("nome"));
				funcionario.setNascimento(resultSet.getDate("nascimento"));
				funcionario.setRua(resultSet.getString("rua"));
				funcionario.setCidade(resultSet.getString("cidade"));
				funcionario.setEstado(resultSet.getString("estado"));
				funcionario.setSalario(resultSet.getFloat("salario"));
				funcionarios.add(funcionario);
			}

		} catch (SQLException e) {
			System.out.println("Conexão não estabelecida.");
			System.out.println(e.getMessage());
		}
		return funcionarios;
	}
}