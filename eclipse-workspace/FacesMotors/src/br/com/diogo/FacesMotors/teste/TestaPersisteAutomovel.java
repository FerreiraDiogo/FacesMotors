package br.com.diogo.FacesMotors.teste;

import javax.persistence.EntityManager;

import br.com.diogo.FacesMotors.modelo.Automovel;
import br.com.diogo.FacesMotors.util.JPAUtil;

public class TestaPersisteAutomovel {

	public static void main(String[] args) {
			Automovel auto = new Automovel();
			auto.setMarca("matanza");
			auto.setModelo("interceptor v6");
			auto.setAnoDeFabricacao(2018);
			auto.setAnoModelo(2019);
			auto.setObservacoes("nem o diabo bebe tanta gasolina");
			
			EntityManager em = new JPAUtil().getEntityManager();
			em.getTransaction().begin();
			em.persist(auto);
			em.getTransaction().commit();
			em.close();
			
	}

}
