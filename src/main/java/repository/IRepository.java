package repository;

public interface IRepository <T,ID>
{

    public T create(T t);
    public T read(ID ID);
    public T update(T t);
    public boolean delete(int ID);

}
