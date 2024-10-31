package model;

import general.ClinicaMain;

public class Funcionario {
	
		private String nome;
		private String telefone;
		private String email;
		private String cargo; // veterinario, adm, atendente
		
		//constructor
		public Funcionario(String nome, String telefone, String email, String cargo) {
			this.nome = nome;
			this.telefone = telefone;
			this.email = email;
			this.cargo = cargo;
		}

		public void verAgenda() {
		};
		
		//getters e setters
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
	
}