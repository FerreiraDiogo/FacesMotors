package br.com.diogo.FacesMotors.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.diogo.FacesMotors.DAO.AutomovelDAO;
import br.com.diogo.FacesMotors.modelo.Automovel;
import br.com.diogo.FacesMotors.util.JPAUtil;

@ManagedBean
public class AutomovelBean {

	private Automovel automovel = new Automovel();
	
	private List<Automovel> automoveis;
	
	public List<Automovel> getAutomoveis(){
		EntityManager em = new JPAUtil().getEntityManager();
		
		Query q = em.createQuery("select a from Automovel a",Automovel.class);
		this.automoveis = q.getResultList();
		em.close();
		
		return automoveis;
	}
	
	

	public Automovel getAutomovel() {
		return this.automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

	public void salva() {
		
		new AutomovelDAO().salvar(automovel);
		


	}
}
