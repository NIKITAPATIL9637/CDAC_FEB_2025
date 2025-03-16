abstract class Shape{
	protected String shapeName;
	
	public Shape(String shapeName){
		this.shapeName = shapeName;
	}
	
	public String getShapeName(){
		return shapeName;
	}
	
	public abstract double calculateArea();
}

class Circle extends Shape{
	private double radius;
	
	public Circle(double radius){
		super("Circle");
		this.radius = radius;
	}
	
	public double calculateArea(){
		return Math.PI * radius * radius;
	}
}

class Reactangle extends Shape{
	private double length;
	private double width;
	
	public Reactangle(double length, double width){
		super("Reactangle");
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea(){
		return length * width;
	}
}

public class ShapeDemo{
	public static void main(String args[]){
		Shape circle = new Circle(5.0);
		System.out.println("Shape: " + circle.getShapeName());
		System.out.println("Shape: " + circle.calculateArea());
		
		Shape Reactangle = new Reactangle(4.0, 6.0);
		System.out.println("Shape: " + circle.getShapeName());
		System.out.println("Area: " + Reactangle.calculateArea());
	}
}