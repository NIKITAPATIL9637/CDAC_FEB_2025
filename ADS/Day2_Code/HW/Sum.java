class Sum{
	static int sumOf(int n){
		if(n <= 0){
			return 0;
		}else{
			return n + sumOf(n-1);
		}
	}
	
	public static void main(String args[]){
		int n = 10;
		int sum = sumOf(n);
		System.out.println(sum);
	}
}