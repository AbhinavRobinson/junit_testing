package junit_testing_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddstrings {

	@Test
	void test() {
		junit_function junit = new junit_function();
		String res = junit.addstring("Last ", "Lab :)");
		assertEquals("Last Lab :)", res);
	}

}
