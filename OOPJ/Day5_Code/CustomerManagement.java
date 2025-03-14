class Customer{
	private String name;
	private int age;
	private String address;
	
	public Customer(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void displayDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Age: " + age);
        System.out.println("Customer Address: " + address);
    }
}

public class CustomerManagement{
	public static void main(String args[]){
		Customer cust = new Customer("Nikita", 23, "Flat No.14, Warje");
		cust.displayDetails();
		
		cust.setAddress("Flat No.08, Narhe");
		System.out.println("Customer Updated address -->");
		cust.displayDetails();
	}
}