package com.selenium.service;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.selenium.model.Exercicio2Model;

public class Exercicio2Teste1Service {
	
	GenericService genericService = new GenericService();
	
	public boolean executeTest(Exercicio2Model exercicio2Model) throws Exception {
		
      WebDriver driver = genericService.abreChromeNaUrl(exercicio2Model.getDriverUrl(), exercicio2Model.getBaseUrl());
      	driver = genericService.encontraElementoNaTelaClica(driver, exercicio2Model.getChooseYourDepartureCity());
      	driver = genericService.encontraElementoNaTelaClica(driver, exercicio2Model.getChooseYourDestinationCity());
      	driver = genericService.encontraElementoNaTelaClica(driver, "//input[@value='Find Flights']");
      	
      	Thread.sleep(5000);
      	List<Boolean> validos = new ArrayList<Boolean>();
      	
      	validos.add(genericService.verificaSePossuiElementoComValorPassado(driver, "//html/body/div[2]/table/thead/tr/th[4]", exercicio2Model.getDeparts()));
      	validos.add(genericService.verificaSePossuiElementoComValorPassado(driver, "//html/body/div[2]/table/thead/tr/th[5]", exercicio2Model.getArrives()));
		
      	for(Boolean valido:validos) {
      		 if(!valido) {
             	driver.close();
             	System.out.println("Falha na execução do teste");
             	throw new RuntimeException();
             }	
      	}
       
        driver.close();
      	return true;
	}
}
