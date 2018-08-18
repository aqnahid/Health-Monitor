import static org.junit.Assert.*;

import org.junit.Test;


public class heart_meter_test {

	@Test
	public void test() {
		heart_meter hm=new heart_meter();
		hm.heartCheck(23, 130);
	}

}
