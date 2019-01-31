// Assignment #: 4
//         Name: Alan Griffieth
//    StudentID: 1212575453
//      Lecture: MWF 9:40 - 10:30
//  Description: This class is used by the Assignment4 driver to return and set information about the Laptop including the
//				 brand name, Model, and price by using getter and setter methods.

import java.text.DecimalFormat;

public class Laptop {
	//instance variables
	private String brandName;
	private Model model;
	private double price;
	//constructor method
	public Laptop() {
		this.brandName = "?";
		this.price = 0.0;
		this.model = new Model();
	}
	
	//getter methods
	
	public String getBrand() {
		return this.brandName;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public Model getModel() {
		return this.model;
	}
	
	//setter methods
	
	public void setBrand(String newBrand) {
		this.brandName = newBrand;
	}
	
	public void setModel(String newModel, double newCPU, int newRAM) {
		this.model.setModel(newModel);
		this.model.setCPU(newCPU);
		this.model.setRAM(newRAM);
	}
	
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
	
	public String toString() {
		DecimalFormat fmt = new DecimalFormat("$0.00"); 
		DecimalFormat fmt2 = new DecimalFormat("0.00GHz"); //DecimalFormats ensure output is the same as test cases
		String result = "";
		result = "\nBrand:\t" + this.brandName + "\n"
				+ "Model:\t"  + this.model.getModel() + "\n"
				+ "CPU:\t" + fmt2.format(this.model.getCPU()) + "\n"
				+"RAM:\t" + this.model.getRAM() + "GB\n"
				+ "Price:\t" + fmt.format(this.price) + "\n\n";
		return result;
	}

}
