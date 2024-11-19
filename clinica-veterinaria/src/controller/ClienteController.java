package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import database.DatabaseConnection;

public class ClienteController {

    private Connection connection;

    public ClienteController() {
        connection = DatabaseConnection.getConnection();  // Conexão com o banco
    }

    // Método para cadastrar cliente
    public void cadastrarCliente(String nome, String endereco, String telefone) {
        String sql = "INSERT INTO cliente (nome, endereco, telefone) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, endereco);
            stmt.setString(3, telefone);
            stmt.executeUpdate();
            System.out.println("Cadastro de cliente realizado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
        }
    }

    // Método para listar clientes
    public void listarClientes() {
        String sql = "SELECT * FROM cliente";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id_cliente");
                String nome = resultSet.getString("nome");
                System.out.println("ID: " + id + ", Nome: " + nome);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar clientes: " + e.getMessage());
        }
    }
    
    
}