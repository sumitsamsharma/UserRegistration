import java.util.regex.Pattern;

public class UserReg
{
    static boolean happy=false;
    public static boolean first(String f_name)
    {
        boolean result=Pattern.matches("^[A-Z]{1}[a-z]{2,}$",f_name);
        if(result)
        {
            happy=true;
        }
        else
            happy=false;
        return result;
    }

    public static boolean last(String l_name)
    {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}$",l_name);
    }

    public static boolean email(String mail)
    {
        return Pattern.matches("^[_A-Za-z0-9-+&*-]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-+&*-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2})*$",mail);
    }

    public static boolean mobile(String phone) {
        return Pattern.matches("[0-9]{2}\\s{1}[1-9]{1}[0-9]{9}",phone);

    }

    public static boolean password(String pass) {

        return Pattern.matches("^(?=.*\\d)"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[#@%$^=+&])"+"(?=\\S+$).{8,}$",pass);
    }

    public static String isHappy(String message)
    {
        if(message.contains("Sad"))
            return "Sad";
        else
            return "Happy";
    }
}
