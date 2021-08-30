package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilidades.ClaseBase;

public class AutenticacionUsuariosPage extends ClaseBase {
	public AutenticacionUsuariosPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	By locatorTxtEmail = By.xpath("//input[@id='email']");
	
	By locatorTxtPassword = By.xpath("//input[@id='passwd']");
	
	By locatorBtnIniciarSesion = By.xpath("(//button/span/i)[2]");
	
	By locatorLblErrorLogin = By.xpath("//strong[contains(text(),'Estas credenciales no coinciden con nuestros regis')]");
	
	
	public void login(String email,String pass) {
		esperaExplicita(locatorTxtEmail).sendKeys(email);
		esperaExplicita(locatorTxtPassword).sendKeys(pass);
		esperaExplicita(locatorBtnIniciarSesion).click();
	}

	public String obtenerMensajeErrorLogin() {
		esperarXSegundos(3000);
		return obtenerTexto(esperaExplicita(locatorLblErrorLogin));
	}

}
