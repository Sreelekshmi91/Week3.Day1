package studentInformation;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student id is : " + " " + id);

	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student id is : " + " " + id);
		System.out.println("Student Name is : " + " " + name);
	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student Email id is : " + " " + email);
		System.out.println("Student Phone number is : " + " " + phoneNumber);
	}

	public static void main(String[] args) {
		Students studentInfo = new Students();
		studentInfo.getStudentInfo(690514);
		studentInfo.getStudentInfo(690514, "Sreelekshmi S");
		studentInfo.getStudentInfo("sreelekshmi25@gmail.com", 4569236912L);

	}
}
