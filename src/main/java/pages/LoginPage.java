package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void preencheEmail(String email) {
		driver.findElement(By.xpath("//input[@id='email-input']")).sendKeys(email);
	}
	
	public void preencheSenha(String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='password-input']")).sendKeys(password);
		Thread.sleep(3000);
	}
	
	public void confirmaLogin() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='login-button']")).click();
	}

}
