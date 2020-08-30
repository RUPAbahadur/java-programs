//java program to menu driven caluculator
import java.io.*;
import java.util.*;

public class SwitchCaseCalculator
{
	public static void main(String[] args) {
	    int number1, number2, option, result;
	    System.out.println("Calculator Menu \n=========================================================\n");
	    System.out.println("1. Addition\n2. Substraction\n3.Multiplication\n4.Quiotent \n5.Remainder\n");
	    System.out.println("Enter two numbers for the any of these operation with option\n");
	    Scanner sc=new Scanner(System.in);
	    number1=sc.nextInt();
	    number2=sc.nextInt();
	    option=sc.nextInt();
	    switch(option)
	    {
	    	case 1: result=number1+number2;
	    			System.out.println("The addition of those numbers is "+ result);
	    			break;

	    	case 2: result=number1-number2;
	    			System.out.println("The Substraction of those numbers is "+ result);
	    			break;

	    	case 3: result=number1*number2;
	    			System.out.println("The multiplication of those numbers is "+ result);
	    			break;

	    	case 4: result=number1/number2;
	    			System.out.println("The  of quotient of those numbers is "+ result);
	    			break;

	    	case 5: result=number1%number2;
	    			System.out.println("The remainder of those numbers is "+ result);
	    			break;

	    	default:System.out.println("Please enter a valid otion");
	    			break;
	    }
	}
}