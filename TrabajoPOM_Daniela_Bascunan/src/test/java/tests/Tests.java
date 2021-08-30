package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AutenticacionUsuariosPage;
import pages.CarritoDeCompraPage;
import pages.CatalogoProductos;
import pages.FormularioRegistroPage;
import pages.HomePage;
import pages.RegistroUsuarioPage;
import utilidades.DataDriven;

public class Tests {
	//definir atributos
	private WebDriver driver;
	private HomePage homePage;
	private DataDriven data;
	private ArrayList<String> datosCP;
	
	private AutenticacionUsuariosPage autenticacionUsuariosPage;
	private RegistroUsuarioPage registroUsuarioPage;
	private FormularioRegistroPage formularioRegistroPage;
	private CatalogoProductos catalogoProductos;
	private CarritoDeCompraPage carritoDeCompraPage;
	
	@BeforeMethod
	public void prepararSitio() {
		homePage.maximizarBrowser();
		homePage.cargarSitio("https://www.digiplot.cl");
	}
	
	@BeforeTest
	public void before() {
		
		//String rutaDriver = Paths.get(System.getProperty("user.dir"), "\\src\\test\\resources\\drivers\\chromedriver.exe").toString();
		String rutaFirefox = Paths
				.get(System.getProperty("user.dir"), "\\src\\test\\resources\\drivers\\geckodriver.exe").toString();
		
		String navegador = "firefox";
		String propertyDriver = "webdriver.gecko.driver";
		
		homePage = new HomePage(driver);
		
		data = new DataDriven();
		
		homePage.conexionDriver(navegador, rutaFirefox, propertyDriver);
		
		autenticacionUsuariosPage = new AutenticacionUsuariosPage(homePage.getDriver());
		registroUsuarioPage = new RegistroUsuarioPage(homePage.getDriver());
		formularioRegistroPage = new FormularioRegistroPage(homePage.getDriver());
		catalogoProductos = new CatalogoProductos(homePage.getDriver());
		carritoDeCompraPage = new CarritoDeCompraPage(homePage.getDriver());
	}
	
	
	@AfterTest
	public void after() {

	}
	
	@Test
	public void CP_01_ValidarIngresoLoginFallido() throws IOException {
		datosCP = data.getData("CP_01_ValidarIngresoLoginFallido");
		homePage.irAIniciarSession();
		autenticacionUsuariosPage.login(datosCP.get(1), datosCP.get(2));
		Assert.assertEquals(autenticacionUsuariosPage.obtenerMensajeErrorLogin(),
				datosCP.get(3));
	}
	
	@Test
	public void CP_02_Validar_Registro_Usuario() throws IOException {
		datosCP = data.getData("CP_02_Validar_Registro_Usuario");
		homePage.irAIniciarSession();
		registroUsuarioPage.ingresoCrear(datosCP.get(1));
		formularioRegistroPage.registroFormulario(datosCP.get(2), datosCP.get(1), datosCP.get(3));
		//validamos que inicie session revisando la existencia del boton //
		Assert.assertEquals(homePage.obtenerTextoLogin(),"Mi Cuenta");
	}
	
	@Test
	public void CP_03_Validar_Registro_Usuario_Existente() throws IOException {
		datosCP = data.getData("CP_03_Validar_Registro_Usuario_Existente");
		homePage.irAIniciarSession();
		registroUsuarioPage.ingresoCrear(datosCP.get(1));
		Assert.assertEquals(registroUsuarioPage.obtenerMensajeUsuarioYaRegistrado(),datosCP.get(2));
	}
	
	@Test
	public void CP_04_Validar_LoginExitoso() throws IOException {
		datosCP = data.getData("CP_04_Validar_LoginExitoso");
		homePage.irAIniciarSession();
		autenticacionUsuariosPage.login(datosCP.get(1), datosCP.get(2));
		Assert.assertEquals(homePage.obtenerTextoLogin(),"Mi Cuenta");
		homePage.irACerrarSession();
	}
	
	@Test
	public void CP_05_Validar_Cierre_Sesion() throws IOException {
		datosCP = data.getData("CP_05_Validar_Cierre_Sesion");
		homePage.irAIniciarSession();
		autenticacionUsuariosPage.login(datosCP.get(1), datosCP.get(2));
		Assert.assertEquals(homePage.obtenerTextoLogin(),"Mi Cuenta");
		homePage.irACerrarSession();
		Assert.assertEquals(homePage.obtenerTextoLogin(),"Inicio Sesión");
	}
	
	@Test
	public void CP_06_Buscar_Productos() throws IOException {
		datosCP = data.getData("CP_06_Buscar_Productos");
		homePage.irAIniciarSession();
		autenticacionUsuariosPage.login(datosCP.get(1), datosCP.get(2));
		Assert.assertEquals(homePage.obtenerTextoLogin(),"Mi Cuenta");
		catalogoProductos.buscarProducto(datosCP.get(3));
		catalogoProductos.seleccionaPrimerItem();
		Assert.assertEquals(catalogoProductos.obtenerTextoProducto(),datosCP.get(3));
		homePage.irACerrarSession();
	}
	
	@Test
	public void CP_07_Buscar_Producto_Agregar_a_Carrito() throws IOException {
		datosCP = data.getData("CP_07_Buscar_Producto_Agregar_a_Carrito");
		homePage.irAIniciarSession();
		autenticacionUsuariosPage.login(datosCP.get(1), datosCP.get(2));
		Assert.assertEquals(homePage.obtenerTextoLogin(),"Mi Cuenta");
		catalogoProductos.buscarProducto(datosCP.get(3));
		catalogoProductos.seleccionaPrimerItem();
		Assert.assertEquals(catalogoProductos.obtenerTextoProducto(),datosCP.get(3));
		catalogoProductos.agregarACarrito();
		catalogoProductos.irACarrito();
		Assert.assertEquals(carritoDeCompraPage.obtenerNombreProductoCarro(),"Descripción : " + datosCP.get(3));
		homePage.irACerrarSession();
	}
	
	@Test
	public void CP_08_Eliminar_Item_Carrito_Compras() throws IOException {
		datosCP = data.getData("CP_08_Eliminar_Item_Carrito_Compras");
		homePage.irAIniciarSession();
		autenticacionUsuariosPage.login(datosCP.get(1), datosCP.get(2));
		Assert.assertEquals(homePage.obtenerTextoLogin(),"Mi Cuenta");
		catalogoProductos.buscarProducto(datosCP.get(3));
		catalogoProductos.seleccionaPrimerItem();
		Assert.assertEquals(catalogoProductos.obtenerTextoProducto(),datosCP.get(3));
		catalogoProductos.agregarACarrito();
		catalogoProductos.irACarrito();
		Assert.assertEquals(carritoDeCompraPage.obtenerNombreProductoCarro(),"Descripción : " + datosCP.get(3));
		carritoDeCompraPage.eliminaItem();
		Assert.assertEquals(homePage.obtenerTextoLogin(),"Mi Cuenta");
		homePage.irACerrarSession();
	}
	
	

}
