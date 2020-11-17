package ru.klabukova.springcourse;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {

	public String getSong() {
		return "Benz Truck";
	}

}
