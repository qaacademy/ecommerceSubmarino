package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {

	WebDriver driver;

	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void selecionaFrete() throws InterruptedException {
		Thread.sleep(90000);
		driver.findElement(By.xpath("//li[@id='CONVENTIONAL-menu-item']//label")).click();
	}

	public void selecionaFormaPagamento() {
		driver.findElement(By.xpath("//li[@id='payment-option-menu-CREDIT_CARD']//span[contains(text(),'selecione')]"))
				.click();
	}

	public void preencheCartaoCredito() throws InterruptedException {
		driver.findElement(By.xpath("//single-card-payment//input[@placeholder='Número do cartão']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//single-card-payment//input[@placeholder='Número do cartão']"))
				.sendKeys("347109420882533");
		driver.findElement(By.xpath("//single-card-payment//input[@placeholder='Número do cartão']"))
				.sendKeys(Keys.TAB);
		Thread.sleep(3000);
	}

	public void preencheNomeCartaoCredito() throws InterruptedException {

		driver.findElement(By.xpath("//single-card-payment//label[2]//input[1]")).click();
		driver.findElement(By.xpath("//single-card-payment//label[2]//input[1]")).sendKeys("Eduardo Murata");
		Thread.sleep(3000);
	}

	public void preencheMesValidade() {
		Select optionMesValidade = new Select(driver.findElement(By.xpath("//body//single-card-payment//select[1]")));
		optionMesValidade.selectByVisibleText("7");
	}

	public void preencheAnoValidade() {
		Select optionAnoValidade = new Select(driver.findElement(By.xpath("//body//single-card-payment//select[2]")));
		optionAnoValidade.selectByVisibleText("2021");
	}

	public void preencheCVV() {
		driver.findElement(By.xpath(
				"//article[@id='payment-option-CREDIT_CARD']//div//div//new-credit-card-payment//section//single-card-payment//ul//new-card-radio-input//li//form//label//div//input[contains(@placeholder,'CVV')]"))
				.sendKeys("9880");

	}

	public void salvarDadosComprasFuturas() throws InterruptedException {
		driver.findElement(By.xpath("//single-card-payment//label[5]//div[1]")).click();
		Thread.sleep(15000);
	}
}
