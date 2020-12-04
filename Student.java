public class Student {

	private String name;
	private String email;
	private String phone;
	private String faculty;
	// private int[] myGrades;
	private Grade[] studentGrade;

	public Student() {
		super();
	}

	public Student(String name, String email, String phone, String faculty, Grade[] studentGrade) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.faculty = faculty;
		this.studentGrade = studentGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public Grade[] getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(Grade[] studentGrade) {
		this.studentGrade = studentGrade;
	}

}
