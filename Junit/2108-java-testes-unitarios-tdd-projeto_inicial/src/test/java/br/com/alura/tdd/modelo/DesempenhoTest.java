package br.com.alura.tdd.modelo;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class DesempenhoTest {

	@Test
	void reajusteSalarialComDesempenhoExcelenteOSalarioPrecisaReajustarParaOnzeMil(){
		Funcionario f = new Funcionario("Lucas", LocalDate.now(), new BigDecimal("10000"));
		ReajusteService r = new ReajusteService();
		BigDecimal reajuste = r.reajusteSalarial(f,Desempenho.EXCELENTE);
		
		assertEquals(new BigDecimal("11000.00"),reajuste);
	}
	
	@Test
	void reajusteSalarialComDesempenhoBomOSalarioPrecisaReajustarParaDezMilEQuinhentos() {
		Funcionario f = new Funcionario("Lucas", LocalDate.now(), new BigDecimal("10000"));
		ReajusteService r = new ReajusteService();
		BigDecimal reajuste = r.reajusteSalarial(f, Desempenho.BOM);
		
		assertEquals(new BigDecimal("10500.00"),reajuste);
	}
	
	@Test
	void reajusteSalarialComDesempenhoRegularOSalarioPrecisaReajustarParaDezMilEDuzentos() {
		Funcionario f = new Funcionario("Lucas", LocalDate.now(), new BigDecimal("10000"));
		ReajusteService r = new ReajusteService();
		BigDecimal reajuste = r.reajusteSalarial(f, Desempenho.REGULAR);
		
		assertEquals(new BigDecimal("10200.00"),reajuste);
	}
	
	@Test
	void reajusteSalarialComDesempenhoRuimOSalarioPrecisaReajustarParaDezMilECem() {
		Funcionario f = new Funcionario("Lucas", LocalDate.now(), new BigDecimal("10000"));
		ReajusteService r = new ReajusteService();
		BigDecimal reajuste = r.reajusteSalarial(f, Desempenho.RUIM);
		
		assertEquals(new BigDecimal("10100.00"),reajuste);
	}
}
