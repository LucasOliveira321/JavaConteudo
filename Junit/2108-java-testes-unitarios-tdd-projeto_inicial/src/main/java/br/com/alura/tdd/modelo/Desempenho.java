package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
	RUIM{
		public BigDecimal reajuste(){
			return new BigDecimal("0.01");
	}},
	REGULAR{
		public BigDecimal reajuste() {
			return new BigDecimal("0.02");
		}
	},
	BOM{
		public BigDecimal reajuste() {
			return new BigDecimal("0.05");
		}
	},
	EXCELENTE{
		public BigDecimal reajuste() {
			return new BigDecimal("0.1");
		}
	};
	
	// Quando quiser obrigar as constantes a utilizar um método,
	// é só criar o método como abstract
	public abstract BigDecimal reajuste();
	

}
