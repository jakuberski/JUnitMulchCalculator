

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

import model.RockCalculator;

public class RockCalculatorTest {
	
	RockCalculator rockTons = new RockCalculator();
	
	@Test
	public void testRockCalculator() {
		double rockMath = rockTons.rockMath(100);
		assertEquals(1.0, rockMath, .01);
	}

	
	@Test
    public void evenNumberFalseTest(){
        RockCalculator notNull = new RockCalculator();
        assertNotNull(notNull.rockMath(300));
    }
	
	@Test
    public void notNullFalseTest(){
        RockCalculator Null = new RockCalculator();
        assertFalse(Null.canWeHaul());
    }
	
	
	

}
