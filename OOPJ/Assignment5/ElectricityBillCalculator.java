import java.util.*;

class ElectricityBill {
	private String customerName;
	private double unitsConsumed;
	private double billAmount;
	
	public ElectricityBill(String customerName, double unitsConsumed){
		this.customerName = customerName;
		this.unitsConsumed = unitsConsumed;
		
		if(unitsConsumed < 0){
			throw new IllegalArgumentException("Units consumed cannot be negative!");
		}
	}
	
	public void calculateBill(){
		if(unitsConsumed <= 100){
			billAmount = unitsConsumed * 5;
		}
		else if(unitsConsumed <= 300){
			billAmount = (100*5)+((unitsConsumed - 300)*7);
		}
		else{
			billAmount = (100*5)+(200*5)+((unitsConsumed-300)*10);
		}
	}
	
	public void displayCalulateBill(){
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill Amount: Rs. " + billAmount);		
	}
}


public class ElectricityBillCalculator{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		try{
			System.out.print("Enter customer name: ");
			String customerName = scn.nextLine();
			
			System.out.print("Enter units consumed: ");
            double unitsConsumed = scn.nextDouble();
			
			ElectricityBill bill = new ElectricityBill(customerName, unitsConsumed);
			
			bill.calculateBill();
			bill.displayCalulateBill();
		}catch(InputMismatchException e){
			System.out.println("Invalid input! Please enter numeric values for units consumed.");
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
}