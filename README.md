# Patient Health Data System

The Patient Health Data System is a Java application that allows users to manage and track health data for individual patients. It includes the following classes:

1. Patient: Represents a patient and stores their personal and health information.
2. MyHealthData: Provides methods to set and retrieve health data for a patient.
3. MyHealthDataTest: Contains test cases to validate the functionality of the MyHealthData class.

## Class Descriptions

### Patient Class

The Patient class represents a patient and stores their personal and health information. It provides methods to set and retrieve the patient's first name, last name, gender, birth year, birth month, birth day, height, and weight. The class also includes a method to display all the patient's health data.

### MyHealthData Class

The MyHealthData class is responsible for managing the health data for a patient. It provides methods to set and retrieve the patient's height, weight, and calculate the BMI (Body Mass Index). The class implements the BMI formula to calculate the BMI value based on the patient's height and weight.

### MyHealthDataTest Class

The MyHealthDataTest class contains test cases to validate the functionality of the MyHealthData class. It includes two test methods: getBMI and getBMIError. The getBMI method tests the accuracy of the BMI calculation, while the getBMIError method tests the scenario where there is an error in the BMI formula.
