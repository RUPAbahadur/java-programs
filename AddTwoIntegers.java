//java program to add two integers
import java.io.*;
import java.util.*;
public class AddTwoIntegers
{
	public static void main(String[] args) {
	    int number1, number2, total;
	    System.out.println("Enter two numbers for addition ");
	    Scanner sc=new Scanner(System.in);
	    number1=sc.nextInt();
	    number2=sc.nextInt();
	    total=number1+number2;
	    
	    System.out.println("The addition of "+ number1 +" and "+number2+ " is "+total);
	}
}
