package controllers;

import models.cats;
import models.dogs;

public abstract class PetAbstract implements affectionInterface {
	
	public dogs createDog(String name, String breed, int weight){
		return new dogs(name, breed, weight);
	}
	public cats createCat(String name, String breed, int weight){
		return new cats(name, breed, weight);
	}
}
