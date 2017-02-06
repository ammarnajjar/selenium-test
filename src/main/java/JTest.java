import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

/**
 * 
 */

/**
 * @author Ammar Najjar
 *
 */
public class JTest {
	private WebDriver driver;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
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
		driver.get("http://www.guru99.com/selenium-tutorial.html");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Free Selenium Tutorials"));
	}

}
