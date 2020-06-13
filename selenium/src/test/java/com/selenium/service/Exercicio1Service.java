package com.selenium.service;

import java.io.File;

import org.openqa.selenium.WebDriver;

public class Exercicio1Service {
	
	GenericService genericService = new GenericService();
	
	public boolean executeTest() throws Exception {
		
      WebDriver driver = genericService.abreChromeNaUrl( "driver" + File.separator + "chromedriver.exe", "https://wpforms.com/demo/%22");
      	driver = genericService.encontraElementoNaTelaClica(driver, "//option[text()='Feedback']");
      	driver = genericService.encontraElementoNaTelaClica(driver, "//main/article[2]/div/div/a[1]");
      	Thread.sleep(4000);
      	driver = genericService.encontraElementoNaTelaClica(driver, "//*[@id=\"wpforms-260271-field_1_2\"]");
      	driver = genericService.preencherCampoInput(driver, "wpforms-260271-field_2", "teste");
      	driver = genericService.preencherCampoInput(driver, "wpforms-260271-field_3", "teste");
      	driver = genericService.encontraElementoNaTelaClica(driver, "wpforms-260271-field_4_1");
      	driver = genericService.preencherCampoInput(driver, "wpforms-260271-field_5", "teste");
      	driver = genericService.preencherCampoInput(driver, "wpforms-260271-field_6", "teste");
      	driver = genericService.encontraElementoNaTelaClica(driver, "//button[text()='Submit']");
      	boolean valido = genericService.verificaSePossuiElementoComValorPassado(driver, "//h3[text()='Congrats, You Completed the First Step!']", "Congrats, You Completed the First Step!");
        if(!valido) {
        	driver.close();
        	System.out.println("Formulario não enviado");
        	throw new RuntimeException();
        }
        driver.close();
      	return true;
	}
}
