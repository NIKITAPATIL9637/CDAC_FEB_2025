class Animal{
	public void sound(){
		System.out.println("Animal Sound!");
	}
}

class Dog extends Animal{
	
	@Override
	public void sound(){
		System.out.println("Dog Barks!");
	}
}

public class DynamicBinding{
	public static void main(String args[]){
		Animal myAnimal = new Dog();
		
		myAnimal.sound(); // output - Dog Barks!
	}
}

/*
Definition: Dynamic binding occurs at runtime. The decision of which method to call is made based on the actual object (runtime type), 
not the declared reference type. This is the key to achieving runtime polymorphism.

When It Occurs:

Method Overriding: When a subclass provides its own implementation of a method defined in a superclass, 
the JVM decides which version to invoke based on the actual object's type.

**Flexible**
*/