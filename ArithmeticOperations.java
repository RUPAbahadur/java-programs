//java program to perform arithmetic operation
import java.io.*;
import java.util.*;
import java.math.*;
public class ArithmeticOperations
{
	public static void main(String[] args) {
	    int number1, number2, result;
	    System.out.println("Enter two numbers to perform arithmetic operation ");
	    Scanner sc=new Scanner(System.in);
	    number1=sc.nextInt();
	    number2=sc.nextInt();
	    
	    result=number1+number2;
	    System.out.println("The addition of "+ number1 +" and "+number2+ " is "+result);
	    
	    result=number1-number2;
	    System.out.println("The subraction of "+ number1 +" and "+number2+ " is "+result);
	    
	    result=number1*number2;
	    System.out.println("The multiplication of "+ number1 +" and "+number2+ " is "+result);
	    
	    result=number1/number2;
	    System.out.println("The addition of "+ number1 +" and "+number2+ " is "+result);
	}
	
}