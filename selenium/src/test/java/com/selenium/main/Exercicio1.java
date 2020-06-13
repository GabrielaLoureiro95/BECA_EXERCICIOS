package com.selenium.main;

import com.selenium.service.Exercicio1Service;

/**
 * Exercicio numero 1:
 * 1 - Acessar o site: https://wpforms.com/demo/
 * 2 - No select “Viewing All Templates” selecionar “FeedBack”
 * 3 - Clicar em “View Demo” do card “Neighborhood Events Questionnaire Form Demo”
 * 4 - Preencher todos os campos (radio button e textbox) do formulário com qualquer valor.
 * 5 - Enviar (Submit) o formulário
 * 6 - Validar que foi o formulário foi enviado.
 *
 */
public class Exercicio1 {
	public static void main(String[] args){
		try {
			Exercicio1Service exercicio1Service = new Exercicio1Service();
			exercicio1Service.executeTest();
					
			System.out.println("Teste realizado com sucesso");
		} catch (Exception e) {
			System.out.println("Falha ao realizar teste");
			e.printStackTrace();
		}
		
	}
}
