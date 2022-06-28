package assignment1;

public class Student {
	private int studentId;
	private String studentName;
	private long mobileNumber;
	private String address;
	private String course;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	public double calculateFee(String course) {
		double fee = 0;
		if (course.equals("java")) {
			fee = 15000;
		} else if (course.equals("ui")) {
			fee = 12000;
		} else if (course.equals("testing")) {
			fee = 10000;
		}
		return fee;
	}

}
