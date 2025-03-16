import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SplitReversed{
	public static void main(String args[]){
        String str = "Nikita";
        List<String> list = Arrays.asList(str.split(""));
        Collections.reverse(list);
		String reversed = String.join("",list);
		
		System.out.println("Reversed of string using split method: " + reversed);
	}
}
