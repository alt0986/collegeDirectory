package Java2Lab3;

import javax.swing.JOptionPane;

public class Faculty extends CollegeEmployee{
private boolean tenure;

//Sets college employee info+tenure status
	public void setFaculty() {
		this.setCollegeEmployee();
		int tenureYesNo = JOptionPane.showConfirmDialog(null, "Does the faculty member have tenure?", "Please select", JOptionPane.YES_NO_OPTION);
		if (tenureYesNo==0) {
			tenure = true;
		}
		else {
			tenure = false;
		}
	}
	
	//Shows college employee info+tenure status
	public void showFaculty() {
		this.showCollegeEmployee();
		if (tenure==true) {
			System.out.print(" - TENURED");
		}
		else {
			System.out.print(" - NOT TENURED");
		}
	}
}
