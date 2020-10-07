import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UserRegTest {
    private UserReg obj1;
    private String mail;
    private boolean exp_value;

    @Before
    public void initialize() {
        obj1=new UserReg();
    }

    public UserRegTest(String mail, boolean exp_value) {
        this.mail=mail;
        this.exp_value=exp_value;
    }
    @Parameterized.Parameters
    public static Collection testEmails(){
        return Arrays.asList(new Object[][] { {"abc@gmail.com",true},{"abc-100@gmail.com",true},
                {"abc21@abc.com",true},{"abc.185@gmail.com.au",true},{"abc@1.com",true},
                {"abc256@gmail.a",false},{"abc123@.com",false},{"abc123@.com.com",false},
                {"abc..@abc.com",false},{"abc*@abc.com",false},{".abc@*$.com",false},{"abc.!1999@ebc.com",false},
                {"abc.@abc.com",false},{"abc@abc@abc.com",false},{".abc@abc.com",false},{"abc@abc.com.1a",false},
                {"abc@qwe.com.ag.aq",false}});
    }

    @Test
    public void givenEmail_whenEntered_shouldReturnValidation() {
        System.out.println("Parameterised Emails are "+mail);
        assertEquals(exp_value,UserReg.email(mail));
    }


}
