import java.util.*;
public class VowelConsonant{
      public static void main(String args[]){
	  
	  String []arr = {"nidhi", "nikita", "namrta", "neha", "nayan"};
	  
	  List<Character> vowels = new ArrayList<>();
	  
	  for(String word : arr){
	      for(char ch : word.toCharArray()){
		     if("aeiou".indexOf(ch) != -1){
		        vowels.add(ch);
		     }
		  }
	  }
	  
	  System.out.println("Unique Vowels: " + vowels);
	  
	  }
}