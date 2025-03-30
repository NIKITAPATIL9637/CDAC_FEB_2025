import java.util.ArrayList;
import java.util.List;
public class Subsequences{
	
	public static void subSequence(String str, int index, String current, List<String> result){
		if(index == str.length()){
			result.add(current);
			return;
		}
		//Exclude current character
		subSequence(str, index+1, current, result);
		//Include current character
		subSequence(str, index+1, current + str.charAt(index), result);
		
		
	}
	
	public static void main(String args[]){
		String input = "abc";
		List<String> result = new ArrayList<>();
		subSequence(input, 0, "", result);
		
		System.out.println(result);
	}
}