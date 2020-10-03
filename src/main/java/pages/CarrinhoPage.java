package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrinhoPage {

	WebDriver driver;
	
	public CarrinhoPage(WebDriver driver) {
		this.driver = driver;
	}

	public void acessaCarrinho() {

		driver.findElement(By.xpath("//a[@class='crt-link']//*[local-name()='svg']")).click(); // clica no botão
																								// "Carrinho"
		driver.findElement(By.xpath("//a[@class='crt-basquet']")).click(); // clica no botão "Ver meu carrinho"
	}

	public void alteraQuantidade() throws InterruptedException {

		driver.findElement(By.xpath("//span[@class='quantityIcon icon-plus']")).click(); // clica no botão "+"
		Thread.sleep(5000);
	}

	public void limpaCarrinho() throws InterruptedException {

		driver.findElement(By.xpath("//span[@class='basket-productRemoveAct link-primary']")).click(); // clica no botão
																								// "Remover"
		Thread.sleep(5000);
	}
	
	public void confirmaCarrinho() throws InterruptedException {

		driver.findElement(By.xpath("//div[@class='basket-wrapper']//button[@id='buy-button']")).click(); // clica no botão
																								// "Continuar"
		Thread.sleep(5000);
	}
}
