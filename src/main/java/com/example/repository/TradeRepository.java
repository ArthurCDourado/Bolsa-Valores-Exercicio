package com.example.repository;

import org.springframework.stereotype.Repository;
import com.example.entidades.Trade;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long>{}
