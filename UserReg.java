package user;

import java.util.regex.Pattern;

public class UserReg
{
<<<<<<< HEAD
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
=======
    static boolean happy=false;
    public static boolean first (String f_name) throws CustomExceptions {
        if(Pattern.matches("[A-Z]{1}[a-z]{2,}", f_name))
        {
            return true;
        }
        else
            {
            throw new CustomExceptions("First name unexpected");
        }
    }

    public static boolean last(String l_name) throws CustomExceptions
    {
        if(Pattern.matches("^[A-Z]{1}[a-z]{2,}$",l_name))
            return true;
        else
            throw new CustomExceptions("Last name unexpected");

    }

    public static boolean email(String mail) throws CustomExceptions
    {
        if(Pattern.matches("^[_A-Za-z0-9-+&*-]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-+&*-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2})*$",mail))
            return true;
        else
            throw new CustomExceptions("Email unexpected");
    }

    public static boolean mobile(String phone) throws CustomExceptions{
        if(Pattern.matches("[0-9]{2}\\s{1}[1-9]{1}[0-9]{9}",phone))
            return true;
        else
            throw new CustomExceptions("Mobile number unexpected");
>>>>>>> UC12_custom_exceptions

    }

    public static boolean password(String pass) throws CustomExceptions {

        if(Pattern.matches("^(?=.*\\d)"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[#@%$^=+&])"+"(?=\\S+$).{8,}$",pass))
            return true;
        else
            throw new CustomExceptions("Password unexpected");
    }

    public static String isHappy(String message)
    {
        if(message.contains("Sad"))
            return "Sad";
        else
            return "Happy";
    }
}
