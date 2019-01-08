import java.io.IOException;
import java.util.List;

public interface DAO<T> {
    T get(String code);
    List<T> getAll();
    boolean add(T t) throws IOException;
    boolean update(T t);
    boolean delete(T t) throws IOException;
}