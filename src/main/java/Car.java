/**
 * Return the make, model, year, and price of the car and allow you to set new values to the varialbes.
 * @author Yaseman
 * @vesrsion 0.29.0
 */
public class Car{
	private String make, model;
	private double price;
	private int year;

    /**
     * allows you to set to values to make, year, model, and price
     * @param make
     * @param model
     * @param year
     * @param price
     */
	public Car(String make, String model, int year, double price){
		this.make= make;
		this. model=model;
		this. year= year;
		this. price=price;
	}
    /**
	 * Getter method to access make
	 * @return make
	 */
	public String getMake(){
		return this.make;
	}
	/**
	 * Getter method to access model
	 * @return model
	 */
	public String getModel(){
		return this.model;
	}
	/**
	 * Getter method to access year
	 * @return year
	 */
	public int getYear(){
		return this.year;
	}
	/**
	 * getter method to access price
	 * @return price
	 */
	public double getPrice(){
		return this.price;
	}
	/**
	 * Setter method to access make
	 * @param make
	 */
	public void setMake(String make){
		this.make=make;
	}
	/**
	 * Setter method to acces model
	 * @param model
	 */
	public void setModel(String model){
		this.model=model;
	}
	/**
	 * Setter method to access year
	 * @param year
	 */
	public void setYear(int year){
		this.year= year;
	}
	/**
	 * setter method to access price
	 * @param price
	 */
	public void setPrice(double price){
		this.price=price;
	}
}
