public class StaticBinding{
	static void greet(){
		System.out.println("Hello from staticBinding greet method.");
	}
	
	//Statically bound
	private void secret(){
		System.out.println("Secret message!");
	}
	
	public static void main(String args[]){
		StaticBinding.greet();
		
		// Even though 'secret' is a method, it cannot be overridden so it's statically bound.
		StaticBinding ex = new StaticBinding();
		ex.secret();
	}
}

/*
Definition: Static binding occurs at compile-time. The compiler determines which method to call based on the reference type, 
method signature, and modifiers. In other words, the link between a method call and its definition is established during compilation.

When It Occurs:

Method Overloading: The compiler decides which overloaded method to invoke based on parameter types.

Methods that Are:

Private: These methods are not visible to subclasses, hence have no chance for overriding.

Static: Being class-level methods, they cannot be overridden.

Final: As these methods cannot be overridden, they are bound at compile-time.
*/