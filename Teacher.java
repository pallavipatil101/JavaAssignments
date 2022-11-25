package assignments;

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
