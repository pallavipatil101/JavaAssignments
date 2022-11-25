package assignments;
//Q.2 Write class Teacher and Student which extends class Person. Add properties Roll no, course, department in student class along with the constructor and getter, setters. Add properties department, specialization in Teacher class along with constructor and getter, setters. The constructor should accept all the properties of the person as well as the current class i.e Student or Teacher and set the properties.

public class Teacher extends Person {
	String dept;
	String specialization;
	
	Teacher(){
		this.dept = "Arts";
		this.specialization = "Philosophy";
	}
	
	Teacher(String dept, String specialization){
		this.dept = dept;
		this.specialization = specialization;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getSpecializationt() {
		return specialization;
	}
	
	public void setSpecialization(String specialization ) {
		this.specialization = specialization;
	}
	
	public void view() {
		System.out.println("Roll No: "+getDept());
		System.out.println("Course: "+getSpecializationt());
	}
	
	public static void main(String[] args) {
		
		Teacher t1 = new Teacher("Science","Maths");
		t1.view();
		
		//Teacher t2 = new Teacher();
		//t2.setDept("Sciance");
		//t2.setSpecialization("Physics");
		//t2.view();

	}

}
