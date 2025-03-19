class Student{
	private String name;
	private int marks1, marks2, marks3;
	
	public void setValues(String name, int marks1, int marks2, int marks3){
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	
	public int computeTotal(){
		return marks1 + marks2 + marks3;
	}
	
	public double computeAverage(){
		return computeTotal()/3.0;
	}
	
	public void display(){
		System.out.println("Student Name: " + name);
		System.out.println("Total Marks: " + computeTotal());
		System.out.println("Average: " + computeAverage());
	}
}
public class StudentDemo{
	public static void main(String args[]){
		Student student = new Student();
		
		student.setValues("Nikita", 89, 90, 95);
		
		student.display();
	}
}