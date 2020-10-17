package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrinhoPage extends BasePage{

	final String BTN_CARRINHO = "//a[@class='crt-link']//*[local-name()='svg']";
	final String BTN_VER_MEU_CARRINHO = "//a[@class='crt-basquet']";
	final String BTN_MAIS = "//span[@class='quantityIcon icon-plus']";
	final String BTN_REMOVER = "//span[@class='basket-productRemoveAct link-primary']";
	final String BTN_CONTINUAR = "//div[@class='basket-wrapper']//button[@id='buy-button']";

	public CarrinhoPage(WebDriver driver) {
		super(driver);
	}

	public void acessaCarrinho() {

		driver.findElement(By.xpath(BTN_CARRINHO)).click();
		driver.findElement(By.xpath(BTN_VER_MEU_CARRINHO)).click();
	}

	public void alteraQuantidade() throws InterruptedException {

		driver.findElement(By.xpath(BTN_MAIS)).click();
	}

	public void limpaCarrinho() throws InterruptedException {

		driver.findElement(By.xpath(BTN_REMOVER)).click();
	}

	public void confirmaCarrinho() throws InterruptedException, IOException {

		driver.findElement(By.xpath(BTN_CONTINUAR)).click();
		screenShot("confirma o Carrinho");
	}
}
