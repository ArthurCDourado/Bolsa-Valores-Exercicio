package com.example.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entidades.Resultado;
import com.example.repository.FechamentoRepository;

@Service
public class FechamentoService {
	
	private FechamentoRepository repository;

	@Autowired
	public FechamentoService(FechamentoRepository repository) {
		super();
		this.repository = repository;
	}
	
	public Resultado calcularRendimento() {
		LocalDate data = LocalDate.now();
		Resultado resultado = new Resultado();
		resultado.setQuantidade(repository.calcularQuantidade(data));
		resultado.setSaldoAtual(resultado.getQuantidade() * repository.calcularPrecoAtivo(data));
		resultado.setRendimentoTotal(repository.calcularRendimentoTotal(data));
		resultado.setRendimentoEmPorcentagem((resultado.getSaldoAtual() / resultado.getRendimentoTotal()) - 1);
		return resultado;
	}

}
