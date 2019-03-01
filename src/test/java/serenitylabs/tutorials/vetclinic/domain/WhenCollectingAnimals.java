package serenitylabs.tutorials.vetclinic.domain;

import java.util.ArrayList;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class WhenCollectingAnimals {
	
	@Test
	public void a_list_of_animals_can_contain_dogs_and_cats() {
		
		Dog danger = Dog.called("danger").ofBreed("labrador").andOfColour("black");
		Cat felix = Cat.called("felix").ofBreed("siamese").andOfColour("white");
		
		ArrayList<Animals> animals = new ArrayList<>();
		animals.add(danger);
		animals.add(felix);
		
		assertThat(animals, hasItems(danger,felix));
	}

}
