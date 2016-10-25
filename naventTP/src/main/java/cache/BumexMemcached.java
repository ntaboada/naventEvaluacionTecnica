package cache;

/**
 * Created by Nicolas on 25/10/2016.
 */
public class BumexMemcached implements Cacheable{

    private static BumexMemcached _selfInstance;


    //Singleton
    public static BumexMemcached getInstance() {
        if(_selfInstance==null){
            _selfInstance = new BumexMemcached();
        }
        return _selfInstance;
    }

    @Override
    public void set(String key, Object value) {

    }
    @Override
    public Object get(String key) {
        return null;
    }

    @Override
    public void delete(String key) {

    }
}
