package scenarios;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CarrinhoPage;
import pages.HomePage;
import pages.ProdutoPage;
import pages.LoginPage;
import pages.PagamentoPage;

public class CheckoutCompra {

	WebDriver driver = new ChromeDriver();
	HomePage homepage = new HomePage(driver);
	ProdutoPage produto = new ProdutoPage(driver);
	CarrinhoPage carrinho = new CarrinhoPage(driver);
	LoginPage login = new LoginPage(driver);
	PagamentoPage pagamento = new PagamentoPage(driver);

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
		pagamento.selecionaFrete();
		pagamento.selecionaFormaPagamento();
		pagamento.preencheCartaoCredito();
		pagamento.preencheNomeCartaoCredito();
		pagamento.preencheMesValidade();
		pagamento.preencheAnoValidade();
		pagamento.preencheCVV();
		pagamento.salvarDadosComprasFuturas();
		driver.quit();

	}
}
