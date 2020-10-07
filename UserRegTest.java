import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegTest {

    @Test
    public void testFirstName()
    {
        assertTrue(UserReg.first("Sharma"));
    }

    @Test
    public void testLastName()
    {
        assertTrue(UserReg.last("Sharma"));
    }

    @Test
    public void testEmail()
    {
        assertTrue(UserReg.email("Sharma@gmail.com"));
    }

    @Test
    public void testMobile()
    {
        assertTrue(UserReg.mobile("91 8123614499"));
    }

    @Test
    public void testPassword()
    {
        assertTrue(UserReg.password("Qwerty123!"));
    }

    public void givenString_whenEntered_shouldReturnSad() {
        assertEquals("sad",UserReg.isHappy("Happy and not sad"));
    }

}
