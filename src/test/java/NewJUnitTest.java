import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;		


/**
 * @author Ammar Najjar
 *
 */
public class NewJUnitTest {
	private WebDriver driver;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Jenkins/tools/chromedriver/chromedriver.exe");
	    driver = new ChromeDriver();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		driver.quit();	
	}

	@Test
	public void test() {
		driver.get("http://www.google.com");  
		String title = driver.getTitle();				 
		assertTrue(title.contains("Google"));
	}

}
