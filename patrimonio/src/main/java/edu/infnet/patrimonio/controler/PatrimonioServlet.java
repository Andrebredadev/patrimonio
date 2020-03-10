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

@WebServlet(name = "patrimonio", urlPatterns = "/ListSrv")
public class PatrimonioServlet extends HttpServlet {

	private PatrimonioService service;

	public PatrimonioServlet() {
		service = new PatrimonioService();

	}

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Patrimonio> patrimonio = service.listaPatrimonio();
		req.setAttribute("patrimonio", patrimonio);
		req.getRequestDispatcher("pages/patrimonio_list.jsp").forward(req, resp);

	}

}
