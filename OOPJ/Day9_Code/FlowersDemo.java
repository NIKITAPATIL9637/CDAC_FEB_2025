class Flowers{
	String flower_name;
	String flower_color;
	boolean hasFrangrance;
	
	public Flowers(String flower_name, String flower_color, boolean hasFrangrance){
		this.flower_name = flower_name;
		this.flower_color = flower_color;
		this.hasFrangrance = hasFrangrance;
	}
	
	public void displayDetails(){
		System.out.println("Flowers name: " + flower_name);
		System.out.println("Flowers color: " + flower_color);
		System.out.println("Has Fragrance: " + (hasFrangrance ? "Yes" : "No"));
	}
}

class Rose extends Flowers{
	boolean hasThorns;
	
	public Rose(String color, boolean hasFrangrance, boolean hasThorns){
		super("Rose", color, hasFrangrance);
		this.hasThorns = hasThorns;
	}
	
	@Override
	public void displayDetails(){
		System.out.println("Rose Details --> ");
		super.displayDetails();
		System.out.println("Has Throns: " + (hasThorns ? "Yes" : "No"));
		System.out.println();
	}
}

class Lily extends Flowers{
	boolean isWaterPlant;
	
	public Lily(String color, boolean hasFrangrance, boolean isWaterPlant){
		super("Lily", color, hasFrangrance);
		this.isWaterPlant = isWaterPlant;
	}
	
	@Override
	public void displayDetails(){
		System.out.println("Lily Details --> ");
		super.displayDetails();
		System.out.println("Grows in water : " + (isWaterPlant ? "Yes" : "No"));
	}
}

public class FlowersDemo{
	public static void main(String args[]){
		Rose rose = new Rose("Red", true, true);
		rose.displayDetails();
		Lily lily = new Lily("White", true, true);
		lily.displayDetails();
	}
}