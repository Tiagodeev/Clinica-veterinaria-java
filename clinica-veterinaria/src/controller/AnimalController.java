package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.DatabaseConnection;

public class AnimalController {

	private Connection connection;

	public AnimalController() {
        connection = DatabaseConnection.getConnection();  // Conexão com o banco
    }
	

    // Método para cadastrar
    public void cadastrarFuncionario(String nome, String especie) {
        String sql = "INSERT INTO funcionario (nome, cargo) VALUES (?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, especie);
            stmt.executeUpdate();
            System.out.println("Cadastro de funcionário realizado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar funcionário: " + e.getMessage());
        }
    }

    // Método para listar
    public void listarFuncionarios() {
        String sql = "SELECT * FROM veterinairo";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id_funcionario");
                String nome = resultSet.getString("nome");
                System.out.println("ID: " + id + ", Nome: " + nome);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar funcionários: " + e.getMessage());
        }
    }
	
	
}
