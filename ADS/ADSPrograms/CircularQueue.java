import java.util.Scanner;
public class CircularQueue{
    
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
        }
    }   
    
    static Node front = null, rear = null;
    
    //Enqueue operation
    public static void enqueue(int key){
        Node newNode = new Node(key);
        if(front == null){
            front = rear = newNode;
            rear.next = front; //circular link
        }else{
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
    }
    
    //Dequeue operations
    public static void dequeue(){
        if(front == null){
            return;
        }else if(front == rear){
            System.out.println(front.data);
            front = rear = null;
        }else{
            System.out.println(front.data);
            front = front.next;
            rear.next = front;
        }
    }
    
    //display 
    public static void display(){
        if(front == null){
            return;
        }
        Node temp = front;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while(temp != front);
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int choice;
		
		while(true){
		    choice = scn.nextInt();
		    switch(choice){
		        case 1: int val = scn.nextInt();
		        enqueue(val);
		        break;
		        
		        case 2: dequeue();
		        break;
		        
		        case 3: display();
		        break;
		        
		        case 4: System.exit(0);
		        
		        default : System.out.print("Invalid choice");
		    }
		}
	}
}