package dao;

/**
 * Created by Nicolas on 25/10/2016.
 */
public interface Repository<T> {
    void insertOrUpdate(T obj);
    void delete(T obj);
    T select(Integer idObj);
}
