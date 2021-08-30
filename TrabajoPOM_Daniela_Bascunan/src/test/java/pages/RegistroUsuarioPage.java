package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilidades.ClaseBase;

public class RegistroUsuarioPage extends ClaseBase {
	public RegistroUsuarioPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By locatorTxtEmailCreate = By.id("email_create");
	By locatorBtnCrearCliente = By.xpath("(//button/span/i)[1]");
	By locatorTxtMsgErrorYaRegistrado = By.xpath("//li[contains(text(),'Ya se ha registrado una cuenta que utiliza esta di')]");
	
	
	public void ingresoCrear(String email_create) {
		esperaExplicita(locatorTxtEmailCreate).sendKeys(email_create);
		esperaExplicita(locatorBtnCrearCliente).click();
	}
	
	public String obtenerMensajeUsuarioYaRegistrado() {
		esperarXSegundos(3000);
		return obtenerTexto(esperaExplicita(locatorTxtMsgErrorYaRegistrado));
	}
	
}
