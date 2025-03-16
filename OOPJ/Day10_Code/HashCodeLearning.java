/* HashCode --->
Return an integer hash value of the object.
Used in collection like HashMap, HashSet
*/

public class HashCodeLearning{
	String name;
	int id;
	
	HashCodeLearning(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public int hashCode(){
		return id; //Using id as a unique hash code must be return
	}
	
	public static void main(String args[]){
		HashCodeLearning h1 = new HashCodeLearning("Nikita", 101);
		System.out.println(h1.hashCode());
	}
}