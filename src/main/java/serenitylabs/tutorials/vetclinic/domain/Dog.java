package serenitylabs.tutorials.vetclinic.domain;

import java.util.Calendar;

public class Dog {
	
	private final String name;
	
	private final String breed;
	
	private final Calendar birthday;
	
	private final String colour;
	
	private final String favouriteFood;
	
	private final String favouriteToy;

	public Dog(String name, String breed, Calendar birthday, String colour, 
			String favouriteFood, String favouriteToy) {
		this.name = name;
		this.breed = breed;
		this.birthday = birthday;
		this.colour = colour;
		this.favouriteFood = favouriteFood;
		this.favouriteToy = favouriteToy;
	}
	
	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public Calendar getBirthday() {
		return birthday;
	}

	public String getColour() {
		return colour;
	}

	public String getFavouriteFood() {
		return favouriteFood;
	}

	public String getFavouriteToy() {
		return favouriteToy;
	}	
}
