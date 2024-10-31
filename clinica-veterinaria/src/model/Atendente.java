package model;

import model.Funcionario;

public class Atendente extends Funcionario{
	
	//construtor
	public Atendente(String nome, String telefone, String email) {
        super(nome, telefone, email, "Atendente");
    }
	
	public void cadastrarCliente() {};
	public void cadastrarAnimal() {};
	
}