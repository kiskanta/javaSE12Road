package ksh.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentDestination {
	private String name;
	private String address;
	List<StudentVO> pupils;

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

	public List<StudentVO> getPupils() {
		if(pupils == null) {
			pupils = new ArrayList<StudentVO>();
		}
		return pupils;
	}

	public void setPupils(List<StudentVO> pupils) {
		this.pupils = pupils;
	}

	@Override
	public String toString() {
		return "DestinationObject [name=" + name + ", address=" + address + ", pupils=" + pupils + "]";
	}
}
