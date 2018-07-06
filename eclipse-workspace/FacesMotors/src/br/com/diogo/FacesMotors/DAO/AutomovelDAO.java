package br.com.diogo.FacesMotors.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.diogo.FacesMotors.modelo.Automovel;
import br.com.diogo.FacesMotors.util.JPAUtil;

public class AutomovelDAO {
	
	private EntityManager em;
	private List<Automovel> resultado;
	
	public AutomovelDAO() {
		this.em = Persistence.createEntityManagerFactory("automoveis").createEntityManager();
	}
	
	public void salvar(Automovel auto) {
		em.getTransaction().begin();
		em.persist(auto);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Automovel> buscaTudo(){
		String query = "select a from Automovel a";
		em.getTransaction().begin();
		Query q = em.createQuery(query,Automovel.class);
		this.resultado = q.getResultList();
		return resultado;
		
	}
	
	public void exibeBusca() {
		if(this.resultado==null) {
			buscaTudo();
		}
		for(Automovel a :this.resultado) {
			System.out.println(a.getMarca());
			System.out.println(a.getModelo());
			System.out.println(a.getAnoModelo());
			System.out.println(a.getAnoDeFabricacao());
			System.out.println(a.getAnoDeFabricacao());
			System.out.println(a.getObservacoes());
			System.out.println("\n\n");
		}
	}
	
	public void remover() {
		//implementar depois;
	}

}
