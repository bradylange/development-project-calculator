package development_project;

// Import library for random generation for code written 
import java.util.Random;

import job_interface.AbleToWork;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: Programmer
 * Language: Java
 * Date: 11/29/17
 * Description: This class contains attributes related to a programmer.
 */

// This class contains attributes related to a programmer and implements AbleToWork to define the amount of work they have done
public class Programmer implements AbleToWork 
{
	// Instance variables
	private int codeWritten;														// Lines of code the programmer has coded that day
	private String firstName;														// Programmer's first name
	private String lastName;														// Programmer's last name
	private String programmerID;													// Programmer's identification
// ------------------- Default Constructor -------------------
	// Default Constructor
	public Programmer()
	{
		// Instantiate default properties
		codeWritten = 0;
		firstName = "";
		lastName = "";
		programmerID = "";
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Code Wrote, First Name, Last Name, Identification
	public Programmer(int code, String fName, String lName, String ID)
	{
		// Instantiate properties
		this.codeWritten = code;
		this.firstName = fName;
		this.lastName = lName;
		this.programmerID = ID;
	}
// ------------------- End Alternate Constructor -------------------
	
// Setters:
// ------------------- Set Code Written Method -------------------
	// Method that alters the amount of lines of code the programmer has coded for the day
	public void setCodeWritten(int codeWritten) 
	{
		this.codeWritten = codeWritten;												// Alter lines of code written for the day
	}
// ------------------- End Set Code Written Method -------------------

// ------------------- Set First Name Method -------------------
	// Method that alters the first name of programmer
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;													// Alter the programmer's first name
	}
// ------------------- End Set First Name Method -------------------

// ------------------- Set Last Name Method -------------------
	// Method that alters the last name of the programmer
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;													// Alter the programmer's last name
	}
// ------------------- End Set Last Name Method -------------------

// ------------------- Set Programmer Identification Method -------------------
	// Method that alters the identification of the programmer 
	public void setProgrammerID(String programmerID) 
	{
		this.programmerID = programmerID;											// Alter the programmer's identification
	}
// ------------------- End Set Programmer Identification Method -------------------
	
// Getters:
// ------------------- Get Code Written Method -------------------
	// Method that returns the lines of code the programmer has coded that day
	public int getCodeWritten() 
	{
		return codeWritten;															// Return the programmer's lines of code written for the day
	}
// ------------------- End Get Code Written Method -------------------
	
// ------------------- Get First Name Method -------------------
	// Method that returns the first name of the programmer
	public String getFirstName() 
	{
		return firstName;															// Return the programmer's first name
	}
// ------------------- End Get First Name Method -------------------
	
// ------------------- Get Last Name Method -------------------
	// Method that returns the last name of the programmer
	public String getLastName() 
	{
		return lastName;															// Return the programmer's last name
	}
// ------------------- End Get Last Name Method -------------------
	
// ------------------- Get Programmer Identification Method -------------------
	// Method that returns the identification of the programmer
	public String getProgrammerID() 
	{
		return programmerID;														// Return the programmer's identification
	}
// ------------------- End Get Programmer Identification Method -------------------

// ------------------- Work Method -------------------
	// Method that calculates the lines of code the programmer has coded that day
	// Overrides AbleToWork's method
	@Override
	public int work()
	{
		Random randGen = new Random();												// Randomly generate a number for the lines of code written for the day

		int codeWritten = (int)(this.codeWritten * 0.5) + randGen.nextInt(this.codeWritten);	// Calculate the lines of code written for the day
		
		return codeWritten;															// Return the lines of code written for the day
	}
// ------------------- End Work Method -------------------

// ------------------- To String Method -------------------
	// Method that converts the data to a String
	public String toString()
	{																				// Return the programmer's data
		return "Lines of code written per day: " + codeWritten + "\nProgrammers first name: " + firstName + "\nProgrammers last name: "
			   + lastName + "\nProgrammers ID: " + programmerID;		
	}
// ------------------- End To String Method -------------------
} // End of class Programmer 
