// Assignment #: 4
//         Name: Alan Griffieth
//    StudentID: 1212575453
//      Lecture: MWF 9:40 - 10:30
//  Description: This class is used by the Assignemnt4 Driver/Laptop Class to return and set information about the model of the
//				 laptop including the model name, CPU speed, and RAM size using getter and setter methods.

import java.text.DecimalFormat;

public class Model {
	//instance variables
	private String modelName;
	private double cpuSpeed;
	private int ramSize;
	//constructor method
	public Model () {
		this.modelName = "?";
		this.cpuSpeed = 0.0;
		this.ramSize = 0;
	}
	
	//getter methods
	
	public String getModel() {
		return this.modelName;
	}
	
	public double getCPU() {
		return this.cpuSpeed;
	}
	
	public int getRAM() {
		return this.ramSize;
	}
	
	//setter methods
	
	public void setModel(String newModel) {
		this.modelName = newModel;
	}
	
	public void setCPU(double newCPU) {
		this.cpuSpeed = newCPU;
	}
	
	public void setRAM(int newRAM) {
		this.ramSize = newRAM;
	}
	
	public String toString() {
		DecimalFormat fmt = new DecimalFormat("0.00GHz"); //DecimalFormat ensure output is the same as test cases
		String result = "";
		result = "Model:\t" + this.modelName + "\n"
				+ "CPU:\t" + fmt.format(this.cpuSpeed) + "\n"
				+ "RAM:\t" + this.ramSize + "GB\n";
		return result;
	}
	
	
	
}
