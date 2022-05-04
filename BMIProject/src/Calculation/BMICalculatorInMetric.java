//Java Program to Calculate BMI and recommend diet
//Authors: Uhegbu Chidiebere Emmanuel, Darshan Dodamani, Midhun Kanadan
//Software Engineering Project Submission 2

//Category	BMI Range
//severly underweight < 15

//Underweight	< 18.5
//Normal	18.5 - 25
//Overweight	25 - 30
//Obese	> 30

package Calculation;
import java.util.Scanner;
import java.util.*; 				          // this will put everything

public class BMICalculatorInMetric 
{
	public static void main(String[] args)
	{
		//initializing variables
		double weight=0;   
        double height=0;
        //Creating the object of Scanner Class
		Scanner userinput = new Scanner(System.in);
		//Creating the object of Scanner Class
		Scanner dietplan = new Scanner(System.in);
		//allow customer to choose the system either metric or imperial system
		System.out.println("Choose '1' for Metric System");
		System.out.println("Choose '2' for Imperial System");
		//take input from customers
        int customerchoice=userinput.nextInt();
        //switch function to hold the customer input on system choices
        switch(customerchoice)
        {
        case 1:
        {
        	//metric system
        	System.out.print("Enter your height(meter): "); 
        	height=userinput.nextDouble();
        	System.out.print("\nEnter your weight(Kg): ");
        	weight=userinput.nextDouble();
        	break;
        }
        case 2:
        {
        	//Imperial system
        	System.out.print("Enter your height(feet): ");
        	double feet=userinput.nextDouble();
        	System.out.print("Enter your height(inches): ");
        	double inches=userinput.nextDouble();
        	inches=(12*feet)+inches;							    // 1 feet =12 inches
        	height= inches*0.0254;									//1 inches = 0.0254 m
        	System.out.print("\nEnter your weight(pound): ");
        	double pound=userinput.nextDouble();
        	weight=(pound*0.45359);									// 1 pound = 0.45359 kg
        	break;
        }
        default:
        {
        	//Throw error
        	System.out.println("Please enter either 1 or 2 as your choice..");
        	break;
        }
        }
        if(height !=0.0 && weight != 0.0)
        {
        	//actual formula
        	double BMICategory=weight / (height*height);
        	System.out.println("BMI Value:"+BMICategory);
        	//show the results
        	// National Institutes of Health.
        	if(BMICategory < 15) {
        		System.out.println("You are very severely underweight");
        		System.out.println("You are severly thin and need to gain weight. Please take care of your health properly. Follow proper diet");
        		System.out.println("Choose '1' for Vegetarian diet");
        		System.out.println("Choose '2' for Non-Vegetarian diet");
        		//take diet input from customers
                int customerdietchoice=dietplan.nextInt();
                //switch function to hold the customer input on system choices
                switch(customerdietchoice)
                {
                case 1:
                {
                	//metric system
                	System.out.println("Vegetarian: Daal, Rice" ); 
                	break;
                }
                case 2:
                {
                	//Imperial system
                	System.out.println("Non-Vegetarian: Chicken" ); 
                	break;
                }
                default:
                {
                	//Throw error
                	System.out.println("Please enter either 1 or 2 as your choice..");
                	break;
                }
                }
        	}
        	else if (BMICategory >=15 && BMICategory <= 16) 
        	{
           	 System.out.println("You are severely underweight");
           	 System.out.println("You are severly thin and need to gain weight. Please take care of your health properly. Follow proper diet");
           	System.out.println("Choose '1' for Vegetarian diet");
    		System.out.println("Choose '2' for Non-Vegetarian diet");
    		//take diet input from customers
            int customerdietchoice=dietplan.nextInt();
            //switch function to hold the customer input on system choices
            switch(customerdietchoice)
            {
            case 1:
            {
            	//metric system
            	System.out.println("Vegetarian: Daal, Rice" ); 
            	break;
            }
            case 2:
            {
            	//Imperial system
            	System.out.println("Non-Vegetarian: Chicken" ); 
            	break;
            }
            default:
            {
            	//Throw error
            	System.out.println("Please enter either 1 or 2 as your choice..");
            	break;
            }
            }
        	}
        	else if(BMICategory >16 && BMICategory <= 18.5)
        	{
        		System.out.println("You are 'underweight'");
        		System.out.println("You are moderately thin and need to gain weight. Please take care of your weight to improve your health!!");
        		System.out.println("Choose '1' for Vegetarian diet");
        		System.out.println("Choose '2' for Non-Vegetarian diet");
        		//take diet input from customers
                int customerdietchoice=dietplan.nextInt();
                //switch function to hold the customer input on system choices
                switch(customerdietchoice)
                {
                case 1:
                {
                	//metric system
                	System.out.println("Vegetarian: Daal, Rice" ); 
                	break;
                }
                case 2:
                {
                	//Imperial system
                	System.out.println("Non-Vegetarian: Chicken" ); 
                	break;
                }
                default:
                {
                	//Throw error
                	System.out.println("Please enter either 1 or 2 as your choice..");
                	break;
                }
                }
        	}
        	if(BMICategory>=18.5 && BMICategory<=24.9)
        	{
        		System.out.println("You are 'normal weight'");
        		System.out.println("Your are maintaining good health!. You need to maintain this fitness..");	
        		System.out.println("Choose '1' for Vegetarian diet");
        		System.out.println("Choose '2' for Non-Vegetarian diet");
        		//take diet input from customers
                int customerdietchoice=dietplan.nextInt();
                //switch function to hold the customer input on system choices
                switch(customerdietchoice)
                {
                case 1:
                {
                	//metric system
                	System.out.println("Vegetarian: Daal, Rice" ); 
                	break;
                }
                case 2:
                {
                	//Imperial system
                	System.out.println("Non-Vegetarian: Chicken" ); 
                	break;
                }
                default:
                {
                	//Throw error
                	System.out.println("Please enter either 1 or 2 as your choice..");
                	break;
                }
                }
        	}
        	if(BMICategory>=25.0 && BMICategory<=29.9)
        	{
        	System.out.println("You are 'overweight'");
        	System.out.println("You are overweight. You need to loose weight. Please follow proper diet to be fit and healthy");
        	System.out.println("Choose '1' for Vegetarian diet");
    		System.out.println("Choose '2' for Non-Vegetarian diet");
    		//take diet input from customers
            int customerdietchoice=dietplan.nextInt();
            //switch function to hold the customer input on system choices
            switch(customerdietchoice)
            {
            case 1:
            {
            	//metric system
            	System.out.println("Vegetarian: Daal, Rice" ); 
            	break;
            }
            case 2:
            {
            	//Imperial system
            	System.out.println("Non-Vegetarian: Chicken" ); 
            	break;
            }
            default:
            {
            	//Throw error
            	System.out.println("Please enter either 1 or 2 as your choice..");
            	break;
            }
            }
        	}
        	if(BMICategory>=30.0)
        	{
        	System.out.println("You are 'obese' ");
        	System.out.println("You need to be fit! Please keep your health properly with regular exercise..");
        	System.out.println("Choose '1' for Vegetarian diet");
    		System.out.println("Choose '2' for Non-Vegetarian diet");
    		//take diet input from customers
            int customerdietchoice=dietplan.nextInt();
            //switch function to hold the customer input on system choices
            switch(customerdietchoice)
            {
            case 1:
            {
            	//metric system
            	System.out.println("Vegetarian: Daal, Rice" ); 
            	break;
            }
            case 2:
            {
            	//Imperial system
            	System.out.println("Non-Vegetarian: Chicken" ); 
            	break;
            }
            default:
            {
            	//Throw error
            	System.out.println("Please enter either 1 or 2 as your choice..");
            	break;
            }
            }
        	}
        }
	}
}