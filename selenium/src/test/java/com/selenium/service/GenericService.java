package com.selenium.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericService {
	
	public WebDriver abreChromeNaUrl(String urlChromedriver, String url){
		
		System.setProperty("webdriver.chrome.driver", urlChromedriver);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
		
        return driver;
	}
	

	public WebDriver efetuaBuscaEmCampoInput(WebDriver driver, String input, String btn, String value) {
		
		if(isXpath(input)) {
			this.encontrarInputPorXpathInserirValor(driver, input, value);
		}else {
			this.encontrarInputPorIdInserirValor(driver, input, value);
		}
		
		this.encontraElementoNaTelaClica(driver, btn);

		return driver;
	}

	
	public WebDriver efetuaBuscaEmCampoInputClicandoNoInicio(WebDriver driver, String input, String btn, String value) {
		
	       WebDriverWait wait = new WebDriverWait(driver, 10);
	       
	       if(isXpath(input)) {
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(input)));
		        WebElement webElement = driver.findElement(By.xpath(input));
		        
		        Actions act = new Actions(driver);
		        act.moveToElement(webElement).moveByOffset(0, 0).click().perform();
		        
		        webElement.sendKeys(new String[] {value});
	    	   
	       }else {
	    	   
		        wait.until(ExpectedConditions.elementToBeClickable(By.id(input)));
		        WebElement webElement = driver.findElement(By.id(input));
		        
		        Actions act = new Actions(driver);
		        act.moveToElement(webElement).moveByOffset(0, 0).click().perform();
		        
		        webElement.sendKeys(new String[] {value});   
	       }
	       
	       this.encontraElementoNaTelaClica(driver, btn);
		return driver;
	}
	
	public WebDriver encontraElementoNaTelaClica(WebDriver driver, String element){
		
	       WebDriverWait wait = new WebDriverWait(driver, 10);
	       
	       if(isXpath(element)) {
	    	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
	    	   driver = this.encontraElementoPorXpathClique(driver, element);
	       }else {
	    	   wait.until(ExpectedConditions.elementToBeClickable(By.id(element)));
	    	   driver = this.encontraElementoPorIdClique(driver, element);
	       }
	       
	       return driver;
	}
	public boolean verificaSePossuiElementoComValorPassado(WebDriver driver, String element, String valor) {
		if(isXpath(element)) {
			return driver.findElement(By.xpath(element)).getText().toString().contains(valor);
		}else {
			return driver.findElement(By.id(element)).getText().toString().contains(valor);
		}
	}
	
	private boolean isXpath(String element) {
		return element.startsWith("//");
	}
	
	public WebDriver encontrarInputPorIdInserirValor(WebDriver driver, String id, String value){		
        driver.findElement(By.id(id)).sendKeys(value);
        return driver;
	}
	
	public WebDriver encontrarInputPorXpathInserirValor(WebDriver driver, String xpath, String value) {
        driver.findElement(By.xpath(xpath)).sendKeys(value);
        return driver;
	}
	
	public WebDriver encontraElementoPorIdClique(WebDriver driver, String id){		
		driver.findElement(By.id(id)).click();
        return driver;
	}
	
	public WebDriver encontraElementoPorXpathClique(WebDriver driver, String xpath){		
		driver.findElement(By.xpath(xpath)).click();
        return driver;
	}
	
	public WebDriver preencherCampoInput(WebDriver driver, String element, String value){		
		if(isXpath(element)) {
			driver.findElement(By.xpath(element)).sendKeys(value);
		}else {
			driver.findElement(By.id(element)).sendKeys(value);
		}
        return driver;
	}
	
	public WebDriver preencherCampoInputLimpandoAntes(WebDriver driver, String element, String value){		
		if(isXpath(element)) {
			driver.findElement(By.xpath(element)).clear();
			driver.findElement(By.xpath(element)).sendKeys(value);
		}else {
			driver.findElement(By.id(element)).clear();
			driver.findElement(By.id(element)).sendKeys(value);
		}
        return driver;
	}

}
