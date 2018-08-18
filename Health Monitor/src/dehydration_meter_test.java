import static org.junit.Assert.*;

import org.junit.Test;


public class dehydration_meter_test {

	@Test
	public void test() {
		double age=19,water=1.5;
		dehydration_meter dh= new dehydration_meter(age,water);
	}
}
