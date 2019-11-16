package ksh.pojo;

public class AddressBean {
	private String streetInfo1;
	private String streetInfo2;
	private String city;
	private String state;
	private String country;
	private int zip5;

	public String getStreetInfo1() {
		return streetInfo1;
	}

	public void setStreetInfo1(String streetInfo1) {
		this.streetInfo1 = streetInfo1;
	}

	public String getStreetInfo2() {
		return streetInfo2;
	}

	public void setStreetInfo2(String streetInfo2) {
		this.streetInfo2 = streetInfo2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZip5() {
		return zip5;
	}

	public void setZip5(int zip5) {
		this.zip5 = zip5;
	}

	@Override
	public String toString() {
		return "AddressBean [streetInfo1=" + streetInfo1 + ", streetInfo2=" + streetInfo2 + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", zip5=" + zip5 + "]";
	}

}
