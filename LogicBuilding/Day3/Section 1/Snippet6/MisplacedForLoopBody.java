public class MisplacedForLoopBody {
/* Error ---> No Error (only task is different)
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++)
 System.out.println(i);
 System.out.println("Done");
 }*/

//Why does "Done" print only once, outside the loop? --> SOP("Done") is outside the loop

// Corrected Code
public static void main(String[] args) {
 for (int i = 0; i < 5; i++){
 System.out.println(i);
 System.out.println("Done");
 }
 }
} 
