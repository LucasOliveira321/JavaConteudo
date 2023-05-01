package br.com.alura.tdd.modelo;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class DesempenhoTest {
	private Funcionario f;
	private ReajusteService r;
	
	// caso queira que este metodo seja executado automaticamente
	// podemos escrever em cima do método @BeforeEach
	// assim o método é executado antes de rodar o teste
	// caso seja necessário rodar o método no final do teste
	// pode utilizar o @AfterEach
	public void inicializa() {
		this.f = new Funcionario("Lucas", LocalDate.now(), new BigDecimal("10000"));
		this.r = new ReajusteService();
	}

	@Test
	void reajusteSalarialComDesempenhoExcelenteOSalarioPrecisaReajustarParaOnzeMil(){
		inicializa();
		BigDecimal reajuste = r.reajusteSalarial(f,Desempenho.EXCELENTE);
		
		assertEquals(new BigDecimal("11000.00"),reajuste);
	}
	
	@Test
	void reajusteSalarialComDesempenhoBomOSalarioPrecisaReajustarParaDezMilEQuinhentos() {
		inicializa();
		BigDecimal reajuste = r.reajusteSalarial(f, Desempenho.BOM);
		
		assertEquals(new BigDecimal("10500.00"),reajuste);
	}
	
	@Test
	void reajusteSalarialComDesempenhoRegularOSalarioPrecisaReajustarParaDezMilEDuzentos() {
		inicializa();
		BigDecimal reajuste = r.reajusteSalarial(f, Desempenho.REGULAR);
		
		assertEquals(new BigDecimal("10200.00"),reajuste);
	}
	
	@Test
	void reajusteSalarialComDesempenhoRuimOSalarioPrecisaReajustarParaDezMilECem() {
		inicializa();
		BigDecimal reajuste = r.reajusteSalarial(f, Desempenho.RUIM);
		
		assertEquals(new BigDecimal("10100.00"),reajuste);
	}
}
