package acorn;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator c = new Calculator();
	ArrayList<Integer> Measure = new ArrayList<>();

	@Test
	void testAdditon() {
		// fail("Not yet implemented");

		Calculator c = new Calculator();

		int result1 = c.Additon(6, 3);
		assertEquals(9, result1);

	}

	@Test
	void testSubstraction() {
		Calculator c = new Calculator();
		int result2 = c.Substraction(6, 3);
		assertEquals(3, result2);
	}

	@Test
	void Multiplication() {
		Calculator c = new Calculator();
		int result3 = c.Multiplication(6, 3);
		assertEquals(18, result3);

	}

	@Test
	void Division() {
		Calculator c = new Calculator();
		int result4 = c.Division(6, 3);
		assertEquals(2, result4);
	}

	@Test
	void testMeasure() {
		Calculator c = new Calculator();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(10);
		ArrayList<Integer> result5 = c.Measure(10);
		assertEquals(list, result5);
	}

}
