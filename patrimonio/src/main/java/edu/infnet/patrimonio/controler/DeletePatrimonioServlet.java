package edu.infnet.patrimonio.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.infnet.patrimonio.negocio.servico.PatrimonioService;

@WebServlet(name = "PatrimonioDelete", urlPatterns = "/DeletePatrimonioSrv")

public class DeletePatrimonioServlet extends HttpServlet {

	private PatrimonioService service;

	public DeletePatrimonioServlet() {
		this.service = new PatrimonioService();
	}

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		service.excluirPatrimonio(id);
		resp.sendRedirect("ListSrv");
	}

}
