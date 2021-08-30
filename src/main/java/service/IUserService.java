package service;

import entity.User;

import java.util.Set;

public interface IUserService extends IService <User, String>
{
    Set<User> getAll();
    User read(int ID);
    boolean delete(int ID);
}
