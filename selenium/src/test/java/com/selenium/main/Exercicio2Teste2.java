package com.selenium.main;

import java.io.File;

import com.selenium.model.Exercicio2Model;
import com.selenium.service.Exercicio2Teste2Service;

/**
 * Exercicio numero 2:

 * Criar o caso de teste 2:
 * 1 - Acessar o site: https://blazedemo.com/
 * 2 - Em select “Choose your departure city:” selecionar “San Diego”.
 * 3 - Em select “Choose your destination city:” selecionar “New York”.
 * 3 - Clicar em “Find Flights”.
 * 4 - Escolher a primeira viagem, ou seja clicar no primeiro botão “Choose This Flight”
 * 5 - Preencher todos os campos do formulário
 * 5 - Enviar (Purchase Flight) o formulário
 * 6 - Validar mensagem de sucesso
 *
 */
public class Exercicio2Teste2 {
	//caso de teste2
	public static void main(String[] args){
		try {
			Exercicio2Teste2Service exercicio2Teste2Service = new Exercicio2Teste2Service();
			Exercicio2Model exercicio2Model = new Exercicio2Model("driver" + File.separator + "chromedriver.exe",
																  "https://blazedemo.com/",
																  "//option[text()='San Diego']",
																  "//option[text()='New York']",
																  "Thank you for your purchase today!");
			
			exercicio2Teste2Service.executeTest(exercicio2Model);
					
			System.out.println("Teste realizado com sucesso");
		} catch (Exception e) {
			System.out.println("Falha ao realizar teste");
			e.printStackTrace();
		}
	}
}
