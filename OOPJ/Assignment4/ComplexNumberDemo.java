class ComplexNumber{
	private double real;
	private double imaginary;
	
	public ComplexNumber(){
		this.real = 0;
		this.imaginary = 0;
	}
	
	public ComplexNumber(double real){
		this.real = real;
		this.imaginary = 0;
	}
	
	public ComplexNumber(double real, double imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public ComplexNumber add(ComplexNumber other){
		double newReal = this.real + other.real;
		double newImaginary = this.imaginary + other.imaginary;
		
		return new ComplexNumber(newReal, newImaginary);
	}
	
	public ComplexNumber multiply(ComplexNumber other){
		double newReal = this.real * other.real;
		double newImaginary = this.imaginary * other.imaginary;
		
		return new ComplexNumber(newReal, newImaginary);
	}
	
	public void display(){
		System.out.println(this.real + " " + (this.imaginary >= 0 ? "+" : "-") + " " + this.imaginary + "i");
	}
}

public class ComplexNumberDemo{
	public static void main(String args[]){
		ComplexNumber num1 = new ComplexNumber(3, 2);
		ComplexNumber num2 = new ComplexNumber(4, -2);
		
		System.out.print("First Complex Number 1: ");
		num1.display();
		
		System.out.print("Complex Number 2: ");
		num2.display();
		
		ComplexNumber sum = num1.add(num2);
		ComplexNumber product = num1.multiply(num2);
		
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
	}
}