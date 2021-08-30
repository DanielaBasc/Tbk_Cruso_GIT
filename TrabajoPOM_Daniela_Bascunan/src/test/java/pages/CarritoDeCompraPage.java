package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilidades.ClaseBase;

public class CarritoDeCompraPage extends ClaseBase {
	

	public CarritoDeCompraPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By locatorItemAgregado = By.xpath("//*[@id=\"cart_summary\"]/tbody/tr/td[2]/small[2]/a");
	By locatorBtnEliminar = By.xpath("//*[@id=\"cart_summary\"]/tbody/tr/td[5]/div/a/i");
	
	public String obtenerNombreProductoCarro() {
		esperarXSegundos(3000);
		return obtenerTexto(esperaExplicita(locatorItemAgregado));
	}
	
	public void eliminaItem() {
		esperaExplicita(locatorBtnEliminar).click();
	}
}
