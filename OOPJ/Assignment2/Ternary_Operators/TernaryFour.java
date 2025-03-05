import java.util.*;
public class TernaryFour{
    public static void main(String args[]){
	int a = 13;
	int b = 15;
	int c = 10;
	int d = 21;
	
	int min_result = (a < b) ? ((a < c) ? ((a < d) ? a : d) : (c < d) ? c : d) 
                          : ((b < c) ? ((b < d) ? b : d) : (c < d) ? c : d);

    System.out.println("The minimum numbers is: " + min_result);					 
	}
}