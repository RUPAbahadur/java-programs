//java program to find whether the number is prime number or not
import java.io.*;
import java.util.*;

public class CheckPrimeNumber
{
	public static void main(String[] args) {
	    int number, flag=0;
	    System.out.println("Enter a number to find whether the number is prime number or not ");
	    Scanner sc=new Scanner(System.in);
	    number=sc.nextInt();
	    for(int i=2;i<=number/2;i++){
	    	if((number==4)||(number==6)){ 
	    	//here 4and 6 half will return says prime number since it will become 2 and 3 which is prime number
	    		flag=1;
	    		break;
	    	}
	    	if((number%i)!=0){
	    		flag=1;
	    		break;
	    	}
	    }

	    if(flag==0){
	    	System.out.println(number + " is a prime number");
	    }

	    else
	    {
	    	System.out.println(number + " is not a prime number");
	    }
}
	}