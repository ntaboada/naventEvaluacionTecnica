package cache;

/**
 * Created by Nicolas on 25/10/2016.
 */
public interface Cacheable {
    void set(String key, Object value);
    Object get(String key);
    void delete(String key);
}
