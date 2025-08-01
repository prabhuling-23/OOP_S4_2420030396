package controlstatements;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 75;
        char grade;

        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
	}

}
