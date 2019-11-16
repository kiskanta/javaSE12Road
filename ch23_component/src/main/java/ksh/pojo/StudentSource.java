package ksh.pojo;

import java.util.ArrayList;
import java.util.List;

import com.github.dozermapper.core.Mapping;

public class StudentSource {
	private String name;
	private String address;

	@Mapping("pupils")
	List<Student> students;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Student> getStudents() {
		if(students == null) {
			students = new ArrayList<Student>();
		}
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "StudentSource [name=" + name + ", address=" + address + ", students=" + students + "]";
	}

}
