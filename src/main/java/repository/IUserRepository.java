package repository;

import entity.User;

public interface IUserRepository extends IRepository<User,String>
{
    public User create(User user);
    public User read(int ID);
    public User update(User user);
    public boolean delete(int ID);
}
