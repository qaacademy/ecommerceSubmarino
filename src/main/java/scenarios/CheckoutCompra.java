package scenarios;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CarrinhoPage;
import pages.CheckOutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProdutoPage;

public class CheckoutCompra {

	WebDriver driver = new ChromeDriver();
	HomePage homepage = new HomePage(driver);
	ProdutoPage produto = new ProdutoPage(driver);
	CarrinhoPage carrinho = new CarrinhoPage(driver);
	LoginPage login = new LoginPage(driver);
	CheckOutPage checkout = new CheckOutPage(driver);

	@Test
	public void checkoutCompra() throws InterruptedException {

		homepage.acessaUrl();
		homepage.aceitaCookies();
		homepage.preencheBusca();
		homepage.efetuaBusca();
		homepage.selecionaProduto();
		produto.incluiProduto();
		carrinho.confirmaCarrinho();
		login.preencheEmail();
		login.preencheSenha();
		login.confirmaLogin();
		checkout.selecionaFrete();
		checkout.selecionaFormaPagamento();
		checkout.preencheCartaoCredito();
		checkout.preencheNomeCartaoCredito();
		checkout.preencheMesValidade();
		checkout.preencheAnoValidade();
		checkout.preencheCVV();
		checkout.salvarDadosComprasFuturas();
		driver.quit();

	}
}
