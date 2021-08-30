package service;

import org.springframework.stereotype.Service;
import entity.User;
import repository.UserRepository;
import java.util.Set;

@Service
public class UserService implements IUserService
{
    private static UserService service = null;
    private static UserRepository repository = null;

    private UserService()
    {
        this.repository = UserRepository.getRepository();
    }

    public static UserService getService()
    {
        if (service == null)
        {
            service = new UserService();
        }
        return service;
    }

    @Override
    public User create(User user)
    {
        return this.repository.create(user);
    }

    @Override
    public User read(String ID)
    {
        return this.repository.read(ID);
    }

    @Override
    public User update(User user) {
        return this.repository.update(user);
    }

    @Override
    public boolean delete(String ID) {
        return false;
    }

    @Override
    public boolean delete(int ID) {
        return this.repository.delete(ID);
    }


    @Override
    public Set<User> getAll() {
        return this.repository.getAll();
    }

    @Override
    public User read(int ID) {
        return null;
    }


}
