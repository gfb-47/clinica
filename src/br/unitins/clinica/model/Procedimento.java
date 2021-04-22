package br.unitins.clinica.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Procedimento extends DefaultEntity<Procedimento> {

	private static final long serialVersionUID = 1533551325974008917L;
	
	private String nome;
	private Integer numeroSessoes;	
	private String descricaoPequena;
	// TODO: Use Duration
	private Integer duracaoMinutos;
	private Double valor;
	private String textoDetalhado;
	@ManyToMany(cascade=CascadeType.PERSIST)
	private List<PalavraChave> palavraChave;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroSessoes() {
		return numeroSessoes;
	}

	public void setNumeroSessoes(Integer numeroSessoes) {
		this.numeroSessoes = numeroSessoes;
	}

	public String getDescricaoPequena() {
		return descricaoPequena;
	}

	public void setDescricaoPequena(String descricaoPequena) {
		this.descricaoPequena = descricaoPequena;
	}

	public Integer getDuracaoMinutos() {
		return duracaoMinutos;
	}

	public void setDuracaoMinutos(Integer duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getTextoDetalhado() {
		return textoDetalhado;
	}

	public void setTextoDetalhado(String textoDetalhado) {
		this.textoDetalhado = textoDetalhado;
	}

	public List<PalavraChave> getPalavraChave() {
		return palavraChave;
	}

	public void setPalavraChave(List<PalavraChave> palavraChave) {
		this.palavraChave = palavraChave;
	}
	
	
}
