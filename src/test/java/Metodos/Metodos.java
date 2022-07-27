package Metodos;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Metodos {

	public WebDriver driver;

	public void iniciarNavegador(String url) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void clicarPorTexto(String texto) {

		driver.findElement(By.xpath("//*[text()='" + texto + "']")).click();
	}

	public void clicar(By elemento) {

		driver.findElement(elemento).click();

	}

	public void type(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void select(By elemento, String value) {

		Select selecao = new Select(driver.findElement(elemento));
		selecao.selectByValue(value);

	}

	public void validarTexto(By elemento, String texto) {

		String text = driver.findElement(elemento).getText();
		assertEquals(texto, text);

	}
	
	public void encerrarTeste() {
		
		driver.quit();
	}

}
