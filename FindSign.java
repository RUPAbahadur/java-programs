//java program to find sign of the integer
import java.io.*;
import java.util.*;

public class FindSign
{
	public static void main(String[] args) {
	    int number;
	    System.out.println("Enter a number to find the sign of integer ");
	    Scanner sc=new Scanner(System.in);
	    number=sc.nextInt();
	    if(number<0)
	    System.out.println("It is negative number");
	    else if(number>0)
	    System.out.println("It is positive number");
	    else
	    System.out.println("It is a zero number");
	    

	}
	
}
