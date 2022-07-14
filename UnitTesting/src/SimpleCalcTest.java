import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCalcTest {

	@Test
	void twoPlusTwoShouldEqualFour() {
//		fail("Not yet implemented");
		SimpleCalc sc = new SimpleCalc();
		assertEquals(4, (sc.add(2, 2)));
	}
	

}
