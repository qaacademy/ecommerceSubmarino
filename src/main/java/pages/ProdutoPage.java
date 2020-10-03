package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoPage {

	WebDriver driver;

	public ProdutoPage(WebDriver driver) {
		this.driver = driver;
	}

	public void incluiProduto() throws InterruptedException {

		driver.findElement(By.xpath("//a[@id='btn-buy']//span[contains(text(),'Comprar')]")).click();
		Thread.sleep(5000);
	}

}
