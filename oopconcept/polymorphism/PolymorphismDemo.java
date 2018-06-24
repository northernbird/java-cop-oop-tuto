package oopconcept.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		// We create animals here and save to the list to let them speak
		List<Animal> speakList = new ArrayList<Animal>();
		// Look! child class objects (Cat, Dog, Duck) are saved into a list of Animal object!
		speakList.add(new Cat());
		speakList.add(new Dog());
		speakList.add(new Duck());

		// We want all animals to speak 
		for(Animal animal : speakList) {
			animal.speak();
		}
	}

}
