/*
 * Filename: MyHealthData.java
 * Author: Sewuese Ayu 
 * Description: Program to create a system that maintains important health information about a patient.
 * Class list: Patient, MyHealthData, MyHealthDataTest
 */

package w23assignment1;
import java.util.Scanner;

/**
 * Class to test the Patient class. The MyHealthData class requests information from the user, then generates and displays the data to the console. 
 * @author Sewuese Ayu
 * @version 1.0
 * @see Patient
 * @since 17.0.4.1
 */

public class MyHealthData {
	
	/**
	 * This main method is the entry point for the program execution. It used to test the behaviour of Patient objects.
	 * @param args: command-line arguments not used.
	 */

	public static void main(String[] args) {
		
		// instantiates a new scanner object. 
		Scanner scanner = new Scanner(System.in);
		
		//declare variables for use input
		double numberInput;
		String textInput;
		int numberInput2;
		
		//creates a new patient object. 
		Patient patient = new Patient();
		
		//prompts user to enter First Name
		System.out.println("Enter First Name: ");
		textInput = scanner.nextLine();
		//Calls method in the patient class to set the first name
		patient.setFirstName(textInput);
		
		//prompts user to enter Last Name
		System.out.println("Enter Last Name: ");
		textInput = scanner.nextLine();
		// Calls method in the patient class to set the last name
		patient.setLastName(textInput);
		
		// prompts user to enter gender
		System.out.println("Enter Gender: ");
		textInput = scanner.nextLine();
		// Calls method in the patient class to patient's gender
		patient.setGender(textInput);
		
		//prompts user to enter birth year
		System.out.println("Enter Birth Year: ");
		numberInput2 = scanner.nextInt();
		// Calls method in the patient class to set the year of birth
		patient.setBirthYear(numberInput2);
		
		// prompts user to enter birth month
		System.out.println("Enter Birth Month: ");
		numberInput2 = scanner.nextInt();
		// Calls method in the patient class to set the month of birth
		patient.setBirthMonth(numberInput2);
		
		// prompts user to enter birth day
		System.out.println("Enter Birth Day: ");
		numberInput2 = scanner.nextInt();
		// Calls method in the patient class to set the day of birth
		patient.setBirthDay(numberInput2);
		
		// prompts user to enter height
		System.out.println("Enter Height: ");
		numberInput = scanner.nextDouble();
		// Calls method in the patient class to set the height
		patient.setHeight(numberInput);
		
		// prompts user to enter weight
		System.out.println("Enter Weight: ");
		numberInput = scanner.nextDouble();
		// Calls method in the patient class to set the weight
		patient.setWeight(numberInput);
		
		System.out.println();

		//Displays all patient's health data
		patient.displayMyHealthData();	

	}

}
	