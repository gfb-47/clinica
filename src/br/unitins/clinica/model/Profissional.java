package br.unitins.clinica.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Profissional extends DefaultEntity<Profissional> {

	private static final long serialVersionUID = 8770696778402507624L;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Pessoa pesssoa;
	private String especialidade;
	private String formacao;
	private String atuacao;

	public Pessoa getPesssoa() {
		return pesssoa;
	}

	public void setPesssoa(Pessoa pesssoa) {
		this.pesssoa = pesssoa;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getAtuacao() {
		return atuacao;
	}

	public void setAtuacao(String atuacao) {
		this.atuacao = atuacao;
	}

}
