import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {
		Test33 test = new Test33();
		int output = test.square(5);
		assertEquals(output, 25);
	}

}
