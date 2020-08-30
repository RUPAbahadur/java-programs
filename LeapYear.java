//java program to find whether the year is leap year or not
import java.io.*;
import java.util.*;
public class LeapYear
{
	public static void main(String[] args) {
	    int year;
	    Scanner sc=new Scanner(System.in);
	    year=sc.nextInt();
	    if((year%4==0 && year%100!=0) || (year%400==0))
	        System.out.println(year+" is a leap year.");
	    else
	        System.out.println(year+" is not a leap year.");
	}
}
