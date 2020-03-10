package edu.infnet.patrimonio.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.infnet.patrimonio.modelo.Patrimonio;
import edu.infnet.patrimonio.negocio.servico.PatrimonioService;

@WebServlet(name = "PatrimonioEdit", urlPatterns = "/EditPatrimonioSrv")
public class EditPatrimonioServlet extends HttpServlet {

	private PatrimonioService service;

	public EditPatrimonioServlet() {

		service = new PatrimonioService();
	}

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		Patrimonio patrimonio = service.buscarID(id);
		req.setAttribute("patrimonio", patrimonio);
		req.getRequestDispatcher("pages/patrimonio_edit.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String identificacao = req.getParameter("numero");
		String nome = req.getParameter("nome");
		String local = req.getParameter("local");

		Patrimonio patrimonio = service.buscarID(id);

		patrimonio.setIdentificacao(identificacao);
		patrimonio.setNome(nome);
		patrimonio.setLocal(local);

		service.editarPatrimonio(patrimonio);

		List<Patrimonio> patrimonioo = service.listaPatrimonio();
		req.setAttribute("patrimonio", patrimonioo);
		req.getRequestDispatcher("pages/patrimonio_list.jsp").forward(req, resp);

		resp.sendRedirect(req.getContextPath());

		;
	}

}
