public class Q5{
	private int age;
	
	public void setAge(int age){
		this.age = age;
		if(age<0 || age>150){
			throw new IllegalArgumentException("Age must be between 0 and 150. Provided age: " + age);
		}
	}
	
	public void displayAge(){
		System.out.println("Age is: " + age);
	}
	
	public static void main(String args[]){
		
		try{
			Q5 validator = new Q5();
			validator.setAge(23);
			validator.displayAge();
			validator.setAge(-5);
			
		}catch(IllegalArgumentException e){
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}