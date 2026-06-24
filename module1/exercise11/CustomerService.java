public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(
            CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }

    public void getCustomerDetails(int customerId) {

        String customerName =
                customerRepository.findCustomerById(customerId);

        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
    }
}