package hipertrofia.teste;

import br.com.hipertrofia.modelo.*;

import java.sql.SQLException;

import br.com.hipertrofia.dao.hipertrofiaDAO;

public class teste {
	public static void main(String[] args) throws SQLException {
		hipertrofiaDAO  dao= new hipertrofiaDAO ();
		
		Produto produto = new Produto("blusa","PP",12);
		Cartao cartao = new Cartao(123456,333,7777);
		Pedido pedido = new Pedido("blusa","PP",12,1);
		Produto produtoAtualizado = new Produto(1,"Blusa","PP",12);
		Cartao cartaoAtualizado = new Cartao(1,5555555,333,7777);
		Pedido pedidoAtualizado = new Pedido(1,"blusa","PP",12,1);
		
		//Cadastrar
		dao.cadastrarCartao(cartao);
		dao.cadastrarProduto(produto);
		dao.cadastrarPedido(pedido);
		
		//Listar
		dao.getMetodoPagamento();
		dao.getEstoque();
		dao.getOrdens();
		
		//Editar
		dao.atualizarProduto(produtoAtualizado);
		dao.atualizarCartao(cartaoAtualizado);
		dao.atualizarPedido(pedidoAtualizado);
		
		//Listar
		dao.getMetodoPagamento();
		dao.getEstoque();
		dao.getOrdens();
		
		//Remover
		dao.removerPorIdProduto(produto.getId(),false);
		dao.removerPorIdCartao(produto.getId(),false);
		dao.removerPorIdPedido(produto.getId(),false);
		
		//Listar
		dao.getMetodoPagamento();
		dao.getEstoque();
		dao.getOrdens();

	}

}
