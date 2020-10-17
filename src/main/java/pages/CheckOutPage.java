package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends BasePage{

	final String RADIO_BTN_FRETE = "//li[@id='CONVENTIONAL-menu-item']//label";
	final String BTN_FORMA_PAGAMENTO = "//li[@id='payment-option-menu-CREDIT_CARD']//span[contains(text(),'selecione')]";
	final String CARTAO_CREDITO = "//single-card-payment//input[@placeholder='N�mero do cart�o']";
	final String NOME_CARTAO_CREDITO = "//single-card-payment//label[2]//input[1]";
	final String MES_VALIDADE = "//body//single-card-payment//select[1]";
	final String ANO_VALIDADE = "//body//single-card-payment//select[2]";
	final String CVV = "//article[@id='payment-option-CREDIT_CARD']//div//div//new-credit-card-payment//section//single-card-payment//ul//new-card-radio-input//li//form//label//div//input[contains(@placeholder,'CVV')]";
	final String CHECKBOX_COMPRAS_FUTURAS = "//single-card-payment//label[5]//div[1]";

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

	public void selecionaFrete() throws InterruptedException, IOException {
		driver.findElement(By.xpath(RADIO_BTN_FRETE)).click();
		screenShot("seleciona o Frete");
	}

	public void selecionaFormaPagamento() throws IOException {
		driver.findElement(By.xpath(BTN_FORMA_PAGAMENTO)).click();
		screenShot("seleciona a Forma de Pagamento");
	}

	public void preencheCartaoCredito(String numeroCartao) throws InterruptedException, IOException {
		driver.findElement(By.xpath(CARTAO_CREDITO)).click();
		driver.findElement(By.xpath(CARTAO_CREDITO)).sendKeys(numeroCartao);
		driver.findElement(By.xpath(CARTAO_CREDITO)).sendKeys(Keys.TAB);
		screenShot("preenche Cart�o de Cr�dito");
	}

	public void preencheNomeCartaoCredito(String nomeCartaoCredito) throws InterruptedException, IOException {

		driver.findElement(By.xpath(NOME_CARTAO_CREDITO)).click();
		driver.findElement(By.xpath(NOME_CARTAO_CREDITO)).sendKeys(nomeCartaoCredito);
		screenShot("prenche o Nome");
	}

	public void preencheMesValidade(String mesValidade) throws IOException {
		Select optionMesValidade = new Select(driver.findElement(By.xpath(MES_VALIDADE)));
		optionMesValidade.selectByVisibleText(mesValidade);
		screenShot("preenche o M�s de Validade");
	}

	public void preencheAnoValidade(String anoValidade) throws IOException {
		Select optionAnoValidade = new Select(driver.findElement(By.xpath(ANO_VALIDADE)));
		optionAnoValidade.selectByVisibleText(anoValidade);
		screenShot("preenche o Ano de Validade");
	}

	public void preencheCVV(String cvv) throws IOException {
		driver.findElement(By.xpath(CVV)).sendKeys(cvv);
		screenShot("preenche o CVV");

	}

	public void salvarDadosComprasFuturas() throws InterruptedException, IOException {
		driver.findElement(By.xpath(CHECKBOX_COMPRAS_FUTURAS)).click();
		screenShot("seleciona Dados para Compras Futuras");
	}
}
