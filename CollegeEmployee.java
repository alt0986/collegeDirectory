package Java2Lab3;

import javax.swing.JOptionPane;

public class CollegeEmployee extends Person{
	//variables
protected String socialSecurityNumber;
protected double annualSalary;
protected String department;

//Sets general+college employee info
	public void setCollegeEmployee() {
		this.setPerson();
		socialSecurityNumber = JOptionPane.showInputDialog("Social securtiy number:");
		annualSalary = Double.parseDouble(JOptionPane.showInputDialog("Annual salary:"));
		department = JOptionPane.showInputDialog("Department:");
	}
	
	//Shows general+college employee info
	public void showCollegeEmployee() {
		this.showPerson();
		System.out.print(" - SSN: "+socialSecurityNumber+" - Department: "+department+" - Annual salary: $"+annualSalary);
	}
}
