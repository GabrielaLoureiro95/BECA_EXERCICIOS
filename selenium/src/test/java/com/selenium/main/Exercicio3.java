package com.selenium.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.selenium.model.Exercicio3Model;
import com.selenium.service.Exercicio3Service;

public class Exercicio3 {
	public static void main(String[] args){
		try {
			Exercicio3Service exercicio3Service = new Exercicio3Service();
			
			List<String> valorCep = new ArrayList<String>();
			valorCep.add("23,17");
			valorCep.add("40,75");
			valorCep.add("51,67");
			
			List<String> caminhoCep = new ArrayList<String>();
			caminhoCep.add("//*[@id=\"table-calcular\"]/tr[1]/td[3]");
			caminhoCep.add("//*[@id=\"table-calcular\"]/tr[2]/td[3]");
			caminhoCep.add("//*[@id=\"table-calcular\"]/tr[3]/td[3]");

			Exercicio3Model exercicio3Model = new Exercicio3Model("driver" + File.separator + "chromedriver.exe",
																"https://www.kabum.com.br/",
																"Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite",
																"//input[@class=\"sprocura\"]",
																"bt-busca",
																"//a[text()='Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite']",
																"38413108",
																"//input[@class=\"input-frete cep\"]",
																"//input[@value='Calcular Frete']",
																 valorCep,
																 caminhoCep);
				
			exercicio3Service.executeTest(exercicio3Model);
					
			System.out.println("Teste realizado com sucesso");
			
		} catch (InterruptedException e) {
			System.out.println("Falha ao realizar teste");
			e.printStackTrace();
		}
		
	}
}
