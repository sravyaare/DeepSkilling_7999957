public class CustomerRepositoryImpl
        implements CustomerRepository {

    @Override
    public String findCustomerById(int customerId) {

        if (customerId == 101) {
            return "Sravya";
        }

        return "Customer Not Found";
    }
}