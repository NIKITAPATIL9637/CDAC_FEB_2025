class Parent{
	public Parent(){
		System.out.println("Parent class Constructor.");
	}
}

class Child extends Parent{
	public Child(){
		super(); // Calling parent class constructor and this keyword is used based on user requirment.
		System.out.println("Child class Constructor");
	}
}

class ConstructorDemo{
	public static void main(String args[]){
		Child c = new Child();
	}
}