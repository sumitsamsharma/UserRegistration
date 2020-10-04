package user;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserReg 
{
	public static void main(String[] args)
	{
	    Scanner c=new Scanner(System.in);
	    System.out.println("Enter email:");
	    String n=c.nextLine();
	    System.out.println("String is"+n);
		System.out.println(Pattern.matches("^[A-Z]{1}[a-z0-9]{2,}\s[A-Z]{1}[a-z0-9]{2,}$",n));
		c.close();
	}  
}
