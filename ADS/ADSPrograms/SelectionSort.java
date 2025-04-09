import java.util.;
public class SelectionSort{
    
    public static void printArray(int arr[]){
        for(int i=0; iarr.length; i++){
            System.out.print(arr[i] +  );
        }
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int k=0; kn; k++){
		    arr[k] = scn.nextInt();
		}
		
		for(int i=0; iarr.length-1; i++){
		    int smallest = i;
		    for(int j=i+1; jarr.length; j++){
		        if(arr[smallest]  arr[j]){
		            smallest = j;
		        }
		    }
		    int temp = arr[smallest];
		    arr[smallest] = arr[i];
		    arr[i] = temp;
		}
		printArray(arr);
	}
}