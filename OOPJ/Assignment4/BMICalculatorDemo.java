import java.util.*;

class BMICalculator{
	private double height;
	private double weight;
	
	public BMICalculator(double height, double weight){
		this.height = height;
		this.weight = weight;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public double calculateBMI(){
		return weight/(height*height);
	}
}

public class BMICalculatorDemo{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter your height in meters: ");
		double height = scn.nextDouble();
		
		System.out.print("Enter your weight in kilograms: ");
		double weight = scn.nextDouble();
		
		BMICalculator bmi = new BMICalculator(height, weight);
		bmi.setHeight(height);
		bmi.setWeight(weight);
		
		double bmiCalc = bmi.calculateBMI();

        System.out.printf("Your BMI is: %.2f%n", bmiCalc);			
	}
}