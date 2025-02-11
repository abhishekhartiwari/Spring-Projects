package com.abhi.springcore.property;

import java.util.Properties;

public class Language {
	
	private Properties CountryAndLanguage;

	public Properties getCountryAndLanguage() {
		return CountryAndLanguage;
	}

	public void setCountryAndLanguage(Properties countryAndLanguage) {
		CountryAndLanguage = countryAndLanguage;
	}

	@Override
	public String toString() {
		return "Language [CountryAndLanguage=" + CountryAndLanguage + "]";
	}
	
	

}
