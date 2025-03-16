/* Provide the string representation of an object
If not overrriden, Exception raised : ClassName#HexadecimalHashCode
*/ 

public class ToStringLearning{
	
	String name;
	int id;
	
	ToStringLearning(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString(){
		return name + " " + id; // you can override whatever you want in toString 
	}
	
	public static void main(String args[]){
		ToStringLearning t1 = new ToStringLearning("Nikita", 01);
		System.out.println(t1); /* You don't need to mentioned the method name you have to 
		                           use only reference variable of your parent object 
								   or in whichever object the toString written*/
	}
}