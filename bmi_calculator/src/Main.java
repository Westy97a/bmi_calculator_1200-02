import java.util.Scanner;



public class Main {
    //Creating properties
    static int CONVERSION_FACTOR = 703;
    static float[] savedInput;
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

        System.out.println("");
    }

    public static boolean requestHeight(){
        //method to get input and validate
        try {
            //attempt to convert user input into an integer
            System.out.println("Please enter your height in inches (In range of 24 -> 120 )");
            savedInput[0] = Float.parseFloat(userInput.nextLine());
            //check if range is valid
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
            //attempt to convert user input into an intgeger
            System.out.println("Please enter your height in lbs. (Input must be above 24");
            savedInput[1] = Float.parseFloat(userInput.nextLine());
            //returns boolean based on the return condition
            return savedInput[1] > 24;
        }
        catch(Exception exception){
            System.out.println("Invalid input");
            return false;
        }
    }

    public static String calculateBmi(){


        return "test";
    }

    public static String bmiDescriptor(Integer bmi){

    }
}