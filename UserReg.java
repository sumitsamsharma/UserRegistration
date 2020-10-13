package user;

import java.util.regex.Pattern;

public class UserReg
{
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
