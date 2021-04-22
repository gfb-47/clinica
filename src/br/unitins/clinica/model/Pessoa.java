package br.unitins.clinica.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Pessoa extends DefaultEntity<Pessoa>{

	private static final long serialVersionUID = -5750280352802259605L;
	
	private String nomeCompleto;
	@Column(unique=true, nullable=false) 
	private String cpf;
	private Date dataNascimento;
	@Column(unique=true) 
	private String telefone;
	private Boolean confiavel;
	@Column(unique=true, nullable=false) 
	private String email;
	private String senha;
	private TipoUsuario tipoUsuario;
	@ManyToMany(cascade=CascadeType.PERSIST)
	private List<Termo> termosAceitos;

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Boolean getConfiavel() {
		return confiavel;
	}

	public void setConfiavel(Boolean confiavel) {
		this.confiavel = confiavel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}
