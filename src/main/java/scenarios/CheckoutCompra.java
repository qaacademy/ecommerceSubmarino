package scenarios;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
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
	public static final Logger logger = Logger.getLogger(CheckoutCompra.class);

	@Before
	public void before() {
		configuraChromeDriver();
	}

	@Test
	public void checkoutCompra() throws InterruptedException, IOException {

		try {
			homepage.acessaUrl("https://www.submarino.com.br/");
			homepage.aceitaCookies();
			homepage.efetuaBusca("ração magnus premium filhotes");
			homepage.selecionaProduto();
			produto.incluiProduto();
			carrinho.confirmaCarrinho();
			login.preencheEmail(""); // preencher com e-mail de conta Submarino válida, entre // aspas duplas ("")
			login.preencheSenha(""); // preencher com senha de conta Submarino válida, entre aspas duplas ("")
			login.efetuaLogin();
			checkout.selecionaFrete();
			checkout.selecionaFormaPagamento();
			checkout.preencheCartaoCredito("347109420882533");
			checkout.preencheNomeCartaoCredito("NOME CLIENTE");
			checkout.preencheMesValidade("7");
			checkout.preencheAnoValidade("2021");
			checkout.preencheCVV("9880");
			checkout.salvarDadosComprasFuturas();

		} catch (Exception e) {
			logger.info(e.getStackTrace() + " " + e.getMessage());
		}
	}

	@After
	public void after() {
		driver.quit();
	}

	/**
	 * Configura o Chrome Driver com espera Implicita de até 90 Segundos
	 */
	private void configuraChromeDriver() {
		// Configura espera de até 90 Segundos qualquer elemento.

//			driver.manage().window().maximize();		
//			ChromeOptions chromeOptions = new ChromeOptions();
//			chromeOptions.addArguments(
////					   "--headless"
//					   "--disable-web-security",
//					   "--ignore-certificate-errors",
//					   "--disable-gpu",
//					   "window-size=1200x600",
//					   "disable-popup-blocking",
//					   "disable-infobars"
//					  );
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
}
