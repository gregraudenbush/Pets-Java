package models;

import controllers.affectionInterface;

public abstract class PetAbstract implements affectionInterface {


	public dogs createDog(String name, String breed, int weight){
		return new dogs(name, breed, weight);
	}
	public cats createCat(String name, String breed, int weight){
		return new cats(name, breed, weight);
	}
	public String showAffection(dogs d){
		if(d.weight > 30) {
			return (d.name + " curled up next to you");
		}else {
			return (d.name + " hopped up on your lap");
		}
	}
	public String showAffection(cats c){
		return (c.name + " looked at you with some affection, You think.");
	}
}
