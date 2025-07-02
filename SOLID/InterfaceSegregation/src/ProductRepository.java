import java.util.List;

public class ProductRepository implements Repository, Searchable {
    @Override
    public void Create(Object T) {

    }

    @Override
    public List<Object> GetAll() {
        return List.of();
    }

    @Override
    public List<Object> SearchByName(String name) {
        return List.of();
    }
}
