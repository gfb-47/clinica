package br.unitins.clinica.model;

import javax.persistence.Entity;

@Entity
public class Termo extends DefaultEntity<Termo> {

	private static final long serialVersionUID = 2075296183280005715L;
	
	private String titulo;
	private String texto;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
