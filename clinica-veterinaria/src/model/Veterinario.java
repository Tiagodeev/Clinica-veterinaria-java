package model;

import model.Funcionario;

public class Veterinario extends Funcionario{
	
	private String crm;//registro profissional
	
	//construtor
	public Veterinario(String nome, String telefone, String email, String crm) {
		super(nome, telefone, email, "Veterinario");
		this.crm = crm;
		
	}
	
	public void realizarServiço() {};
	public void agendarServiço() {};
	public void criarReceitaMedica() {};
	public void verAgenda() {};
	
	//getters e setters
	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}
}
