package nuig.app.soft_assignment;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Student {
	private String name;
	private int age;
	private Date dob;
	private int ID;
	private String username;
	private List<Course> courses;
	private List<Module> modules;
	
	public Student(String name, int age, Date dob, int iD) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
		ID = iD;
		username = getUsername();
	}
	
	public String getUsername() {
		String username = name + age;
		return username;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
