import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StramReversed{
	public static void main(String args[]){
		String str = "Nikita";
		
		String reversed = IntStream.rangeClosed(1, str.length())
		                 .mapToObj(i -> str.charAt(str.length() - i))
						 .map(Object :: toString)
						 .collect(Collectors.joining());
						 
		System.out.println("Reversed string using streams: " + reversed);
	}
}