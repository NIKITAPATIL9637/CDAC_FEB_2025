class ArrayOperations{
	static int arr[] = new int[5];
	static int n =0;
	
	//display
	static void display(){
		for(int i=0; i<n;i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	//insertion
	static void insert(int value){
		if(n>=arr.length){
			System.out.println("Array is full!");
		}else{
			arr[n] = value;
			n++;
		}
	}
	//find operation
	static boolean find(int key){
		for(int i=0; i<n; i++){
			if(arr[i] == key){
				return true;
			}
		}
		return false;
	}
	
	//Deletion
	static void delete(int key){
		for(int i=0; i<n; i++){
			if(arr[i] == key){
				break;//found-->exit
			}
		}
		
		if(i == n){
			System.out.println("Element not fount");
			return;
		}
		
		//shifting
		for(int k=1; k<n; k++){
			arr[k] = arr[k+1];
		}
		n--;
	}
	
	public static void main(String args[]){
		
		insert(10);
		insert(20);
		insert(60);
		display();
		int key = 60;
		if(find(key)){
			System.out.print("Found");
		}else{
			System.out.print("Not Found");
		}
		delete(key);
		display();
	}
}