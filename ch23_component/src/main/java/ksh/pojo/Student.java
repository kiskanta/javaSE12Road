package ksh.pojo;

import com.github.dozermapper.core.Mapping;

public class Student {
	private String name;

	@Mapping("batchName")
	private String batch;

	@Mapping("homeAddress")
	private String address;

	public Student(String name, String batch, String address) {
		super();
		this.name = name;
		this.batch = batch;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", batch=" + batch + ", address=" + address + "]";
	}

}
