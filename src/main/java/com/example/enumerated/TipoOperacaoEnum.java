package com.example.enumerated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;
import java.util.stream.Stream;

public enum TipoOperacaoEnum {
	COMPRA(1, "Compra"),
	VENDA(2, "Venda");
	
	private Integer codigo;
	private String descricao;

	@JsonValue
	public int toValue() { return getCodigo(); }
	
	private TipoOperacaoEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	@JsonCreator
	public static TipoOperacaoEnum byCodigo(Integer codigo) {
	    return Stream
	      .of(values())
	      .filter(fil -> Objects.nonNull(codigo) && fil.codigo.intValue() == codigo.intValue())
	      .findAny()
	      .orElse(null);
	}

	@JsonCreator
	public static TipoOperacaoEnum byCodigo(boolean codigo) {
	    return codigo ? TipoOperacaoEnum.COMPRA : TipoOperacaoEnum.VENDA;
	}
}
