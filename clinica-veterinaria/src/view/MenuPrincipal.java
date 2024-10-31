package view;
import java.util.Scanner;
import general.ClinicaMain;

public class MenuPrincipal {

	Scanner scr = new Scanner(System.in);
	MenuCadastro viewcadastro = new MenuCadastro();
	MenuConsulta viewconsulta = new MenuConsulta();
	
    public void MenuPrincipal( ) {
    	
    	
        int opcao;
        
        do {
        	
            System.out.println("\nMenu da Clínica Veterinária:\n");
            System.out.println("1. Adicionar cadastros");
            System.out.println("2. Listar cadastros");
            System.out.println("3. Agendar Consulta");
            System.out.println("4. ver Consultas");
            System.out.println("0. Sair");
            
            System.out.print("\nEscolha uma opção: ");
            
            opcao = scr.nextInt();
            scr.nextLine();

            switch (opcao) {
                case 1:
                	viewcadastro.MenuAdicionar();
                    break;
                case 2:
                	
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
            }
        } while (opcao != 0);
    }
    
    public void MenuAdicionar() {
    	
        int opcao;
        
        do {
            System.out.println("\nMenu Adicionar:");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Adicionar Animal");
            System.out.println("3. Adicionar Funcionário");
            System.out.println("0. Voltar");
            
            System.out.print("\nEscolha uma opção: ");
            
            opcao = scr.nextInt();
            
            switch (opcao) {
                case 1:
                    //String nomeCliente = obterNome("cliente");
                    //String contatoCliente = obterContato();
                    //adicionarCliente(nomeCliente, contatoCliente);
                    break;
                case 2:
                    //String nomeAnimal = obterNome("animal");
                    //String especie = obterEspecie();
                    //adicionarAnimal(nomeAnimal, especie);
                    break;
                case 3:
                    //String nomeFuncionario = obterNome("funcionário");
                    //String cargo = obterCargo();
                    //adicionarFuncionario(nomeFuncionario, cargo);
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
    
    private void mostrarMenuconsultar() {
        int opcao;
        do {
            System.out.println("\nMenu Listar:");
            System.out.println("1. Listar Clientes");
            System.out.println("2. Listar Animais");
            System.out.println("3. Listar Funcionários");
            System.out.println("0. Voltar");
            
            
            System.out.print("\nEscolha uma opção: ");
            
            opcao = scr.nextInt();

            switch (opcao) {
                case 1:
                    //gerenciador.listarClientes();
                    break;
                case 2:
                    //gerenciador.listarAnimais();
                    break;
                case 3:
                    //gerenciador.listarFuncionarios();
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
