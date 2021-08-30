package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilidades.ClaseBase;

public class FormularioRegistroPage extends ClaseBase {
	public FormularioRegistroPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By locatorTxtName = By.id("name");
	By locatorTxtEmail = By.id("email");
	By locatorTxtPassword = By.id("passwd");
	By locatorBtnRegistrar = By.xpath("(//button/span/i)[1]");
	
	public void registroFormulario(String name, String email, String password) {
		esperaExplicita(locatorTxtName).sendKeys(name);
		esperaExplicita(locatorTxtEmail).sendKeys(email);
		esperaExplicita(locatorTxtPassword).sendKeys(password);
		esperaExplicita(locatorBtnRegistrar).click();
	}
	
		
}
