import java.util.*;
class ElectricityBill{
	private String customerName;
	private double unitsConsumed;
	private double billAmount;
	
	public ElectricityBill(String customerName, double unitsConsumed){
		this.customerName = customerName;
		this.unitsConsumed = unitsConsumed;
		this.billAmount = 0.0;
	}
	
	public void calculateBillAmount(){
		if(unitsConsumed <= 100){
			billAmount = unitsConsumed * 5;
		}
		else if(unitsConsumed <=300){
			billAmount = (100*5) + ((unitsConsumed -100) * 7);
		}
		else{
			billAmount = (100*5) + (200*7) + ((unitsConsumed - 300) * 10);
		}
	}
	
	public void displayBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill Amount: Rs. " + billAmount);
    }
}

public class ElectricityBillDemo{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter customer name: ");
		String customerName = scn.nextLine();
		
		System.out.print("Enter units consumed: ");
        double unitsConsumed = scn.nextDouble();
		
		ElectricityBill bill = new ElectricityBill(customerName, unitsConsumed);
		
		bill.calculateBillAmount();
		
		bill.displayBill();
	}
}