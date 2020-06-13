package com.selenium.service;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.selenium.model.Exercicio3Model;

public class Exercicio3Service {
	
	GenericService genericService = new GenericService();
	
	public boolean executeTest(Exercicio3Model exercicio3Model) throws InterruptedException {
		
      WebDriver driver = genericService.abreChromeNaUrl(exercicio3Model.getDriverUrl(), exercicio3Model.getBaseUrl());
       driver = genericService.efetuaBuscaEmCampoInput(driver, exercicio3Model.getCaminhoInputNome(), exercicio3Model.getCaminhoBtnInputNome(), exercicio3Model.getProdutoNome());  
       driver = genericService.encontraElementoNaTelaClica(driver, exercicio3Model.getCaminhoElementoSelecionar());
       driver = genericService.efetuaBuscaEmCampoInputClicandoNoInicio(driver, exercicio3Model.getCaminhoInputCep(), exercicio3Model.getCaminhoBtnInputCep(), exercicio3Model.getCep());

        Thread.sleep(5000);
        
        verificaCep(driver , exercicio3Model);
        driver.close();
        return true;
	}

	private void verificaCep(WebDriver driver, Exercicio3Model exercicio3Model) {
		
	    List<Boolean> isValues = new ArrayList<Boolean>();
		
		if(exercicio3Model.getValorCep().size() != exercicio3Model.getCaminhoValorCep().size()) {
			System.out.println("Falha ao realizar teste, erro na entrada de valores para validação no cep.");
    		throw new RuntimeException();
		}
		
		for (int i = 0 ; i < exercicio3Model.getValorCep().size() ; i++) {
	        isValues.add(genericService.verificaSePossuiElementoComValorPassado(driver, exercicio3Model.getCaminhoValorCep().get(i), exercicio3Model.getValorCep().get(i)));
		}
		
        //Valida se possui algum valor nao encontrado caso ele não foi encontrrado fecha o driver e retorna uma mensagem na tela
        for(Boolean value : isValues) {
        	if(!value) {
        		driver.close();
        		System.out.println("Falha ao realizar teste, valor do cep não encontrado.");
        		throw new RuntimeException();
        	}
        	
        }
	}

}
