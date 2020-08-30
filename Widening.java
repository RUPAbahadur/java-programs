//java program to widening or automatic type conversion
import java.io.*;
import java.util.*;
import java.math.*;
public class Widening
{
	public static void main(String[] args) {
	    int number;
	    System.out.println("Enter a number for widening ");
	    Scanner sc=new Scanner(System.in);
	    number=sc.nextInt();
	    System.out.println("Integer value is "+ number);
	    long longNumber=number;
	    System.out.println("Long value is "+ longNumber);
	    float floatNumber=number;
	    System.out.println("float value is "+ floatNumber);


	}
	
}
