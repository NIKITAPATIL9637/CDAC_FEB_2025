public class CharReversed{
	public static void main(String args[]){
		String str = "Nikita";
		char charArray[] = str.toCharArray();
		
		int start = 0;
		int end = charArray.length - 1;
		
		while(start < end){
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			start++;
			end--;
		}
		System.out.println("Reversed string using the charArray way: " + new String (charArray));
	}
}