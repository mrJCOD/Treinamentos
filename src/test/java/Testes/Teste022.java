package Testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import Elementos.Elementos;
import Metodos.Metodos;

public class Teste022 extends Metodos{
	
	//setTimeout (() => { debugger; }, 5000)
	
	Elementos el = new Elementos();

	@Before
	public void setUp() throws Exception {
		
		iniciarNavegador("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");
	}

	@After
	public void tearDown() throws Exception {
		
		encerrarTeste();
	}

	@Test
	public void test() {
		
		//selecionar versao do site
		select(el.elVersaoDoSite, "/v1.x/demo/bootstrap_theme_v4");
		//clicar em customer
		clicar(el.elAddCustomer);
		
		//preencher informações de cadastro
		type(el.elName, "Mauro");
		type(el.elLastName, "Rodrigues");
		type(el.elContactFirstName, "Maria");
		type(el.elPhone, "(11) 9 9410-9492");
		type(el.elAddressLine1, "Rua dois");
		type(el.elAddressLine2, "Rua dois");
		type(el.elCity, "São Paulo");
		type(el.elState, "SP");
		type(el.elPostalCode, "02320-290");
		type(el.elCountry, "Brasil");
		driver.findElement(By.xpath("//div[@class='chosen-container chosen-container-single']")).click();
		clicar(el.elCastillo);
		type(el.elCreditLimit, "1000");
		type(el.elDeleted, "seminfodocampo");
		
		//clicar em salvar
		clicar(el.elSave);
		
		//validar mensagem de retorno
		validarTexto(el.elMsgDeRetorno, "Your data has been successfully stored into the database. or");
		
		
	
	}

}
