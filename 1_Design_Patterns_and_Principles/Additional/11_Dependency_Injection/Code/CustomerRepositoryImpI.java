import java.util.HashMap;

public class CustomerRepositoryImpI implements CustomerRepository {
    private static HashMap<Integer, String> customerDatabase = new HashMap<>();
    static {
        customerDatabase.put(1, "John Doe");
        customerDatabase.put(2, "Jane Smith");
    }
    public void findCunstomerById(int id) {
        if(customerDatabase.containsKey(id)) {
            System.out.println("Customer found: " + customerDatabase.get(id));
        } else {
            System.out.println("Customer not found with ID: " + id);
        }
    }
}