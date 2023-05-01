package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void valorDeBonusParaSalarioMaiorQueDezMilTemQueSerZero() {
		BonusService service = new BonusService();
			
		assertThrows(IllegalArgumentException.class,
				() -> service.calcularBonus(new Funcionario("Lucas",LocalDate.now(),new BigDecimal("10001"))));
	}
	
	@Test
	void bonusIgualADozentosECinquenta() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Lucas",LocalDate.now(),new BigDecimal("2500")));
		
		assertEquals(new BigDecimal("250.00"), bonus);
		
	}

}
