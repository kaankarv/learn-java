package inheritance;

public class Main {

    public static void main(String[] args) {

        IndividualCustomer engin = new IndividualCustomer();
        engin.customerNumber = "1234";

        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber = "9999";



        CustomerManager customerManager = new CustomerManager();

        Customer[] customers = {engin, hepsiBurada};

        customerManager.addMultiple(customers);

        CustomerManager customerManager1 = new CustomerManager();

        customerManager1.add(engin);

    }
}
