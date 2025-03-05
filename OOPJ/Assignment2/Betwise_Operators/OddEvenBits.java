public class OddEvenBits{
     public static void main(String args[]){
	 int num = 25;
	 
	 System.out.println("Original number is: " + num);
	 System.out.println("Swapped bits of that number: " + swapBits(num));
	 }
	 
	 public static int swapBits(int x){
	 int evenBits = (x & 0xAAAAAAAA ) >> 1;
	 int oddBits = (x & 0x55555555) << 1;
	 
	 return (evenBits | oddBits);
	 }
}