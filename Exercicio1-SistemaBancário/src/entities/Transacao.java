package entities;

import java.util.Date;

import entities.enums.TipoTransacao;

public class Transacao {
	
	Date moment;
	private double valor;
	TipoTransacao tipoTransacao;
	
	public Transacao() {		
	}

	public Transacao(Date moment, double valor, TipoTransacao tipoTransacao) {
		super();
		this.moment = moment;
		this.valor = valor;
		this.tipoTransacao = tipoTransacao;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public TipoTransacao getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(TipoTransacao tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}
	
	

}
