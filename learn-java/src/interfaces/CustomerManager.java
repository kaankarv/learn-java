package interfaces;

public class CustomerManager {

    public void add(Customer customer){
        System.out.println("customer added: " + customer.getFirstName());

        DatabaseLogger logger = new DatabaseLogger();
        logger.log(customer.getFirstName() + "database logged");

    }

    public void delete(Customer customer){
        System.out.println("customer deleted : " + customer.getLastName());

        DatabaseLogger logger = new DatabaseLogger();
        logger.log(customer.getLastName() + "database logged");

    }
}
