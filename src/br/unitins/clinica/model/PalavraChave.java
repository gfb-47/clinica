package br.unitins.clinica.model;

import javax.persistence.Entity;

@Entity
public class PalavraChave extends DefaultEntity<PalavraChave> {

	private static final long serialVersionUID = 4672596494659268275L;

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
