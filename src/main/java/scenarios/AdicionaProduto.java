package scenarios;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.ProdutoPage;

public class AdicionaProduto {
	
	WebDriver driver = new ChromeDriver();
	HomePage homepage = new HomePage(driver);
	ProdutoPage produto = new ProdutoPage(driver);
	
	@Test
	public void adicionaProduto() throws InterruptedException{
		
		homepage.acessaUrl();
		homepage.aceitaCookies();
		homepage.preencheBusca();
		homepage.efetuaBusca();
		homepage.selecionaProduto();
		produto.incluiProduto();
		driver.quit();
	}
}
