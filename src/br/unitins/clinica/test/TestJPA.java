package br.unitins.clinica.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.unitins.clinica.model.Paciente;

public class TestJPA {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Clinica");
		EntityManager em = emf.createEntityManager();
		
		Paciente paciente = new Paciente();
		paciente.setId(1);
		paciente.setCpf("111");
		paciente.setNome("João");
		
		//Iniciando transação
		em.getTransaction().begin();
		em.persist(paciente);
		em.getTransaction().commit();
		
		System.out.println("Funcionou..");
	}
}
