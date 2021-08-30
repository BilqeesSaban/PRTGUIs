package repository;

import entity.User;
import factory.UserFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class UserRepositoryTest
{
    private static UserRepository repository = UserRepository.getRepository();
    private static User user = UserFactory.createUser
            (01, "Bilqees", "Saban", "084 398 7458", "23", true);

    private static User user2 = UserFactory.createUser
            (02, "Billie", "Bear", "058 459 8745", "235 ", false);

    @Test
    void a_create()
    {
        User created = repository.create(user);
        User created2 = repository.create(user2);
        assertEquals(created.getID(), user.getID());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read()
    {
        User read = repository.read(user.getID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update()
    {
        User updated = new User.Builder().copy(user).setFirstName("Jeff").build();
        assertNotNull(repository.update(updated));
        System.out.println("Update:" + updated);
    }

    @Test
    void d_delete()
    {
        boolean success = repository.delete(user.getID());
        assertTrue (success);
        System.out.println("Delete:" + success);
    }

    @Test
    void e_getAll()
    {
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }
}