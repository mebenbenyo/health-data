/*
 * Filename: MyHealthDataTest.java
 * Author: Sewuese Ayu
 * Description: Program to create a system that maintains important health information about a patient
 * Class list: Patient, MyHealthData, MyHealthDataTest
 */

package w23assignment1;

/**
 * The HealthDataTest class is used to test two methods with the Patient class - getBMI() and getBMIError()
 * 
 * @author Sewuese Ayu
 * @version 1.0
 * @see Patient 
 * @since 17.0.4.1
 */

public class MyHealthDataTest {
	
	/**
	 * This main method is the entry point for the program execution. It used to test the behaviour of Patient objects.
	 * @param args: command-line arguments (not used)
	 */

	public static void main(String[] args) {
		
		//invokes getBMI() method within main method
		getBMI();
		// invokes getBMIError() method within main method
		getBMIError();
	}
	
	/**
	 * The expected value for BMI when calculated correctly. 
	 */
	private static final double BMI = 2.24;
 	
	/**
	 * Used to resolve mathematical errors when comparing double(decimal) numbers.
	 */
	private static final double EPSILON = 1E-12;


	
	//This test is expected to PASS
	/**
	 * This method is used to test the getBMI() method in the Patient class.
	 * This test is expected to pass as the formula within getBMI() method in patient class is correct
	 */
	public static void getBMI() {
		Patient patient = new Patient("Sandra", "Alex", "Female", 1999, 6, 12, 170.0, 92.0);
 		System.out.println("Test for getBMI() Method");
		if ((patient.getBMI() - BMI)< EPSILON){
			System.out.println("Test has PASSED");
		} else {
			System.out.println("Test has FAILED");
		}
		System.out.println();
	}
	
	//This test is expected to FAIL
	/**
	 * This method is used to test the getBMIError() method in the Patient class
	 * This test is expected to fail due to errors in the formula within getBMIError() method in patient class
	 */
	public static void getBMIError() {
		Patient patient = new Patient("Sandra", "Alex", "Female", 1999, 6, 12, 170.0, 92.0);
 		System.out.println("Test for getBMIError() Method");
		if ((patient.getBMIError() - BMI) < EPSILON){
			System.out.println("Test has PASSED");
		} else {
			System.out.println("Test has FAILED");
		}
	}

}
