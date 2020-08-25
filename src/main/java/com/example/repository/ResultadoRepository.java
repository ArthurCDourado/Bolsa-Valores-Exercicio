package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entidades.Resultado;

@Repository
public interface ResultadoRepository extends JpaRepository<Resultado, Long> {
	
	
}
