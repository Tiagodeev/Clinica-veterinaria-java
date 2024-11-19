package view;

import java.sql.Connection;
import controller.ClienteController;
import controller.FuncionarioController;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import database.DatabaseConnection;

public class Menu {

    private Scanner scanner;
    private ClienteController clienteController;
    private FuncionarioController funcionarioController;

    public Menu() {
        scanner = new Scanner(System.in);
        clienteController = new ClienteController();  // Instancia o controlador de cliente
        funcionarioController = new FuncionarioController();  // Instancia o controlador de funcionário
        MenuPrincipal();
    }

    public void MenuPrincipal() {
        int mOption;

        do {
            System.out.println("\n\n\n\n\nMenu da Clínica Veterinária:");
            System.out.println("1. Adicionar cadastros");
            System.out.println("2. Listar cadastros");
            System.out.println("3. Agendar Consulta");
            System.out.println("4. Ver Consultas");
            System.out.println("5. Editar cadastros");
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
                    System.out.println("Agendar consulta");
                    break;
                case 4:
                    System.out.println("Ver consultas");
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
            System.out.println("2. Adicionar Funcionário");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha após nextInt()

            switch (option) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarFuncionario();
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
            System.out.println("2. Listar Funcionários");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    listarClientes();
                    break;
                case 2:
                    listarFuncionarios();
                    break;
                case 3:
                	//listarAnimal()
                	break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 0);
    }

    private void cadastrarCliente() {
        System.out.println("Nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("endereço do cliente: ");
        String endereco = scanner.nextLine();
        
        System.out.println("Telefone do cliente: ");
        String telefone = scanner.nextLine();
        

        clienteController.cadastrarCliente(nome, endereco, telefone);  // Chamando o controlador de cliente
    }

    private void cadastrarFuncionario() {
        System.out.println("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Cargo do funcionário: ");
        String cargo = scanner.nextLine();

        funcionarioController.cadastrarFuncionario(nome, cargo);  // Chamando o controlador de funcionário
    }

    private void listarClientes() {
        clienteController.listarClientes();  // Chamando o controlador de cliente
    }

    private void listarFuncionarios() {
        funcionarioController.listarFuncionarios();  // Chamando o controlador de funcionário
    }
}