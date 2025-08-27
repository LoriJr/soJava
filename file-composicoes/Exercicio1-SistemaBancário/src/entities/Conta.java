package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.enums.TipoConta;


public class Conta {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	
	private int cc;
	private Titular titular;
	private double saldo;
	private TipoConta tipoConta;
	
	List<Transacao> transacao = new ArrayList<>();
	
	public Conta() {		
	}

	public Conta(int cc, Titular titular, double saldo, TipoConta tipoConta) {
		
		this.cc = cc;
		this.titular = titular;
		this.saldo = saldo;
		this.tipoConta = tipoConta;
		
	}

	public int getCc() {
		return cc;
	}
	
	public Titular getTitular() {
		return titular;
	}
	
	public void setCc(int cc) {
		this.cc = cc;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	public List<Transacao> getTransacao() {
		return transacao;
	}

	public void addTransacao(Transacao item) {
		transacao.add(item);
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void transferir(Conta destino, double valor) {
		sacar(valor);
		destino.depositar(valor);
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Titular da Conta: ");
		sb.append(titular.getTitularNome() + "\n");
		sb.append("CPF: ");
		sb.append(titular.getTitularCpf() + "\n");
		sb.append("Tipo da conta: ");
		sb.append(tipoConta + "\n");
		sb.append("Saldo: ");
		sb.append(String.format("%.2f", saldo) + "\n");
		sb.append("Operação realizada: ");
		for(Transacao c : transacao) {
			sb.append(c.tipoTransacao + "\n");
			sb.append("Data: ");
			sb.append(c.getMoment() + "\n");
			sb.append("Valor: ");
			sb.append(String.format("%.2f" + c.getValor() + "\n"));
		}
		
		
		return sb.toString();
	}
	
	

}
