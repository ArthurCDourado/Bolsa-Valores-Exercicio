package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.ResultadoRepository;

@Service
public class ResultadoService {

	private ResultadoRepository repository;

	@Autowired
	public ResultadoService(ResultadoRepository repository) {
		super();
		this.repository = repository;
	}
	
	
	
}
