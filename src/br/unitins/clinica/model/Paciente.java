package br.unitins.clinica.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends DefaultEntity<Paciente> {
	
	private static final long serialVersionUID = -4981131568570237596L;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Pessoa pessoa;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}