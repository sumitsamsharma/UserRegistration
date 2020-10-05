package user;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserReg 
{
	static Scanner scanner = new Scanner(System.in);

	public static void first() 
	{
		System.out.println("Enter First Name");
		String name = scanner.nextLine();
		if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$",name))
			System.out.println("First name is: "+name);
		else
			System.out.println("Not a valid first name");
	}

	public static void last() {
		System.out.println("Enter Last name (first word capitol)");
		String name = scanner.nextLine();
		if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$",name))
			System.out.println("Last name is:"+name);
		else
			System.out.println("Invalid Last Name");
	}

	public static void email() 
	{
		System.out.println("Enter email");
		String email = scanner.nextLine();
		if (Pattern.matches("^[_A-Za-z0-9-+&*-]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-+&*-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2})*$",email))
			System.out.println("it is valid e-mail");
		else
			System.out.println("it is not valid email");		
	}
	
	public static void mobile() {
		System.out.println("Enter mobile no with a country code(give a space between code and no.)");
		String mobile = scanner.nextLine();
		if (Pattern.matches("^[1-9]{2}\s{1}[1-9]{1}[0-9]{9}$",mobile))
			System.out.println("Valid Mobile no."+mobile);
		else
			System.out.println("Invalid Mobile");
	}
	
	public static void password() {
		System.out.println("Enter password");
		String pass = scanner.nextLine();
		if (Pattern.matches("^(?=.*\\d)" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[#@%$^=+&])" + "(?=\\S+$).{8,}$",pass))
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}
	public static void main(String[] args) {	
		first();
		last();
		email();
		mobile();
		password();
	}
}

