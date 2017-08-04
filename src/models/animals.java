package models;

public class animals {
	private String name;
	private int weight;
	private String breed;
	
	
	public animals(String name, String breed, int weight) {
		this.name = name;
		this.weight = weight;
		this.breed = breed;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
}
