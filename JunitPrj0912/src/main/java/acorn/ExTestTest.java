package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExTestTest {

	ExTest test = new ExTest();

	@Test
	void testAdd() {
		// fail("Not yet implemented");

		ExTest test = new ExTest();
		int result = test.add(5, 3);
		assertEquals(8, result);

	}

}
