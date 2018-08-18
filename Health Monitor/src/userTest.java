import static org.junit.Assert.*;
import org.junit.Test;

public class userTest {

	@Test
	public void testUser(){
	user us=new user();
	String id="nahid";
	String pass="bhai@bro";
	int ch=us.check(id,pass);
	}
}
