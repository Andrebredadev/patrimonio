package edu.infnet.patrimonio.negocio.servico;

import java.util.List;

import edu.infnet.patrimonio.modelo.Patrimonio;
import edu.infnet.patrimonio.negocio.dao.PatrimonioDAO;

public class PatrimonioService {

	private PatrimonioDAO dao;

	public PatrimonioService() {
		dao = new PatrimonioDAO();
	}

	public List<Patrimonio> listaPatrimonio() {

		return dao.findAll();
	}

	public Boolean salvarPatrimonio(Patrimonio patrimonio) {

		return dao.save(patrimonio);

	}

	public Boolean editarPatrimonio(Patrimonio patrimonio) {
		return dao.edit(patrimonio);
	}

	public Patrimonio buscarID(Integer id) {
		return dao.find(id);
	}

	public Boolean excluirPatrimonio(Integer id) {

		Patrimonio patrimonio = this.buscarID(id);
		return dao.delete(patrimonio);
	}

}
