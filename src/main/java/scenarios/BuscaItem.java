package scenarios;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

public class BuscaItem {
	
	WebDriver driver = new ChromeDriver();
	HomePage homepage = new HomePage(driver);
	
	@Test
	public void buscaItem() throws InterruptedException {
	
	homepage.acessaUrl();
	homepage.aceitaCookies();
	homepage.preencheBusca();
	homepage.efetuaBusca();
	driver.quit();
	}
}
