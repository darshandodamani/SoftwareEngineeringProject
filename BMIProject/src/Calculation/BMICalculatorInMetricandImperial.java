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
//import java.util.*; 				          // this will put everything

public class BMICalculatorInMetricandImperial 
{
	public static void main(String[] args)
	{
		//initializing variables
		double weight=0;   
        double height=0;
        //Creating the object of Scanner Class
		@SuppressWarnings("resource")
		Scanner userinput = new Scanner(System.in);
		//Creating the object of Scanner Class
		@SuppressWarnings("resource")
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
            	System.out.println("Vegetarian Diet Plan: \\n Breakfast: 50g whole grain cereal with 1 cup almond milk and a handful of walnut, 50g oatmeal porridge, 1 tablespoon flax seed, 1 medium banana. \\n Lunch: 1 cup cooked rice, 1 cup non starchy vegetable. \\n Dinner: 1 cup lentil curry with 2 wheat naan bread 150g scrambled tofu." ); 
            	break;
            }
            case 2:
            {
            	//Imperial system
            	System.out.println("Non-Vegetarian Diet Plan: \\n Breakfast:  2 scrambled eggs, 50g oatmeal porridge. \\n Lunch: 1 cup cooked rice, 1/2 cup lentil chicken curry. \\n Dinner: Chicken tortilla wrap." ); 
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
                	System.out.println("Vegetarian Diet Plan: \\n Breakfast: 50g whole grain cereal with 1 cup almond milk and a handful of walnut, 50g oatmeal porridge, 1 tablespoon flax seed, 1 medium banana. \\n Lunch: 1 cup cooked rice, 1 cup non starchy vegetable. \\n Dinner: 1 cup lentil curry with 2 wheat naan bread 150g scrambled tofu." ); 
                	break;
                }
                case 2:
                {
                	//Imperial system
                	System.out.println("Non-Vegetarian Diet Plan: \\n Breakfast:  2 scrambled eggs, 50g oatmeal porridge. \\n Lunch: 1 cup cooked rice, 1/2 cup lentil chicken curry. \\n Dinner: Chicken tortilla wrap." ); 
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
                	System.out.println("Non-Vegetarian Diet Plan: \\n Breakfast:  2 scrambled eggs, 50g oatmeal porridge. \\n Lunch: 1 cup cooked rice, 1/2 cup lentil chicken curry. \\n Dinner: Chicken tortilla wrap." ); 
                	break;
                }
                case 2:
                {
                	//Imperial system
                	System.out.println("Vegetarian Diet Plan: \\n Breakfast: 50g whole grain cereal with 1 cup almond milk and a handful of walnut, 50g oatmeal porridge, 1 tablespoon flax seed, 1 medium banana. \\n Lunch: 1 cup cooked rice, 1 cup non starchy vegetable. \\n Dinner: 1 cup lentil curry with 2 wheat naan bread 150g scrambled tofu." ); 
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
            	System.out.println("Vegetarian Diet Plan: \\n Breakfast: 500ml green smoothie, 1 cup spinach, 1 small banana, 1 cup almond milk, 1 tablespoon flaxseed, 1/2 an apple, 1/4 an avocado. \\n Lunch: 1 cup cooked rice, 1 cup cooked rice, 1 cup non starchy vegetable. \\n Dinner: 1 cup lentil curry with 1 wheat naan bread 150g scrambled tofu." ); 
            	break;
            }
            case 2:
            {
            	//Imperial system
            	System.out.println("Non-Vegetarian Diet Plan: \\n Breakfast: 2 boiled eggs, 40g oatmeal porridge. \\n Lunch: Chicken and avocado salad, 100gms grilled chicken breast. \\n Dinner: Chicken soup." ); 
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
            	System.out.println("Vegetarian Diet Plan:  \\n Breakfast:  500ml green smoothie, 500ml green smoothie, 1 small banana, 1 cup almond milk. \\n Lunch: 1/2 cup cooked rice, 2 cups salad vegetables. \\n Dinner: 1 wheat naan bread, 1  cup lentil curry with" ); 
            	break;
            }
            case 2:
            {
            	//Imperial system
            	System.out.println("Non-Vegetarian Diet Plan: \\n Breakfast: 2 boiled eggs, 2 boiled eggs. \\n Lunch: Chicken and avocado salad, 100gms grilled chicken breast. \\n Dinner: Chicken Soup." ); 
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
