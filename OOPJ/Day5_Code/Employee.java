public class Employee{
    int emp_id;
	String emp_name;
	String emp_address;
    long phone_number;
	double salary;
 
    Employee(int emp_id, String emp_name, String emp_address, long emp_phone_number, double emp_salary){
	    this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_address = emp_address;
		this.phone_number = emp_phone_number;
		this.salary = emp_salary;
		
		System.out.println("Emp_id:" + emp_id);
		
		System.out.println("Emp_name:" + emp_name);

		System.out.println("Emp_address:" + emp_address);
		
		System.out.println("Emp_phone_number:" + emp_phone_number);
		
		System.out.println("Emp_salary:" + salary);
	}
 
    public static void main(String args[]){
	System.out.println("Employee Details: " );
	Employee emp1 = new Employee(1, "Amit", "Sharma", 9876543210L, 3000000);
	System.out.println();
    Employee emp2 = new Employee(2, "Priya", "Verma", 8765432109L, 2800000);
	System.out.println();
    Employee emp3 = new Employee(3, "Raj", "Patil", 7654321098L, 3500000);
	System.out.println();
    Employee emp4 = new Employee(4, "Simran", "Gupta", 6543210987L, 2700000);
	System.out.println();
    Employee emp5 = new Employee(5, "Vikram", "Joshi", 5432109876L, 4000000);
	System.out.println();
    Employee emp6 = new Employee(6, "Neha", "Kumar", 4321098765L, 3200000);
	System.out.println();
    Employee emp7 = new Employee(7, "Arjun", "Mehta", 3210987654L, 2900000);
	System.out.println();
    Employee emp8 = new Employee(8, "Sneha", "Singh", 2109876543L, 3100000);
	System.out.println();
    Employee emp9 = new Employee(9, "Rohit", "Yadav", 1098765432L, 3600000);
	System.out.println();
    Employee emp10 = new Employee(10, "Kavita", "Pandey", 9988776655L, 3300000);
	System.out.println();
    Employee emp11 = new Employee(11, "Manoj", "Choudhary", 8877665544L, 2700000);
	System.out.println();
    Employee emp12 = new Employee(12, "Swati", "Desai", 7766554433L, 3900000);
	System.out.println();
    Employee emp13 = new Employee(13, "Ankush", "Reddy", 6655443322L, 4100000);
	System.out.println();
    Employee emp14 = new Employee(14, "Pooja", "Nair", 5544332211L, 3000000);
	System.out.println();
    Employee emp15 = new Employee(15, "Rahul", "Kapoor", 4433221100L, 3400000);
	}
}