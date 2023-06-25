/*
 * Filename: Patient.java
 * Author: Sewuese Ayu 
 * Description: Program to create a system that maintains important health information about a patient.
 * Class list: Patient, MyHealthData, MyHealthDataTest
 */

package w23assignment1;

import java.time.LocalDate;
 
/**
 * The Patient class stores all patient information needed to create a patient health data system.
 * Note: This class assumes values passed to the set methods are correct.
 * 
 * @author Sewuese Ayu
 * @version 1.0
 * @see java.lang.Object
 * @since 17.0.4.1
 */

public class Patient {

	/**
	 * stores the first name of the patient
	 */
	private String firstName;

	/**
	 * stores the last name of the patient
	 */
	private String lastName;

	/**
	 * stores the gender of the patient
	 */
	private String gender;

	/**
	 * stores the birth year of the patient
	 */
	private int birthYear;

	/**
	 * stores the birth month of the patient
	 */
	private int birthMonth;

	/**
	 * stores the birth day of the patient
	 */
	private int birthDay;

	/**
	 * stores the height of the patient
	 */
	private double height;

	/**
	 * stores the weight of the patient
	 */
	private double weight;
 
	/**
	 * The default constructor - constructs a patient with no health data in it.
	 */
	public Patient() {

	}
 
	
	/**
	 * This constructor sets the first name, last name, gender, birth year, birth
	 * month, height and weight as passed
	 * 
	 * @param firstName the first name of the patient
	 * @param lastName the last name of the patient
	 * @param gender the gender of the patient
	 * @param birthYear the birth year of the patient
	 * @param birthMonth the birth month of the patient
	 * @param birthDay the birth day of the patient
	 * @param height the height of the patient
	 * @param weight the weight of the patient
	 */
	public Patient(String firstName, String lastName, String gender, int birthYear, int birthMonth, int birthDay,
			double height, double weight) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.height = height;
		this.weight = weight;
	}

	/**
	 * Returns the first name of the patient.
	 * 
	 * @return firstName the first name of the patient
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of the patient.
	 * 
	 * @param firstName the patient's first name
	 */

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the last name of the patient.
	 * 
	 * @return lastName the last of the patient
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name of the patient.
	 * 
	 * @param lastName the patient's last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the gender of the patient
	 * 
	 * @return gender the gender of the patient
	 */

	public String getGender() {
		return gender;
	}

	/**
	 * Sets the gender of the patient.
	 * 
	 * @param gender the patient's gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Returns the birth year of the patient
	 * 
	 * @return birthYear the birth year of the patient
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * Sets the birth year of the patient.
	 * 
	 * @param birthYear the patient's year of birth
	 */

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * Returns the birth month of the patient
	 * 
	 * @return birthMonth the birth month of the patient
	 */
	public int getBirthMonth() {
		return birthMonth;
	}

	/**
	 * Sets the birth month of the patient.
	 * 
	 * @param birthMonth the patient's month of birth
	 */
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	/**
	 * Returns the birth day of the patient
	 * 
	 * @return birthDay the birth day of the patient
	 */
	public int getBirthDay() {
		return birthDay;
	}

	/**
	 * Sets the birth day of the patient.
	 * 
	 * @param birthDay the patient's day of birth
	 */
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	/**
	 * Returns the height of the patient (in cm)
	 * 
	 * @return height the height of the patient
	 */

	public double getHeight() {
		return height;
	}

	/**
	 * Sets the height of the patient (in cm)
	 * 
	 * @param height the patient's height
	 */

	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Returns the weight of the patient (in kg)
	 * 
	 * @return weight the weight of the patient
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Sets the weight of the patient (in kg)
	 * 
	 * @param weight the patient's weight
	 */

	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Computes and returns the age of the patient. Patient's age is calculated using 
	 * the birthYear, birthMonth and birthDay. Conditions are set to compare the birth 
	 * day, month and year to the current day, month and year
	 * 
	 * @return age the age of the patient
	 */

	public int getAge() {
		int age = LocalDate.now().getYear() - getBirthYear();
		if (LocalDate.now().getMonthValue() < getBirthMonth()) {
			age--;
		} else if (LocalDate.now().getDayOfMonth() < getBirthDay()) {
			age--;
		}
		return age;
	}

	/**
	 * Computes and returns the maximum heart rate of the patient.
	 * Maximum heart rate is calculated by subtracting age from 220
	 * 
	 * @return maxHeartRate the maximum heart rate of the patient;
	 */

	public double getMaximumHeartRate() {
		double maxHeartRate = 220 - getAge();
		return maxHeartRate;
	}

	/**
	 * Computes and returns the minimum target heart rate of the patient. 
	 * Minimum target heart rate is calculated by multiplying maximum heart rate by 0.5
	 * 
	 * @return minHeartRate the minimum heart rate of the patient. 
	 */

	public double getMinimumTargetHeartRate() {
		double minHeartRate = 0.5 * getMaximumHeartRate() ;
		return minHeartRate;
	}

	/**
	 * Computes and returns the maximum target heart rate of the patient.
	 *  Maximum target heart rate is calculated by multiplying maximum heart rate by 0.85
	 * 
	 * @return (0.5 * getMaximumHeartRate());
	 */

	public double getMaximumTargetHeartRate() {
		double maxTargetHeartRate = 0.85 * getMaximumHeartRate();
		return maxTargetHeartRate;
	}
	
	/**
	 * Computes and returns the patient's body max index (BMI).
	 * BMI is calculated using the weight and height of the patient. 
	 * @return BMI the patient's BMI
	 */
	public double getBMI() {
		double BMI = (getWeight() * 703) / (getHeight() * getHeight());
		return BMI;
	}

	/**
	 *Computes and returns the patient's BMI with an error in the calculations.
	 * @return BMIError the patient's BMI with an error 
	 */

	public double getBMIError() {
		double BMIError = (getWeight() * 703) * (getHeight() * getHeight());
		return BMIError;
	}

	/**
	 * This method displays all patient health data
	 */
	public void displayMyHealthData() {

		System.out.printf("First Name: %s%n", getFirstName());
		System.out.printf("Last Name: %s%n", getLastName());
		System.out.printf("Gender: %s%n", getGender());
		System.out.printf("Date of Birth(YYYY-MM-DD): %d-%d-%d %n", getBirthYear(), getBirthMonth(), getBirthDay());
		System.out.printf("Age(in Years): %d%n", getAge());
		System.out.printf("Height(cm): %.2f%n", getHeight());
		System.out.printf("Weight(kg): %.2f%n", getWeight());
		System.out.printf("Maximum Heart Rate: %.2f%n", getMaximumHeartRate());
		System.out.printf("Minimum Target Heart Rate: %.2f%n", getMinimumTargetHeartRate());
		System.out.printf("Maximum Target Heart Rate: %.2f%n", getMaximumTargetHeartRate());
		System.out.printf("BMI: %.2f%n", getBMI());
		System.out.println();
		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
	}

} // end class Patient
