/**
 	* Return the name, breed and weight of a dog and allow the user to set new values for them.
	*@author Yaseman
	*@version 0.29.0
 */
public class Dog{
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
	/**
	 * getter method for the the name
	 * @return the name as the String
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * getter method to access breed
	 * @return the breed as String
	 */
	public String getBreed(){
		return this.breed;
	}
	/**
	 * getter method to access the weight.
	 * @return the weight as integer
	 */
	public int getWeight(){
		return this.weight;
	}
	/**
	 * setter method to access name
	 * @param name
	 */
	public void setName(String name){
		this.name=name;
	}
	/**
	 * setter method to access weight
	 * @param weight
	 */
	public void setWeight(int weight){
		this.weight=weight;
	}
	/**
	 * Setter method to acces breed
	 * @param breed
	 */
	public void setBreed(String breed){
		this.breed=breed;
	}
}