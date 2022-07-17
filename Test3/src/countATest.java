import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	void test() {
		Test33 t = new Test33();
		int output = t.countA("ahkjaaoiy");
		assertEquals(output, 3);
	}

}
