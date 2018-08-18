import static org.junit.Assert.*;

import org.junit.Test;


public class calorie_meter_test {

	@Test
	public void test() {
		String gend="M";
		double age=23, cal=3000;
		int active=2;
		calorie_meter cm=new calorie_meter(gend, age, active,cal);
	}

}
