import java.util.Arrays;
import java.util.Scanner;

//By: Austin West - 100544931
//Date: 5/24/2024
//Assignment 1: Simple Java Application - COSC-1200-02
//Description: calculates bmi from users input using inches and lbs


public class Main {
    //Creating properties
    static int CONVERSION_FACTOR = 703;
    static float[] savedInput = {0,0};
    static Scanner userInput = new Scanner(System.in);
    static boolean continueFlag = false;

    public static void main(String[] args) {
        //first we request the height of the user.
        while(!continueFlag){
            //call requestHeight method and make the return value our continueFlag
            continueFlag = requestHeight();
        }
        //setting flag to false for the next requested input
        continueFlag = false;
        //next input requesting their weight in pounds (lbs)
        while(!continueFlag){
            continueFlag = requestWeight();
        }

        System.out.println(calculateBmi());
    }
    public static boolean requestHeight(){
        //method to get input and validate
        try {
            //attempt to convert user input into an integer
            System.out.println("Please enter your height in inches (In range of 24 -> 120 )");
            int i = Integer.parseInt(userInput.nextLine());
            //check if range is valid
            savedInput[0] = i;
            if (savedInput[0] > 23 && savedInput[0] < 121){
                return true;
            }
            else{System.out.println("Invalid integer"); return false;}
        }
        //if it fails to convert, display error and return false
        catch(Exception exception){
            System.out.println("Invalid input");
            return false;
        }

    }
    public static boolean requestWeight(){
        //method to get the users weight
        try{
            //attempt to convert user input into an integer
            System.out.println("Please enter your weight in lbs. (Input must be above 24");
            int i = Integer.parseInt(userInput.nextLine());
            savedInput[1] = i;
            //returns boolean based on the return condition
            return savedInput[1] > 24;
        }
        catch(Exception exception){
            System.out.println("Invalid input");
            return false;
        }
    }
    public static String calculateBmi(){
        //calculate bmi
        System.out.println(Arrays.toString(savedInput));
        double bmi = (savedInput[1] / (savedInput[0] * savedInput[0])) * CONVERSION_FACTOR;
        //return a string that offers both the bmi and a description in a string
        return String.format("You have a bmi of %.2f\n", bmi) + bmiDescriptor(bmi);

    }
    public static String bmiDescriptor(double bmi){
        //conditional statements based on bmi given
        if(bmi >= 30){return ("A BMI of 30 or over is considered “obese”.");}
        else if(bmi >= 25){return ("A BMI of 25 up to less than 30 is considered “overweight”.");}
        else if(bmi >= 18.5){return ("A BMI of 18.5 up to less than 25 is considered “healthy”.");}
        else if(bmi >= 16){return("A BMI of 16 up to less than 18.5 is considered “underweight”.");}
        else{return("A BMI of less than 16 is considered “severely underweight”");}

    }
}