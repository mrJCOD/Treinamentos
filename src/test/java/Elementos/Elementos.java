package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	
	public By elVersaoDoSite = By.id("switch-version-select");
	public By elAddCustomer = By.xpath("(//div[@class='floatL t5'])[1]");
	
	public By elName = By.id("field-customerName");
	public By elLastName = By.id("field-contactLastName");
	public By elContactFirstName = By.id("field-contactFirstName");
	public By elPhone = By.id("field-phone");
	public By elAddressLine1 = By.id("field-addressLine1");
	public By elAddressLine2 = By.id("field-addressLine2");
	public By elCity = By.id("field-city");
	public By elState = By.id("field-state");
	public By elPostalCode = By.id("field-postalCode");
	public By elCountry = By.id("field-country");
	public By elCastillo = By.xpath("(//ul/li)[5]");
	public By elFromEmployeer2 = By.xpath("//div[@class='chosen-search']");
	public By elFromEmployeer = By.id("field-salesRepEmployeeNumber");
	public By elCreditLimit = By.id("field-creditLimit");
	public By elDeleted = By.id("field-deleted");
	public By elSave = By.id("form-button-save");
	
	public By elMsgDeRetorno = By.xpath("//div[@id='report-success']/p");
	
	

}
