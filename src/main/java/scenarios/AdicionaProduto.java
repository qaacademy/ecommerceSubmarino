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
		
		homepage.acessaUrl("https://www.submarino.com.br/");
		homepage.aceitaCookies();
		homepage.efetuaBusca("ração magnus premium filhotes");
		homepage.selecionaProduto();
		produto.incluiProduto();
		driver.quit();
	}
}
