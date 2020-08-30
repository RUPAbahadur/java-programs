//java program to convert double to float
import java.io.*;
import java.util.*;
public class ConversiondoubleTofloat
{
	public static void main(String[] args) {
		double doublenumber;
		float floatnumber;
		System.out.println("Enter double type number for conversion to float");
		Scanner sc=new Scanner(System.in);
		doublenumber= sc.nextDouble();//if this tyoe is not right that it will throw runtime error
		floatnumber=(float)doublenumber;
		System.out.println(doublenumber+" is convert to float data type "+ floatnumber);
	}
}
