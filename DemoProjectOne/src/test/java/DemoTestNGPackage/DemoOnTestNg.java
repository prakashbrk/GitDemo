package DemoTestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoOnTestNg {
	
	//Checking update commit into git
	
	@Test(priority=1,description="...Sum Method in TestNG...")
	public void sum() {
		System.out.println("In Maven Test Add");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
	@Test(priority=2)
	public void Sub() {
		System.out.println("In Maven Test Sub");
		int a=30;
		int b=20;
		Assert.assertEquals(30, a-b);
	}
	@Test(priority=3)
	public void Mul() {
		
		int a=30;
		int b=20;
		Assert.assertEquals(600, a*b);
	}

}
