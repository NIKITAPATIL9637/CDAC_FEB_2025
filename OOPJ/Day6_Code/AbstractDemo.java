abstract class vehicle{
	abstract void absMethod();
	
	void display(){
		System.out.println("Display method in vehicle");
	}
}

class Bike extends vehicle{
	void absMethod(){
		System.out.println("Abstract method implemented in Bike");
	}
	
	void show(){
		System.out.println("Show method in Bike");
	}
	
	private double distance;
	private double time;
	
	public Bike(double distance, double time){
		this.distance = distance;
		this.time = time;
	}
	
	public double calculateAverage(){
		return distance / time;
	}
}

public class AbstractDemo{
	public static void main(String args[]){
		Bike b1 = new Bike(120, 3);
		
		b1.absMethod();
		b1.display();
		b1.show();
		
		double average = b1.calculateAverage(); // upcasting
		System.out.println(average);
	}
}