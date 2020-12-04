import java.util.Scanner;

import javax.swing.JOptionPane;

public class StudentTest {

	public static void main(String[] args) {

		Scanner takeInput = new Scanner(System.in);
		System.out.println("Please enter your name");
		String userInput = takeInput.next();
		System.out.println("Welcome " + userInput);

		String numberOfStuString = JOptionPane.showInputDialog("Please enter number of students: ");
		int numberOfStu = Integer.parseInt(numberOfStuString);

		Student[] userData = new Student[numberOfStu];

		for (int i = 0; i < userData.length; i++) {
			String stuName = JOptionPane.showInputDialog("Please enter student Name: ");
			String stuEmail = JOptionPane.showInputDialog("Please enter student Email: ");
			String stuPhone = JOptionPane.showInputDialog("Please enter student Phone: ");
			String stuFaculty = JOptionPane.showInputDialog("Please enter student Faculty: ");

			String numberOfSubjectsString = JOptionPane.showInputDialog("Please enter number of subjects: ");
			int numberOfSubjects = Integer.parseInt(numberOfSubjectsString);
			Grade[] userGrades = new Grade[numberOfSubjects];

			for (int x = 0; x < userGrades.length; x++) {
				String subject = JOptionPane.showInputDialog("Please enter your subject: ");
				String markString = JOptionPane.showInputDialog("Please enter your mark: ");
				int mark1 = Integer.parseInt(markString);
				Grade grade = new Grade(subject, mark1);
				userGrades[x] = grade;

			}
			Student student = new Student(stuName, stuEmail, stuPhone, stuFaculty, userGrades);
			userData[i] = student;
		}

		for (int i = 0; i < userData.length; i++) {
			System.out.println("Student Number: " + (i + 1));
			System.out.println("Student Name:" + userData[i].getName());
			System.out.println("Student Email:" + userData[i].getEmail());
			System.out.println("Student Phone:" + userData[i].getPhone());
			System.out.println("Student Faculty:" + userData[i].getFaculty());
			for (int j = 0; j < userData[i].getStudentGrade().length; j++) {

				Grade grade = userData[i].getStudentGrade()[j];
				System.out.println("Name of Subject:" + grade.getName());
				if (grade.getMark() > 75)
					System.out.println("Very Good Mark:" + grade.getMark());
				else
					System.out.println("Mark:" + grade.getMark());
			

			}

		}

	}

}
