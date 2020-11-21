package development_project;

// Import library for random generation of code tested 
import java.util.Random;

import job_interface.AbleToWork;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: Tester
 * Language: Java
 * Date: 11/29/17
 * Description: This class contains attributes related to a tester and algorithms to modify the attributes.
 */

// This class contains tester related attributes and implements AbleToWork to define the amount of work they have done
public class Tester implements AbleToWork 
{
	// Instance variables
	private int codeTested;													// Lines of code tested for the day
	private String firstName;												// Tester's first name
	private String lastName;												// Tester's last name
	private String testerID;												// Tester's identification
// ------------------- Default Constructor -------------------
	// Default Constructor
	public Tester()
	{
		// Instantiate default properties
		codeTested = 0;
		firstName = "";
		lastName = "";
		testerID = "";
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Code, First Name, Last Name, Identification
	public Tester(int code, String fName, String lName, String ID)
	{
		// Instantiate properties with parameter values 
		this.codeTested = code;
		this.firstName = fName;
		this.lastName = lName;
		this.testerID = ID;
	}
// ------------------- End Alternate Constructor -------------------
	
// Setters:
// ------------------- Set Code Tested Method -------------------
	// Method that alters the lines of code tested that day
	public void setCodeTested(int codeTested) 
	{
		this.codeTested = codeTested;										// Alter the lines of code tested for the day
	}
// ------------------- End Set Code Tested Method -------------------

// ------------------- Set First Name Method -------------------
	// Method that alters the first name of the tester
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;											// Alter the tester's first name
	}
// ------------------- End Set First Name Method -------------------

// ------------------- Set Last Name Method -------------------
	// Method that alters the last name of the tester
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;											// Alter the tester's last name
	}
// ------------------- End Set Last Name Method -------------------

// ------------------- Set Tester Identification Method -------------------
	// Method that alters the identification of the tester 
	public void setTesterID(String testerID) 
	{
		this.testerID = testerID;											// Alter the tester's identification
	}
// ------------------- End Tester Identification Method -------------------
	
// Getters:
// ------------------- Get Code Tested Method -------------------
	// Method that returns the lines of code tested that day
	public int getCodeTested() 
	{
		return codeTested;													// Return the lines of code tested for the day
	}
// ------------------- End Get Code Tested Method -------------------
	
// ------------------- Get First Name Method -------------------
	// Method that returns the tester's first name
	public String getFirstName() 
	{
		return firstName;													// Return the tester's first name
	}
// ------------------- End Get First Name Method -------------------
	
// ------------------- Get Last Name Method -------------------
	// Method that returns the tester's last name
	public String getLastName() 
	{
		return lastName;													// Return the tester's last name
	}
// ------------------- End Get Last Name Method -------------------

// ------------------- Get Tester Identification Method -------------------
	// Method that returns the tester's identification
	public String getTesterID() 
	{
		return testerID;													// Return the tester's identification
	}
// ------------------- End Get Tester Identification Method -------------------

// ------------------- Work Method -------------------
	// Method that calculates the amount of testing the tester did for the day
	// Overrides AbleToWork's method
	@Override
	public int work()
	{
		Random randGen = new Random();										// Randomly generate a number for the lines of code tested for the day
		
		int codeTested = (int) (this.codeTested * 0.75) + (int) (randGen.nextInt(this.codeTested) * 0.5);	// Calculate the lines of code tested for the day
		
		return codeTested;													// Return the lines of code tested for the day
	}
// ------------------- End Work Method -------------------
	
// ------------------- To String Method -------------------
	// Method that converts the tester's data to a String
	public String toString()
	{																		// Return the tester's data
		return "Lines of code tested per day: " + codeTested + "\nTesters first name: " + firstName + "\nTesters last name: "
			   + lastName + "\nTesters ID: " + testerID;		
	}
// ------------------- End To String Method -------------------
} // End of class Tester
