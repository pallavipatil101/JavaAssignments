package assignments;
//Q.2 Write class Teacher and Student which extends class Person. Add properties Roll no, course, department in student class along with the constructor and getter, setters. Add properties department, specialization in Teacher class along with constructor and getter, setters. The constructor should accept all the properties of the person as well as the current class i.e Student or Teacher and set the properties.

public class Student extends Person {
	int roll_no ;
	String course;
	String dept;
	
	Student() {
		this.roll_no = 10;
		this.course = "CSE";
		this.dept = "Engineering";
	}
	
	Student(int roll_no, String course, String dept){
		this.roll_no = roll_no;
		this.course = course;
		this.dept = dept;
	}
	
	public int getRollNo() {
		return roll_no;
	}
	
	public void setRollNo(int roll_no) {
		this.roll_no = roll_no;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void show() {
		System.out.println("Roll No: "+getRollNo());
		System.out.println("Course: "+getCourse());
		System.out.println("Course: "+getDept());
	}
	public static void main(String[] args) {
		
		Student st1 = new Student(23, "BE", "CSE");
		st1.show();
		
		Student st = new Student();
		st.setRollNo(33);
		st.setCourse("BA");
		st.setDept("Arts");
		st.show();
		
		
		
		}
	

	
		
	}


