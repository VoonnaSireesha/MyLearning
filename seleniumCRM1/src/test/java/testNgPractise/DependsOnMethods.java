package testNgPractise;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
        @Test
        public void createContactTest()  {
        	System.out.println("excute creteContact");
        }
        
        @Test(dependsOnMethods = "createContactTest")
        public void modifyContactTest() {
        	System.out.println("excute modifyContactTest");
        }
        
        @Test(dependsOnMethods = "modifyContactTest")
        public void deleteContactTest() {
        	System.out.println("excute deleteContactTest");
        }
}
