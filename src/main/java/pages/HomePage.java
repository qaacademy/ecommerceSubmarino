package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void acessaUrl(String url) { // a variavel url é declarada dentro do parenteses, e o valor da variavel é
										// definido na classe de testes, de modo a tornar esse metodo capaz de abrir
										// qualquer url
		driver.get(url);
		driver.manage().window().maximize();

	}

	public void aceitaCookies() {

		driver.findElement(By.xpath("//button[@id='lgpd-accept']")).click();
	}

	public void efetuaBusca(String produtoDesejado) throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='h_search-input']")).sendKeys(produtoDesejado);
		driver.findElement(By.xpath("//button[@id='h_search-btn']")).click();
		Thread.sleep(3000);
	}

	public void selecionaProduto() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/section[1]/div[1]/div[1]/div[1]/picture[1]/img[1]"))
				.click();
		Thread.sleep(3000);
	}

	public void efetuaLogout() throws InterruptedException {

		driver.findElement(By.xpath("//span[@class='usr-icon-wrapper']//*[local-name()='svg']")).click();
		driver.findElement(By.xpath("//a[@class='usr-signout']")).click();

	}
}
