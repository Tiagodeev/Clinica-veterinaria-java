package view;

import java.util.Scanner;

public class MenuCadastro {

	private Scanner scr;
	
	
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
    
	
}
