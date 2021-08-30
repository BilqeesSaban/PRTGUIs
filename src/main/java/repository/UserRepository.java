package repository;

import entity.User;

import java.util.HashSet;
import java.util.Set;

public class UserRepository implements IUserRepository
{
    private static UserRepository repository = null;
    private Set<User> userDB = null;

    private UserRepository()
    {
        userDB = new HashSet<User>();
    }

    public static UserRepository getRepository()
    {
        if (repository == null)
        {
            repository = new UserRepository();
        }
        return repository;
    }

    @Override
    public User create(User user)
    {
        boolean success = userDB.add(user);
        if (!success)
            return null;
        return user;
    }

    @Override
    public User read(String ID) {
        return null;
    }

    @Override
    public User read(int ID)
    {
        for (User u : userDB)
            if (u.getID()==ID)
            {
                return u;
            }
        return null;
    }

    @Override
    public User update(User user)
    {
        int index = user.getID();
        User oldUser = read(index);
        System.out.println("oldUser: "+oldUser);
        if (oldUser != null)
        {
            userDB.remove(oldUser);
            userDB.add(user);
            return user;
        }
        return null;
    }

    @Override
    public boolean delete(int ID)
    {
        User userToDelete = read(ID);
        if (userToDelete == null)
            return false;
        userDB.remove(userToDelete);
        return true;
    }

    public Set<User> getAll()
    {
        return userDB;
    }
}
