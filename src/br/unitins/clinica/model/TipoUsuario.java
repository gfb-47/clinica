package br.unitins.clinica.model;

import java.util.List;

public enum TipoUsuario {
	PROFISSIONAL(1, "Profissional"), FUNCIONARIO(2, "Funcionário"), ADMIN(3, "Admin");

	private int id;
	private String label;
	private List<String> paginasComPermissao = null;


	private TipoUsuario(int id, String label) {
		this.id = id;
		this.label = label;	
		this.paginasComPermissao = null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

}
