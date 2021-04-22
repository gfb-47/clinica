package br.unitins.clinica.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.unitins.clinica.application.JPAUtil;
import br.unitins.clinica.application.Session;
import br.unitins.clinica.application.Util;
import br.unitins.clinica.model.Pessoa;


@Named
@ViewScoped
public class LoginController implements Serializable {

	private static final long serialVersionUID = -7554946551552979100L;

	private Pessoa pessoa;

	public void singIn() {
		EntityManager em = JPAUtil.getEntityManager();
		TypedQuery<Pessoa> query = em.createQuery("from User u where u.email = :email and u.password = :password",
				Pessoa.class);
		
		String email = getEmail();
		String password = getPassword();
		query.setParameter("email", email);
		//Converte o password para Hash, assim podemos fazer a busca no Banco de Dados.
		query.setParameter("password", Util.hash(password));
		
		try {
			setUser(query.getSingleResult());
			Session.getInstance().setAttribute("loggedInUser", user);
			Util.redirect("/lip/views/user/index.xhtml");
		} catch (javax.persistence.NoResultException e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "User not found", null));
			FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
			Util.redirect("/lip/views/auth/login.xhtml");
		}
	}

	public void clean() {
		setEmail(null);
		setPassword(null);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}