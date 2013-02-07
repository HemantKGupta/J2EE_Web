package testingTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyFirstJunitTest {
	static final long serialVersionUID = 1L;

	@Test
	public void simpleAdd() {

		int result = 1;

		int expected = 1;

		assertEquals(result, expected);

	}

}