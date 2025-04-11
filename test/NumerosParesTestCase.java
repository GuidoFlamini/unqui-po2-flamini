
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

public class NumerosParesTestCase {
	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(111);
		counter.addNumber(3334);
		counter.addNumber(000);
		counter.addNumber(7777);
		counter.addNumber(93799999);
		
		counter.addNumber(444444);
	}
	/**
	 * Verifica la cantidad de digitos pares
	 */
	@Test
	public void testDigitosPares() {
		// Getting the even occurrences
		int amount = counter.elQueTieneMayorCantidadDeDígitosPares();
		// I check the amount is the expected one
		assertEquals(amount, 444444);
	}
	
}
