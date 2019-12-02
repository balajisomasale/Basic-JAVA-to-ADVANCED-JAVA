package profit_method;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test(expected = IllegalArgumentException.class) 
	public void test() {
		Main p=new Main();
		
				assertEquals(20.00,p.calculateProfit(10,-200,20),0.001);
				assertEquals(20.00,p.calculateProfit(10,200,-20),0.001);
				assertEquals(20.00,p.calculateProfit(10,-200,-20),0.001);
				assertEquals(20.00,p.calculateProfit(10,200,20),0.001);
				
	}

}
