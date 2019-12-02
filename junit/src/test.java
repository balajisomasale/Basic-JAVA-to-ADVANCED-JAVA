import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.internal.runners.statements.*;
public class test {

	@Test
	public void test() {
		Main obj=new Main();
		int x=obj.sum(12,13);
		assertEquals(25,x);
	}

}
