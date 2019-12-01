package nuig.app.soft_assignment;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Course {
	private String name;
	private List<Module> modules;
	private List<Student> students;
	private Date sDate, fDate;
	
	public Course(String name, List<Module> modules, List<Student> students, Date sDate,Date fDate) {
		super();
		this.name = name;
		this.modules = modules;
		this.students = students;
		this.sDate = sDate;
		this.fDate = fDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Date getsDate() {
		return sDate;
	}

	public void setsDate(Date sDate) {
		this.sDate = sDate;
	}

	public Date getfDate() {
		return fDate;
	}

	public void setfDate(Date fDate) {
		this.fDate = fDate;
	} 
	
	
}
