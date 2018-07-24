package br.com.diogo.FacesMotors.teste;

import br.com.diogo.FacesMotors.bean.AutomovelBean;

public class TestaAutomovelBean {

	public static void main(String[] args) {
		
		AutomovelBean ab = new AutomovelBean();
		
		ab.automovel.setMarca("ford");
		ab.automovel.setAnoModelo(2012);
		ab.automovel.setAnoDeFabricacao(2012);
		ab.automovel.setModelo("focus");
		ab.automovel.setObservacoes("completo!");
		
		ab.getAutomovel();
		
		System.out.println(ab.getAutomovel());
		System.out.println(ab.automovel.getMarca());
		System.out.println(ab.automovel.getModelo());
		System.out.println(ab.automovel.getAnoDeFabricacao());
		System.out.println(ab.automovel.getAnoModelo());
		System.out.println(ab.automovel.getObservacoes());
		
		ab.salva();
	}

}
