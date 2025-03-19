class Box{
	private double height;
	private double width;
	private double breadth;
	
	public Box(double height, double width, double breadth){
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	
	public double getVolume(){
		return height * width * breadth;
	}
	
	public double getArea(){
		return 2*(height*width + width*breadth + height*breadth);
	}
}

public class BoxAreaVolumeDemo{
	public static void main(String args[]){
		Box box1 = new Box(10,12,14);
		Box box2 = new Box(12,10,13);
		
		System.out.println("Box 1 volume: " + box1.getVolume());
		System.out.println("Box 1 Surface Area: " + box1.getArea());
		
		System.out.println("Box 2 volume: " + box2.getVolume());
		System.out.println("Box 2 Surface Area: " + box2.getArea());
	}
}