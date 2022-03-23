package Java2Lab3;

import javax.swing.JOptionPane;

public class Student extends Person{
//Variables
private String major;
private double gpa;

//Sets person+student info
	public void setStudent() {
		this.setPerson();
		major = JOptionPane.showInputDialog("Major field of study:");
		gpa = Double.parseDouble(JOptionPane.showInputDialog("Grade point average:"));
	}
	
//Shows person+student info
	public void showStudent() {
		this.showPerson();
		System.out.print(" - Major: "+major+" - GPA: "+gpa);
	}
}
