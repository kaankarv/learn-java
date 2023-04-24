package interfaces;

public class CustomerManager {

    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }


    public void add(Customer customer){
        System.out.println("customer added: " + customer.getFirstName());

        for (Logger logger :
                loggers) {
            logger.log(customer.getFirstName());
        }

    }

    public void delete(Customer customer){
        System.out.println("customer deleted : " + customer.getLastName());

        for (Logger logger :
                loggers) {
            logger.log(customer.getFirstName());
        }


    }
}
