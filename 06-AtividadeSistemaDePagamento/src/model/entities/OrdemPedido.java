package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.enums.TipoPagamento;
import model.services.BoletoBancario;
import model.services.CartaoCredito;
import model.services.Dinheiro;
import model.services.Pagamento;
import model.services.Pix;

public class OrdemPedido {

	private Integer orderID;
	private LocalDate date;
	
	private TipoPagamento tipoPagamento;
	private Pagamento pagamento;
	private List<Produto> produtos;
		

	
	public OrdemPedido(Integer orderID, LocalDate date, TipoPagamento tipoPagamento) {
		super();
		this.orderID = orderID;
		this.date = date;
		this.tipoPagamento = tipoPagamento;
		this.produtos = new ArrayList<>();
		this.pagamento = formaDePagamento(tipoPagamento);
		
	}


	public Integer getOrderID() {
		return orderID;
	}


	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}


	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}


	public Pagamento getPagamento() {
		return pagamento;
	}


	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}


	public List<Produto> getProduto() {
		return produtos;
	}	
	
	
	public double calcularTotal() {
		double valorOrdem=0;
		for(Produto x: produtos) {
			valorOrdem +=x.valorTotal();
		}
		return valorOrdem;		
	}	
	
	public void processarPagamento() {
		pagamento.processarPagamento(calcularTotal());
	}
	
	private Pagamento formaDePagamento(TipoPagamento tipo) {
		switch(tipo) {
			case CARTAO_CREDITO:
				return new CartaoCredito();
			case BOLETO_BANCARIO:
				return new BoletoBancario();
			case PIX:				
				return new Pix();
			case DINHEIRO:
				return new Dinheiro();
			default:
				throw new IllegalArgumentException("Tipo de pagamento inválido");
		}
	}
	
	public double calcularComTaxa() {
		return pagamento.calcularTaxa(calcularTotal());
	}
	
	public void adicionarPedido(Produto produto) {
		produtos.add(produto);
	}
	
}
