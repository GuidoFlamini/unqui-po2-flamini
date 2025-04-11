import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.Counter;

public class MultiploMasAltoTestCase {
	private Counter counter;
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
	}
	
	@Test
	public void testMultiploMasAlto() {
		// Getting the even occurrences
		int x = counter.multiploMasAltoDe_Y_(4, 6);
		// I check the amount is the expected one
		assertEquals(x, 996);
	}
	
}