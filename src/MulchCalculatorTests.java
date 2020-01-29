
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.MulchCalculator;
import model.RockCalculator;

public class MulchCalculatorTests {

	MulchCalculator mulchTons = new MulchCalculator();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMulchCalculator() {

		double mulchMath = mulchTons.mulchMath(200);
		assertEquals(1.0, mulchMath, .01);
	}

}
