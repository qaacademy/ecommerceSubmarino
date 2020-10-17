package scenarios;

import java.io.IOException;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

public class BuscaItem {
	
	WebDriver driver = new ChromeDriver();
	HomePage homepage = new HomePage(driver);
	
	@Test
	public void buscaItem() throws InterruptedException, IOException {
	
	homepage.acessaUrl("https://www.submarino.com.br/");
	homepage.aceitaCookies();
	homepage.efetuaBusca("ração magnus premium filhotes");
	}
	
	@After
	public void after() {
		driver.quit();
	}
}
