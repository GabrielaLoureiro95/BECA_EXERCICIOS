package com.selenium.service;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.selenium.model.Exercicio2Model;

public class Exercicio2Teste3Service {
	
	GenericService genericService = new GenericService();
	
	public boolean executeTest(Exercicio2Model exercicio2Model) throws Exception {
		
      WebDriver driver = genericService.abreChromeNaUrl(exercicio2Model.getDriverUrl(), exercicio2Model.getBaseUrl());
      	driver = genericService.encontraElementoNaTelaClica(driver, "//option[text()='" + exercicio2Model.getChooseYourDepartureCity() + "']");
      	driver = genericService.encontraElementoNaTelaClica(driver, "//option[text()='"+exercicio2Model.getChooseYourDestinationCity()+"']");
      	driver = genericService.encontraElementoNaTelaClica(driver, "//input[@value='Find Flights']");
      	driver = genericService.encontraElementoNaTelaClica(driver, "//html/body/div[2]/table/tbody/tr[1]/td[1]/input");
      	
      	driver = genericService.preencherCampoInput(driver, "//html/body/div[2]/form/div[1]/div/input", exercicio2Model.getName());
      	driver = genericService.preencherCampoInput(driver, "//html/body/div[2]/form/div[2]/div/input", exercicio2Model.getAddress());
      	driver = genericService.preencherCampoInput(driver, "//html/body/div[2]/form/div[3]/div/input", exercicio2Model.getCity());
      	driver = genericService.preencherCampoInput(driver, "//html/body/div[2]/form/div[4]/div/input", exercicio2Model.getState());
      	driver = genericService.preencherCampoInput(driver, "//html/body/div[2]/form/div[5]/div/input", exercicio2Model.getZipCode());
      	driver = genericService.encontraElementoNaTelaClica(driver, "//option[text()='"+exercicio2Model.getCardType()+"']");
      	driver = genericService.preencherCampoInput(driver, "//html/body/div[2]/form/div[7]/div/input", exercicio2Model.getCreditCardNumber());
      	driver = genericService.preencherCampoInputLimpandoAntes(driver, "//html/body/div[2]/form/div[8]/div/input", exercicio2Model.getMonth());
      	driver = genericService.preencherCampoInputLimpandoAntes(driver, "//html/body/div[2]/form/div[9]/div/input", exercicio2Model.getYear());
      	driver = genericService.preencherCampoInput(driver, "//html/body/div[2]/form/div[10]/div/input", exercicio2Model.getNameOnCard());
      	driver = genericService.encontraElementoNaTelaClica(driver, "//html/body/div[2]/form/div[11]/div/input");
	
      	Thread.sleep(5000);
      	List<Boolean> validos = new ArrayList<Boolean>();
      	
      	validos.add(genericService.verificaSePossuiElementoComValorPassado(driver, "//html/body/div[2]/div/h1", exercicio2Model.getNameValidate()));
      	
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
