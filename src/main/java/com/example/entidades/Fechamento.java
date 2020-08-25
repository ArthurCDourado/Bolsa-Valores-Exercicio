package com.example.entidades;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(schema = "public", name = "instrument_quote")
public class Fechamento {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "simbol")
	private String simbol;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "date")
	private LocalDate date;

	public Fechamento(Long id, String simbol, double price, LocalDate date) {
		super();
		this.id = id;
		this.simbol = simbol;
		this.price = price;
		this.date = date;
	}

	public Fechamento() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSimbol() {
		return simbol;
	}

	public void setSimbol(String simbol) {
		this.simbol = simbol;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}
