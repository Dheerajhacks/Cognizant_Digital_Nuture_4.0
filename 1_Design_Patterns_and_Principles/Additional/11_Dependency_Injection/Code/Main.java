public class Main {
    public static void main(String[] args) {
        System.out.println("\nDependency Injection Principle Example\n");
        CustomerRepository customerRepository = new CustomerRepositoryImpI();
        CustomerService customerService = new CustomerService(customerRepository);
        
        customerService.findCustomerById(1);

        System.out.println();
    }
}
