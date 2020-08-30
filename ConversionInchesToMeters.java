//java program to convert inches into meters 
import java.io.*;
import java.util.*;
public class ConversionInchesToMeters
{
	public static void main(String[] args) {
		int inches;
		double meters;
		System.out.println("Enter inches for inche to meter conversion");
		Scanner sc=new Scanner(System.in);
		inches= sc.nextInt();
		meters=inches*0.0254;
		
		System.out.println(inches+" is equal to "+ meters);
	}
}
