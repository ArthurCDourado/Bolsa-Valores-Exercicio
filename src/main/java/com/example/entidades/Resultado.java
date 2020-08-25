package com.example.entidades;

import javax.persistence.*;

@Entity
@Table(schema = "public", name = "resultado")
public class Resultado {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "quantidade")
	private int quantidade;
	
	@Column(name = "saldo_atual")
	private double saldoAtual;
	
	@Column(name = "rendimento_total")
	private double rendimentoTotal;
	
	@Column(name = "rendimento_porcentagem")
	private double rendimentoEmPorcentagem;

	public Resultado(Long id, int quantidade, double saldoAtual, double rendimentoTotal,
			double rendimentoEmPorcentagem) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.saldoAtual = saldoAtual;
		this.rendimentoTotal = rendimentoTotal;
		this.rendimentoEmPorcentagem = rendimentoEmPorcentagem;
	}

	public Resultado() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public double getRendimentoTotal() {
		return rendimentoTotal;
	}

	public void setRendimentoTotal(double rendimentoTotal) {
		this.rendimentoTotal = rendimentoTotal;
	}

	public double getRendimentoEmPorcentagem() {
		return rendimentoEmPorcentagem;
	}

	public void setRendimentoEmPorcentagem(double rendimentoEmPorcentagem) {
		this.rendimentoEmPorcentagem = rendimentoEmPorcentagem;
	}
}
