package Java2Lab3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CollegeList {

	public static void main(String[] args) {
	//Create scanner
	Scanner inputDevice = new Scanner(System.in);
		
	//Arrays for each type of person
	CollegeEmployee[] collegeEmployees = new CollegeEmployee[4];
	Faculty[] facultyMembers = new Faculty[3];
	Student[] students = new Student[7];
	
	//Data entry loop
	boolean loop = true;
	int counterC = 0;
	int counterF = 0;
	int counterS = 0;
	do {
		//Print menu choices
		System.out.println("What would you like to register?");
		System.out.println("C - College Employee");
		System.out.println("F - Faculty");
		System.out.println("S - Student");
		char choice = inputDevice.next().charAt(0);
		
	switch(choice) {	
	//Add college employees
	case 'c':
	case 'C':{
		try {
		collegeEmployees[counterC] = new CollegeEmployee();
		collegeEmployees[counterC].setCollegeEmployee();
		counterC++;
		break;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Maximum number of college employees already entered");
		}
	}
	
	//Add faculty members
	case 'f':
	case 'F':{
		try {
		facultyMembers[counterF] = new Faculty();
		facultyMembers[counterF].setFaculty();
		counterF++;
		break;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Maximum number of faculty members already entered");
		}
	}
	//Add students
	case 's':
	case 'S':{
		try {
		students[counterS] = new Student();
		students[counterS].setStudent();
		counterS++;
		break;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Maximum number of students already entered");
		}
	}
	//Quit
	case 'q':
	case 'Q':{
		loop = false;
	}
	}
	}while(loop==true);
		
	//Display all info
	//College employees
	for (CollegeEmployee x: collegeEmployees) {
		if (x != null) {
			x.showCollegeEmployee();
		}
	}
	
	//Faculty
	for (Faculty x: facultyMembers) {
		if (x != null) {
			x.showFaculty();
		}
	}
	
	//Students
	for (Student x: students) {
		if (x != null ) {
			x.showStudent();
		}
	}
	}
}
