package interfaces;

public class Main {
    public static void main(String[] args){

        Logger[] loggers = { new SmsLogger(), new FileLogger(), new DatabaseLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);

        Customer kaan = new Customer(1,"kaan", "karvan");


        customerManager.add(kaan);

    }
}
