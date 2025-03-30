class TowerOfHanoi{
	public static void toh(int n, char source, char intermediate, char destination){
		if(n==1){
			System.out.println("We are taking the disk from " + source + " to " + destination);
		}else{
			toh(n-1, source, destination, intermediate);
			System.out.println("We are taking the disk from " + source + " to " + destination);
			toh(n-1, intermediate, source, destination);
		}
	}
	
	public static void main(String args[]){
		int n=3;
		toh(n, 'A', 'B', 'C');//Towers--> A,B,C and Case--> n
	}
}