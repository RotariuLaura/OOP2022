import java.util.ArrayList;

public interface AppService {
    public <T> Object create (T element, T element1, T element2) throws ValidationFailedException;
    public <T> ArrayList <Object> search(String element);
    public  <T> boolean delete(T element);
}
