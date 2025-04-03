import java.util.*;

class Stack{
	static final int MAX = 7;
	int tos;
	int a[] = new int[MAX];

    boolean isEmpty(){
		return tos < 0;
	}
 
    Stack(){
		tos = -1;
	} 
	
	boolean push(int x){
		if(tos >= (MAX - 1)){
			System.out.print("Stack Overflow!");
			return false;
		}else{
			a[++tos] = x;
			System.out.println(x + "pushed element");
			return true;
		}
	}
	
	int pop(){
		if(tos < 0){
			System.out.print("Stack Underflower");
			return 0;
		}else{
			int x = a[tos--];
			return x;
		}
	}
	
	int peek(){
		if(tos < 0){
			System.out.print("Stack Underflow!");
			return 0;
		}else{
			int x = a[tos];
			return x;
		}
	}
}

public class StackApp{
	public static void main(String args[]){
		Stack s = new Stack();
		Scanner scn = new Scanner(System.in);
		int choice;
		
		do{
			System.out.println("\n****** MENU ******");
			System.out.println("1. PUSH");
			System.out.println("2.POP");
			System.out.println("3.PEEK");
			System.out.println("4.IS Empty?");
			System.out.println("5.EXIT");
			System.out.println("Enter your choice: ");
			
			choice = scn.nextInt();
			
			switch(choice){
				case 1 : System.out.print("Enter the value: ");
				s.push(scn.nextInt());
				break;
				case 2 : int popped = s.pop();
				if(popped != -1){
					System.out.println("Popped element: " + popped);
				}
				break;
				case 3: int tos = s.peek();
				if(tos != -1){
					System.out.println("Top element: " + tos);
				}
				break;
				case 4: System.out.println("Is stack empty?" + s.isEmpty());
				break;
				case 5: System.out.println("Existing..");
				System.exit(0);
				default: System.out.println("Wrong Choice! Please enter a valid option.");
			}
			System.out.print("Do you want to continue? (1 for Yes, 0 for No): ");
		}while(scn.nextInt() == 1);
		scn.close();
	}
}