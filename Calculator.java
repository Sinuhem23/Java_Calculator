package Java_Calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		

//Write a program to create a calculator that can Add, Subtract, Multiply, and Divide 2 numbers entered by the user. Also, add an option to exit out from the program.
	
    //Initializing variables
		char operator_selection;
	    Double user_num1, user_num2, result;
	    
	//Initializing Scanner
        Scanner scan = new Scanner(System.in);
        
    // First number 
        System.out.println("Enter first number: ");
        user_num1 = scan.nextDouble();
        
    // Second number
        System.out.println("Enter second number: ");
          user_num2 = scan.nextDouble();
        
    // Select Operator
       System.out.println("Select between 1-5. 1:Add, 2:Subtract, 3:Multiply, 4:Divide, 5:Exit : ");
        operator_selection = scan.next().charAt(0);
     

  // Write different methods for each module (add, subtract, multiply, and divide).
  //
  // Use switch/case to call the particular method.
  //
  // Take input inside the methods to perform the related operation.
  //
  // Return the answer and display it inside the main method.
  //
  // Display a default message (ex. "Invalid Entry, Try Again") if any number other than 1-5 is entered by the user

  // 1. Add 2. Subtract 3. Multiply 4. Divide 5. Exit
      switch(operator_selection) {
      case '1':
    	  result = user_num1 + user_num2;
    	  System.out.println(user_num1 + " + " + user_num2 + " = " + result);
          break;
      case '2':
    	  result = user_num1 - user_num2;
    	  System.out.println(user_num1 + " - " + user_num2 + " = " + result);
          break;
      case '3':
    	  result = user_num1 * user_num2;
    	  System.out.println(user_num1 + " * " + user_num2 + " = " + result);
          break;
      case '4':
    	  result = user_num1 / user_num2;
    	  System.out.println(user_num1 + " / " + user_num2 + " = " + result);
          break;
      case '5':
    	  System.out.println(" You have now exited ");
          break;
     
      default:
          System.out.println("Invalid Entry, Try Again!");
          break;
      
      }
     
       
       

	}

}
