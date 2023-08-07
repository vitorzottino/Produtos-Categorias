package br.com.fiap.controller;

import java.sql.Connection;

import br.com.fiap.dao.ProdutosDAO;
import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.Produtos;

public class ProdutosController {
	
	private ProdutosDAO produtoDAO;
	
	public ProdutosController() {
		Connection connection = new ConnectionFactory().conectarOracle();
		this.produtoDAO = new ProdutosDAO(connection);
	}
	
	public void salvarProduto(Produtos produto ) {
		this.produtoDAO.salvarComCategoria(produto);
	}
	

}