package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilidades.ClaseBase;

public class HomePage extends ClaseBase {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Centralizar los localizadores de la pagina
	By locatorBtnIniciarSession = By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[1]/div[2]/ul[1]/li[1]/a[1]");
	By locatorBtnCerrarSession = By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/a[1]");
	
	
	public void irAIniciarSession() {
		if(estaHabilitado(locatorBtnIniciarSession)) {
			click(locatorBtnIniciarSession);
		}
	}
	
	public void irACerrarSession() {
		if(estaHabilitado(locatorBtnCerrarSession)) {
			click(locatorBtnCerrarSession);
		}
	}
	
	public String obtenerTextoLogin() {
		esperarXSegundos(3000);
		return obtenerTexto(esperaExplicita(locatorBtnIniciarSession));
	}
	
}
