package testNgPractise;

import org.testng.annotations.Test;

  public class InvocationCountTest {
	@Test(invocationCount = 5)
      public   void createOrderTest() {
		System.out.println("Execute createOrderTest");
	}
	@Test(invocationCount = 3)
	public void billingOrderTest() {
		System.out.println("Execute billingAndOrderTest");
	}
	@Test(enabled = false)
	public void createContact() {
		System.out.println("createContact");
	}
}
