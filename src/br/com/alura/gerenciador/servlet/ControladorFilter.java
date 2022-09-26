package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.Acao;

//@WebFilter("/entrada")
public class ControladorFilter extends HttpFilter implements Filter {

	private static final long serialVersionUID = 1L;

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("ControladorFilter");
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		
		String paramAcao = request.getParameter("acao");
		String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao;
		String nome;
		try {

			Class<?> classe = Class.forName(nomeDaClasse);// carrega a classe com o nome
			@SuppressWarnings("deprecation")
			Acao acao = (Acao) classe.newInstance();
			nome = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}

		String[] tipoEEndereco = nome.split(":");
		if (tipoEEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEEndereco[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(tipoEEndereco[1]);
		}
	}

}
