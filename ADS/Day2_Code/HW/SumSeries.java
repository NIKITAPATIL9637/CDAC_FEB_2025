public class SumSeries{
	
	public static int sumSeries(int num){
		if(num == 0){
			return 0;
		}
		return (num % 10) + sumSeries(num/10);
	}
	
	public static void main(String args[]){
		int num = 987;
		int result = sumSeries(num);
		System.out.print(result);
	}
}