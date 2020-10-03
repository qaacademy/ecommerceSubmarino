package scenarios;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CarrinhoPage;
import pages.HomePage;
import pages.ProdutoPage;


public class AlteraQuantidadeProduto {
	
	WebDriver driver = new ChromeDriver();
	HomePage homepage = new HomePage(driver);
	ProdutoPage produto = new ProdutoPage(driver);
	CarrinhoPage carrinho = new CarrinhoPage(driver);
	
	@Test
	public void alteraQuantidadeProduto() throws InterruptedException{
		
		homepage.acessaUrl("https://www.submarino.com.br/");
		homepage.aceitaCookies();
		homepage.efetuaBusca();
		homepage.selecionaProduto();
		produto.incluiProduto();
		carrinho.alteraQuantidade();
		driver.quit();
	}

}
