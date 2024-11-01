package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import database.DatabaseConnection;

public class Menu{
	
    private Scanner scanner;
    Connection connection = DatabaseConnection.getConnection();

    public Menu() {
        scanner = new Scanner(System.in);
        MenuPrincipal();
    }

    public void MenuPrincipal() {
    	
        int mOption;

        do {
        	System.out.println("\n\n\n\n\nMenu da Clínica Veterinária:\n");
            System.out.println("1. Adicionar cadastros");
            System.out.println("2. Listar cadastros");
            System.out.println("3. Agendar Consulta");
            System.out.println("4. ver Consultas");
            System.out.println("5. editar cadastros");
            System.out.println("0. Sair");
            mOption = scanner.nextInt();

            switch (mOption) {
                case 1:
                    MenuCadastro();
                    break;
                case 2:
                    MenuConsulta();
                    break;
                case 3:
                    System.out.println("agendar");
                    break;
                case 4:
                    System.out.println("ver consultas");
                    break;
                case 0:
                	System.out.println("Saindo...");
                	break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (mOption != 0);

        scanner.close();
    }

    private void MenuCadastro() {
        int option;

        do {
        	
        	System.out.println("\nMenu Adicionar:");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Adicionar Animal");
            System.out.println("3. Adicionar Funcionário");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha após nextInt()

            switch (option) {
                case 1:
                	cadastrarCliente(scanner, connection);
                    break;
                case 2:
                    System.out.println("cadastrar animal");
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 0);
    }

    private void MenuConsulta() {
        int option;

        do {
        	System.out.println("\nMenu Listar:");
            System.out.println("1. Listar Clientes");
            System.out.println("2. Listar Animais");
            System.out.println("3. Listar Funcionários");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                	consultarClientes(connection);
                    break;
                case 2:
                    consultarFuncionarios(connection);
                    break;
                case 3:
                	consultarFuncionarios(connection);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 0);
    }
    
    private static void consultarClientes(Connection connection) {
        String sql = "SELECT * FROM cliente"; 
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id_cliente"); 
                String nome = resultSet.getString("nome");
                System.out.println("ID: " + id + ", Nome: " + nome);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar clientes: " + e.getMessage());
        }
    }
    
    private static void consultarFuncionarios(Connection connection) {
        String sql = "SELECT * FROM funcionario"; 
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id_funcionario"); 
                String nome = resultSet.getString("nome");
                System.out.println("ID: " + id + ", Nome: " + nome);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar clientes: " + e.getMessage());
        }
    }
    
    
    private static void cadastrarCliente(Scanner scanner, Connection connection) {
        System.out.println("Nome do cliente: ");
        String nome = scanner.nextLine();
        
        System.out.println("E-mail do cliente: ");
        String telefone = scanner.nextLine();

        String sql = "INSERT INTO cliente (nome, telefone) VALUES (?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, telefone);
            stmt.executeUpdate();
            System.out.println("Cadastro realizado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
