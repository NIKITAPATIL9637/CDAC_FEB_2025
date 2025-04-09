import java.util.*;
public class DLL
{
    static class Node{
        int data;
        Node prev, next;
        
        Node(int data){
            this.data = data;
        }
    }
    
    static Node head = null;
    
    //Insert at begining
    public static void insertAtBegining(int data){
        Node newNode = new Node(data);
        if(head != null){
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }
    
    //Insert at end
    public static void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    
    //Insert at position
    public static void insertAtPostion(int data, int pos){
        if(pos <= 1){
            insertAtBegining(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        
        for(int i=1; temp != null && i < pos - 1; i++){
            temp = temp.next;
        }
        
        if(temp == null || temp.next == null){
            insertAtEnd(data);
            return;
        }
        
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }
    
    //Delete begining
    public static void deleteBegining(){
        if(head == null){
            return;
        }
        head = head.next;
        if(head != null){
            head.prev = null;
        }
    }
    
    //Delete end
    public static void deleteEnd(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
            temp.prev.next = null;
        }
    }
    
    //Delete at postions
    public static void deletePostion(int pos){
        if(head == null){
            return;
        }
        if(pos == 1){
            deleteBegining();
            return;
        }
        Node temp = head;
        for(int i=1; temp != null && i<pos; i++){
            temp = temp.next;
        }
        if(temp == null){
            return;
        }
        
        if(temp.next != null){
            temp.next.prev = temp.prev;
        }
        if(temp.prev != null){
            temp.prev.next = temp.next;
        }
    }
    
    //Display forward
    public static void displayForrward(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    //Display Backward
    public static void displayBackrward(){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp != null){
            temp = temp.next;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
 
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int choice, data, pos;
		
		while(true){
		    choice = scn.nextInt();
		    
		    switch(choice){
		        case 1 : data = scn.nextInt();
		        insertAtBegining(data);
		        break;
		        
		        case 2: data = scn.nextInt();
		        insertAtEnd(data);
		        break;
		        
		        case 3 : data = scn.nextInt();
		        pos = scn.nextInt();
		        insertAtPostion(data, pos);
		        break;
		        
		        case 4: deleteBegining();
		        break;
		        
		        case 5: deleteEnd();
		        break;
		        
		        case 6: pos = scn.nextInt();
		        deletePostion(pos);
		        break;
		        
		        case 7: displayForrward();
		        break;
		        
		        case 8: displayBackrward();
		        break;
		        
		        case 9: scn.close();
		        
		        default: System.out.print("Invalid choice!");
		    }
		}
	}
}