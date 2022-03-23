package Java2Lab3;

import javax.swing.JOptionPane;

public class Person {
	//Variables
protected String firstName;
protected String lastName;
protected String streetAddress;
protected String zipCode;
protected String phoneNumber;

	//Sets person info
	public void setPerson() {
		firstName = JOptionPane.showInputDialog("First name:");
		lastName = JOptionPane.showInputDialog("Last name:");
		streetAddress = JOptionPane.showInputDialog("Street address:");
		zipCode =  JOptionPane.showInputDialog("Zip code:");
		phoneNumber = JOptionPane.showInputDialog("Phone number:");
	}
	
	//Shows person info
	public void showPerson() {
		System.out.print("\nName: "+firstName+" "+lastName+" - Address: "+streetAddress+", "+zipCode+" - Phone number: "+phoneNumber);
	}
}
