package com.selenium.main;

import java.io.File;

import com.selenium.model.Exercicio2Model;
import com.selenium.service.Exercicio2Teste1Service;

/**
 * Exercicio numero 2:
 * Criar o caso de teste 1:
 * 1 - Acessar o site: https://blazedemo.com/
 * 2 - No select “Choose your departure city:” selecionar “San Diego”.
 * 3 - No select “Choose your destination city:” selecionar “New York”.
 * 3 - Clicar em “Find Flights”.
 * 4 - Validar se no cabeçalho da tabela tem as informações: "Departs: San Diego" e "Arrives: New York"
 *
 */
public class Exercicio2Teste1 {
	//caso de teste1
	public static void main(String[] args){
		try {
			Exercicio2Teste1Service exercicio2Service = new Exercicio2Teste1Service();
			Exercicio2Model exercicio2Model = new Exercicio2Model("driver" + File.separator + "chromedriver.exe",
																  "https://blazedemo.com/",
																  "//option[text()='San Diego']",
																  "//option[text()='New York']",
																  "Departs: San Diego",
																  "Arrives: New York");
			
			exercicio2Service.executeTest(exercicio2Model);
					
			System.out.println("Teste realizado com sucesso");
		} catch (Exception e) {
			System.out.println("Falha ao realizar teste");
			e.printStackTrace();
		}
	}
}
