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

		homepage.acessaUrl("https://www.submarino.com.br/");
		homepage.aceitaCookies();
		homepage.efetuaBusca("ração magnus premium filhotes");
		homepage.selecionaProduto();
		produto.incluiProduto();
		carrinho.confirmaCarrinho();
		login.preencheEmail(""); // preencher com e-mail de conta Submarino válida, entre aspas duplas ("")
		login.preencheSenha(""); // preencher com senha de conta Submarino válida, entre aspas duplas ("")
		login.confirmaLogin();
		checkout.selecionaFrete();
		checkout.selecionaFormaPagamento();
		checkout.preencheCartaoCredito("347109420882533");
		checkout.preencheNomeCartaoCredito("NOME CLIENTE");
		checkout.preencheMesValidade("7");
		checkout.preencheAnoValidade("2021");
		checkout.preencheCVV("9880");
		checkout.salvarDadosComprasFuturas();
		driver.quit();

	}
}
