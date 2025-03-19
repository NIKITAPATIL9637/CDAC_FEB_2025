class Room{
	private double height;
	private double width;
	private double breadth;
	
	public Room(double height, double width, double breadth){
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	
	public double volume(){
		return height*width*breadth;
	}
}



public class RoomDemo{
	public static void main(String args[]){
		Room room1 = new Room(10,15,20);
		
		System.out.println("Volume is: "+room1.volume());
	}
}