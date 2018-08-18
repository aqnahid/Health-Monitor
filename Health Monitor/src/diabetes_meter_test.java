import static org.junit.Assert.*;

import org.junit.Test;


public class diabetes_meter_test {

	@Test
	
	public void testcalculate_dia()
	{
		String t="2-hours-after-meal";
		double glc=150;
		diabetes_meter ch=new diabetes_meter(t,glc);
	}
	public void testCalculate_dia() {
		fail("Not yet implemented");
	}


}
