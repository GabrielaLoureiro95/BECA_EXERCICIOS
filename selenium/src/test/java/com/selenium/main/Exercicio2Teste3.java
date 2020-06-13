package com.selenium.main;

import java.io.File;

import com.selenium.model.Exercicio2Model;
import com.selenium.service.Exercicio2Teste3Service;

/**
 * Exercicio numero 2:
 * Criar o caso de teste 3:
 * 1 - Acessar o site: https://blazedemo.com/
 * 2 - Em select “Choose your departure city:” selecionar qualquer valor passado por parâmetro
 * 3 - Em select “Choose your destination city:” selecionar qualquer valor passado por parâmetro
 * 3 - Clicar em “Find Flights”.
 * 4 - Escolher a viagem baseada no “Flight#”, ou seja clicar no botão “Choose This Flight” do “Flight#” passado por parâmetro
 * 5 - Preencher todos os campos do formulário (passar as informações por parâmetro)
 * 5 - Enviar (Purchase Flight) o formulário
 * 6 - Validar mensagem de sucesso
 *
 */
public class Exercicio2Teste3 {
	//caso de teste3
	public static void main(String[] args){
		try {
			Exercicio2Teste3Service exercicio2Teste3Service = new Exercicio2Teste3Service();
			Exercicio2Model exercicio2Model = new Exercicio2Model("driver" + File.separator + "chromedriver.exe",
																  "https://blazedemo.com/",
																  "San Diego",
																  "New York",
																  "Thank you for your purchase today!",
																  "Gabriela",
																  "AV brasil",
																  "Uberlândia",
																  "Minas Gerais",
																  "38413100",
																  "American Express",
																  "555555555555555",
																  "02",
																  "2019",
																  "GABRIELA"
																  );
			
			exercicio2Teste3Service.executeTest(exercicio2Model);
					
			System.out.println("Teste realizado com sucesso");
		} catch (Exception e) {
			System.out.println("Falha ao realizar teste");
			e.printStackTrace();
		}
	}
}
