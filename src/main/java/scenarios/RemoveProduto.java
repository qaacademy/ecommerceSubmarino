package scenarios;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CarrinhoPage;
import pages.HomePage;
import pages.ProdutoPage;

public class RemoveProduto {
	
	WebDriver driver = new ChromeDriver();
	HomePage homepage = new HomePage(driver);
	ProdutoPage produto = new ProdutoPage(driver);
	CarrinhoPage carrinho = new CarrinhoPage(driver);
	
	@Test
	public void adicionaProduto() throws InterruptedException{
		
		homepage.acessaUrl();
		homepage.aceitaCookies();
		homepage.preencheBusca();
		homepage.efetuaBusca();
		homepage.selecionaProduto();
		produto.incluiProduto();
		carrinho.limpaCarrinho();
		driver.quit();
	}

}
