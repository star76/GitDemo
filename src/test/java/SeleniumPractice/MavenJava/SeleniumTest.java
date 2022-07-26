package SeleniumPractice.MavenJava;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	//testng xml file from maven
	//how to run all test cases from project's test folder using maven -> mvn test
	
	@Test
	public void BrowserAutomation(){
		System.out.println("BrowserAutomation");
	}
	@Test
	public void ElementsUI(){
		System.out.println("ElementsUI");
	}

}
