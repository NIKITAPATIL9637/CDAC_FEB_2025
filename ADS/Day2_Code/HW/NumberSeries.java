public class NumberSeries{
	static void numRecursive(int num){
		if(num <= 10){
			System.out.print(num + " ");
			numRecursive(num + 1);
		}
	}
	public static void main(String args[]){
		int num = 1;
		numRecursive(num);
	}
}
