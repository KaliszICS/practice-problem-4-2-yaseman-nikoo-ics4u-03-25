public class PracticeProblem {

	public static void main(String args[]) {

	}
}
/**
 	* Return the name, breed and weight of a dog and allow the user to set new values for them.
	*@author Yaseman
	*@version 0.29.0
 */
class Dog{
	//instance variable
	private String name, breed;
	private int weight;
	/**
	 * the variables shows the name, weight, and breed of the dog
	 * @param name the name of the dog
	 * @param breed the breed of the dog
	 * @param weight the weight of the dog
	 */

	public Dog(String name, String breed, int weight){
		this.name = name;
		this.breed= breed;
		this.weight= weight;
	}
	public String getName(){
		return this.name;
	}
	public String getBreed(){
		return this.breed;
	}
	public int getWeight(){
		return this.weight;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setWeight(int weight){
		this.weight=weight;
	}
	public void setBreed(String breed){
		this.breed=breed;
	}
}
	class Car{
		private String make, model;
		private double price;
		private int year;
		public Car(String make, String model, int year, double price){
			this.make= make;
			this. model=model;
			this. year= year;
			this. price=price;
		}
		public String getMake(){
			return this.make;
		}
		public String getModel(){
			return this.model;
		}
		public int getYear(){
			return this.year;
		}
		public double getPrice(){
			return this.price;
		}
		public void setMake(String make){
			this.make=make;
		}
		public void setModel(String model){
			this.model=model;
		}
		public void setYear(int year){
			this.year= year;
		}
		public void setPrice(double price){
			this.price=price;
		}
	}

