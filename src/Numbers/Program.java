package Numbers;

import org.junit.Assert;
import org.junit.Test;


public class Program {
	
	@Test
	public void numbersInIncreasingOrder() {
		// TODO Auto-generated method stub
		BiggerAndSmaller algorithm = new BiggerAndSmaller();
		
		algorithm.find(new int[] {2, 3, 4, 9});
		
		Assert.assertEquals(2, algorithm.getSmaller());
//		Assert.assertEquals(4, algorithm.getBigger());

	}

}
