import java.util.*;

class Student{
	private String name;
	private int rollNo;
	private double marks[];
	private double average;
	private char grade;
	
	public Student(String name, int rolloNo, double marks[]){
		//Validation of marks
		for(double mark : marks){
			if(mark < 0 || mark > 100){
				throw new IllegalArgumentException("Marks must be between 0 and 100!");
			}
		}
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	public void calculateAverage(){
		double total = 0;
		for(double mark : marks){
			total = total + mark;
		}
		this.average = total / marks.length;
	}
	
	public void calculateGrade(){
		if(average >= 90){
			grade = 'A';
		}else if(average >= 80){
			grade = 'B';
		}else if(average >= 70){
			grade = 'C';
		}else if(average >= 60){
			grade = 'D';
		}else{
			grade = 'F';
		}
	}
	
	public void displayStudentInfo(){
		System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: ");
		
		for(double mark : marks){
			System.out.println(mark + " ");
		}
		
		System.out.println();
		
		System.out.println("Average Marks" + average);
		System.out.println("Grade: " + grade);
	}
}

public class StudentDemo{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		try{
			System.out.print("Enter student name: ");
			String name = scn.nextLine();
			
			System.out.print("Enter roll number: ");
			int rollNo = scn.nextInt();
			
			System.out.println("Enter marks for 5 subjects: ");
			double marks[] = new double[5];
			
			for(int i=0; i<5; i++){
				System.out.println("Mark" + (i+1) + ": ");
				marks[i] = scn.nextDouble();
			}
			
			Student student = new Student(name, rollNo, marks);
			
			student.calculateGrade();
			student.calculateAverage();
			student.displayStudentInfo();
			
		}catch(InputMismatchException e){
			System.out.println("Invalid input! Please enter numeric values for marks and roll number.");
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
}