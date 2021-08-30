package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilidades.ClaseBase;

public class CatalogoProductos extends ClaseBase {
	public CatalogoProductos(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	By locatorTxtBuscador = By.id("pos_query_top");
	By locatorBtnBuscador = By.xpath("//*[@id='searchbox']/button/i");
	By locatorBtnSeleccionaItem1 = By.xpath("(//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img)[1]"); 
	By locatorLblProducto = By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[3]/h1");
	By locatorBtnAgregarACarrito = By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[3]/form[1]/div/div/p/button/span");
	By locatorBtnIrACarrito = By.xpath("//*[@id=\"header\"]/div[4]/div/div/div[2]/div/div[2]/div/div/a");
	
	public void buscarProducto(String producto) {
		esperaExplicita(locatorTxtBuscador).click();
		esperaExplicita(locatorTxtBuscador).sendKeys(producto);
		esperaExplicita(locatorBtnBuscador).click();
	}
	
	public void seleccionaPrimerItem() {
		esperaExplicita(locatorBtnSeleccionaItem1).click();
	}
	
	public void agregarACarrito() {
		esperaExplicita(locatorBtnAgregarACarrito).click();
	}
	
	public void irACarrito() {
		esperaExplicita(locatorBtnIrACarrito).click();
	}
	
	public String obtenerTextoProducto() {
		esperarXSegundos(3000);
		return obtenerTexto(esperaExplicita(locatorLblProducto));
	}
}
