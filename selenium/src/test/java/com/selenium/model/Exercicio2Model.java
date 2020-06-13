package com.selenium.model;

public class Exercicio2Model {
	
	String driverUrl;
	
	String baseUrl;
	
	String chooseYourDepartureCity;
	
	String chooseYourDestinationCity;
	
	String departs;
	
	String Arrives;
	
	String nameValidate;
	
	String name;
	
	String address;
	
	String city;
	
	String state;
	
	String zipCode;
	
	String cardType;
	
	String creditCardNumber;
	
	String month;
	
	String year;
	
	String nameOnCard;
	
	public Exercicio2Model(String driverUrl, String baseUrl, String chooseYourDepartureCity,
			String chooseYourDestinationCity, String departs, String arrives) {
		super();
		this.driverUrl = driverUrl;
		this.baseUrl = baseUrl;
		this.chooseYourDepartureCity = chooseYourDepartureCity;
		this.chooseYourDestinationCity = chooseYourDestinationCity;
		this.departs = departs;
		Arrives = arrives;
	}

	public Exercicio2Model(String driverUrl, String baseUrl, String chooseYourDepartureCity,
			String chooseYourDestinationCity, String nameValidate) {
		super();
		this.driverUrl = driverUrl;
		this.baseUrl = baseUrl;
		this.chooseYourDepartureCity = chooseYourDepartureCity;
		this.chooseYourDestinationCity = chooseYourDestinationCity;
		this.nameValidate = nameValidate;
	}

	public Exercicio2Model(String driverUrl, String baseUrl, String chooseYourDepartureCity,
			String chooseYourDestinationCity, String nameValidate, String name, String address, String city,
			String state, String zipCode, String cardType, String creditCardNumber, String month, String year,
			String nameOnCard) {
		super();
		this.driverUrl = driverUrl;
		this.baseUrl = baseUrl;
		this.chooseYourDepartureCity = chooseYourDepartureCity;
		this.chooseYourDestinationCity = chooseYourDestinationCity;
		this.nameValidate = nameValidate;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.cardType = cardType;
		this.creditCardNumber = creditCardNumber;
		this.month = month;
		this.year = year;
		this.nameOnCard = nameOnCard;
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

	public String getChooseYourDepartureCity() {
		return chooseYourDepartureCity;
	}

	public void setChooseYourDepartureCity(String chooseYourDepartureCity) {
		this.chooseYourDepartureCity = chooseYourDepartureCity;
	}

	public String getChooseYourDestinationCity() {
		return chooseYourDestinationCity;
	}

	public void setChooseYourDestinationCity(String chooseYourDestinationCity) {
		this.chooseYourDestinationCity = chooseYourDestinationCity;
	}

	public String getDeparts() {
		return departs;
	}

	public void setDeparts(String departs) {
		this.departs = departs;
	}

	public String getArrives() {
		return Arrives;
	}

	public void setArrives(String arrives) {
		Arrives = arrives;
	}

	public String getNameValidate() {
		return nameValidate;
	}

	public void setNameValidate(String nameValidate) {
		this.nameValidate = nameValidate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
}
