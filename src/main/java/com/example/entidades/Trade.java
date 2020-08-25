package com.example.entidades;

import java.time.LocalDate;

import javax.persistence.*;

import com.example.enumerated.TipoOperacaoEnum;

@Entity
@Table(schema = "public", name = "user_trade")
public class Trade {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "data")
	private LocalDate data;
	
	@Column(name = "tipo_operacao")
	private TipoOperacaoEnum tipoOperacao;
	
	@Column(name = "mercado")
	private String mercado;
	
	@Column(name = "prazo")
	private String prazo;
	
	@Column(name = "instrument")
	private String instrument;
	
	@Column(name = "especificacao")
	private String especificacao;
	
	@Column(name = "quantidade")
	private Long quantidade;
	
	@Column(name = "preco")
	private double preco;
	
	@Column(name = "valor_total")
	private double valorTotal;

	public Trade(Long id, LocalDate data, TipoOperacaoEnum tipoOperacao, String mercado, String prazo,
			String instrument, String especificacao, Long quantidade, double preco, double valorTotal) {
		super();
		this.id = id;
		this.data = data;
		this.tipoOperacao = tipoOperacao;
		this.mercado = mercado;
		this.prazo = prazo;
		this.instrument = instrument;
		this.especificacao = especificacao;
		this.quantidade = quantidade;
		this.preco = preco;
		this.valorTotal = valorTotal;
	}

	public Trade() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public TipoOperacaoEnum getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(TipoOperacaoEnum tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public String getMercado() {
		return mercado;
	}

	public void setMercado(String mercado) {
		this.mercado = mercado;
	}

	public String getPrazo() {
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
}
