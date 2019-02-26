package serenitylabs.tutorials.vetclinic.domain;

import java.util.Calendar;
import serenitylabs.tutorials.vetclinic.domain.Dog;

public class DogBuilder implements WithBreed, WithColour{
	
	private String name;
	private String breed;
	private String colour;
	private String favouriteFood;
	private String favouriteToy;
	
	public static DogBuilder aDog() {
		return new DogBuilder();
	}
	
	public static DogBuilder aSmallDog() {		
		return aDog().ofBreed("poodle");
	}
	
	public static DogBuilder aBigDog() {
		return aDog().ofBreed("labrador");
	}
	
	
	public DogBuilder called(String name) {
		this.name = name;
		return this;
	}
	
	public DogBuilder ofBreed(String breed) {
		this.breed = breed;
		return this;
	}

	public DogBuilder ofColour(String colour) {
		this.colour = colour;
		return this;
	}
	
	public DogBuilder withFavouriteFood(String favouriteFood) {
		this.favouriteFood = favouriteFood;
		return this;
	}
	
	public DogBuilder withFavouriteToy(String favouriteToy) {
		this.favouriteToy = favouriteToy;
		return this;
	}
	
	public Dog bornOn(Calendar birthday) {
		return new Dog(name, breed, birthday, colour, favouriteFood, favouriteToy);
	}
}
