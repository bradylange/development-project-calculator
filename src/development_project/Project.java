package development_project;

import java.util.ArrayList;
import java.util.List;

import job_interface.AbleToWork;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: Project
 * Language: Java
 * Date: 11/29/17
 * Description: This class contains attributes related to a software development project and algorithms to modify the attributes.
 */

// This class contains information on the development project and calculates the amount of work the employees have done
public class Project 
{
	// Instance variables
	private int linesOfCode; 													// Prediction of the lines of code that a project will require
	private int linesOfCodeWritten; 											// Number of lines of code the programmer has written
	private int linesOfCodeTested; 												// Number of lines of code the tester has tested
	private int duration; 														// Number of days the manager has given for completion of the project
	private List <AbleToWork> employees;										// Collection of employee's that are able to work
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Lines of Code, Duration
	public Project(int linesOfCode, int duration)
	{
		// Instantiate properties with parameter values 
		this.linesOfCode = linesOfCode;
		this.duration = duration;
		this.linesOfCodeTested = 0;
		this.linesOfCodeWritten = 0;
		this.employees = new ArrayList <AbleToWork>();
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Add Employee Method -------------------
	// Method that adds an employee to the project 
	public void addEmployee(AbleToWork employee)
	{
		employees.add(employee);												// Add employee to the collection of employees
	}
// ------------------- End Add Employee Method -------------------
	
// ------------------- Do Project Method -------------------	
	// Method that calculates the number of days a project took
	public int doProject()
	{
		// Local variables
		int day = 0;															// Number of days the project took
		
		do 																		// Continue until the project is done 
		{
			for (AbleToWork emp: employees)										// For each employee in the collection 
			{
				if (emp instanceof Programmer) 									// Employee is a programmer
				{
					if (linesOfCodeWritten >= linesOfCode) 						// Programmer cannot write more lines of code than needed so validate this
					{
						linesOfCodeWritten = linesOfCode;						// Set code written to the max lines of code needed
						continue;												// Go to start of the for loop
					}
					else														// Write lines of code 
					{
						linesOfCodeWritten += emp.work();						// Sum the lines of code wrote
					}
				}
				else if (emp instanceof Tester) 								// Employee is a tester 
				{
					if (linesOfCodeWritten <= linesOfCodeTested)				// Not enough code is written to be tested 					
					{
						continue;												// Go to start of the for loop
					}
		
					linesOfCodeTested += emp.work();							// Sum the lines of code tested 
						
					if (linesOfCodeTested > linesOfCodeWritten)					// With using a random function need to make sure the tester doesn't test more code than available 
					{
						linesOfCodeTested = linesOfCodeWritten;					// Set lines of code tested to the lines of code written 
					}
				}
			}
			
			day++;																// End of day, increase day
			
		} while (this.linesOfCodeTested < linesOfCode || this.linesOfCodeWritten < linesOfCode);
		
		return day;																// Return days that it took to complete the project 
	}
// ------------------- End Do Project Method -------------------
	
// Setters:
// ------------------- Set Lines of Code Method -------------------
	// Method that alters the prediction of the lines of code the project will need
	public void setLinesOfCode(int linesOfCode) 
	{
		this.linesOfCode = linesOfCode;											// Alter the lines of code that the project will need 
	}
// ------------------- End Set Lines of Code Method -------------------
	
// ------------------- Set Lines of Code Written Method -------------------
	// Method that alters the lines of code written by the programmer
	public void setLinesOfCodeWritten(int linesOfCodeWritten) 
	{	
		this.linesOfCodeWritten = linesOfCodeWritten;							// Alter the lines of code written by the programmer 
	}
// ------------------- End Set Lines of Code Written Method -------------------
	
// ------------------- Set Lines of Code Tested Method -------------------
	// Method that alters the lines of code tested by the tester 
	public void setLinesOfCodeTested(int linesOfCodeTested) 
	{
		this.linesOfCodeTested = linesOfCodeTested;								// Alter the lines of code tested by the tester 
	}
// ------------------- End Set Lines of Code Tested Method -------------------
	
// ------------------- Set Duration Method -------------------
	// Method that alters the project's duration
	public void setDuration(int duration) 
	{
		this.duration = duration;												// Alter the the duration of the project 
	}
// ------------------- End Set Duration Method -------------------

// ------------------- Set Employees Method -------------------
	// Method that alters the employees involved in the project 
	public void setEmployees(List <AbleToWork> employees) 
	{
		this.employees = employees;												// Alter the employee's involved in the project 
	}
// ------------------- End Set Employees Method -------------------
	
// Getters:
// ------------------- Get Lines of Code Method -------------------
	// Method that returns the predicted lines of code needed for the project 
	public int getLinesOfCode() 
	{
		return linesOfCode;														// Return the lines of code needed for the project 
	}
// ------------------- End Get Lines of Code Method -------------------

// ------------------- Get Lines of Code Written Method -------------------
	// Method that returns the lines of code written by the programmer
	public int getLinesOfCodeWritten()
	{
		return linesOfCodeWritten;												// Return the lines of code written by the programmer 
	}
// ------------------- End Get Lines of Code Written Method -------------------

// ------------------- Get Lines of Code Tested Method -------------------
	// Method that returns the lines of code tested by the tester 
	public int getLinesOfCodeTested() 
	{
		return linesOfCodeTested;												// Return the lines of code tested by the tester
	}
// ------------------- End Get Lines of Code Tested Method -------------------

// ------------------- Get Duration Method -------------------
	// Method that returns duration of the project 
	public int getDuration() 
	{
		return duration;														// Return the duration of the project 
	}
// ------------------- End Get Duration Method -------------------

// ------------------- Get Employees Method -------------------
	// Method that returns the list of employees involved in the project 
	public List <AbleToWork> getEmployees() 
	{
		return employees;														// Return the employee's involved in the project
	}
// ------------------- End Get Employees Method -------------------

// ------------------- To String Method -------------------
	// Method that converts the project's data to a String
	public String toString()
	{																			// Return the project's data 
		return "Lines of code the project requires: " + linesOfCode + "\nLines of code the programmer has wrote: " + linesOfCodeWritten
				+ "\nLines of code tested by the tester: " + linesOfCodeTested + "\nTime given to complete the project: " + duration 
				+ "\nList of the employees for the project: " + employees;
	}
// ------------------- End To String Method -------------------
} // End of class Project 
