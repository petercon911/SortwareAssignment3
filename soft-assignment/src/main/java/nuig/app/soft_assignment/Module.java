package nuig.app.soft_assignment;

import java.util.List;

public class Module {
	private String name;
	private int ID;
	private List<Student> students;
	private List<Course> courses;
	
	public Module(String name, int iD, List<Student> students, List<Course> courses) {
		super();
		this.name = name;
		ID = iD;
		this.students = students;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
}
