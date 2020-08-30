//java program convert mintues to number of years and days
import java.io.*;
import java.util.*;
import java.math.*;
public class MinutesConversion
{
	public static void main(String[] args) {
	    int minutes;
	    System.out.println("Enter minutes for conversion ");
	    Scanner sc=new Scanner(System.in);
	    minutes=sc.nextInt();
	    int year= minutes/(60*24*365);//if () not specified the calculation will be wrong
	    int days=minutes/(60*24)%365;//%365 if used to eliminate the perfect years and return only remaining days
	    System.out.println(minutes + " minutes is equal to " + year+ " and " +days+ " days.");

}
	}
	
