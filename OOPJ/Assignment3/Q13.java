import java.util.*;
public class Q13{
    public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
        int numStudents = 3;
        int subjects = 3;
//3*20 = 300
        int totalMarks = 300; 
        int[] aggregates = new int[numStudents];
        
        int countAbove75 = 0;
        int countBelow40 = 0;
	
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths):");
            int physics = scanner.nextInt();
            int chemistry = scanner.nextInt();
            int maths = scanner.nextInt();
            
            int aggregate = physics + chemistry + maths;
            aggregates[i] = aggregate;
            
            double percentage = (aggregate / (double) totalMarks) * 100;
            
            if (percentage >= 75) {
                countAbove75++;
            } else if (percentage <= 40) {
                countBelow40++;
            }
        }
        System.out.println("Number of students securing 75% and above: " + countAbove75);
        System.out.println("Number of students securing 40% and below: " + countBelow40);
	}
}