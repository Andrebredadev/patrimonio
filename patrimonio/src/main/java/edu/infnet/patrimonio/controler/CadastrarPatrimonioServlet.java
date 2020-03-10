package edu.infnet.patrimonio.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.infnet.patrimonio.modelo.Patrimonio;
import edu.infnet.patrimonio.negocio.servico.PatrimonioService;

@WebServlet(name = "CadastrarPatrimonio", urlPatterns = { "/PatrimonioSrv" })
public class CadastrarPatrimonioServlet extends HttpServlet {

	private PatrimonioService service;

	public CadastrarPatrimonioServlet() {
		service = new PatrimonioService();
	}

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String action = req.getParameter("action");

		if ("new".equals(action)) {

			req.getRequestDispatcher("pages/patrimonio_cadastro.jsp").forward(req, resp);
			;

		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");

		if ("new".equals(action)) {
			Patrimonio patrimonio = iniciarPatrimonio(req);
			service.salvarPatrimonio(patrimonio);
			resp.sendRedirect("ListSrv");
		}
	}

	private Patrimonio iniciarPatrimonio(HttpServletRequest req) {

		String identificacao = req.getParameter("numero");
		String nome = req.getParameter("nome");
		String local = req.getParameter("local");

		return new Patrimonio(identificacao, nome, local);
	}

}
