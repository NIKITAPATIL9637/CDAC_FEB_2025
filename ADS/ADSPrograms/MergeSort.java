import java.util.;
public class MergeSort{
    public static void conqure(int arr[], int si, int mid, int ei){
        int merge[] = new int[ei-si+1];
        int index1 = si;
        int index2 = mid+1;
        int x = 0;
        
        while(index1 = mid && index2 = ei){
            if(arr[index1] = arr[index2]){
                merge[x++] = arr[index1++];
            }else{
                merge[x++] = arr[index2++];
            }
        }
        
        while(index1 = mid){
            merge[x++] = arr[index1++];
        }
        
        while(index2 = ei){
            merge[x++] = arr[index2++];
        }
        
        for(int i=0, j=si; imerge.length; i++, j++){
            arr[j] = merge[i];
        }
    }
    
    public static void divide(int arr[], int si, int ei){
        if(si = ei){
            return;
        }
        int mid = si+(ei-si)2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conqure(arr, si, mid, ei);
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i=0; in; i++){
		    arr[i] = scn.nextInt();
		}
		divide(arr, 0, n-1);
		for(int i=0; in; i++){
		    System.out.print(arr[i] +  );
		}
	}
}