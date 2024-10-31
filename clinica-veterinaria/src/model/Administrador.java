package model;

public class Administrador extends Funcionario{
	
	//construtor
	public Administrador(String nome, String telefone, String email) {
		super(nome, telefone, email, "Administrador");
	}
	
	public void getRegistroFinanceiro() {
		System.out.println("registros financeiros");
	};
	public void verAgenda() {
		System.out.println("Agenda de serviços");
	};
}