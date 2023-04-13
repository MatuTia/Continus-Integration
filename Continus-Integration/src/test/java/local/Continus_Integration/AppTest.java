package local.Continus_Integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class AppTest {

	private App app;

	@Before
	public void setUp() {
		app = new App();
	}

	@Test
	public void testSayHello() {
		assertEquals("Hello", app.sayHello());
	}
	
	@Test
	public void testWithFailure() {
		assertTrue(false);
	}
}
