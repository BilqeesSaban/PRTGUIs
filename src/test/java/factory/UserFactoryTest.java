package factory;

import entity.User;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

class UserFactoryTest
{
 User user1;
 User user2;
 User user3;

    @BeforeEach
    void setUp()
    {
        user1 = UserFactory.createUser(01, "Bilqees", "Saban", "084 398 7458", "23", true);
        user2 = user1;
        user3 = UserFactory.createUser(02, "Billie", "Bear", "058 459 8745", "235 ", false);

    }

    @Test
    void testIdentity()
    {
        assertSame (user1, user2);

    }

    @Test
    void testEquality()
    {
        assertEquals(user1, user2);
        assertNotEquals(user1, user3);
    }

    @Timeout(value = 23, unit = TimeUnit.MILLISECONDS)
    @Test
    void timeouts()
    {
        assertEquals(user1, user2);
    }

    @Disabled
    @Test
    void disablingTest()
    {
        assertNotEquals(user1.getID(),user3.getOrderNum());
        System.out.println("Diabled by Bilqees Saban");
    }


}