package Calculation;
import java.text.DecimalFormat;               //this will pull out decimal format
import java.util.Scanner;
//import java.util.*;				          // this will put everything

public class BMICalculatorInMetric {
	
	public static void main(String[] args) throws Exception {
		int gender, age, selection;
		double totalBMI, weight, feet, inches, totalHeightinInches;
		final int BMI_CONSTANT_VALUE=703;
		
		Scanner inputval = new Scanner(System.in);
		
		System.out.println("I(Imperial) M(Metric) : I/M");
		selection = inputval.next().charAt(0);
		
		System.out.println("Please enter your gender: M/F");
		gender = inputval.next().charAt(0);
		
		//For adults 20 years old and older, BMI is interpreted using standard weight status categories.
		//These categories are the same for men and women of all body types and ages.
		
		System.out.println("Please enter your age: ");
		age = inputval.nextInt();
		//if (age >= 0 && age < 120) {
			//inputval.age = age;
		//} else throw new IllegalArgumentException("Age can not be negative or more than 120");
		
		//American System
		//BMI = Weight in pounds * 703 / (height in inches * height in inches)
		
		System.out.print("Please Enter your Weight in pounds: ");
		weight = inputval.nextInt();
		
		System.out.println("Please enter your height? ");
		System.out.print("feet: ");
		feet = inputval.nextInt();
		
		System.out.print("Inches: ");
		inches = inputval.nextInt();
		
		totalHeightinInches = (feet*12)+inches;
		
		totalBMI= (weight * BMI_CONSTANT_VALUE) / (Math.pow(totalHeightinInches,2));
		
		DecimalFormat decfmt = new DecimalFormat("0.###");
		
		System.out.println("Your total BMI is: " + decfmt.format(totalBMI));
		printBMICategory(totalBMI);
		//printBMICategory(BMIcategory);
        //calculateBMI();
    }
	private static void printBMICategory(double totalBMI) {
	 if(totalBMI < 15) {
            System.out.println("You are very severely underweight");
	 }
            else if (totalBMI >=15 && totalBMI <= 16) {
            	 System.out.println("You are severely underweight");
            }
            else if (totalBMI >16 && totalBMI <= 18.5) {
            	System.out.println("You are underweight");
            }
		else if(totalBMI < 18.5 && totalBMI <= 25) {
            System.out.println("You are normal (healthy weight)");
        }else if (totalBMI >25 && totalBMI <= 30) {
            System.out.println("You are overweight");
        }else if (totalBMI >30 && totalBMI <= 35) {
            System.out.println("You are obese");
        }
            else if (totalBMI >35 && totalBMI <= 40) {
            	System.out.println("You are severely obese");
        }else {
            System.out.println("You are very severely obese");
        }
    }

    /*private static void calculateBMI() throws Exception {
    	System.out.print("Please Enter your Gender: ");       
    	System.out.print("Please enter your weight in kg: ");
        Scanner s = new Scanner(System.in);
        float weight = s.nextFloat();
        System.out.print("Please enter your height in cm: ");
        float height = s.nextFloat();

        // multiplication by 100*100 for cm to m conversion
        float bmi = (100*100*weight)/(height*height);

        System.out.println("Your BMI is: "+bmi);
        printBMICategory(bmi);

    }*/

    // Prints BMI category
   /* private static String printBMICategory(double totalBMI) {
    	String BMIcategory;
    	if (totalBMI < 15) {
			BMIcategory = "very severely underweight";
		} else if (totalBMI >=15 && totalBMI <= 16) {
			BMIcategory = "severely underweight";
		} else if (totalBMI >16 && totalBMI <= 18.5) {
			BMIcategory = "underweight";
		} else if (totalBMI >18.5 && totalBMI <= 25) {
			BMIcategory = "normal (healthy weight)";
		} else if (totalBMI >25 && totalBMI <= 30) {
			BMIcategory = "overweight";
		} else if (totalBMI >30 && totalBMI <= 35) {
			BMIcategory = "moderately obese";
		} else if (totalBMI >35 && totalBMI <= 40) {
			BMIcategory = "severely obese";
		} else {
			BMIcategory ="very severely obese";
		}
		return BMIcategory;
		
	}
    	*/		
        
    }