package java.serialization;

public class School {

	int schoolId;
	String address;

	School(int id, String address) {
		this.schoolId = id;
		this.address = address;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", address=" + address + "]";
	}

}
