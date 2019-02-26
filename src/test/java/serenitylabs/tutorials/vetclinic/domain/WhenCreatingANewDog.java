package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import java.util.Calendar;

import org.junit.Assert;

public class WhenCreatingANewDog {
	
	Calendar birthday = Calendar.getInstance();
	
	@Test
	public void a_dog_with_all_parameters() throws Exception {
		
		Dog fido = DogBuilder.aDog()
				.called("Fido")
				.ofBreed("poodle")
				.ofColour("black")
				.withFavouriteFood("pizza")
				.withFavouriteToy("bone")
				.bornOn(birthday);
		
		Assert.assertEquals("Fido", fido.getName());
		Assert.assertEquals("poodle", fido.getBreed());
		Assert.assertEquals("black", fido.getColour());
		Assert.assertEquals("pizza", fido.getFavouriteFood());
		Assert.assertEquals("bone", fido.getFavouriteToy());
		Assert.assertEquals(birthday, fido.getBirthday());
	}
	
	@Test
	public void a_dog_can_have_an_optional_favouite_food() throws Exception{
		
		Dog fido = DogBuilder.aDog()
				.called("Fido")
				.ofBreed("poodle")
				.ofColour("black")
				.withFavouriteFood("pizza")
				.bornOn(birthday);
		
		Assert.assertEquals("Fido", fido.getName());
		Assert.assertEquals("poodle", fido.getBreed());
		Assert.assertEquals("black", fido.getColour());
		Assert.assertEquals("pizza", fido.getFavouriteFood());
		Assert.assertNull(fido.getFavouriteToy());
		Assert.assertEquals(birthday, fido.getBirthday());
	}
	
	@Test
	public void a_dog_can_have_an_optional_favouite_toy() throws Exception{
		
		Dog fido = DogBuilder.aDog()
				.called("Fido")
				.ofBreed("poodle")
				.ofColour("black")
				.withFavouriteToy("bone")
				.bornOn(birthday);
		
		Assert.assertEquals("Fido", fido.getName());
		Assert.assertEquals("poodle", fido.getBreed());
		Assert.assertEquals("black", fido.getColour());
		Assert.assertNull(fido.getFavouriteFood());
		Assert.assertEquals("bone", fido.getFavouriteToy());
		Assert.assertEquals(birthday, fido.getBirthday());
	}
	
	@Test
	public void a_small_dog() throws Exception {
		
		Dog fido = DogBuilder.aSmallDog()
				.called("Fido")
				.ofColour("black")
				.withFavouriteFood("pizza")
				.withFavouriteToy("bone")
				.bornOn(birthday);
		
		Assert.assertEquals("Fido", fido.getName());
		Assert.assertEquals("poodle", fido.getBreed());
		Assert.assertEquals("black", fido.getColour());
		Assert.assertEquals("pizza", fido.getFavouriteFood());
		Assert.assertEquals("bone", fido.getFavouriteToy());
		Assert.assertEquals(birthday, fido.getBirthday());
	}
	
	@Test
	public void a_big_dog() throws Exception {
		
		Dog fido = DogBuilder.aBigDog()
				.called("Fido")
				.ofColour("black")
				.withFavouriteFood("pizza")
				.withFavouriteToy("bone")
				.bornOn(birthday);
		
		Assert.assertEquals("Fido", fido.getName());
		Assert.assertEquals("labrador", fido.getBreed());
		Assert.assertEquals("black", fido.getColour());
		Assert.assertEquals("pizza", fido.getFavouriteFood());
		Assert.assertEquals("bone", fido.getFavouriteToy());
		Assert.assertEquals(birthday, fido.getBirthday());
	}

}
