package br.unitins.clinica.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Funcionario extends DefaultEntity<Funcionario> {

	private static final long serialVersionUID = 23117791188239792L;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Pessoa pessoa;
	private String atuacao;
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public String getAtuacao() {
		return atuacao;
	}
	public void setAtuacao(String atuacao) {
		this.atuacao = atuacao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
