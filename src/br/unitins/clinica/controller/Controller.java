package br.unitins.clinica.controller;

import java.io.Serializable;

import br.unitins.clinica.application.RepositoryException;
import br.unitins.clinica.application.Util;
import br.unitins.clinica.model.DefaultEntity;
import br.unitins.clinica.repository.Repository;

public abstract class Controller <T extends DefaultEntity<? super T>> implements Serializable {

	private static final long serialVersionUID = 3648816070687810287L;
	
	protected T entity;

	public Controller() {
		super();
	}

	public void save() {
		
		Repository<T> repo = new Repository<T>();
		try {
			repo.beginTransaction();
			setEntity(repo.save(getEntity()));
			repo.commitTransaction();
			Util.addInfoMessage("Saved with success");
		} catch (RepositoryException e) {
			repo.rollbackTransaction();
			e.printStackTrace();
			Util.addErrorMessage("Error on saving");
		}
	}

	public void remove(T entity) {
		Repository<T> repo = new Repository<T>();
		try {
			repo.beginTransaction();
			repo.remove(entity);
			Util.addInfoMessage("Deleted with success");
			repo.commitTransaction();
		} catch (br.unitins.clinica.application.RepositoryException e) {
			repo.rollbackTransaction();
			e.printStackTrace();
			Util.addErrorMessage("Error on deleting.");
		}
	}
	
	public void edit(T entity) {
		setEntity(entity);
	}
	
	public void clean() {
		setEntity(null);
	}

	public abstract T getEntity();

	public void setEntity(T entity) {
		this.entity = entity;
	}
}