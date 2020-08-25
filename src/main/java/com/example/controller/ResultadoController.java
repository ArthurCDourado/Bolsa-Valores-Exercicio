package com.example.controller;

import com.example.entidades.Resultado;
import com.example.service.FechamentoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resultado")
public class ResultadoController {
	
	private FechamentoService fechamentoService;

	public ResultadoController(FechamentoService fechamentoService) {
		this.fechamentoService = fechamentoService;
	}
	
	@GetMapping()
	public Resultado findResultado() {
		return fechamentoService.calcularRendimento();
	}
}
