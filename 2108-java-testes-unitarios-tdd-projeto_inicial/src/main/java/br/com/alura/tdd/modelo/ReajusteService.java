package br.com.alura.tdd.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajusteService {
	
	public BigDecimal reajusteSalarial(Funcionario f, Desempenho desempenho){
		BigDecimal percentual = desempenho.reajuste();
		BigDecimal reajuste = f.getSalario().multiply(percentual);	
		return f.getSalario().add(reajuste).setScale(2,RoundingMode.HALF_UP);
	}

}
