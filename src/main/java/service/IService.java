package service;

public interface IService <T,ID>
{
        public T create(T t);
        public T read(ID ID);
        public T update(T t);
        public boolean delete(ID ID);
}
