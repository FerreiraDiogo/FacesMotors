package br.com.diogo.FacesMotors.bean;

import javax.faces.bean.ManagedBean;

import br.com.diogo.FacesMotors.DAO.AutomovelDAO;
import br.com.diogo.FacesMotors.modelo.Automovel;

@ManagedBean
public class AutomovelBean {

	private Automovel automovel = new Automovel();

	public Automovel getAutomovel() {
		return this.automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

	public void salva(Automovel automovel) {
		
		new AutomovelDAO().salvar(automovel);
		

		System.out.println("teste 1 2 3");

	}
}
