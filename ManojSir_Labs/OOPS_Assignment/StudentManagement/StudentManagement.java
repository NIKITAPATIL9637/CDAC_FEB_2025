import java.util.*;
class Student{
	private int id;
	private String name;
	private int age;
	private String course;
	private double baseFee;
	
	public Student(int id, String name, int age, String course, double baseFee){
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
		this.baseFee = baseFee;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(double baseFee) {
        this.baseFee = baseFee;
    }
	
	public void displayDetails(){
		System.out.println("Id: " + id + "Name: " + name + "Age: " + age + "Course: " + course + "Base Fee: " + baseFee);
	}
	
	public double calculateTotalFee(){
		return baseFee;
	}
}

class DayScholar extends Student{
	private double transportFee;
	
	public DayScholar(int id, String name, int age, String course, double baseFee, double transportFee){
		super(id, name, age, course, baseFee);
		this.transportFee = transportFee;
	}
	
	public double getTransportFee(){
		return transportFee;
	}
	
	public void setTransportFee(double transportFee){
		this.transportFee = transportFee;
	}
	
	@Override
	public double calculateTotalFee(){
		return getBaseFee() + transportFee;
	}
}

class Hosteller extends Student{
	private double hostelFee;
	
	public Hosteller(int id, String name, int age, String course, double baseFee, double hostelFee){
		super(id, name, age, course, baseFee);
		this.hostelFee = hostelFee;
	}
	
	public double getHostellerFee(){
		return hostelFee;
	}
	
	public void setHostellerFee(double hostelFee){
		this.hostelFee = hostelFee;
	}
	
	@Override
	public double calculateTotalFee(){
		return getBaseFee() + hostelFee;
	}
}

interface CourseStructure{
	void showCourseSubjects();
}

class DayScholarWithCourse extends DayScholar implements CourseStructure{
	public DayScholarWithCourse(int id, String name, int age, String course, double baseFee, double transportFee){
		super(id, name, age, course, baseFee, transportFee);
	}
	
	@Override
	public void showCourseSubjects(){
		if(getCourse().equalsIgnoreCase("Science")){
			System.out.println("Subjects: Physics, chemistry, Biology");
		}else{
			System.out.println("Subjects: General Subjects");
		}
	}
}

class HostellerWithCourse extends Hosteller implements CourseStructure{
	public HostellerWithCourse(int id, String name, int age, String course, double baseFee, double hostelFee){
		super(id, name, age, course, baseFee, hostelFee);
	}
	
	@Override
	public void showCourseSubjects(){
		if(getCourse().equalsIgnoreCase("Engineering")){
			System.out.println("Subjects: Mathematics, Programming, Physics");
		}else{
			System.out.println("Subjects: General Subjects");
		}
	}
}

public class StudentManagement{
	public static void main(String args[]){
		Student student1 = new DayScholarWithCourse(1, "Nikita", 23, "Science", 25000, 5000);
		Student student2 = new DayScholarWithCourse(2, "Pooja", 23, "Engineering", 26000, 7000);
		Student student3 = new HostellerWithCourse(3, "Nik", 23, "Arts", 29000, 8000);
		
		System.out.println("Total Fees: " + student1.calculateTotalFee());
		((CourseStructure)student1).showCourseSubjects();
		
		System.out.println("Total Fees: " + student2.calculateTotalFee());
		((CourseStructure)student2).showCourseSubjects();
		
		System.out.println("Total Fees: " + student3.calculateTotalFee());
		((CourseStructure)student3).showCourseSubjects();
	}
}