package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

	final String EMAIL = "//input[@id='email-input']";
	final String SENHA = "//input[@id='password-input']";
	final String BTN_EFETUA_LOGIN = "//button[@id='login-button']";

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void preencheEmail(String email) throws IOException {
		driver.findElement(By.xpath(EMAIL)).sendKeys(email);
		screenShot("preenche o Email");
	}

	public void preencheSenha(String password) throws InterruptedException, IOException {
		driver.findElement(By.xpath(SENHA)).sendKeys(password);
		screenShot("preenche a Senha");
	}

	public void efetuaLogin() throws InterruptedException, IOException {
		driver.findElement(By.xpath(BTN_EFETUA_LOGIN)).click();
		screenShot("efetua o login");
	}

}
