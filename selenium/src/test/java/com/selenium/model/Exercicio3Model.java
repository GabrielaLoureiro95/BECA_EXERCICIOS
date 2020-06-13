package com.selenium.model;

import java.util.List;

public class Exercicio3Model {
	
	String driverUrl;
	
	String baseUrl;
	
	String produtoNome;
	
	String caminhoInputNome;
	
	String caminhoBtnInputNome;
	
	String caminhoElementoSelecionar;
	
	String cep;
	
	String caminhoInputCep;
	
	String caminhoBtnInputCep;
	
	List<String> valorCep;
	
	List<String> caminhoValorCep;



	public Exercicio3Model(String driverUrl, String baseUrl, String produtoNome, String caminhoInputNome,
			String caminhoBtnInputNome, String caminhoElementoSelecionar, String cep, String caminhoInputCep,
			String caminhoBtnInputCep, List<String> valorCep, List<String> caminhoValorCep) {
		super();
		this.driverUrl = driverUrl;
		this.baseUrl = baseUrl;
		this.produtoNome = produtoNome;
		this.caminhoInputNome = caminhoInputNome;
		this.caminhoBtnInputNome = caminhoBtnInputNome;
		this.caminhoElementoSelecionar = caminhoElementoSelecionar;
		this.cep = cep;
		this.caminhoInputCep = caminhoInputCep;
		this.caminhoBtnInputCep = caminhoBtnInputCep;
		this.valorCep = valorCep;
		this.caminhoValorCep = caminhoValorCep;
	}

	public String getDriverUrl() {
		return driverUrl;
	}

	public void setDriverUrl(String driverUrl) {
		this.driverUrl = driverUrl;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public String getProdutoNome() {
		return produtoNome;
	}

	public void setProdutoNome(String produtoNome) {
		this.produtoNome = produtoNome;
	}

	public String getCaminhoInputNome() {
		return caminhoInputNome;
	}

	public void setCaminhoInputNome(String caminhoInputNome) {
		this.caminhoInputNome = caminhoInputNome;
	}

	public String getCaminhoBtnInputNome() {
		return caminhoBtnInputNome;
	}

	public void setCaminhoBtnInputNome(String caminhoBtnInputNome) {
		this.caminhoBtnInputNome = caminhoBtnInputNome;
	}

	public String getCaminhoElementoSelecionar() {
		return caminhoElementoSelecionar;
	}

	public void setCaminhoElementoSelecionar(String caminhoElementoSelecionar) {
		this.caminhoElementoSelecionar = caminhoElementoSelecionar;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCaminhoInputCep() {
		return caminhoInputCep;
	}

	public void setCaminhoInputCep(String caminhoInputCep) {
		this.caminhoInputCep = caminhoInputCep;
	}

	public String getCaminhoBtnInputCep() {
		return caminhoBtnInputCep;
	}

	public void setCaminhoBtnInputCep(String caminhoBtnInputCep) {
		this.caminhoBtnInputCep = caminhoBtnInputCep;
	}

	public List<String> getValorCep() {
		return valorCep;
	}

	public void setValorCep(List<String> valorCep) {
		this.valorCep = valorCep;
	}

	public List<String> getCaminhoValorCep() {
		return caminhoValorCep;
	}

	public void setCaminhoValorCep(List<String> caminhoValorCep) {
		this.caminhoValorCep = caminhoValorCep;
	}
}
