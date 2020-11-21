package development_project_application;

import development_project.Programmer;
import development_project.Project;
import development_project.Tester;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: ProjectApplication
 * Language: Java
 * Date: 11/29/17
 * Description: This program tests the functionality of the development project.
 */

// This program tests the functionality of the development project
public class ProjectApplication 
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program
	public static void main(String [] args) 
	{
		// Instantiate a new project
		Project projOne = new Project(10500, 14); //400 lines of code and 12 days to complete
		
		// Instantiate programmer's
		Programmer progOne = new Programmer(600, "Brady", "Lange", "W311111");
		Programmer progTwo = new Programmer(140, "Adrian", "Peterson", "W3121214");
		Programmer progThree = new Programmer(34, "Kobe", "Bryant", "W4344344");
		
		// Instantiate tester's
		Tester testOne = new Tester(550, "John", "Doe", "W3543345");
		Tester testTwo = new Tester(400, "Cass", "Smith", "W6565757");
		
		// Add programmers and testers to the project
		projOne.addEmployee(progOne);
		projOne.addEmployee(progTwo);
		projOne.addEmployee(progThree);
		projOne.addEmployee(testOne);
		projOne.addEmployee(testTwo);
		
		System.out.println("***************************************** Software Development Project: *******************************************");
		
		// Calculate the days it took the employees to complete the project
		int duration = projOne.doProject();
		if (projOne.getDuration() >= duration)														// Successfully completed the project on time
		{
			System.out.println("The employees completed their tasks within the time limit of " 
					+ projOne.getDuration() + " days and completed it in " + duration + " day(s).");
		}
		else																						// Unsuccessfully completed the project on time 
		{
			System.out.println("The employees fail to complete their tasks within the time limit of " 
					+ projOne.getDuration() + " days and finished it in " + duration + " day(s).");
		}
		System.out.println("*********************************************************************************************\n");
	} 
// ------------------- End Main Method -------------------
} // End of class ProjectApplication
