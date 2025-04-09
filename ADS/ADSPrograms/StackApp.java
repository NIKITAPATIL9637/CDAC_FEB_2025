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
			return false;
		}else{
			a[++tos] = x;
			return true;
		}
	}
	
	int pop(){
		if(tos < 0){
			return 0;
		}else{
			int x = a[tos--];
			return x;
		}
	}
	
	int peek(){
		if(tos < 0){
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
			choice = scn.nextInt();
			
			switch(choice){
				case 1 : s.push(scn.nextInt());
				break;
				case 2 : int popped = s.pop();
				if(popped != -1){
					System.out.println(popped);
				}
				break;
				case 3: int tos = s.peek();
				if(tos != -1){
					System.out.println(tos);
				}
				break;
				case 4: System.out.println(s.isEmpty());
				break;
				case 5: System.exit(0);
				default: System.out.println("Wrong Choice! Please enter a valid option.");
			}
		}while(scn.nextInt() == 1);
		scn.close();
	}
}